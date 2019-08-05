package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties   {
  @JsonProperty("com.adobe.cq.cdn.cdn-rewriter")
  private ConfigNodePropertyString comAdobeCqCdnCdnRewriter = null;

  @JsonProperty("com.adobe.cq.cloud-config.components")
  private ConfigNodePropertyString comAdobeCqCloudConfigComponents = null;

  @JsonProperty("com.adobe.cq.cloud-config.core")
  private ConfigNodePropertyString comAdobeCqCloudConfigCore = null;

  @JsonProperty("com.adobe.cq.cloud-config.ui")
  private ConfigNodePropertyString comAdobeCqCloudConfigUi = null;

  @JsonProperty("com.adobe.cq.com.adobe.cq.editor")
  private ConfigNodePropertyString comAdobeCqComAdobeCqEditor = null;

  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.core")
  private ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore = null;

  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core")
  private ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore = null;

  @JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons")
  private ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons = null;

  @JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style")
  private ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle = null;

  @JsonProperty("com.adobe.cq.cq-activitymap-integration")
  private ConfigNodePropertyString comAdobeCqCqActivitymapIntegration = null;

  @JsonProperty("com.adobe.cq.cq-contexthub-commons")
  private ConfigNodePropertyString comAdobeCqCqContexthubCommons = null;

  @JsonProperty("com.adobe.cq.cq-dtm")
  private ConfigNodePropertyString comAdobeCqCqDtm = null;

  @JsonProperty("com.adobe.cq.cq-healthcheck")
  private ConfigNodePropertyString comAdobeCqCqHealthcheck = null;

  @JsonProperty("com.adobe.cq.cq-multisite-targeting")
  private ConfigNodePropertyString comAdobeCqCqMultisiteTargeting = null;

  @JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup")
  private ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup = null;

  @JsonProperty("com.adobe.cq.cq-product-info-provider")
  private ConfigNodePropertyString comAdobeCqCqProductInfoProvider = null;

  @JsonProperty("com.adobe.cq.cq-rest-sites")
  private ConfigNodePropertyString comAdobeCqCqRestSites = null;

  @JsonProperty("com.adobe.cq.cq-security-hc")
  private ConfigNodePropertyString comAdobeCqCqSecurityHc = null;

  @JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler")
  private ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler = null;

  @JsonProperty("com.adobe.cq.dam.cq-scene7-imaging")
  private ConfigNodePropertyString comAdobeCqDamCqScene7Imaging = null;

  @JsonProperty("com.adobe.cq.dtm-reactor.core")
  private ConfigNodePropertyString comAdobeCqDtmReactorCore = null;

  @JsonProperty("com.adobe.cq.dtm-reactor.ui")
  private ConfigNodePropertyString comAdobeCqDtmReactorUi = null;

  @JsonProperty("com.adobe.cq.exp-jspel-resolver")
  private ConfigNodePropertyString comAdobeCqExpJspelResolver = null;

  @JsonProperty("com.adobe.cq.inbox.cq-inbox")
  private ConfigNodePropertyString comAdobeCqInboxCqInbox = null;

  @JsonProperty("com.adobe.cq.json-schema-parser")
  private ConfigNodePropertyString comAdobeCqJsonSchemaParser = null;

  @JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core")
  private ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore = null;

  @JsonProperty("com.adobe.cq.mobile.cq-mobile-caas")
  private ConfigNodePropertyString comAdobeCqMobileCqMobileCaas = null;

  @JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder")
  private ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder = null;

  @JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build")
  private ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild = null;

  @JsonProperty("com.adobe.cq.myspell")
  private ConfigNodePropertyString comAdobeCqMyspell = null;

  @JsonProperty("com.adobe.cq.sample.we.retail.core")
  private ConfigNodePropertyString comAdobeCqSampleWeRetailCore = null;

  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc")
  private ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc = null;

  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core")
  private ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore = null;

  @JsonProperty("com.adobe.cq.social.cq-social-as-provider")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider = null;

  @JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-badging-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-calendar-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-enablement-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-graph-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-ideation-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-jcr-provider")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider = null;

  @JsonProperty("com.adobe.cq.social.cq-social-members-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-ms-provider")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider = null;

  @JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb = null;

  @JsonProperty("com.adobe.cq.social.cq-social-notifications-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-rdb-provider")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider = null;

  @JsonProperty("com.adobe.cq.social.cq-social-scf-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-scoring-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-srp-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl = null;

  @JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl")
  private ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl = null;

  @JsonProperty("com.adobe.dam.cq-dam-cfm-impl")
  private ConfigNodePropertyString comAdobeDamCqDamCfmImpl = null;

  @JsonProperty("com.adobe.forms.foundation-forms-foundation-base")
  private ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase = null;

  @JsonProperty("com.adobe.granite.apicontroller")
  private ConfigNodePropertyString comAdobeGraniteApicontroller = null;

  @JsonProperty("com.adobe.granite.asset.core")
  private ConfigNodePropertyString comAdobeGraniteAssetCore = null;

  @JsonProperty("com.adobe.granite.auth.sso")
  private ConfigNodePropertyString comAdobeGraniteAuthSso = null;

  @JsonProperty("com.adobe.granite.bundles.hc.impl")
  private ConfigNodePropertyString comAdobeGraniteBundlesHcImpl = null;

  @JsonProperty("com.adobe.granite.compat-router")
  private ConfigNodePropertyString comAdobeGraniteCompatRouter = null;

  @JsonProperty("com.adobe.granite.conf")
  private ConfigNodePropertyString comAdobeGraniteConf = null;

  @JsonProperty("com.adobe.granite.conf.ui.core")
  private ConfigNodePropertyString comAdobeGraniteConfUiCore = null;

  @JsonProperty("com.adobe.granite.cors")
  private ConfigNodePropertyString comAdobeGraniteCors = null;

  @JsonProperty("com.adobe.granite.crx-explorer")
  private ConfigNodePropertyString comAdobeGraniteCrxExplorer = null;

  @JsonProperty("com.adobe.granite.crxde-lite")
  private ConfigNodePropertyString comAdobeGraniteCrxdeLite = null;

  @JsonProperty("com.adobe.granite.crypto.config")
  private ConfigNodePropertyString comAdobeGraniteCryptoConfig = null;

  @JsonProperty("com.adobe.granite.crypto.extension")
  private ConfigNodePropertyString comAdobeGraniteCryptoExtension = null;

  @JsonProperty("com.adobe.granite.crypto.file")
  private ConfigNodePropertyString comAdobeGraniteCryptoFile = null;

  @JsonProperty("com.adobe.granite.crypto.jcr")
  private ConfigNodePropertyString comAdobeGraniteCryptoJcr = null;

  @JsonProperty("com.adobe.granite.csrf")
  private ConfigNodePropertyString comAdobeGraniteCsrf = null;

  @JsonProperty("com.adobe.granite.distribution.core")
  private ConfigNodePropertyString comAdobeGraniteDistributionCore = null;

  @JsonProperty("com.adobe.granite.dropwizard.metrics")
  private ConfigNodePropertyString comAdobeGraniteDropwizardMetrics = null;

  @JsonProperty("com.adobe.granite.frags.impl")
  private ConfigNodePropertyString comAdobeGraniteFragsImpl = null;

  @JsonProperty("com.adobe.granite.gibson")
  private ConfigNodePropertyString comAdobeGraniteGibson = null;

  @JsonProperty("com.adobe.granite.infocollector")
  private ConfigNodePropertyString comAdobeGraniteInfocollector = null;

  @JsonProperty("com.adobe.granite.installer.factory.packages")
  private ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages = null;

  @JsonProperty("com.adobe.granite.jetty.ssl")
  private ConfigNodePropertyString comAdobeGraniteJettySsl = null;

  @JsonProperty("com.adobe.granite.jobs.async")
  private ConfigNodePropertyString comAdobeGraniteJobsAsync = null;

  @JsonProperty("com.adobe.granite.maintenance.oak")
  private ConfigNodePropertyString comAdobeGraniteMaintenanceOak = null;

  @JsonProperty("com.adobe.granite.monitoring.core")
  private ConfigNodePropertyString comAdobeGraniteMonitoringCore = null;

  @JsonProperty("com.adobe.granite.queries")
  private ConfigNodePropertyString comAdobeGraniteQueries = null;

  @JsonProperty("com.adobe.granite.replication.hc.impl")
  private ConfigNodePropertyString comAdobeGraniteReplicationHcImpl = null;

  @JsonProperty("com.adobe.granite.repository.checker")
  private ConfigNodePropertyString comAdobeGraniteRepositoryChecker = null;

  @JsonProperty("com.adobe.granite.repository.hc.impl")
  private ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl = null;

  @JsonProperty("com.adobe.granite.rest.assets")
  private ConfigNodePropertyString comAdobeGraniteRestAssets = null;

  @JsonProperty("com.adobe.granite.security.ui")
  private ConfigNodePropertyString comAdobeGraniteSecurityUi = null;

  @JsonProperty("com.adobe.granite.startup")
  private ConfigNodePropertyString comAdobeGraniteStartup = null;

  @JsonProperty("com.adobe.granite.tagsoup")
  private ConfigNodePropertyString comAdobeGraniteTagsoup = null;

  @JsonProperty("com.adobe.granite.taskmanagement.core")
  private ConfigNodePropertyString comAdobeGraniteTaskmanagementCore = null;

  @JsonProperty("com.adobe.granite.taskmanagement.workflow")
  private ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow = null;

  @JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less")
  private ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess = null;

  @JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc")
  private ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc = null;

  @JsonProperty("com.adobe.granite.webconsole.plugins")
  private ConfigNodePropertyString comAdobeGraniteWebconsolePlugins = null;

  @JsonProperty("com.adobe.granite.workflow.console")
  private ConfigNodePropertyString comAdobeGraniteWorkflowConsole = null;

  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux")
  private ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux = null;

  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx")
  private ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx = null;

  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.win")
  private ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin = null;

  @JsonProperty("com.day.commons.osgi.wrapper.simple-jndi")
  private ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi = null;

  @JsonProperty("com.day.cq.cq-authhandler")
  private ConfigNodePropertyString comDayCqCqAuthhandler = null;

  @JsonProperty("com.day.cq.cq-compat-configupdate")
  private ConfigNodePropertyString comDayCqCqCompatConfigupdate = null;

  @JsonProperty("com.day.cq.cq-licensebranding")
  private ConfigNodePropertyString comDayCqCqLicensebranding = null;

  @JsonProperty("com.day.cq.cq-notifcation-impl")
  private ConfigNodePropertyString comDayCqCqNotifcationImpl = null;

  @JsonProperty("com.day.cq.cq-replication-audit")
  private ConfigNodePropertyString comDayCqCqReplicationAudit = null;

  @JsonProperty("com.day.cq.cq-search-ext")
  private ConfigNodePropertyString comDayCqCqSearchExt = null;

  @JsonProperty("com.day.cq.dam.cq-dam-annotation-print")
  private ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint = null;

  @JsonProperty("com.day.cq.dam.cq-dam-asset-usage")
  private ConfigNodePropertyString comDayCqDamCqDamAssetUsage = null;

  @JsonProperty("com.day.cq.dam.cq-dam-s7dam")
  private ConfigNodePropertyString comDayCqDamCqDamS7dam = null;

  @JsonProperty("com.day.cq.dam.cq-dam-similaritysearch")
  private ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch = null;

  @JsonProperty("com.day.cq.dam.dam-webdav-support")
  private ConfigNodePropertyString comDayCqDamDamWebdavSupport = null;

  @JsonProperty("com.day.cq.pre-upgrade-tasks")
  private ConfigNodePropertyString comDayCqPreUpgradeTasks = null;

  @JsonProperty("com.day.cq.replication.extensions")
  private ConfigNodePropertyString comDayCqReplicationExtensions = null;

  @JsonProperty("com.day.cq.wcm.cq-msm-core")
  private ConfigNodePropertyString comDayCqWcmCqMsmCore = null;

  @JsonProperty("com.day.cq.wcm.cq-wcm-translation")
  private ConfigNodePropertyString comDayCqWcmCqWcmTranslation = null;

  @JsonProperty("day-commons-jrawio")
  private ConfigNodePropertyString dayCommonsJrawio = null;

  @JsonProperty("org.apache.aries.jmx.whiteboard")
  private ConfigNodePropertyString orgApacheAriesJmxWhiteboard = null;

  @JsonProperty("org.apache.felix.http.sslfilter")
  private ConfigNodePropertyString orgApacheFelixHttpSslfilter = null;

  @JsonProperty("org.apache.felix.org.apache.felix.threaddump")
  private ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump = null;

  @JsonProperty("org.apache.felix.webconsole.plugins.ds")
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs = null;

  @JsonProperty("org.apache.felix.webconsole.plugins.event")
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent = null;

  @JsonProperty("org.apache.felix.webconsole.plugins.memoryusage")
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage = null;

  @JsonProperty("org.apache.felix.webconsole.plugins.packageadmin")
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin = null;

  @JsonProperty("org.apache.jackrabbit.oak-auth-ldap")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap = null;

  @JsonProperty("org.apache.jackrabbit.oak-segment-tar")
  private ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar = null;

  @JsonProperty("org.apache.jackrabbit.oak-solr-osgi")
  private ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi = null;

  @JsonProperty("org.apache.sling.bundleresource.impl")
  private ConfigNodePropertyString orgApacheSlingBundleresourceImpl = null;

  @JsonProperty("org.apache.sling.commons.fsclassloader")
  private ConfigNodePropertyString orgApacheSlingCommonsFsclassloader = null;

  @JsonProperty("org.apache.sling.commons.log.webconsole")
  private ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole = null;

  @JsonProperty("org.apache.sling.datasource")
  private ConfigNodePropertyString orgApacheSlingDatasource = null;

  @JsonProperty("org.apache.sling.discovery.base")
  private ConfigNodePropertyString orgApacheSlingDiscoveryBase = null;

  @JsonProperty("org.apache.sling.discovery.oak")
  private ConfigNodePropertyString orgApacheSlingDiscoveryOak = null;

  @JsonProperty("org.apache.sling.discovery.support")
  private ConfigNodePropertyString orgApacheSlingDiscoverySupport = null;

  @JsonProperty("org.apache.sling.distribution.api")
  private ConfigNodePropertyString orgApacheSlingDistributionApi = null;

  @JsonProperty("org.apache.sling.distribution.core")
  private ConfigNodePropertyString orgApacheSlingDistributionCore = null;

  @JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider")
  private ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider = null;

  @JsonProperty("org.apache.sling.hc.webconsole")
  private ConfigNodePropertyString orgApacheSlingHcWebconsole = null;

  @JsonProperty("org.apache.sling.installer.console")
  private ConfigNodePropertyString orgApacheSlingInstallerConsole = null;

  @JsonProperty("org.apache.sling.installer.provider.file")
  private ConfigNodePropertyString orgApacheSlingInstallerProviderFile = null;

  @JsonProperty("org.apache.sling.installer.provider.jcr")
  private ConfigNodePropertyString orgApacheSlingInstallerProviderJcr = null;

  @JsonProperty("org.apache.sling.jcr.davex")
  private ConfigNodePropertyString orgApacheSlingJcrDavex = null;

  @JsonProperty("org.apache.sling.jcr.resourcesecurity")
  private ConfigNodePropertyString orgApacheSlingJcrResourcesecurity = null;

  @JsonProperty("org.apache.sling.jmx.provider")
  private ConfigNodePropertyString orgApacheSlingJmxProvider = null;

  @JsonProperty("org.apache.sling.launchpad.installer")
  private ConfigNodePropertyString orgApacheSlingLaunchpadInstaller = null;

  @JsonProperty("org.apache.sling.models.impl")
  private ConfigNodePropertyString orgApacheSlingModelsImpl = null;

  @JsonProperty("org.apache.sling.repoinit.parser")
  private ConfigNodePropertyString orgApacheSlingRepoinitParser = null;

  @JsonProperty("org.apache.sling.resource.inventory")
  private ConfigNodePropertyString orgApacheSlingResourceInventory = null;

  @JsonProperty("org.apache.sling.resourceresolver")
  private ConfigNodePropertyString orgApacheSlingResourceresolver = null;

  @JsonProperty("org.apache.sling.scripting.javascript")
  private ConfigNodePropertyString orgApacheSlingScriptingJavascript = null;

  @JsonProperty("org.apache.sling.scripting.jst")
  private ConfigNodePropertyString orgApacheSlingScriptingJst = null;

  @JsonProperty("org.apache.sling.scripting.sightly.js.provider")
  private ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider = null;

  @JsonProperty("org.apache.sling.scripting.sightly.models.provider")
  private ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider = null;

  @JsonProperty("org.apache.sling.security")
  private ConfigNodePropertyString orgApacheSlingSecurity = null;

  @JsonProperty("org.apache.sling.servlets.compat")
  private ConfigNodePropertyString orgApacheSlingServletsCompat = null;

  @JsonProperty("org.apache.sling.servlets.get")
  private ConfigNodePropertyString orgApacheSlingServletsGet = null;

  @JsonProperty("org.apache.sling.startupfilter.disabler")
  private ConfigNodePropertyString orgApacheSlingStartupfilterDisabler = null;

  @JsonProperty("org.apache.sling.tracer")
  private ConfigNodePropertyString orgApacheSlingTracer = null;

  @JsonProperty("we.retail.client.app.core")
  private ConfigNodePropertyString weRetailClientAppCore = null;

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCdnCdnRewriter(ConfigNodePropertyString comAdobeCqCdnCdnRewriter) {
    this.comAdobeCqCdnCdnRewriter = comAdobeCqCdnCdnRewriter;
    return this;
  }

   /**
   * Get comAdobeCqCdnCdnRewriter
   * @return comAdobeCqCdnCdnRewriter
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCdnCdnRewriter() {
    return comAdobeCqCdnCdnRewriter;
  }

  public void setComAdobeCqCdnCdnRewriter(ConfigNodePropertyString comAdobeCqCdnCdnRewriter) {
    this.comAdobeCqCdnCdnRewriter = comAdobeCqCdnCdnRewriter;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCloudConfigComponents(ConfigNodePropertyString comAdobeCqCloudConfigComponents) {
    this.comAdobeCqCloudConfigComponents = comAdobeCqCloudConfigComponents;
    return this;
  }

   /**
   * Get comAdobeCqCloudConfigComponents
   * @return comAdobeCqCloudConfigComponents
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCloudConfigComponents() {
    return comAdobeCqCloudConfigComponents;
  }

  public void setComAdobeCqCloudConfigComponents(ConfigNodePropertyString comAdobeCqCloudConfigComponents) {
    this.comAdobeCqCloudConfigComponents = comAdobeCqCloudConfigComponents;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCloudConfigCore(ConfigNodePropertyString comAdobeCqCloudConfigCore) {
    this.comAdobeCqCloudConfigCore = comAdobeCqCloudConfigCore;
    return this;
  }

   /**
   * Get comAdobeCqCloudConfigCore
   * @return comAdobeCqCloudConfigCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCloudConfigCore() {
    return comAdobeCqCloudConfigCore;
  }

  public void setComAdobeCqCloudConfigCore(ConfigNodePropertyString comAdobeCqCloudConfigCore) {
    this.comAdobeCqCloudConfigCore = comAdobeCqCloudConfigCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCloudConfigUi(ConfigNodePropertyString comAdobeCqCloudConfigUi) {
    this.comAdobeCqCloudConfigUi = comAdobeCqCloudConfigUi;
    return this;
  }

   /**
   * Get comAdobeCqCloudConfigUi
   * @return comAdobeCqCloudConfigUi
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCloudConfigUi() {
    return comAdobeCqCloudConfigUi;
  }

  public void setComAdobeCqCloudConfigUi(ConfigNodePropertyString comAdobeCqCloudConfigUi) {
    this.comAdobeCqCloudConfigUi = comAdobeCqCloudConfigUi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqEditor(ConfigNodePropertyString comAdobeCqComAdobeCqEditor) {
    this.comAdobeCqComAdobeCqEditor = comAdobeCqComAdobeCqEditor;
    return this;
  }

   /**
   * Get comAdobeCqComAdobeCqEditor
   * @return comAdobeCqComAdobeCqEditor
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqComAdobeCqEditor() {
    return comAdobeCqComAdobeCqEditor;
  }

  public void setComAdobeCqComAdobeCqEditor(ConfigNodePropertyString comAdobeCqComAdobeCqEditor) {
    this.comAdobeCqComAdobeCqEditor = comAdobeCqComAdobeCqEditor;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqProjectsCore(ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore) {
    this.comAdobeCqComAdobeCqProjectsCore = comAdobeCqComAdobeCqProjectsCore;
    return this;
  }

   /**
   * Get comAdobeCqComAdobeCqProjectsCore
   * @return comAdobeCqComAdobeCqProjectsCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqComAdobeCqProjectsCore() {
    return comAdobeCqComAdobeCqProjectsCore;
  }

  public void setComAdobeCqComAdobeCqProjectsCore(ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore) {
    this.comAdobeCqComAdobeCqProjectsCore = comAdobeCqComAdobeCqProjectsCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqProjectsWcmCore(ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore) {
    this.comAdobeCqComAdobeCqProjectsWcmCore = comAdobeCqComAdobeCqProjectsWcmCore;
    return this;
  }

   /**
   * Get comAdobeCqComAdobeCqProjectsWcmCore
   * @return comAdobeCqComAdobeCqProjectsWcmCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqComAdobeCqProjectsWcmCore() {
    return comAdobeCqComAdobeCqProjectsWcmCore;
  }

  public void setComAdobeCqComAdobeCqProjectsWcmCore(ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore) {
    this.comAdobeCqComAdobeCqProjectsWcmCore = comAdobeCqComAdobeCqProjectsWcmCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqUiCommons(ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons) {
    this.comAdobeCqComAdobeCqUiCommons = comAdobeCqComAdobeCqUiCommons;
    return this;
  }

   /**
   * Get comAdobeCqComAdobeCqUiCommons
   * @return comAdobeCqComAdobeCqUiCommons
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqComAdobeCqUiCommons() {
    return comAdobeCqComAdobeCqUiCommons;
  }

  public void setComAdobeCqComAdobeCqUiCommons(ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons) {
    this.comAdobeCqComAdobeCqUiCommons = comAdobeCqComAdobeCqUiCommons;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqWcmStyle(ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle) {
    this.comAdobeCqComAdobeCqWcmStyle = comAdobeCqComAdobeCqWcmStyle;
    return this;
  }

   /**
   * Get comAdobeCqComAdobeCqWcmStyle
   * @return comAdobeCqComAdobeCqWcmStyle
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqComAdobeCqWcmStyle() {
    return comAdobeCqComAdobeCqWcmStyle;
  }

  public void setComAdobeCqComAdobeCqWcmStyle(ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle) {
    this.comAdobeCqComAdobeCqWcmStyle = comAdobeCqComAdobeCqWcmStyle;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqActivitymapIntegration(ConfigNodePropertyString comAdobeCqCqActivitymapIntegration) {
    this.comAdobeCqCqActivitymapIntegration = comAdobeCqCqActivitymapIntegration;
    return this;
  }

   /**
   * Get comAdobeCqCqActivitymapIntegration
   * @return comAdobeCqCqActivitymapIntegration
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqActivitymapIntegration() {
    return comAdobeCqCqActivitymapIntegration;
  }

  public void setComAdobeCqCqActivitymapIntegration(ConfigNodePropertyString comAdobeCqCqActivitymapIntegration) {
    this.comAdobeCqCqActivitymapIntegration = comAdobeCqCqActivitymapIntegration;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqContexthubCommons(ConfigNodePropertyString comAdobeCqCqContexthubCommons) {
    this.comAdobeCqCqContexthubCommons = comAdobeCqCqContexthubCommons;
    return this;
  }

   /**
   * Get comAdobeCqCqContexthubCommons
   * @return comAdobeCqCqContexthubCommons
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqContexthubCommons() {
    return comAdobeCqCqContexthubCommons;
  }

  public void setComAdobeCqCqContexthubCommons(ConfigNodePropertyString comAdobeCqCqContexthubCommons) {
    this.comAdobeCqCqContexthubCommons = comAdobeCqCqContexthubCommons;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqDtm(ConfigNodePropertyString comAdobeCqCqDtm) {
    this.comAdobeCqCqDtm = comAdobeCqCqDtm;
    return this;
  }

   /**
   * Get comAdobeCqCqDtm
   * @return comAdobeCqCqDtm
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqDtm() {
    return comAdobeCqCqDtm;
  }

  public void setComAdobeCqCqDtm(ConfigNodePropertyString comAdobeCqCqDtm) {
    this.comAdobeCqCqDtm = comAdobeCqCqDtm;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqHealthcheck(ConfigNodePropertyString comAdobeCqCqHealthcheck) {
    this.comAdobeCqCqHealthcheck = comAdobeCqCqHealthcheck;
    return this;
  }

   /**
   * Get comAdobeCqCqHealthcheck
   * @return comAdobeCqCqHealthcheck
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqHealthcheck() {
    return comAdobeCqCqHealthcheck;
  }

  public void setComAdobeCqCqHealthcheck(ConfigNodePropertyString comAdobeCqCqHealthcheck) {
    this.comAdobeCqCqHealthcheck = comAdobeCqCqHealthcheck;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqMultisiteTargeting(ConfigNodePropertyString comAdobeCqCqMultisiteTargeting) {
    this.comAdobeCqCqMultisiteTargeting = comAdobeCqCqMultisiteTargeting;
    return this;
  }

   /**
   * Get comAdobeCqCqMultisiteTargeting
   * @return comAdobeCqCqMultisiteTargeting
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqMultisiteTargeting() {
    return comAdobeCqCqMultisiteTargeting;
  }

  public void setComAdobeCqCqMultisiteTargeting(ConfigNodePropertyString comAdobeCqCqMultisiteTargeting) {
    this.comAdobeCqCqMultisiteTargeting = comAdobeCqCqMultisiteTargeting;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqPreUpgradeCleanup(ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup) {
    this.comAdobeCqCqPreUpgradeCleanup = comAdobeCqCqPreUpgradeCleanup;
    return this;
  }

   /**
   * Get comAdobeCqCqPreUpgradeCleanup
   * @return comAdobeCqCqPreUpgradeCleanup
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqPreUpgradeCleanup() {
    return comAdobeCqCqPreUpgradeCleanup;
  }

  public void setComAdobeCqCqPreUpgradeCleanup(ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup) {
    this.comAdobeCqCqPreUpgradeCleanup = comAdobeCqCqPreUpgradeCleanup;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqProductInfoProvider(ConfigNodePropertyString comAdobeCqCqProductInfoProvider) {
    this.comAdobeCqCqProductInfoProvider = comAdobeCqCqProductInfoProvider;
    return this;
  }

   /**
   * Get comAdobeCqCqProductInfoProvider
   * @return comAdobeCqCqProductInfoProvider
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqProductInfoProvider() {
    return comAdobeCqCqProductInfoProvider;
  }

  public void setComAdobeCqCqProductInfoProvider(ConfigNodePropertyString comAdobeCqCqProductInfoProvider) {
    this.comAdobeCqCqProductInfoProvider = comAdobeCqCqProductInfoProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqRestSites(ConfigNodePropertyString comAdobeCqCqRestSites) {
    this.comAdobeCqCqRestSites = comAdobeCqCqRestSites;
    return this;
  }

   /**
   * Get comAdobeCqCqRestSites
   * @return comAdobeCqCqRestSites
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqRestSites() {
    return comAdobeCqCqRestSites;
  }

  public void setComAdobeCqCqRestSites(ConfigNodePropertyString comAdobeCqCqRestSites) {
    this.comAdobeCqCqRestSites = comAdobeCqCqRestSites;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqSecurityHc(ConfigNodePropertyString comAdobeCqCqSecurityHc) {
    this.comAdobeCqCqSecurityHc = comAdobeCqCqSecurityHc;
    return this;
  }

   /**
   * Get comAdobeCqCqSecurityHc
   * @return comAdobeCqCqSecurityHc
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqCqSecurityHc() {
    return comAdobeCqCqSecurityHc;
  }

  public void setComAdobeCqCqSecurityHc(ConfigNodePropertyString comAdobeCqCqSecurityHc) {
    this.comAdobeCqCqSecurityHc = comAdobeCqCqSecurityHc;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDamCqDamSvgHandler(ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler) {
    this.comAdobeCqDamCqDamSvgHandler = comAdobeCqDamCqDamSvgHandler;
    return this;
  }

   /**
   * Get comAdobeCqDamCqDamSvgHandler
   * @return comAdobeCqDamCqDamSvgHandler
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqDamCqDamSvgHandler() {
    return comAdobeCqDamCqDamSvgHandler;
  }

  public void setComAdobeCqDamCqDamSvgHandler(ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler) {
    this.comAdobeCqDamCqDamSvgHandler = comAdobeCqDamCqDamSvgHandler;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDamCqScene7Imaging(ConfigNodePropertyString comAdobeCqDamCqScene7Imaging) {
    this.comAdobeCqDamCqScene7Imaging = comAdobeCqDamCqScene7Imaging;
    return this;
  }

   /**
   * Get comAdobeCqDamCqScene7Imaging
   * @return comAdobeCqDamCqScene7Imaging
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqDamCqScene7Imaging() {
    return comAdobeCqDamCqScene7Imaging;
  }

  public void setComAdobeCqDamCqScene7Imaging(ConfigNodePropertyString comAdobeCqDamCqScene7Imaging) {
    this.comAdobeCqDamCqScene7Imaging = comAdobeCqDamCqScene7Imaging;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDtmReactorCore(ConfigNodePropertyString comAdobeCqDtmReactorCore) {
    this.comAdobeCqDtmReactorCore = comAdobeCqDtmReactorCore;
    return this;
  }

   /**
   * Get comAdobeCqDtmReactorCore
   * @return comAdobeCqDtmReactorCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqDtmReactorCore() {
    return comAdobeCqDtmReactorCore;
  }

  public void setComAdobeCqDtmReactorCore(ConfigNodePropertyString comAdobeCqDtmReactorCore) {
    this.comAdobeCqDtmReactorCore = comAdobeCqDtmReactorCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDtmReactorUi(ConfigNodePropertyString comAdobeCqDtmReactorUi) {
    this.comAdobeCqDtmReactorUi = comAdobeCqDtmReactorUi;
    return this;
  }

   /**
   * Get comAdobeCqDtmReactorUi
   * @return comAdobeCqDtmReactorUi
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqDtmReactorUi() {
    return comAdobeCqDtmReactorUi;
  }

  public void setComAdobeCqDtmReactorUi(ConfigNodePropertyString comAdobeCqDtmReactorUi) {
    this.comAdobeCqDtmReactorUi = comAdobeCqDtmReactorUi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqExpJspelResolver(ConfigNodePropertyString comAdobeCqExpJspelResolver) {
    this.comAdobeCqExpJspelResolver = comAdobeCqExpJspelResolver;
    return this;
  }

   /**
   * Get comAdobeCqExpJspelResolver
   * @return comAdobeCqExpJspelResolver
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqExpJspelResolver() {
    return comAdobeCqExpJspelResolver;
  }

  public void setComAdobeCqExpJspelResolver(ConfigNodePropertyString comAdobeCqExpJspelResolver) {
    this.comAdobeCqExpJspelResolver = comAdobeCqExpJspelResolver;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqInboxCqInbox(ConfigNodePropertyString comAdobeCqInboxCqInbox) {
    this.comAdobeCqInboxCqInbox = comAdobeCqInboxCqInbox;
    return this;
  }

   /**
   * Get comAdobeCqInboxCqInbox
   * @return comAdobeCqInboxCqInbox
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqInboxCqInbox() {
    return comAdobeCqInboxCqInbox;
  }

  public void setComAdobeCqInboxCqInbox(ConfigNodePropertyString comAdobeCqInboxCqInbox) {
    this.comAdobeCqInboxCqInbox = comAdobeCqInboxCqInbox;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqJsonSchemaParser(ConfigNodePropertyString comAdobeCqJsonSchemaParser) {
    this.comAdobeCqJsonSchemaParser = comAdobeCqJsonSchemaParser;
    return this;
  }

   /**
   * Get comAdobeCqJsonSchemaParser
   * @return comAdobeCqJsonSchemaParser
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqJsonSchemaParser() {
    return comAdobeCqJsonSchemaParser;
  }

  public void setComAdobeCqJsonSchemaParser(ConfigNodePropertyString comAdobeCqJsonSchemaParser) {
    this.comAdobeCqJsonSchemaParser = comAdobeCqJsonSchemaParser;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMediaCqMediaPublishingDpsFpCore(ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore) {
    this.comAdobeCqMediaCqMediaPublishingDpsFpCore = comAdobeCqMediaCqMediaPublishingDpsFpCore;
    return this;
  }

   /**
   * Get comAdobeCqMediaCqMediaPublishingDpsFpCore
   * @return comAdobeCqMediaCqMediaPublishingDpsFpCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqMediaCqMediaPublishingDpsFpCore() {
    return comAdobeCqMediaCqMediaPublishingDpsFpCore;
  }

  public void setComAdobeCqMediaCqMediaPublishingDpsFpCore(ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore) {
    this.comAdobeCqMediaCqMediaPublishingDpsFpCore = comAdobeCqMediaCqMediaPublishingDpsFpCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMobileCqMobileCaas(ConfigNodePropertyString comAdobeCqMobileCqMobileCaas) {
    this.comAdobeCqMobileCqMobileCaas = comAdobeCqMobileCqMobileCaas;
    return this;
  }

   /**
   * Get comAdobeCqMobileCqMobileCaas
   * @return comAdobeCqMobileCqMobileCaas
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqMobileCqMobileCaas() {
    return comAdobeCqMobileCqMobileCaas;
  }

  public void setComAdobeCqMobileCqMobileCaas(ConfigNodePropertyString comAdobeCqMobileCqMobileCaas) {
    this.comAdobeCqMobileCqMobileCaas = comAdobeCqMobileCqMobileCaas;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMobileCqMobileIndexBuilder(ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder) {
    this.comAdobeCqMobileCqMobileIndexBuilder = comAdobeCqMobileCqMobileIndexBuilder;
    return this;
  }

   /**
   * Get comAdobeCqMobileCqMobileIndexBuilder
   * @return comAdobeCqMobileCqMobileIndexBuilder
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqMobileCqMobileIndexBuilder() {
    return comAdobeCqMobileCqMobileIndexBuilder;
  }

  public void setComAdobeCqMobileCqMobileIndexBuilder(ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder) {
    this.comAdobeCqMobileCqMobileIndexBuilder = comAdobeCqMobileCqMobileIndexBuilder;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMobileCqMobilePhonegapBuild(ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild) {
    this.comAdobeCqMobileCqMobilePhonegapBuild = comAdobeCqMobileCqMobilePhonegapBuild;
    return this;
  }

   /**
   * Get comAdobeCqMobileCqMobilePhonegapBuild
   * @return comAdobeCqMobileCqMobilePhonegapBuild
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqMobileCqMobilePhonegapBuild() {
    return comAdobeCqMobileCqMobilePhonegapBuild;
  }

  public void setComAdobeCqMobileCqMobilePhonegapBuild(ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild) {
    this.comAdobeCqMobileCqMobilePhonegapBuild = comAdobeCqMobileCqMobilePhonegapBuild;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMyspell(ConfigNodePropertyString comAdobeCqMyspell) {
    this.comAdobeCqMyspell = comAdobeCqMyspell;
    return this;
  }

   /**
   * Get comAdobeCqMyspell
   * @return comAdobeCqMyspell
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqMyspell() {
    return comAdobeCqMyspell;
  }

  public void setComAdobeCqMyspell(ConfigNodePropertyString comAdobeCqMyspell) {
    this.comAdobeCqMyspell = comAdobeCqMyspell;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSampleWeRetailCore(ConfigNodePropertyString comAdobeCqSampleWeRetailCore) {
    this.comAdobeCqSampleWeRetailCore = comAdobeCqSampleWeRetailCore;
    return this;
  }

   /**
   * Get comAdobeCqSampleWeRetailCore
   * @return comAdobeCqSampleWeRetailCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSampleWeRetailCore() {
    return comAdobeCqSampleWeRetailCore;
  }

  public void setComAdobeCqSampleWeRetailCore(ConfigNodePropertyString comAdobeCqSampleWeRetailCore) {
    this.comAdobeCqSampleWeRetailCore = comAdobeCqSampleWeRetailCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqScreensComAdobeCqScreensDcc(ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc) {
    this.comAdobeCqScreensComAdobeCqScreensDcc = comAdobeCqScreensComAdobeCqScreensDcc;
    return this;
  }

   /**
   * Get comAdobeCqScreensComAdobeCqScreensDcc
   * @return comAdobeCqScreensComAdobeCqScreensDcc
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqScreensComAdobeCqScreensDcc() {
    return comAdobeCqScreensComAdobeCqScreensDcc;
  }

  public void setComAdobeCqScreensComAdobeCqScreensDcc(ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc) {
    this.comAdobeCqScreensComAdobeCqScreensDcc = comAdobeCqScreensComAdobeCqScreensDcc;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqScreensComAdobeCqScreensMqCore(ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore) {
    this.comAdobeCqScreensComAdobeCqScreensMqCore = comAdobeCqScreensComAdobeCqScreensMqCore;
    return this;
  }

   /**
   * Get comAdobeCqScreensComAdobeCqScreensMqCore
   * @return comAdobeCqScreensComAdobeCqScreensMqCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqScreensComAdobeCqScreensMqCore() {
    return comAdobeCqScreensComAdobeCqScreensMqCore;
  }

  public void setComAdobeCqScreensComAdobeCqScreensMqCore(ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore) {
    this.comAdobeCqScreensComAdobeCqScreensMqCore = comAdobeCqScreensComAdobeCqScreensMqCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialAsProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider) {
    this.comAdobeCqSocialCqSocialAsProvider = comAdobeCqSocialCqSocialAsProvider;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialAsProvider
   * @return comAdobeCqSocialCqSocialAsProvider
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialAsProvider() {
    return comAdobeCqSocialCqSocialAsProvider;
  }

  public void setComAdobeCqSocialCqSocialAsProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider) {
    this.comAdobeCqSocialCqSocialAsProvider = comAdobeCqSocialCqSocialAsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialBadgingBasicImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl) {
    this.comAdobeCqSocialCqSocialBadgingBasicImpl = comAdobeCqSocialCqSocialBadgingBasicImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialBadgingBasicImpl
   * @return comAdobeCqSocialCqSocialBadgingBasicImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialBadgingBasicImpl() {
    return comAdobeCqSocialCqSocialBadgingBasicImpl;
  }

  public void setComAdobeCqSocialCqSocialBadgingBasicImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl) {
    this.comAdobeCqSocialCqSocialBadgingBasicImpl = comAdobeCqSocialCqSocialBadgingBasicImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialBadgingImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl) {
    this.comAdobeCqSocialCqSocialBadgingImpl = comAdobeCqSocialCqSocialBadgingImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialBadgingImpl
   * @return comAdobeCqSocialCqSocialBadgingImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialBadgingImpl() {
    return comAdobeCqSocialCqSocialBadgingImpl;
  }

  public void setComAdobeCqSocialCqSocialBadgingImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl) {
    this.comAdobeCqSocialCqSocialBadgingImpl = comAdobeCqSocialCqSocialBadgingImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialCalendarImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl) {
    this.comAdobeCqSocialCqSocialCalendarImpl = comAdobeCqSocialCqSocialCalendarImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialCalendarImpl
   * @return comAdobeCqSocialCqSocialCalendarImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialCalendarImpl() {
    return comAdobeCqSocialCqSocialCalendarImpl;
  }

  public void setComAdobeCqSocialCqSocialCalendarImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl) {
    this.comAdobeCqSocialCqSocialCalendarImpl = comAdobeCqSocialCqSocialCalendarImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialContentFragmentsImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl) {
    this.comAdobeCqSocialCqSocialContentFragmentsImpl = comAdobeCqSocialCqSocialContentFragmentsImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialContentFragmentsImpl
   * @return comAdobeCqSocialCqSocialContentFragmentsImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialContentFragmentsImpl() {
    return comAdobeCqSocialCqSocialContentFragmentsImpl;
  }

  public void setComAdobeCqSocialCqSocialContentFragmentsImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl) {
    this.comAdobeCqSocialCqSocialContentFragmentsImpl = comAdobeCqSocialCqSocialContentFragmentsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialEnablementImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl) {
    this.comAdobeCqSocialCqSocialEnablementImpl = comAdobeCqSocialCqSocialEnablementImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialEnablementImpl
   * @return comAdobeCqSocialCqSocialEnablementImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialEnablementImpl() {
    return comAdobeCqSocialCqSocialEnablementImpl;
  }

  public void setComAdobeCqSocialCqSocialEnablementImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl) {
    this.comAdobeCqSocialCqSocialEnablementImpl = comAdobeCqSocialCqSocialEnablementImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialGraphImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl) {
    this.comAdobeCqSocialCqSocialGraphImpl = comAdobeCqSocialCqSocialGraphImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialGraphImpl
   * @return comAdobeCqSocialCqSocialGraphImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialGraphImpl() {
    return comAdobeCqSocialCqSocialGraphImpl;
  }

  public void setComAdobeCqSocialCqSocialGraphImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl) {
    this.comAdobeCqSocialCqSocialGraphImpl = comAdobeCqSocialCqSocialGraphImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialIdeationImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl) {
    this.comAdobeCqSocialCqSocialIdeationImpl = comAdobeCqSocialCqSocialIdeationImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialIdeationImpl
   * @return comAdobeCqSocialCqSocialIdeationImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialIdeationImpl() {
    return comAdobeCqSocialCqSocialIdeationImpl;
  }

  public void setComAdobeCqSocialCqSocialIdeationImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl) {
    this.comAdobeCqSocialCqSocialIdeationImpl = comAdobeCqSocialCqSocialIdeationImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialJcrProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider) {
    this.comAdobeCqSocialCqSocialJcrProvider = comAdobeCqSocialCqSocialJcrProvider;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialJcrProvider
   * @return comAdobeCqSocialCqSocialJcrProvider
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialJcrProvider() {
    return comAdobeCqSocialCqSocialJcrProvider;
  }

  public void setComAdobeCqSocialCqSocialJcrProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider) {
    this.comAdobeCqSocialCqSocialJcrProvider = comAdobeCqSocialCqSocialJcrProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialMembersImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl) {
    this.comAdobeCqSocialCqSocialMembersImpl = comAdobeCqSocialCqSocialMembersImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialMembersImpl
   * @return comAdobeCqSocialCqSocialMembersImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialMembersImpl() {
    return comAdobeCqSocialCqSocialMembersImpl;
  }

  public void setComAdobeCqSocialCqSocialMembersImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl) {
    this.comAdobeCqSocialCqSocialMembersImpl = comAdobeCqSocialCqSocialMembersImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialMsProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider) {
    this.comAdobeCqSocialCqSocialMsProvider = comAdobeCqSocialCqSocialMsProvider;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialMsProvider
   * @return comAdobeCqSocialCqSocialMsProvider
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialMsProvider() {
    return comAdobeCqSocialCqSocialMsProvider;
  }

  public void setComAdobeCqSocialCqSocialMsProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider) {
    this.comAdobeCqSocialCqSocialMsProvider = comAdobeCqSocialCqSocialMsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialNotificationsChannelsWeb(ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb) {
    this.comAdobeCqSocialCqSocialNotificationsChannelsWeb = comAdobeCqSocialCqSocialNotificationsChannelsWeb;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialNotificationsChannelsWeb
   * @return comAdobeCqSocialCqSocialNotificationsChannelsWeb
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialNotificationsChannelsWeb() {
    return comAdobeCqSocialCqSocialNotificationsChannelsWeb;
  }

  public void setComAdobeCqSocialCqSocialNotificationsChannelsWeb(ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb) {
    this.comAdobeCqSocialCqSocialNotificationsChannelsWeb = comAdobeCqSocialCqSocialNotificationsChannelsWeb;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialNotificationsImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl) {
    this.comAdobeCqSocialCqSocialNotificationsImpl = comAdobeCqSocialCqSocialNotificationsImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialNotificationsImpl
   * @return comAdobeCqSocialCqSocialNotificationsImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialNotificationsImpl() {
    return comAdobeCqSocialCqSocialNotificationsImpl;
  }

  public void setComAdobeCqSocialCqSocialNotificationsImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl) {
    this.comAdobeCqSocialCqSocialNotificationsImpl = comAdobeCqSocialCqSocialNotificationsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialRdbProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider) {
    this.comAdobeCqSocialCqSocialRdbProvider = comAdobeCqSocialCqSocialRdbProvider;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialRdbProvider
   * @return comAdobeCqSocialCqSocialRdbProvider
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialRdbProvider() {
    return comAdobeCqSocialCqSocialRdbProvider;
  }

  public void setComAdobeCqSocialCqSocialRdbProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider) {
    this.comAdobeCqSocialCqSocialRdbProvider = comAdobeCqSocialCqSocialRdbProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialScfImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl) {
    this.comAdobeCqSocialCqSocialScfImpl = comAdobeCqSocialCqSocialScfImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialScfImpl
   * @return comAdobeCqSocialCqSocialScfImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialScfImpl() {
    return comAdobeCqSocialCqSocialScfImpl;
  }

  public void setComAdobeCqSocialCqSocialScfImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl) {
    this.comAdobeCqSocialCqSocialScfImpl = comAdobeCqSocialCqSocialScfImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialScoringBasicImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl) {
    this.comAdobeCqSocialCqSocialScoringBasicImpl = comAdobeCqSocialCqSocialScoringBasicImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialScoringBasicImpl
   * @return comAdobeCqSocialCqSocialScoringBasicImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialScoringBasicImpl() {
    return comAdobeCqSocialCqSocialScoringBasicImpl;
  }

  public void setComAdobeCqSocialCqSocialScoringBasicImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl) {
    this.comAdobeCqSocialCqSocialScoringBasicImpl = comAdobeCqSocialCqSocialScoringBasicImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialScoringImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl) {
    this.comAdobeCqSocialCqSocialScoringImpl = comAdobeCqSocialCqSocialScoringImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialScoringImpl
   * @return comAdobeCqSocialCqSocialScoringImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialScoringImpl() {
    return comAdobeCqSocialCqSocialScoringImpl;
  }

  public void setComAdobeCqSocialCqSocialScoringImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl) {
    this.comAdobeCqSocialCqSocialScoringImpl = comAdobeCqSocialCqSocialScoringImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialServiceusersImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl) {
    this.comAdobeCqSocialCqSocialServiceusersImpl = comAdobeCqSocialCqSocialServiceusersImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialServiceusersImpl
   * @return comAdobeCqSocialCqSocialServiceusersImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialServiceusersImpl() {
    return comAdobeCqSocialCqSocialServiceusersImpl;
  }

  public void setComAdobeCqSocialCqSocialServiceusersImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl) {
    this.comAdobeCqSocialCqSocialServiceusersImpl = comAdobeCqSocialCqSocialServiceusersImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialSrpImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl) {
    this.comAdobeCqSocialCqSocialSrpImpl = comAdobeCqSocialCqSocialSrpImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialSrpImpl
   * @return comAdobeCqSocialCqSocialSrpImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialSrpImpl() {
    return comAdobeCqSocialCqSocialSrpImpl;
  }

  public void setComAdobeCqSocialCqSocialSrpImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl) {
    this.comAdobeCqSocialCqSocialSrpImpl = comAdobeCqSocialCqSocialSrpImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialUgcbaseImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl) {
    this.comAdobeCqSocialCqSocialUgcbaseImpl = comAdobeCqSocialCqSocialUgcbaseImpl;
    return this;
  }

   /**
   * Get comAdobeCqSocialCqSocialUgcbaseImpl
   * @return comAdobeCqSocialCqSocialUgcbaseImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialUgcbaseImpl() {
    return comAdobeCqSocialCqSocialUgcbaseImpl;
  }

  public void setComAdobeCqSocialCqSocialUgcbaseImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl) {
    this.comAdobeCqSocialCqSocialUgcbaseImpl = comAdobeCqSocialCqSocialUgcbaseImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeDamCqDamCfmImpl(ConfigNodePropertyString comAdobeDamCqDamCfmImpl) {
    this.comAdobeDamCqDamCfmImpl = comAdobeDamCqDamCfmImpl;
    return this;
  }

   /**
   * Get comAdobeDamCqDamCfmImpl
   * @return comAdobeDamCqDamCfmImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeDamCqDamCfmImpl() {
    return comAdobeDamCqDamCfmImpl;
  }

  public void setComAdobeDamCqDamCfmImpl(ConfigNodePropertyString comAdobeDamCqDamCfmImpl) {
    this.comAdobeDamCqDamCfmImpl = comAdobeDamCqDamCfmImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeFormsFoundationFormsFoundationBase(ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase) {
    this.comAdobeFormsFoundationFormsFoundationBase = comAdobeFormsFoundationFormsFoundationBase;
    return this;
  }

   /**
   * Get comAdobeFormsFoundationFormsFoundationBase
   * @return comAdobeFormsFoundationFormsFoundationBase
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeFormsFoundationFormsFoundationBase() {
    return comAdobeFormsFoundationFormsFoundationBase;
  }

  public void setComAdobeFormsFoundationFormsFoundationBase(ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase) {
    this.comAdobeFormsFoundationFormsFoundationBase = comAdobeFormsFoundationFormsFoundationBase;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteApicontroller(ConfigNodePropertyString comAdobeGraniteApicontroller) {
    this.comAdobeGraniteApicontroller = comAdobeGraniteApicontroller;
    return this;
  }

   /**
   * Get comAdobeGraniteApicontroller
   * @return comAdobeGraniteApicontroller
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteApicontroller() {
    return comAdobeGraniteApicontroller;
  }

  public void setComAdobeGraniteApicontroller(ConfigNodePropertyString comAdobeGraniteApicontroller) {
    this.comAdobeGraniteApicontroller = comAdobeGraniteApicontroller;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteAssetCore(ConfigNodePropertyString comAdobeGraniteAssetCore) {
    this.comAdobeGraniteAssetCore = comAdobeGraniteAssetCore;
    return this;
  }

   /**
   * Get comAdobeGraniteAssetCore
   * @return comAdobeGraniteAssetCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteAssetCore() {
    return comAdobeGraniteAssetCore;
  }

  public void setComAdobeGraniteAssetCore(ConfigNodePropertyString comAdobeGraniteAssetCore) {
    this.comAdobeGraniteAssetCore = comAdobeGraniteAssetCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteAuthSso(ConfigNodePropertyString comAdobeGraniteAuthSso) {
    this.comAdobeGraniteAuthSso = comAdobeGraniteAuthSso;
    return this;
  }

   /**
   * Get comAdobeGraniteAuthSso
   * @return comAdobeGraniteAuthSso
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteAuthSso() {
    return comAdobeGraniteAuthSso;
  }

  public void setComAdobeGraniteAuthSso(ConfigNodePropertyString comAdobeGraniteAuthSso) {
    this.comAdobeGraniteAuthSso = comAdobeGraniteAuthSso;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteBundlesHcImpl(ConfigNodePropertyString comAdobeGraniteBundlesHcImpl) {
    this.comAdobeGraniteBundlesHcImpl = comAdobeGraniteBundlesHcImpl;
    return this;
  }

   /**
   * Get comAdobeGraniteBundlesHcImpl
   * @return comAdobeGraniteBundlesHcImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteBundlesHcImpl() {
    return comAdobeGraniteBundlesHcImpl;
  }

  public void setComAdobeGraniteBundlesHcImpl(ConfigNodePropertyString comAdobeGraniteBundlesHcImpl) {
    this.comAdobeGraniteBundlesHcImpl = comAdobeGraniteBundlesHcImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCompatRouter(ConfigNodePropertyString comAdobeGraniteCompatRouter) {
    this.comAdobeGraniteCompatRouter = comAdobeGraniteCompatRouter;
    return this;
  }

   /**
   * Get comAdobeGraniteCompatRouter
   * @return comAdobeGraniteCompatRouter
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCompatRouter() {
    return comAdobeGraniteCompatRouter;
  }

  public void setComAdobeGraniteCompatRouter(ConfigNodePropertyString comAdobeGraniteCompatRouter) {
    this.comAdobeGraniteCompatRouter = comAdobeGraniteCompatRouter;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteConf(ConfigNodePropertyString comAdobeGraniteConf) {
    this.comAdobeGraniteConf = comAdobeGraniteConf;
    return this;
  }

   /**
   * Get comAdobeGraniteConf
   * @return comAdobeGraniteConf
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteConf() {
    return comAdobeGraniteConf;
  }

  public void setComAdobeGraniteConf(ConfigNodePropertyString comAdobeGraniteConf) {
    this.comAdobeGraniteConf = comAdobeGraniteConf;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteConfUiCore(ConfigNodePropertyString comAdobeGraniteConfUiCore) {
    this.comAdobeGraniteConfUiCore = comAdobeGraniteConfUiCore;
    return this;
  }

   /**
   * Get comAdobeGraniteConfUiCore
   * @return comAdobeGraniteConfUiCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteConfUiCore() {
    return comAdobeGraniteConfUiCore;
  }

  public void setComAdobeGraniteConfUiCore(ConfigNodePropertyString comAdobeGraniteConfUiCore) {
    this.comAdobeGraniteConfUiCore = comAdobeGraniteConfUiCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCors(ConfigNodePropertyString comAdobeGraniteCors) {
    this.comAdobeGraniteCors = comAdobeGraniteCors;
    return this;
  }

   /**
   * Get comAdobeGraniteCors
   * @return comAdobeGraniteCors
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCors() {
    return comAdobeGraniteCors;
  }

  public void setComAdobeGraniteCors(ConfigNodePropertyString comAdobeGraniteCors) {
    this.comAdobeGraniteCors = comAdobeGraniteCors;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCrxExplorer(ConfigNodePropertyString comAdobeGraniteCrxExplorer) {
    this.comAdobeGraniteCrxExplorer = comAdobeGraniteCrxExplorer;
    return this;
  }

   /**
   * Get comAdobeGraniteCrxExplorer
   * @return comAdobeGraniteCrxExplorer
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCrxExplorer() {
    return comAdobeGraniteCrxExplorer;
  }

  public void setComAdobeGraniteCrxExplorer(ConfigNodePropertyString comAdobeGraniteCrxExplorer) {
    this.comAdobeGraniteCrxExplorer = comAdobeGraniteCrxExplorer;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCrxdeLite(ConfigNodePropertyString comAdobeGraniteCrxdeLite) {
    this.comAdobeGraniteCrxdeLite = comAdobeGraniteCrxdeLite;
    return this;
  }

   /**
   * Get comAdobeGraniteCrxdeLite
   * @return comAdobeGraniteCrxdeLite
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCrxdeLite() {
    return comAdobeGraniteCrxdeLite;
  }

  public void setComAdobeGraniteCrxdeLite(ConfigNodePropertyString comAdobeGraniteCrxdeLite) {
    this.comAdobeGraniteCrxdeLite = comAdobeGraniteCrxdeLite;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoConfig(ConfigNodePropertyString comAdobeGraniteCryptoConfig) {
    this.comAdobeGraniteCryptoConfig = comAdobeGraniteCryptoConfig;
    return this;
  }

   /**
   * Get comAdobeGraniteCryptoConfig
   * @return comAdobeGraniteCryptoConfig
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCryptoConfig() {
    return comAdobeGraniteCryptoConfig;
  }

  public void setComAdobeGraniteCryptoConfig(ConfigNodePropertyString comAdobeGraniteCryptoConfig) {
    this.comAdobeGraniteCryptoConfig = comAdobeGraniteCryptoConfig;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoExtension(ConfigNodePropertyString comAdobeGraniteCryptoExtension) {
    this.comAdobeGraniteCryptoExtension = comAdobeGraniteCryptoExtension;
    return this;
  }

   /**
   * Get comAdobeGraniteCryptoExtension
   * @return comAdobeGraniteCryptoExtension
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCryptoExtension() {
    return comAdobeGraniteCryptoExtension;
  }

  public void setComAdobeGraniteCryptoExtension(ConfigNodePropertyString comAdobeGraniteCryptoExtension) {
    this.comAdobeGraniteCryptoExtension = comAdobeGraniteCryptoExtension;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoFile(ConfigNodePropertyString comAdobeGraniteCryptoFile) {
    this.comAdobeGraniteCryptoFile = comAdobeGraniteCryptoFile;
    return this;
  }

   /**
   * Get comAdobeGraniteCryptoFile
   * @return comAdobeGraniteCryptoFile
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCryptoFile() {
    return comAdobeGraniteCryptoFile;
  }

  public void setComAdobeGraniteCryptoFile(ConfigNodePropertyString comAdobeGraniteCryptoFile) {
    this.comAdobeGraniteCryptoFile = comAdobeGraniteCryptoFile;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoJcr(ConfigNodePropertyString comAdobeGraniteCryptoJcr) {
    this.comAdobeGraniteCryptoJcr = comAdobeGraniteCryptoJcr;
    return this;
  }

   /**
   * Get comAdobeGraniteCryptoJcr
   * @return comAdobeGraniteCryptoJcr
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCryptoJcr() {
    return comAdobeGraniteCryptoJcr;
  }

  public void setComAdobeGraniteCryptoJcr(ConfigNodePropertyString comAdobeGraniteCryptoJcr) {
    this.comAdobeGraniteCryptoJcr = comAdobeGraniteCryptoJcr;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCsrf(ConfigNodePropertyString comAdobeGraniteCsrf) {
    this.comAdobeGraniteCsrf = comAdobeGraniteCsrf;
    return this;
  }

   /**
   * Get comAdobeGraniteCsrf
   * @return comAdobeGraniteCsrf
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteCsrf() {
    return comAdobeGraniteCsrf;
  }

  public void setComAdobeGraniteCsrf(ConfigNodePropertyString comAdobeGraniteCsrf) {
    this.comAdobeGraniteCsrf = comAdobeGraniteCsrf;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteDistributionCore(ConfigNodePropertyString comAdobeGraniteDistributionCore) {
    this.comAdobeGraniteDistributionCore = comAdobeGraniteDistributionCore;
    return this;
  }

   /**
   * Get comAdobeGraniteDistributionCore
   * @return comAdobeGraniteDistributionCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteDistributionCore() {
    return comAdobeGraniteDistributionCore;
  }

  public void setComAdobeGraniteDistributionCore(ConfigNodePropertyString comAdobeGraniteDistributionCore) {
    this.comAdobeGraniteDistributionCore = comAdobeGraniteDistributionCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteDropwizardMetrics(ConfigNodePropertyString comAdobeGraniteDropwizardMetrics) {
    this.comAdobeGraniteDropwizardMetrics = comAdobeGraniteDropwizardMetrics;
    return this;
  }

   /**
   * Get comAdobeGraniteDropwizardMetrics
   * @return comAdobeGraniteDropwizardMetrics
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteDropwizardMetrics() {
    return comAdobeGraniteDropwizardMetrics;
  }

  public void setComAdobeGraniteDropwizardMetrics(ConfigNodePropertyString comAdobeGraniteDropwizardMetrics) {
    this.comAdobeGraniteDropwizardMetrics = comAdobeGraniteDropwizardMetrics;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteFragsImpl(ConfigNodePropertyString comAdobeGraniteFragsImpl) {
    this.comAdobeGraniteFragsImpl = comAdobeGraniteFragsImpl;
    return this;
  }

   /**
   * Get comAdobeGraniteFragsImpl
   * @return comAdobeGraniteFragsImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteFragsImpl() {
    return comAdobeGraniteFragsImpl;
  }

  public void setComAdobeGraniteFragsImpl(ConfigNodePropertyString comAdobeGraniteFragsImpl) {
    this.comAdobeGraniteFragsImpl = comAdobeGraniteFragsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteGibson(ConfigNodePropertyString comAdobeGraniteGibson) {
    this.comAdobeGraniteGibson = comAdobeGraniteGibson;
    return this;
  }

   /**
   * Get comAdobeGraniteGibson
   * @return comAdobeGraniteGibson
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteGibson() {
    return comAdobeGraniteGibson;
  }

  public void setComAdobeGraniteGibson(ConfigNodePropertyString comAdobeGraniteGibson) {
    this.comAdobeGraniteGibson = comAdobeGraniteGibson;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteInfocollector(ConfigNodePropertyString comAdobeGraniteInfocollector) {
    this.comAdobeGraniteInfocollector = comAdobeGraniteInfocollector;
    return this;
  }

   /**
   * Get comAdobeGraniteInfocollector
   * @return comAdobeGraniteInfocollector
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteInfocollector() {
    return comAdobeGraniteInfocollector;
  }

  public void setComAdobeGraniteInfocollector(ConfigNodePropertyString comAdobeGraniteInfocollector) {
    this.comAdobeGraniteInfocollector = comAdobeGraniteInfocollector;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteInstallerFactoryPackages(ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages) {
    this.comAdobeGraniteInstallerFactoryPackages = comAdobeGraniteInstallerFactoryPackages;
    return this;
  }

   /**
   * Get comAdobeGraniteInstallerFactoryPackages
   * @return comAdobeGraniteInstallerFactoryPackages
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteInstallerFactoryPackages() {
    return comAdobeGraniteInstallerFactoryPackages;
  }

  public void setComAdobeGraniteInstallerFactoryPackages(ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages) {
    this.comAdobeGraniteInstallerFactoryPackages = comAdobeGraniteInstallerFactoryPackages;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteJettySsl(ConfigNodePropertyString comAdobeGraniteJettySsl) {
    this.comAdobeGraniteJettySsl = comAdobeGraniteJettySsl;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySsl
   * @return comAdobeGraniteJettySsl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteJettySsl() {
    return comAdobeGraniteJettySsl;
  }

  public void setComAdobeGraniteJettySsl(ConfigNodePropertyString comAdobeGraniteJettySsl) {
    this.comAdobeGraniteJettySsl = comAdobeGraniteJettySsl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteJobsAsync(ConfigNodePropertyString comAdobeGraniteJobsAsync) {
    this.comAdobeGraniteJobsAsync = comAdobeGraniteJobsAsync;
    return this;
  }

   /**
   * Get comAdobeGraniteJobsAsync
   * @return comAdobeGraniteJobsAsync
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteJobsAsync() {
    return comAdobeGraniteJobsAsync;
  }

  public void setComAdobeGraniteJobsAsync(ConfigNodePropertyString comAdobeGraniteJobsAsync) {
    this.comAdobeGraniteJobsAsync = comAdobeGraniteJobsAsync;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteMaintenanceOak(ConfigNodePropertyString comAdobeGraniteMaintenanceOak) {
    this.comAdobeGraniteMaintenanceOak = comAdobeGraniteMaintenanceOak;
    return this;
  }

   /**
   * Get comAdobeGraniteMaintenanceOak
   * @return comAdobeGraniteMaintenanceOak
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteMaintenanceOak() {
    return comAdobeGraniteMaintenanceOak;
  }

  public void setComAdobeGraniteMaintenanceOak(ConfigNodePropertyString comAdobeGraniteMaintenanceOak) {
    this.comAdobeGraniteMaintenanceOak = comAdobeGraniteMaintenanceOak;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteMonitoringCore(ConfigNodePropertyString comAdobeGraniteMonitoringCore) {
    this.comAdobeGraniteMonitoringCore = comAdobeGraniteMonitoringCore;
    return this;
  }

   /**
   * Get comAdobeGraniteMonitoringCore
   * @return comAdobeGraniteMonitoringCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteMonitoringCore() {
    return comAdobeGraniteMonitoringCore;
  }

  public void setComAdobeGraniteMonitoringCore(ConfigNodePropertyString comAdobeGraniteMonitoringCore) {
    this.comAdobeGraniteMonitoringCore = comAdobeGraniteMonitoringCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteQueries(ConfigNodePropertyString comAdobeGraniteQueries) {
    this.comAdobeGraniteQueries = comAdobeGraniteQueries;
    return this;
  }

   /**
   * Get comAdobeGraniteQueries
   * @return comAdobeGraniteQueries
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteQueries() {
    return comAdobeGraniteQueries;
  }

  public void setComAdobeGraniteQueries(ConfigNodePropertyString comAdobeGraniteQueries) {
    this.comAdobeGraniteQueries = comAdobeGraniteQueries;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteReplicationHcImpl(ConfigNodePropertyString comAdobeGraniteReplicationHcImpl) {
    this.comAdobeGraniteReplicationHcImpl = comAdobeGraniteReplicationHcImpl;
    return this;
  }

   /**
   * Get comAdobeGraniteReplicationHcImpl
   * @return comAdobeGraniteReplicationHcImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteReplicationHcImpl() {
    return comAdobeGraniteReplicationHcImpl;
  }

  public void setComAdobeGraniteReplicationHcImpl(ConfigNodePropertyString comAdobeGraniteReplicationHcImpl) {
    this.comAdobeGraniteReplicationHcImpl = comAdobeGraniteReplicationHcImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteRepositoryChecker(ConfigNodePropertyString comAdobeGraniteRepositoryChecker) {
    this.comAdobeGraniteRepositoryChecker = comAdobeGraniteRepositoryChecker;
    return this;
  }

   /**
   * Get comAdobeGraniteRepositoryChecker
   * @return comAdobeGraniteRepositoryChecker
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteRepositoryChecker() {
    return comAdobeGraniteRepositoryChecker;
  }

  public void setComAdobeGraniteRepositoryChecker(ConfigNodePropertyString comAdobeGraniteRepositoryChecker) {
    this.comAdobeGraniteRepositoryChecker = comAdobeGraniteRepositoryChecker;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteRepositoryHcImpl(ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl) {
    this.comAdobeGraniteRepositoryHcImpl = comAdobeGraniteRepositoryHcImpl;
    return this;
  }

   /**
   * Get comAdobeGraniteRepositoryHcImpl
   * @return comAdobeGraniteRepositoryHcImpl
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteRepositoryHcImpl() {
    return comAdobeGraniteRepositoryHcImpl;
  }

  public void setComAdobeGraniteRepositoryHcImpl(ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl) {
    this.comAdobeGraniteRepositoryHcImpl = comAdobeGraniteRepositoryHcImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteRestAssets(ConfigNodePropertyString comAdobeGraniteRestAssets) {
    this.comAdobeGraniteRestAssets = comAdobeGraniteRestAssets;
    return this;
  }

   /**
   * Get comAdobeGraniteRestAssets
   * @return comAdobeGraniteRestAssets
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteRestAssets() {
    return comAdobeGraniteRestAssets;
  }

  public void setComAdobeGraniteRestAssets(ConfigNodePropertyString comAdobeGraniteRestAssets) {
    this.comAdobeGraniteRestAssets = comAdobeGraniteRestAssets;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteSecurityUi(ConfigNodePropertyString comAdobeGraniteSecurityUi) {
    this.comAdobeGraniteSecurityUi = comAdobeGraniteSecurityUi;
    return this;
  }

   /**
   * Get comAdobeGraniteSecurityUi
   * @return comAdobeGraniteSecurityUi
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteSecurityUi() {
    return comAdobeGraniteSecurityUi;
  }

  public void setComAdobeGraniteSecurityUi(ConfigNodePropertyString comAdobeGraniteSecurityUi) {
    this.comAdobeGraniteSecurityUi = comAdobeGraniteSecurityUi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteStartup(ConfigNodePropertyString comAdobeGraniteStartup) {
    this.comAdobeGraniteStartup = comAdobeGraniteStartup;
    return this;
  }

   /**
   * Get comAdobeGraniteStartup
   * @return comAdobeGraniteStartup
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteStartup() {
    return comAdobeGraniteStartup;
  }

  public void setComAdobeGraniteStartup(ConfigNodePropertyString comAdobeGraniteStartup) {
    this.comAdobeGraniteStartup = comAdobeGraniteStartup;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteTagsoup(ConfigNodePropertyString comAdobeGraniteTagsoup) {
    this.comAdobeGraniteTagsoup = comAdobeGraniteTagsoup;
    return this;
  }

   /**
   * Get comAdobeGraniteTagsoup
   * @return comAdobeGraniteTagsoup
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteTagsoup() {
    return comAdobeGraniteTagsoup;
  }

  public void setComAdobeGraniteTagsoup(ConfigNodePropertyString comAdobeGraniteTagsoup) {
    this.comAdobeGraniteTagsoup = comAdobeGraniteTagsoup;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteTaskmanagementCore(ConfigNodePropertyString comAdobeGraniteTaskmanagementCore) {
    this.comAdobeGraniteTaskmanagementCore = comAdobeGraniteTaskmanagementCore;
    return this;
  }

   /**
   * Get comAdobeGraniteTaskmanagementCore
   * @return comAdobeGraniteTaskmanagementCore
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteTaskmanagementCore() {
    return comAdobeGraniteTaskmanagementCore;
  }

  public void setComAdobeGraniteTaskmanagementCore(ConfigNodePropertyString comAdobeGraniteTaskmanagementCore) {
    this.comAdobeGraniteTaskmanagementCore = comAdobeGraniteTaskmanagementCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteTaskmanagementWorkflow(ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow) {
    this.comAdobeGraniteTaskmanagementWorkflow = comAdobeGraniteTaskmanagementWorkflow;
    return this;
  }

   /**
   * Get comAdobeGraniteTaskmanagementWorkflow
   * @return comAdobeGraniteTaskmanagementWorkflow
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteTaskmanagementWorkflow() {
    return comAdobeGraniteTaskmanagementWorkflow;
  }

  public void setComAdobeGraniteTaskmanagementWorkflow(ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow) {
    this.comAdobeGraniteTaskmanagementWorkflow = comAdobeGraniteTaskmanagementWorkflow;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteUiClientlibsCompilerLess(ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess) {
    this.comAdobeGraniteUiClientlibsCompilerLess = comAdobeGraniteUiClientlibsCompilerLess;
    return this;
  }

   /**
   * Get comAdobeGraniteUiClientlibsCompilerLess
   * @return comAdobeGraniteUiClientlibsCompilerLess
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteUiClientlibsCompilerLess() {
    return comAdobeGraniteUiClientlibsCompilerLess;
  }

  public void setComAdobeGraniteUiClientlibsCompilerLess(ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess) {
    this.comAdobeGraniteUiClientlibsCompilerLess = comAdobeGraniteUiClientlibsCompilerLess;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteUiClientlibsProcessorGcc(ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc) {
    this.comAdobeGraniteUiClientlibsProcessorGcc = comAdobeGraniteUiClientlibsProcessorGcc;
    return this;
  }

   /**
   * Get comAdobeGraniteUiClientlibsProcessorGcc
   * @return comAdobeGraniteUiClientlibsProcessorGcc
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteUiClientlibsProcessorGcc() {
    return comAdobeGraniteUiClientlibsProcessorGcc;
  }

  public void setComAdobeGraniteUiClientlibsProcessorGcc(ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc) {
    this.comAdobeGraniteUiClientlibsProcessorGcc = comAdobeGraniteUiClientlibsProcessorGcc;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteWebconsolePlugins(ConfigNodePropertyString comAdobeGraniteWebconsolePlugins) {
    this.comAdobeGraniteWebconsolePlugins = comAdobeGraniteWebconsolePlugins;
    return this;
  }

   /**
   * Get comAdobeGraniteWebconsolePlugins
   * @return comAdobeGraniteWebconsolePlugins
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteWebconsolePlugins() {
    return comAdobeGraniteWebconsolePlugins;
  }

  public void setComAdobeGraniteWebconsolePlugins(ConfigNodePropertyString comAdobeGraniteWebconsolePlugins) {
    this.comAdobeGraniteWebconsolePlugins = comAdobeGraniteWebconsolePlugins;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteWorkflowConsole(ConfigNodePropertyString comAdobeGraniteWorkflowConsole) {
    this.comAdobeGraniteWorkflowConsole = comAdobeGraniteWorkflowConsole;
    return this;
  }

   /**
   * Get comAdobeGraniteWorkflowConsole
   * @return comAdobeGraniteWorkflowConsole
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeGraniteWorkflowConsole() {
    return comAdobeGraniteWorkflowConsole;
  }

  public void setComAdobeGraniteWorkflowConsole(ConfigNodePropertyString comAdobeGraniteWorkflowConsole) {
    this.comAdobeGraniteWorkflowConsole = comAdobeGraniteWorkflowConsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeXmpWorkerFilesNativeFragmentLinux(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux) {
    this.comAdobeXmpWorkerFilesNativeFragmentLinux = comAdobeXmpWorkerFilesNativeFragmentLinux;
    return this;
  }

   /**
   * Get comAdobeXmpWorkerFilesNativeFragmentLinux
   * @return comAdobeXmpWorkerFilesNativeFragmentLinux
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentLinux() {
    return comAdobeXmpWorkerFilesNativeFragmentLinux;
  }

  public void setComAdobeXmpWorkerFilesNativeFragmentLinux(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux) {
    this.comAdobeXmpWorkerFilesNativeFragmentLinux = comAdobeXmpWorkerFilesNativeFragmentLinux;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeXmpWorkerFilesNativeFragmentMacosx(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx) {
    this.comAdobeXmpWorkerFilesNativeFragmentMacosx = comAdobeXmpWorkerFilesNativeFragmentMacosx;
    return this;
  }

   /**
   * Get comAdobeXmpWorkerFilesNativeFragmentMacosx
   * @return comAdobeXmpWorkerFilesNativeFragmentMacosx
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentMacosx() {
    return comAdobeXmpWorkerFilesNativeFragmentMacosx;
  }

  public void setComAdobeXmpWorkerFilesNativeFragmentMacosx(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx) {
    this.comAdobeXmpWorkerFilesNativeFragmentMacosx = comAdobeXmpWorkerFilesNativeFragmentMacosx;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeXmpWorkerFilesNativeFragmentWin(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin) {
    this.comAdobeXmpWorkerFilesNativeFragmentWin = comAdobeXmpWorkerFilesNativeFragmentWin;
    return this;
  }

   /**
   * Get comAdobeXmpWorkerFilesNativeFragmentWin
   * @return comAdobeXmpWorkerFilesNativeFragmentWin
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentWin() {
    return comAdobeXmpWorkerFilesNativeFragmentWin;
  }

  public void setComAdobeXmpWorkerFilesNativeFragmentWin(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin) {
    this.comAdobeXmpWorkerFilesNativeFragmentWin = comAdobeXmpWorkerFilesNativeFragmentWin;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCommonsOsgiWrapperSimpleJndi(ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi) {
    this.comDayCommonsOsgiWrapperSimpleJndi = comDayCommonsOsgiWrapperSimpleJndi;
    return this;
  }

   /**
   * Get comDayCommonsOsgiWrapperSimpleJndi
   * @return comDayCommonsOsgiWrapperSimpleJndi
  **/
  @Valid
  public ConfigNodePropertyString getComDayCommonsOsgiWrapperSimpleJndi() {
    return comDayCommonsOsgiWrapperSimpleJndi;
  }

  public void setComDayCommonsOsgiWrapperSimpleJndi(ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi) {
    this.comDayCommonsOsgiWrapperSimpleJndi = comDayCommonsOsgiWrapperSimpleJndi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqAuthhandler(ConfigNodePropertyString comDayCqCqAuthhandler) {
    this.comDayCqCqAuthhandler = comDayCqCqAuthhandler;
    return this;
  }

   /**
   * Get comDayCqCqAuthhandler
   * @return comDayCqCqAuthhandler
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqCqAuthhandler() {
    return comDayCqCqAuthhandler;
  }

  public void setComDayCqCqAuthhandler(ConfigNodePropertyString comDayCqCqAuthhandler) {
    this.comDayCqCqAuthhandler = comDayCqCqAuthhandler;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqCompatConfigupdate(ConfigNodePropertyString comDayCqCqCompatConfigupdate) {
    this.comDayCqCqCompatConfigupdate = comDayCqCqCompatConfigupdate;
    return this;
  }

   /**
   * Get comDayCqCqCompatConfigupdate
   * @return comDayCqCqCompatConfigupdate
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqCqCompatConfigupdate() {
    return comDayCqCqCompatConfigupdate;
  }

  public void setComDayCqCqCompatConfigupdate(ConfigNodePropertyString comDayCqCqCompatConfigupdate) {
    this.comDayCqCqCompatConfigupdate = comDayCqCqCompatConfigupdate;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqLicensebranding(ConfigNodePropertyString comDayCqCqLicensebranding) {
    this.comDayCqCqLicensebranding = comDayCqCqLicensebranding;
    return this;
  }

   /**
   * Get comDayCqCqLicensebranding
   * @return comDayCqCqLicensebranding
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqCqLicensebranding() {
    return comDayCqCqLicensebranding;
  }

  public void setComDayCqCqLicensebranding(ConfigNodePropertyString comDayCqCqLicensebranding) {
    this.comDayCqCqLicensebranding = comDayCqCqLicensebranding;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqNotifcationImpl(ConfigNodePropertyString comDayCqCqNotifcationImpl) {
    this.comDayCqCqNotifcationImpl = comDayCqCqNotifcationImpl;
    return this;
  }

   /**
   * Get comDayCqCqNotifcationImpl
   * @return comDayCqCqNotifcationImpl
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqCqNotifcationImpl() {
    return comDayCqCqNotifcationImpl;
  }

  public void setComDayCqCqNotifcationImpl(ConfigNodePropertyString comDayCqCqNotifcationImpl) {
    this.comDayCqCqNotifcationImpl = comDayCqCqNotifcationImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqReplicationAudit(ConfigNodePropertyString comDayCqCqReplicationAudit) {
    this.comDayCqCqReplicationAudit = comDayCqCqReplicationAudit;
    return this;
  }

   /**
   * Get comDayCqCqReplicationAudit
   * @return comDayCqCqReplicationAudit
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqCqReplicationAudit() {
    return comDayCqCqReplicationAudit;
  }

  public void setComDayCqCqReplicationAudit(ConfigNodePropertyString comDayCqCqReplicationAudit) {
    this.comDayCqCqReplicationAudit = comDayCqCqReplicationAudit;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqSearchExt(ConfigNodePropertyString comDayCqCqSearchExt) {
    this.comDayCqCqSearchExt = comDayCqCqSearchExt;
    return this;
  }

   /**
   * Get comDayCqCqSearchExt
   * @return comDayCqCqSearchExt
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqCqSearchExt() {
    return comDayCqCqSearchExt;
  }

  public void setComDayCqCqSearchExt(ConfigNodePropertyString comDayCqCqSearchExt) {
    this.comDayCqCqSearchExt = comDayCqCqSearchExt;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamAnnotationPrint(ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint) {
    this.comDayCqDamCqDamAnnotationPrint = comDayCqDamCqDamAnnotationPrint;
    return this;
  }

   /**
   * Get comDayCqDamCqDamAnnotationPrint
   * @return comDayCqDamCqDamAnnotationPrint
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqDamCqDamAnnotationPrint() {
    return comDayCqDamCqDamAnnotationPrint;
  }

  public void setComDayCqDamCqDamAnnotationPrint(ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint) {
    this.comDayCqDamCqDamAnnotationPrint = comDayCqDamCqDamAnnotationPrint;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamAssetUsage(ConfigNodePropertyString comDayCqDamCqDamAssetUsage) {
    this.comDayCqDamCqDamAssetUsage = comDayCqDamCqDamAssetUsage;
    return this;
  }

   /**
   * Get comDayCqDamCqDamAssetUsage
   * @return comDayCqDamCqDamAssetUsage
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqDamCqDamAssetUsage() {
    return comDayCqDamCqDamAssetUsage;
  }

  public void setComDayCqDamCqDamAssetUsage(ConfigNodePropertyString comDayCqDamCqDamAssetUsage) {
    this.comDayCqDamCqDamAssetUsage = comDayCqDamCqDamAssetUsage;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamS7dam(ConfigNodePropertyString comDayCqDamCqDamS7dam) {
    this.comDayCqDamCqDamS7dam = comDayCqDamCqDamS7dam;
    return this;
  }

   /**
   * Get comDayCqDamCqDamS7dam
   * @return comDayCqDamCqDamS7dam
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqDamCqDamS7dam() {
    return comDayCqDamCqDamS7dam;
  }

  public void setComDayCqDamCqDamS7dam(ConfigNodePropertyString comDayCqDamCqDamS7dam) {
    this.comDayCqDamCqDamS7dam = comDayCqDamCqDamS7dam;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamSimilaritysearch(ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch) {
    this.comDayCqDamCqDamSimilaritysearch = comDayCqDamCqDamSimilaritysearch;
    return this;
  }

   /**
   * Get comDayCqDamCqDamSimilaritysearch
   * @return comDayCqDamCqDamSimilaritysearch
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqDamCqDamSimilaritysearch() {
    return comDayCqDamCqDamSimilaritysearch;
  }

  public void setComDayCqDamCqDamSimilaritysearch(ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch) {
    this.comDayCqDamCqDamSimilaritysearch = comDayCqDamCqDamSimilaritysearch;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamDamWebdavSupport(ConfigNodePropertyString comDayCqDamDamWebdavSupport) {
    this.comDayCqDamDamWebdavSupport = comDayCqDamDamWebdavSupport;
    return this;
  }

   /**
   * Get comDayCqDamDamWebdavSupport
   * @return comDayCqDamDamWebdavSupport
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqDamDamWebdavSupport() {
    return comDayCqDamDamWebdavSupport;
  }

  public void setComDayCqDamDamWebdavSupport(ConfigNodePropertyString comDayCqDamDamWebdavSupport) {
    this.comDayCqDamDamWebdavSupport = comDayCqDamDamWebdavSupport;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqPreUpgradeTasks(ConfigNodePropertyString comDayCqPreUpgradeTasks) {
    this.comDayCqPreUpgradeTasks = comDayCqPreUpgradeTasks;
    return this;
  }

   /**
   * Get comDayCqPreUpgradeTasks
   * @return comDayCqPreUpgradeTasks
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqPreUpgradeTasks() {
    return comDayCqPreUpgradeTasks;
  }

  public void setComDayCqPreUpgradeTasks(ConfigNodePropertyString comDayCqPreUpgradeTasks) {
    this.comDayCqPreUpgradeTasks = comDayCqPreUpgradeTasks;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqReplicationExtensions(ConfigNodePropertyString comDayCqReplicationExtensions) {
    this.comDayCqReplicationExtensions = comDayCqReplicationExtensions;
    return this;
  }

   /**
   * Get comDayCqReplicationExtensions
   * @return comDayCqReplicationExtensions
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqReplicationExtensions() {
    return comDayCqReplicationExtensions;
  }

  public void setComDayCqReplicationExtensions(ConfigNodePropertyString comDayCqReplicationExtensions) {
    this.comDayCqReplicationExtensions = comDayCqReplicationExtensions;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqWcmCqMsmCore(ConfigNodePropertyString comDayCqWcmCqMsmCore) {
    this.comDayCqWcmCqMsmCore = comDayCqWcmCqMsmCore;
    return this;
  }

   /**
   * Get comDayCqWcmCqMsmCore
   * @return comDayCqWcmCqMsmCore
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqWcmCqMsmCore() {
    return comDayCqWcmCqMsmCore;
  }

  public void setComDayCqWcmCqMsmCore(ConfigNodePropertyString comDayCqWcmCqMsmCore) {
    this.comDayCqWcmCqMsmCore = comDayCqWcmCqMsmCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqWcmCqWcmTranslation(ConfigNodePropertyString comDayCqWcmCqWcmTranslation) {
    this.comDayCqWcmCqWcmTranslation = comDayCqWcmCqWcmTranslation;
    return this;
  }

   /**
   * Get comDayCqWcmCqWcmTranslation
   * @return comDayCqWcmCqWcmTranslation
  **/
  @Valid
  public ConfigNodePropertyString getComDayCqWcmCqWcmTranslation() {
    return comDayCqWcmCqWcmTranslation;
  }

  public void setComDayCqWcmCqWcmTranslation(ConfigNodePropertyString comDayCqWcmCqWcmTranslation) {
    this.comDayCqWcmCqWcmTranslation = comDayCqWcmCqWcmTranslation;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties dayCommonsJrawio(ConfigNodePropertyString dayCommonsJrawio) {
    this.dayCommonsJrawio = dayCommonsJrawio;
    return this;
  }

   /**
   * Get dayCommonsJrawio
   * @return dayCommonsJrawio
  **/
  @Valid
  public ConfigNodePropertyString getDayCommonsJrawio() {
    return dayCommonsJrawio;
  }

  public void setDayCommonsJrawio(ConfigNodePropertyString dayCommonsJrawio) {
    this.dayCommonsJrawio = dayCommonsJrawio;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheAriesJmxWhiteboard(ConfigNodePropertyString orgApacheAriesJmxWhiteboard) {
    this.orgApacheAriesJmxWhiteboard = orgApacheAriesJmxWhiteboard;
    return this;
  }

   /**
   * Get orgApacheAriesJmxWhiteboard
   * @return orgApacheAriesJmxWhiteboard
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheAriesJmxWhiteboard() {
    return orgApacheAriesJmxWhiteboard;
  }

  public void setOrgApacheAriesJmxWhiteboard(ConfigNodePropertyString orgApacheAriesJmxWhiteboard) {
    this.orgApacheAriesJmxWhiteboard = orgApacheAriesJmxWhiteboard;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixHttpSslfilter(ConfigNodePropertyString orgApacheFelixHttpSslfilter) {
    this.orgApacheFelixHttpSslfilter = orgApacheFelixHttpSslfilter;
    return this;
  }

   /**
   * Get orgApacheFelixHttpSslfilter
   * @return orgApacheFelixHttpSslfilter
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheFelixHttpSslfilter() {
    return orgApacheFelixHttpSslfilter;
  }

  public void setOrgApacheFelixHttpSslfilter(ConfigNodePropertyString orgApacheFelixHttpSslfilter) {
    this.orgApacheFelixHttpSslfilter = orgApacheFelixHttpSslfilter;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixOrgApacheFelixThreaddump(ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump) {
    this.orgApacheFelixOrgApacheFelixThreaddump = orgApacheFelixOrgApacheFelixThreaddump;
    return this;
  }

   /**
   * Get orgApacheFelixOrgApacheFelixThreaddump
   * @return orgApacheFelixOrgApacheFelixThreaddump
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheFelixOrgApacheFelixThreaddump() {
    return orgApacheFelixOrgApacheFelixThreaddump;
  }

  public void setOrgApacheFelixOrgApacheFelixThreaddump(ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump) {
    this.orgApacheFelixOrgApacheFelixThreaddump = orgApacheFelixOrgApacheFelixThreaddump;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsDs(ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs) {
    this.orgApacheFelixWebconsolePluginsDs = orgApacheFelixWebconsolePluginsDs;
    return this;
  }

   /**
   * Get orgApacheFelixWebconsolePluginsDs
   * @return orgApacheFelixWebconsolePluginsDs
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsDs() {
    return orgApacheFelixWebconsolePluginsDs;
  }

  public void setOrgApacheFelixWebconsolePluginsDs(ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs) {
    this.orgApacheFelixWebconsolePluginsDs = orgApacheFelixWebconsolePluginsDs;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsEvent(ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent) {
    this.orgApacheFelixWebconsolePluginsEvent = orgApacheFelixWebconsolePluginsEvent;
    return this;
  }

   /**
   * Get orgApacheFelixWebconsolePluginsEvent
   * @return orgApacheFelixWebconsolePluginsEvent
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsEvent() {
    return orgApacheFelixWebconsolePluginsEvent;
  }

  public void setOrgApacheFelixWebconsolePluginsEvent(ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent) {
    this.orgApacheFelixWebconsolePluginsEvent = orgApacheFelixWebconsolePluginsEvent;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsMemoryusage(ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage) {
    this.orgApacheFelixWebconsolePluginsMemoryusage = orgApacheFelixWebconsolePluginsMemoryusage;
    return this;
  }

   /**
   * Get orgApacheFelixWebconsolePluginsMemoryusage
   * @return orgApacheFelixWebconsolePluginsMemoryusage
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsMemoryusage() {
    return orgApacheFelixWebconsolePluginsMemoryusage;
  }

  public void setOrgApacheFelixWebconsolePluginsMemoryusage(ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage) {
    this.orgApacheFelixWebconsolePluginsMemoryusage = orgApacheFelixWebconsolePluginsMemoryusage;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsPackageadmin(ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin) {
    this.orgApacheFelixWebconsolePluginsPackageadmin = orgApacheFelixWebconsolePluginsPackageadmin;
    return this;
  }

   /**
   * Get orgApacheFelixWebconsolePluginsPackageadmin
   * @return orgApacheFelixWebconsolePluginsPackageadmin
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsPackageadmin() {
    return orgApacheFelixWebconsolePluginsPackageadmin;
  }

  public void setOrgApacheFelixWebconsolePluginsPackageadmin(ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin) {
    this.orgApacheFelixWebconsolePluginsPackageadmin = orgApacheFelixWebconsolePluginsPackageadmin;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheJackrabbitOakAuthLdap(ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap) {
    this.orgApacheJackrabbitOakAuthLdap = orgApacheJackrabbitOakAuthLdap;
    return this;
  }

   /**
   * Get orgApacheJackrabbitOakAuthLdap
   * @return orgApacheJackrabbitOakAuthLdap
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthLdap() {
    return orgApacheJackrabbitOakAuthLdap;
  }

  public void setOrgApacheJackrabbitOakAuthLdap(ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap) {
    this.orgApacheJackrabbitOakAuthLdap = orgApacheJackrabbitOakAuthLdap;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheJackrabbitOakSegmentTar(ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar) {
    this.orgApacheJackrabbitOakSegmentTar = orgApacheJackrabbitOakSegmentTar;
    return this;
  }

   /**
   * Get orgApacheJackrabbitOakSegmentTar
   * @return orgApacheJackrabbitOakSegmentTar
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheJackrabbitOakSegmentTar() {
    return orgApacheJackrabbitOakSegmentTar;
  }

  public void setOrgApacheJackrabbitOakSegmentTar(ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar) {
    this.orgApacheJackrabbitOakSegmentTar = orgApacheJackrabbitOakSegmentTar;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheJackrabbitOakSolrOsgi(ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi) {
    this.orgApacheJackrabbitOakSolrOsgi = orgApacheJackrabbitOakSolrOsgi;
    return this;
  }

   /**
   * Get orgApacheJackrabbitOakSolrOsgi
   * @return orgApacheJackrabbitOakSolrOsgi
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheJackrabbitOakSolrOsgi() {
    return orgApacheJackrabbitOakSolrOsgi;
  }

  public void setOrgApacheJackrabbitOakSolrOsgi(ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi) {
    this.orgApacheJackrabbitOakSolrOsgi = orgApacheJackrabbitOakSolrOsgi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingBundleresourceImpl(ConfigNodePropertyString orgApacheSlingBundleresourceImpl) {
    this.orgApacheSlingBundleresourceImpl = orgApacheSlingBundleresourceImpl;
    return this;
  }

   /**
   * Get orgApacheSlingBundleresourceImpl
   * @return orgApacheSlingBundleresourceImpl
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingBundleresourceImpl() {
    return orgApacheSlingBundleresourceImpl;
  }

  public void setOrgApacheSlingBundleresourceImpl(ConfigNodePropertyString orgApacheSlingBundleresourceImpl) {
    this.orgApacheSlingBundleresourceImpl = orgApacheSlingBundleresourceImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingCommonsFsclassloader(ConfigNodePropertyString orgApacheSlingCommonsFsclassloader) {
    this.orgApacheSlingCommonsFsclassloader = orgApacheSlingCommonsFsclassloader;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsFsclassloader
   * @return orgApacheSlingCommonsFsclassloader
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingCommonsFsclassloader() {
    return orgApacheSlingCommonsFsclassloader;
  }

  public void setOrgApacheSlingCommonsFsclassloader(ConfigNodePropertyString orgApacheSlingCommonsFsclassloader) {
    this.orgApacheSlingCommonsFsclassloader = orgApacheSlingCommonsFsclassloader;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingCommonsLogWebconsole(ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole) {
    this.orgApacheSlingCommonsLogWebconsole = orgApacheSlingCommonsLogWebconsole;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogWebconsole
   * @return orgApacheSlingCommonsLogWebconsole
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogWebconsole() {
    return orgApacheSlingCommonsLogWebconsole;
  }

  public void setOrgApacheSlingCommonsLogWebconsole(ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole) {
    this.orgApacheSlingCommonsLogWebconsole = orgApacheSlingCommonsLogWebconsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDatasource(ConfigNodePropertyString orgApacheSlingDatasource) {
    this.orgApacheSlingDatasource = orgApacheSlingDatasource;
    return this;
  }

   /**
   * Get orgApacheSlingDatasource
   * @return orgApacheSlingDatasource
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingDatasource() {
    return orgApacheSlingDatasource;
  }

  public void setOrgApacheSlingDatasource(ConfigNodePropertyString orgApacheSlingDatasource) {
    this.orgApacheSlingDatasource = orgApacheSlingDatasource;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDiscoveryBase(ConfigNodePropertyString orgApacheSlingDiscoveryBase) {
    this.orgApacheSlingDiscoveryBase = orgApacheSlingDiscoveryBase;
    return this;
  }

   /**
   * Get orgApacheSlingDiscoveryBase
   * @return orgApacheSlingDiscoveryBase
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingDiscoveryBase() {
    return orgApacheSlingDiscoveryBase;
  }

  public void setOrgApacheSlingDiscoveryBase(ConfigNodePropertyString orgApacheSlingDiscoveryBase) {
    this.orgApacheSlingDiscoveryBase = orgApacheSlingDiscoveryBase;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDiscoveryOak(ConfigNodePropertyString orgApacheSlingDiscoveryOak) {
    this.orgApacheSlingDiscoveryOak = orgApacheSlingDiscoveryOak;
    return this;
  }

   /**
   * Get orgApacheSlingDiscoveryOak
   * @return orgApacheSlingDiscoveryOak
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingDiscoveryOak() {
    return orgApacheSlingDiscoveryOak;
  }

  public void setOrgApacheSlingDiscoveryOak(ConfigNodePropertyString orgApacheSlingDiscoveryOak) {
    this.orgApacheSlingDiscoveryOak = orgApacheSlingDiscoveryOak;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDiscoverySupport(ConfigNodePropertyString orgApacheSlingDiscoverySupport) {
    this.orgApacheSlingDiscoverySupport = orgApacheSlingDiscoverySupport;
    return this;
  }

   /**
   * Get orgApacheSlingDiscoverySupport
   * @return orgApacheSlingDiscoverySupport
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingDiscoverySupport() {
    return orgApacheSlingDiscoverySupport;
  }

  public void setOrgApacheSlingDiscoverySupport(ConfigNodePropertyString orgApacheSlingDiscoverySupport) {
    this.orgApacheSlingDiscoverySupport = orgApacheSlingDiscoverySupport;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDistributionApi(ConfigNodePropertyString orgApacheSlingDistributionApi) {
    this.orgApacheSlingDistributionApi = orgApacheSlingDistributionApi;
    return this;
  }

   /**
   * Get orgApacheSlingDistributionApi
   * @return orgApacheSlingDistributionApi
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingDistributionApi() {
    return orgApacheSlingDistributionApi;
  }

  public void setOrgApacheSlingDistributionApi(ConfigNodePropertyString orgApacheSlingDistributionApi) {
    this.orgApacheSlingDistributionApi = orgApacheSlingDistributionApi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDistributionCore(ConfigNodePropertyString orgApacheSlingDistributionCore) {
    this.orgApacheSlingDistributionCore = orgApacheSlingDistributionCore;
    return this;
  }

   /**
   * Get orgApacheSlingDistributionCore
   * @return orgApacheSlingDistributionCore
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingDistributionCore() {
    return orgApacheSlingDistributionCore;
  }

  public void setOrgApacheSlingDistributionCore(ConfigNodePropertyString orgApacheSlingDistributionCore) {
    this.orgApacheSlingDistributionCore = orgApacheSlingDistributionCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingExtensionsWebconsolesecurityprovider(ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider) {
    this.orgApacheSlingExtensionsWebconsolesecurityprovider = orgApacheSlingExtensionsWebconsolesecurityprovider;
    return this;
  }

   /**
   * Get orgApacheSlingExtensionsWebconsolesecurityprovider
   * @return orgApacheSlingExtensionsWebconsolesecurityprovider
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingExtensionsWebconsolesecurityprovider() {
    return orgApacheSlingExtensionsWebconsolesecurityprovider;
  }

  public void setOrgApacheSlingExtensionsWebconsolesecurityprovider(ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider) {
    this.orgApacheSlingExtensionsWebconsolesecurityprovider = orgApacheSlingExtensionsWebconsolesecurityprovider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingHcWebconsole(ConfigNodePropertyString orgApacheSlingHcWebconsole) {
    this.orgApacheSlingHcWebconsole = orgApacheSlingHcWebconsole;
    return this;
  }

   /**
   * Get orgApacheSlingHcWebconsole
   * @return orgApacheSlingHcWebconsole
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingHcWebconsole() {
    return orgApacheSlingHcWebconsole;
  }

  public void setOrgApacheSlingHcWebconsole(ConfigNodePropertyString orgApacheSlingHcWebconsole) {
    this.orgApacheSlingHcWebconsole = orgApacheSlingHcWebconsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingInstallerConsole(ConfigNodePropertyString orgApacheSlingInstallerConsole) {
    this.orgApacheSlingInstallerConsole = orgApacheSlingInstallerConsole;
    return this;
  }

   /**
   * Get orgApacheSlingInstallerConsole
   * @return orgApacheSlingInstallerConsole
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingInstallerConsole() {
    return orgApacheSlingInstallerConsole;
  }

  public void setOrgApacheSlingInstallerConsole(ConfigNodePropertyString orgApacheSlingInstallerConsole) {
    this.orgApacheSlingInstallerConsole = orgApacheSlingInstallerConsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingInstallerProviderFile(ConfigNodePropertyString orgApacheSlingInstallerProviderFile) {
    this.orgApacheSlingInstallerProviderFile = orgApacheSlingInstallerProviderFile;
    return this;
  }

   /**
   * Get orgApacheSlingInstallerProviderFile
   * @return orgApacheSlingInstallerProviderFile
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingInstallerProviderFile() {
    return orgApacheSlingInstallerProviderFile;
  }

  public void setOrgApacheSlingInstallerProviderFile(ConfigNodePropertyString orgApacheSlingInstallerProviderFile) {
    this.orgApacheSlingInstallerProviderFile = orgApacheSlingInstallerProviderFile;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingInstallerProviderJcr(ConfigNodePropertyString orgApacheSlingInstallerProviderJcr) {
    this.orgApacheSlingInstallerProviderJcr = orgApacheSlingInstallerProviderJcr;
    return this;
  }

   /**
   * Get orgApacheSlingInstallerProviderJcr
   * @return orgApacheSlingInstallerProviderJcr
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingInstallerProviderJcr() {
    return orgApacheSlingInstallerProviderJcr;
  }

  public void setOrgApacheSlingInstallerProviderJcr(ConfigNodePropertyString orgApacheSlingInstallerProviderJcr) {
    this.orgApacheSlingInstallerProviderJcr = orgApacheSlingInstallerProviderJcr;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingJcrDavex(ConfigNodePropertyString orgApacheSlingJcrDavex) {
    this.orgApacheSlingJcrDavex = orgApacheSlingJcrDavex;
    return this;
  }

   /**
   * Get orgApacheSlingJcrDavex
   * @return orgApacheSlingJcrDavex
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingJcrDavex() {
    return orgApacheSlingJcrDavex;
  }

  public void setOrgApacheSlingJcrDavex(ConfigNodePropertyString orgApacheSlingJcrDavex) {
    this.orgApacheSlingJcrDavex = orgApacheSlingJcrDavex;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingJcrResourcesecurity(ConfigNodePropertyString orgApacheSlingJcrResourcesecurity) {
    this.orgApacheSlingJcrResourcesecurity = orgApacheSlingJcrResourcesecurity;
    return this;
  }

   /**
   * Get orgApacheSlingJcrResourcesecurity
   * @return orgApacheSlingJcrResourcesecurity
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingJcrResourcesecurity() {
    return orgApacheSlingJcrResourcesecurity;
  }

  public void setOrgApacheSlingJcrResourcesecurity(ConfigNodePropertyString orgApacheSlingJcrResourcesecurity) {
    this.orgApacheSlingJcrResourcesecurity = orgApacheSlingJcrResourcesecurity;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingJmxProvider(ConfigNodePropertyString orgApacheSlingJmxProvider) {
    this.orgApacheSlingJmxProvider = orgApacheSlingJmxProvider;
    return this;
  }

   /**
   * Get orgApacheSlingJmxProvider
   * @return orgApacheSlingJmxProvider
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingJmxProvider() {
    return orgApacheSlingJmxProvider;
  }

  public void setOrgApacheSlingJmxProvider(ConfigNodePropertyString orgApacheSlingJmxProvider) {
    this.orgApacheSlingJmxProvider = orgApacheSlingJmxProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingLaunchpadInstaller(ConfigNodePropertyString orgApacheSlingLaunchpadInstaller) {
    this.orgApacheSlingLaunchpadInstaller = orgApacheSlingLaunchpadInstaller;
    return this;
  }

   /**
   * Get orgApacheSlingLaunchpadInstaller
   * @return orgApacheSlingLaunchpadInstaller
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingLaunchpadInstaller() {
    return orgApacheSlingLaunchpadInstaller;
  }

  public void setOrgApacheSlingLaunchpadInstaller(ConfigNodePropertyString orgApacheSlingLaunchpadInstaller) {
    this.orgApacheSlingLaunchpadInstaller = orgApacheSlingLaunchpadInstaller;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingModelsImpl(ConfigNodePropertyString orgApacheSlingModelsImpl) {
    this.orgApacheSlingModelsImpl = orgApacheSlingModelsImpl;
    return this;
  }

   /**
   * Get orgApacheSlingModelsImpl
   * @return orgApacheSlingModelsImpl
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingModelsImpl() {
    return orgApacheSlingModelsImpl;
  }

  public void setOrgApacheSlingModelsImpl(ConfigNodePropertyString orgApacheSlingModelsImpl) {
    this.orgApacheSlingModelsImpl = orgApacheSlingModelsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingRepoinitParser(ConfigNodePropertyString orgApacheSlingRepoinitParser) {
    this.orgApacheSlingRepoinitParser = orgApacheSlingRepoinitParser;
    return this;
  }

   /**
   * Get orgApacheSlingRepoinitParser
   * @return orgApacheSlingRepoinitParser
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingRepoinitParser() {
    return orgApacheSlingRepoinitParser;
  }

  public void setOrgApacheSlingRepoinitParser(ConfigNodePropertyString orgApacheSlingRepoinitParser) {
    this.orgApacheSlingRepoinitParser = orgApacheSlingRepoinitParser;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingResourceInventory(ConfigNodePropertyString orgApacheSlingResourceInventory) {
    this.orgApacheSlingResourceInventory = orgApacheSlingResourceInventory;
    return this;
  }

   /**
   * Get orgApacheSlingResourceInventory
   * @return orgApacheSlingResourceInventory
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingResourceInventory() {
    return orgApacheSlingResourceInventory;
  }

  public void setOrgApacheSlingResourceInventory(ConfigNodePropertyString orgApacheSlingResourceInventory) {
    this.orgApacheSlingResourceInventory = orgApacheSlingResourceInventory;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingResourceresolver(ConfigNodePropertyString orgApacheSlingResourceresolver) {
    this.orgApacheSlingResourceresolver = orgApacheSlingResourceresolver;
    return this;
  }

   /**
   * Get orgApacheSlingResourceresolver
   * @return orgApacheSlingResourceresolver
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingResourceresolver() {
    return orgApacheSlingResourceresolver;
  }

  public void setOrgApacheSlingResourceresolver(ConfigNodePropertyString orgApacheSlingResourceresolver) {
    this.orgApacheSlingResourceresolver = orgApacheSlingResourceresolver;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingJavascript(ConfigNodePropertyString orgApacheSlingScriptingJavascript) {
    this.orgApacheSlingScriptingJavascript = orgApacheSlingScriptingJavascript;
    return this;
  }

   /**
   * Get orgApacheSlingScriptingJavascript
   * @return orgApacheSlingScriptingJavascript
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingScriptingJavascript() {
    return orgApacheSlingScriptingJavascript;
  }

  public void setOrgApacheSlingScriptingJavascript(ConfigNodePropertyString orgApacheSlingScriptingJavascript) {
    this.orgApacheSlingScriptingJavascript = orgApacheSlingScriptingJavascript;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingJst(ConfigNodePropertyString orgApacheSlingScriptingJst) {
    this.orgApacheSlingScriptingJst = orgApacheSlingScriptingJst;
    return this;
  }

   /**
   * Get orgApacheSlingScriptingJst
   * @return orgApacheSlingScriptingJst
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingScriptingJst() {
    return orgApacheSlingScriptingJst;
  }

  public void setOrgApacheSlingScriptingJst(ConfigNodePropertyString orgApacheSlingScriptingJst) {
    this.orgApacheSlingScriptingJst = orgApacheSlingScriptingJst;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingSightlyJsProvider(ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider) {
    this.orgApacheSlingScriptingSightlyJsProvider = orgApacheSlingScriptingSightlyJsProvider;
    return this;
  }

   /**
   * Get orgApacheSlingScriptingSightlyJsProvider
   * @return orgApacheSlingScriptingSightlyJsProvider
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingScriptingSightlyJsProvider() {
    return orgApacheSlingScriptingSightlyJsProvider;
  }

  public void setOrgApacheSlingScriptingSightlyJsProvider(ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider) {
    this.orgApacheSlingScriptingSightlyJsProvider = orgApacheSlingScriptingSightlyJsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingSightlyModelsProvider(ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider) {
    this.orgApacheSlingScriptingSightlyModelsProvider = orgApacheSlingScriptingSightlyModelsProvider;
    return this;
  }

   /**
   * Get orgApacheSlingScriptingSightlyModelsProvider
   * @return orgApacheSlingScriptingSightlyModelsProvider
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingScriptingSightlyModelsProvider() {
    return orgApacheSlingScriptingSightlyModelsProvider;
  }

  public void setOrgApacheSlingScriptingSightlyModelsProvider(ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider) {
    this.orgApacheSlingScriptingSightlyModelsProvider = orgApacheSlingScriptingSightlyModelsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingSecurity(ConfigNodePropertyString orgApacheSlingSecurity) {
    this.orgApacheSlingSecurity = orgApacheSlingSecurity;
    return this;
  }

   /**
   * Get orgApacheSlingSecurity
   * @return orgApacheSlingSecurity
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingSecurity() {
    return orgApacheSlingSecurity;
  }

  public void setOrgApacheSlingSecurity(ConfigNodePropertyString orgApacheSlingSecurity) {
    this.orgApacheSlingSecurity = orgApacheSlingSecurity;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingServletsCompat(ConfigNodePropertyString orgApacheSlingServletsCompat) {
    this.orgApacheSlingServletsCompat = orgApacheSlingServletsCompat;
    return this;
  }

   /**
   * Get orgApacheSlingServletsCompat
   * @return orgApacheSlingServletsCompat
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingServletsCompat() {
    return orgApacheSlingServletsCompat;
  }

  public void setOrgApacheSlingServletsCompat(ConfigNodePropertyString orgApacheSlingServletsCompat) {
    this.orgApacheSlingServletsCompat = orgApacheSlingServletsCompat;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingServletsGet(ConfigNodePropertyString orgApacheSlingServletsGet) {
    this.orgApacheSlingServletsGet = orgApacheSlingServletsGet;
    return this;
  }

   /**
   * Get orgApacheSlingServletsGet
   * @return orgApacheSlingServletsGet
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingServletsGet() {
    return orgApacheSlingServletsGet;
  }

  public void setOrgApacheSlingServletsGet(ConfigNodePropertyString orgApacheSlingServletsGet) {
    this.orgApacheSlingServletsGet = orgApacheSlingServletsGet;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingStartupfilterDisabler(ConfigNodePropertyString orgApacheSlingStartupfilterDisabler) {
    this.orgApacheSlingStartupfilterDisabler = orgApacheSlingStartupfilterDisabler;
    return this;
  }

   /**
   * Get orgApacheSlingStartupfilterDisabler
   * @return orgApacheSlingStartupfilterDisabler
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingStartupfilterDisabler() {
    return orgApacheSlingStartupfilterDisabler;
  }

  public void setOrgApacheSlingStartupfilterDisabler(ConfigNodePropertyString orgApacheSlingStartupfilterDisabler) {
    this.orgApacheSlingStartupfilterDisabler = orgApacheSlingStartupfilterDisabler;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingTracer(ConfigNodePropertyString orgApacheSlingTracer) {
    this.orgApacheSlingTracer = orgApacheSlingTracer;
    return this;
  }

   /**
   * Get orgApacheSlingTracer
   * @return orgApacheSlingTracer
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingTracer() {
    return orgApacheSlingTracer;
  }

  public void setOrgApacheSlingTracer(ConfigNodePropertyString orgApacheSlingTracer) {
    this.orgApacheSlingTracer = orgApacheSlingTracer;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties weRetailClientAppCore(ConfigNodePropertyString weRetailClientAppCore) {
    this.weRetailClientAppCore = weRetailClientAppCore;
    return this;
  }

   /**
   * Get weRetailClientAppCore
   * @return weRetailClientAppCore
  **/
  @Valid
  public ConfigNodePropertyString getWeRetailClientAppCore() {
    return weRetailClientAppCore;
  }

  public void setWeRetailClientAppCore(ConfigNodePropertyString weRetailClientAppCore) {
    this.weRetailClientAppCore = weRetailClientAppCore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

