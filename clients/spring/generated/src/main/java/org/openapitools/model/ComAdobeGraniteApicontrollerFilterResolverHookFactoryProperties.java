package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties
 */

@JsonTypeName("comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCdnCdnRewriter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCloudConfigComponents;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCloudConfigCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCloudConfigUi;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqComAdobeCqEditor;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqActivitymapIntegration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqContexthubCommons;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqDtm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqHealthcheck;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqMultisiteTargeting;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqProductInfoProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqRestSites;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqCqSecurityHc;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqDamCqScene7Imaging;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqDtmReactorCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqDtmReactorUi;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqExpJspelResolver;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqInboxCqInbox;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqJsonSchemaParser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqMobileCqMobileCaas;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqMyspell;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSampleWeRetailCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeDamCqDamCfmImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteApicontroller;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteAssetCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteAuthSso;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteBundlesHcImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCompatRouter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteConf;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteConfUiCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCrxExplorer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCrxdeLite;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCryptoConfig;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCryptoExtension;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCryptoFile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCryptoJcr;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteCsrf;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteDistributionCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteDropwizardMetrics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteFragsImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteGibson;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteInfocollector;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteJettySsl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteJobsAsync;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteMaintenanceOak;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteMonitoringCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteQueries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteReplicationHcImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteRepositoryChecker;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteRestAssets;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteSecurityUi;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteStartup;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteTagsoup;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteTaskmanagementCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteWebconsolePlugins;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteWorkflowConsole;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqCqAuthhandler;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqCqCompatConfigupdate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqCqLicensebranding;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqCqNotifcationImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqCqReplicationAudit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqCqSearchExt;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqDamCqDamAssetUsage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqDamCqDamS7dam;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqDamDamWebdavSupport;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqPreUpgradeTasks;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqReplicationExtensions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqWcmCqMsmCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comDayCqWcmCqWcmTranslation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString dayCommonsJrawio;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheAriesJmxWhiteboard;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpSslfilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingBundleresourceImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingCommonsFsclassloader;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingDatasource;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingDiscoveryBase;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingDiscoveryOak;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingDiscoverySupport;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingDistributionApi;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingDistributionCore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingHcWebconsole;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingInstallerConsole;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingInstallerProviderFile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingInstallerProviderJcr;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingJcrDavex;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingJcrResourcesecurity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingJmxProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingLaunchpadInstaller;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingModelsImpl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingRepoinitParser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingResourceInventory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingResourceresolver;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingScriptingJavascript;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingScriptingJst;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingSecurity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingServletsCompat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingServletsGet;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingStartupfilterDisabler;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingTracer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString weRetailClientAppCore;

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCdnCdnRewriter(@Nullable ConfigNodePropertyString comAdobeCqCdnCdnRewriter) {
    this.comAdobeCqCdnCdnRewriter = comAdobeCqCdnCdnRewriter;
    return this;
  }

  /**
   * Get comAdobeCqCdnCdnRewriter
   * @return comAdobeCqCdnCdnRewriter
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cdn.cdn-rewriter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cdn.cdn-rewriter")
  public @Nullable ConfigNodePropertyString getComAdobeCqCdnCdnRewriter() {
    return comAdobeCqCdnCdnRewriter;
  }

  @JsonProperty("com.adobe.cq.cdn.cdn-rewriter")
  public void setComAdobeCqCdnCdnRewriter(@Nullable ConfigNodePropertyString comAdobeCqCdnCdnRewriter) {
    this.comAdobeCqCdnCdnRewriter = comAdobeCqCdnCdnRewriter;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCloudConfigComponents(@Nullable ConfigNodePropertyString comAdobeCqCloudConfigComponents) {
    this.comAdobeCqCloudConfigComponents = comAdobeCqCloudConfigComponents;
    return this;
  }

  /**
   * Get comAdobeCqCloudConfigComponents
   * @return comAdobeCqCloudConfigComponents
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cloud-config.components", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cloud-config.components")
  public @Nullable ConfigNodePropertyString getComAdobeCqCloudConfigComponents() {
    return comAdobeCqCloudConfigComponents;
  }

  @JsonProperty("com.adobe.cq.cloud-config.components")
  public void setComAdobeCqCloudConfigComponents(@Nullable ConfigNodePropertyString comAdobeCqCloudConfigComponents) {
    this.comAdobeCqCloudConfigComponents = comAdobeCqCloudConfigComponents;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCloudConfigCore(@Nullable ConfigNodePropertyString comAdobeCqCloudConfigCore) {
    this.comAdobeCqCloudConfigCore = comAdobeCqCloudConfigCore;
    return this;
  }

  /**
   * Get comAdobeCqCloudConfigCore
   * @return comAdobeCqCloudConfigCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cloud-config.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cloud-config.core")
  public @Nullable ConfigNodePropertyString getComAdobeCqCloudConfigCore() {
    return comAdobeCqCloudConfigCore;
  }

  @JsonProperty("com.adobe.cq.cloud-config.core")
  public void setComAdobeCqCloudConfigCore(@Nullable ConfigNodePropertyString comAdobeCqCloudConfigCore) {
    this.comAdobeCqCloudConfigCore = comAdobeCqCloudConfigCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCloudConfigUi(@Nullable ConfigNodePropertyString comAdobeCqCloudConfigUi) {
    this.comAdobeCqCloudConfigUi = comAdobeCqCloudConfigUi;
    return this;
  }

  /**
   * Get comAdobeCqCloudConfigUi
   * @return comAdobeCqCloudConfigUi
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cloud-config.ui", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cloud-config.ui")
  public @Nullable ConfigNodePropertyString getComAdobeCqCloudConfigUi() {
    return comAdobeCqCloudConfigUi;
  }

  @JsonProperty("com.adobe.cq.cloud-config.ui")
  public void setComAdobeCqCloudConfigUi(@Nullable ConfigNodePropertyString comAdobeCqCloudConfigUi) {
    this.comAdobeCqCloudConfigUi = comAdobeCqCloudConfigUi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqEditor(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqEditor) {
    this.comAdobeCqComAdobeCqEditor = comAdobeCqComAdobeCqEditor;
    return this;
  }

  /**
   * Get comAdobeCqComAdobeCqEditor
   * @return comAdobeCqComAdobeCqEditor
   */
  @Valid 
  @Schema(name = "com.adobe.cq.com.adobe.cq.editor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.com.adobe.cq.editor")
  public @Nullable ConfigNodePropertyString getComAdobeCqComAdobeCqEditor() {
    return comAdobeCqComAdobeCqEditor;
  }

  @JsonProperty("com.adobe.cq.com.adobe.cq.editor")
  public void setComAdobeCqComAdobeCqEditor(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqEditor) {
    this.comAdobeCqComAdobeCqEditor = comAdobeCqComAdobeCqEditor;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqProjectsCore(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore) {
    this.comAdobeCqComAdobeCqProjectsCore = comAdobeCqComAdobeCqProjectsCore;
    return this;
  }

  /**
   * Get comAdobeCqComAdobeCqProjectsCore
   * @return comAdobeCqComAdobeCqProjectsCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.com.adobe.cq.projects.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.core")
  public @Nullable ConfigNodePropertyString getComAdobeCqComAdobeCqProjectsCore() {
    return comAdobeCqComAdobeCqProjectsCore;
  }

  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.core")
  public void setComAdobeCqComAdobeCqProjectsCore(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore) {
    this.comAdobeCqComAdobeCqProjectsCore = comAdobeCqComAdobeCqProjectsCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqProjectsWcmCore(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore) {
    this.comAdobeCqComAdobeCqProjectsWcmCore = comAdobeCqComAdobeCqProjectsWcmCore;
    return this;
  }

  /**
   * Get comAdobeCqComAdobeCqProjectsWcmCore
   * @return comAdobeCqComAdobeCqProjectsWcmCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.com.adobe.cq.projects.wcm.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core")
  public @Nullable ConfigNodePropertyString getComAdobeCqComAdobeCqProjectsWcmCore() {
    return comAdobeCqComAdobeCqProjectsWcmCore;
  }

  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core")
  public void setComAdobeCqComAdobeCqProjectsWcmCore(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore) {
    this.comAdobeCqComAdobeCqProjectsWcmCore = comAdobeCqComAdobeCqProjectsWcmCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqUiCommons(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons) {
    this.comAdobeCqComAdobeCqUiCommons = comAdobeCqComAdobeCqUiCommons;
    return this;
  }

  /**
   * Get comAdobeCqComAdobeCqUiCommons
   * @return comAdobeCqComAdobeCqUiCommons
   */
  @Valid 
  @Schema(name = "com.adobe.cq.com.adobe.cq.ui.commons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons")
  public @Nullable ConfigNodePropertyString getComAdobeCqComAdobeCqUiCommons() {
    return comAdobeCqComAdobeCqUiCommons;
  }

  @JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons")
  public void setComAdobeCqComAdobeCqUiCommons(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons) {
    this.comAdobeCqComAdobeCqUiCommons = comAdobeCqComAdobeCqUiCommons;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqComAdobeCqWcmStyle(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle) {
    this.comAdobeCqComAdobeCqWcmStyle = comAdobeCqComAdobeCqWcmStyle;
    return this;
  }

  /**
   * Get comAdobeCqComAdobeCqWcmStyle
   * @return comAdobeCqComAdobeCqWcmStyle
   */
  @Valid 
  @Schema(name = "com.adobe.cq.com.adobe.cq.wcm.style", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style")
  public @Nullable ConfigNodePropertyString getComAdobeCqComAdobeCqWcmStyle() {
    return comAdobeCqComAdobeCqWcmStyle;
  }

  @JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style")
  public void setComAdobeCqComAdobeCqWcmStyle(@Nullable ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle) {
    this.comAdobeCqComAdobeCqWcmStyle = comAdobeCqComAdobeCqWcmStyle;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqActivitymapIntegration(@Nullable ConfigNodePropertyString comAdobeCqCqActivitymapIntegration) {
    this.comAdobeCqCqActivitymapIntegration = comAdobeCqCqActivitymapIntegration;
    return this;
  }

  /**
   * Get comAdobeCqCqActivitymapIntegration
   * @return comAdobeCqCqActivitymapIntegration
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-activitymap-integration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-activitymap-integration")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqActivitymapIntegration() {
    return comAdobeCqCqActivitymapIntegration;
  }

  @JsonProperty("com.adobe.cq.cq-activitymap-integration")
  public void setComAdobeCqCqActivitymapIntegration(@Nullable ConfigNodePropertyString comAdobeCqCqActivitymapIntegration) {
    this.comAdobeCqCqActivitymapIntegration = comAdobeCqCqActivitymapIntegration;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqContexthubCommons(@Nullable ConfigNodePropertyString comAdobeCqCqContexthubCommons) {
    this.comAdobeCqCqContexthubCommons = comAdobeCqCqContexthubCommons;
    return this;
  }

  /**
   * Get comAdobeCqCqContexthubCommons
   * @return comAdobeCqCqContexthubCommons
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-contexthub-commons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-contexthub-commons")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqContexthubCommons() {
    return comAdobeCqCqContexthubCommons;
  }

  @JsonProperty("com.adobe.cq.cq-contexthub-commons")
  public void setComAdobeCqCqContexthubCommons(@Nullable ConfigNodePropertyString comAdobeCqCqContexthubCommons) {
    this.comAdobeCqCqContexthubCommons = comAdobeCqCqContexthubCommons;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqDtm(@Nullable ConfigNodePropertyString comAdobeCqCqDtm) {
    this.comAdobeCqCqDtm = comAdobeCqCqDtm;
    return this;
  }

  /**
   * Get comAdobeCqCqDtm
   * @return comAdobeCqCqDtm
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-dtm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-dtm")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqDtm() {
    return comAdobeCqCqDtm;
  }

  @JsonProperty("com.adobe.cq.cq-dtm")
  public void setComAdobeCqCqDtm(@Nullable ConfigNodePropertyString comAdobeCqCqDtm) {
    this.comAdobeCqCqDtm = comAdobeCqCqDtm;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqHealthcheck(@Nullable ConfigNodePropertyString comAdobeCqCqHealthcheck) {
    this.comAdobeCqCqHealthcheck = comAdobeCqCqHealthcheck;
    return this;
  }

  /**
   * Get comAdobeCqCqHealthcheck
   * @return comAdobeCqCqHealthcheck
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-healthcheck", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-healthcheck")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqHealthcheck() {
    return comAdobeCqCqHealthcheck;
  }

  @JsonProperty("com.adobe.cq.cq-healthcheck")
  public void setComAdobeCqCqHealthcheck(@Nullable ConfigNodePropertyString comAdobeCqCqHealthcheck) {
    this.comAdobeCqCqHealthcheck = comAdobeCqCqHealthcheck;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqMultisiteTargeting(@Nullable ConfigNodePropertyString comAdobeCqCqMultisiteTargeting) {
    this.comAdobeCqCqMultisiteTargeting = comAdobeCqCqMultisiteTargeting;
    return this;
  }

  /**
   * Get comAdobeCqCqMultisiteTargeting
   * @return comAdobeCqCqMultisiteTargeting
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-multisite-targeting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-multisite-targeting")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqMultisiteTargeting() {
    return comAdobeCqCqMultisiteTargeting;
  }

  @JsonProperty("com.adobe.cq.cq-multisite-targeting")
  public void setComAdobeCqCqMultisiteTargeting(@Nullable ConfigNodePropertyString comAdobeCqCqMultisiteTargeting) {
    this.comAdobeCqCqMultisiteTargeting = comAdobeCqCqMultisiteTargeting;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqPreUpgradeCleanup(@Nullable ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup) {
    this.comAdobeCqCqPreUpgradeCleanup = comAdobeCqCqPreUpgradeCleanup;
    return this;
  }

  /**
   * Get comAdobeCqCqPreUpgradeCleanup
   * @return comAdobeCqCqPreUpgradeCleanup
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-pre-upgrade-cleanup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqPreUpgradeCleanup() {
    return comAdobeCqCqPreUpgradeCleanup;
  }

  @JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup")
  public void setComAdobeCqCqPreUpgradeCleanup(@Nullable ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup) {
    this.comAdobeCqCqPreUpgradeCleanup = comAdobeCqCqPreUpgradeCleanup;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqProductInfoProvider(@Nullable ConfigNodePropertyString comAdobeCqCqProductInfoProvider) {
    this.comAdobeCqCqProductInfoProvider = comAdobeCqCqProductInfoProvider;
    return this;
  }

  /**
   * Get comAdobeCqCqProductInfoProvider
   * @return comAdobeCqCqProductInfoProvider
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-product-info-provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-product-info-provider")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqProductInfoProvider() {
    return comAdobeCqCqProductInfoProvider;
  }

  @JsonProperty("com.adobe.cq.cq-product-info-provider")
  public void setComAdobeCqCqProductInfoProvider(@Nullable ConfigNodePropertyString comAdobeCqCqProductInfoProvider) {
    this.comAdobeCqCqProductInfoProvider = comAdobeCqCqProductInfoProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqRestSites(@Nullable ConfigNodePropertyString comAdobeCqCqRestSites) {
    this.comAdobeCqCqRestSites = comAdobeCqCqRestSites;
    return this;
  }

  /**
   * Get comAdobeCqCqRestSites
   * @return comAdobeCqCqRestSites
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-rest-sites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-rest-sites")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqRestSites() {
    return comAdobeCqCqRestSites;
  }

  @JsonProperty("com.adobe.cq.cq-rest-sites")
  public void setComAdobeCqCqRestSites(@Nullable ConfigNodePropertyString comAdobeCqCqRestSites) {
    this.comAdobeCqCqRestSites = comAdobeCqCqRestSites;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqCqSecurityHc(@Nullable ConfigNodePropertyString comAdobeCqCqSecurityHc) {
    this.comAdobeCqCqSecurityHc = comAdobeCqCqSecurityHc;
    return this;
  }

  /**
   * Get comAdobeCqCqSecurityHc
   * @return comAdobeCqCqSecurityHc
   */
  @Valid 
  @Schema(name = "com.adobe.cq.cq-security-hc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.cq-security-hc")
  public @Nullable ConfigNodePropertyString getComAdobeCqCqSecurityHc() {
    return comAdobeCqCqSecurityHc;
  }

  @JsonProperty("com.adobe.cq.cq-security-hc")
  public void setComAdobeCqCqSecurityHc(@Nullable ConfigNodePropertyString comAdobeCqCqSecurityHc) {
    this.comAdobeCqCqSecurityHc = comAdobeCqCqSecurityHc;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDamCqDamSvgHandler(@Nullable ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler) {
    this.comAdobeCqDamCqDamSvgHandler = comAdobeCqDamCqDamSvgHandler;
    return this;
  }

  /**
   * Get comAdobeCqDamCqDamSvgHandler
   * @return comAdobeCqDamCqDamSvgHandler
   */
  @Valid 
  @Schema(name = "com.adobe.cq.dam.cq-dam-svg-handler", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler")
  public @Nullable ConfigNodePropertyString getComAdobeCqDamCqDamSvgHandler() {
    return comAdobeCqDamCqDamSvgHandler;
  }

  @JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler")
  public void setComAdobeCqDamCqDamSvgHandler(@Nullable ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler) {
    this.comAdobeCqDamCqDamSvgHandler = comAdobeCqDamCqDamSvgHandler;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDamCqScene7Imaging(@Nullable ConfigNodePropertyString comAdobeCqDamCqScene7Imaging) {
    this.comAdobeCqDamCqScene7Imaging = comAdobeCqDamCqScene7Imaging;
    return this;
  }

  /**
   * Get comAdobeCqDamCqScene7Imaging
   * @return comAdobeCqDamCqScene7Imaging
   */
  @Valid 
  @Schema(name = "com.adobe.cq.dam.cq-scene7-imaging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.dam.cq-scene7-imaging")
  public @Nullable ConfigNodePropertyString getComAdobeCqDamCqScene7Imaging() {
    return comAdobeCqDamCqScene7Imaging;
  }

  @JsonProperty("com.adobe.cq.dam.cq-scene7-imaging")
  public void setComAdobeCqDamCqScene7Imaging(@Nullable ConfigNodePropertyString comAdobeCqDamCqScene7Imaging) {
    this.comAdobeCqDamCqScene7Imaging = comAdobeCqDamCqScene7Imaging;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDtmReactorCore(@Nullable ConfigNodePropertyString comAdobeCqDtmReactorCore) {
    this.comAdobeCqDtmReactorCore = comAdobeCqDtmReactorCore;
    return this;
  }

  /**
   * Get comAdobeCqDtmReactorCore
   * @return comAdobeCqDtmReactorCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.dtm-reactor.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.dtm-reactor.core")
  public @Nullable ConfigNodePropertyString getComAdobeCqDtmReactorCore() {
    return comAdobeCqDtmReactorCore;
  }

  @JsonProperty("com.adobe.cq.dtm-reactor.core")
  public void setComAdobeCqDtmReactorCore(@Nullable ConfigNodePropertyString comAdobeCqDtmReactorCore) {
    this.comAdobeCqDtmReactorCore = comAdobeCqDtmReactorCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqDtmReactorUi(@Nullable ConfigNodePropertyString comAdobeCqDtmReactorUi) {
    this.comAdobeCqDtmReactorUi = comAdobeCqDtmReactorUi;
    return this;
  }

  /**
   * Get comAdobeCqDtmReactorUi
   * @return comAdobeCqDtmReactorUi
   */
  @Valid 
  @Schema(name = "com.adobe.cq.dtm-reactor.ui", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.dtm-reactor.ui")
  public @Nullable ConfigNodePropertyString getComAdobeCqDtmReactorUi() {
    return comAdobeCqDtmReactorUi;
  }

  @JsonProperty("com.adobe.cq.dtm-reactor.ui")
  public void setComAdobeCqDtmReactorUi(@Nullable ConfigNodePropertyString comAdobeCqDtmReactorUi) {
    this.comAdobeCqDtmReactorUi = comAdobeCqDtmReactorUi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqExpJspelResolver(@Nullable ConfigNodePropertyString comAdobeCqExpJspelResolver) {
    this.comAdobeCqExpJspelResolver = comAdobeCqExpJspelResolver;
    return this;
  }

  /**
   * Get comAdobeCqExpJspelResolver
   * @return comAdobeCqExpJspelResolver
   */
  @Valid 
  @Schema(name = "com.adobe.cq.exp-jspel-resolver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.exp-jspel-resolver")
  public @Nullable ConfigNodePropertyString getComAdobeCqExpJspelResolver() {
    return comAdobeCqExpJspelResolver;
  }

  @JsonProperty("com.adobe.cq.exp-jspel-resolver")
  public void setComAdobeCqExpJspelResolver(@Nullable ConfigNodePropertyString comAdobeCqExpJspelResolver) {
    this.comAdobeCqExpJspelResolver = comAdobeCqExpJspelResolver;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqInboxCqInbox(@Nullable ConfigNodePropertyString comAdobeCqInboxCqInbox) {
    this.comAdobeCqInboxCqInbox = comAdobeCqInboxCqInbox;
    return this;
  }

  /**
   * Get comAdobeCqInboxCqInbox
   * @return comAdobeCqInboxCqInbox
   */
  @Valid 
  @Schema(name = "com.adobe.cq.inbox.cq-inbox", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.inbox.cq-inbox")
  public @Nullable ConfigNodePropertyString getComAdobeCqInboxCqInbox() {
    return comAdobeCqInboxCqInbox;
  }

  @JsonProperty("com.adobe.cq.inbox.cq-inbox")
  public void setComAdobeCqInboxCqInbox(@Nullable ConfigNodePropertyString comAdobeCqInboxCqInbox) {
    this.comAdobeCqInboxCqInbox = comAdobeCqInboxCqInbox;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqJsonSchemaParser(@Nullable ConfigNodePropertyString comAdobeCqJsonSchemaParser) {
    this.comAdobeCqJsonSchemaParser = comAdobeCqJsonSchemaParser;
    return this;
  }

  /**
   * Get comAdobeCqJsonSchemaParser
   * @return comAdobeCqJsonSchemaParser
   */
  @Valid 
  @Schema(name = "com.adobe.cq.json-schema-parser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.json-schema-parser")
  public @Nullable ConfigNodePropertyString getComAdobeCqJsonSchemaParser() {
    return comAdobeCqJsonSchemaParser;
  }

  @JsonProperty("com.adobe.cq.json-schema-parser")
  public void setComAdobeCqJsonSchemaParser(@Nullable ConfigNodePropertyString comAdobeCqJsonSchemaParser) {
    this.comAdobeCqJsonSchemaParser = comAdobeCqJsonSchemaParser;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMediaCqMediaPublishingDpsFpCore(@Nullable ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore) {
    this.comAdobeCqMediaCqMediaPublishingDpsFpCore = comAdobeCqMediaCqMediaPublishingDpsFpCore;
    return this;
  }

  /**
   * Get comAdobeCqMediaCqMediaPublishingDpsFpCore
   * @return comAdobeCqMediaCqMediaPublishingDpsFpCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.media.cq-media-publishing-dps-fp-core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core")
  public @Nullable ConfigNodePropertyString getComAdobeCqMediaCqMediaPublishingDpsFpCore() {
    return comAdobeCqMediaCqMediaPublishingDpsFpCore;
  }

  @JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core")
  public void setComAdobeCqMediaCqMediaPublishingDpsFpCore(@Nullable ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore) {
    this.comAdobeCqMediaCqMediaPublishingDpsFpCore = comAdobeCqMediaCqMediaPublishingDpsFpCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMobileCqMobileCaas(@Nullable ConfigNodePropertyString comAdobeCqMobileCqMobileCaas) {
    this.comAdobeCqMobileCqMobileCaas = comAdobeCqMobileCqMobileCaas;
    return this;
  }

  /**
   * Get comAdobeCqMobileCqMobileCaas
   * @return comAdobeCqMobileCqMobileCaas
   */
  @Valid 
  @Schema(name = "com.adobe.cq.mobile.cq-mobile-caas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.mobile.cq-mobile-caas")
  public @Nullable ConfigNodePropertyString getComAdobeCqMobileCqMobileCaas() {
    return comAdobeCqMobileCqMobileCaas;
  }

  @JsonProperty("com.adobe.cq.mobile.cq-mobile-caas")
  public void setComAdobeCqMobileCqMobileCaas(@Nullable ConfigNodePropertyString comAdobeCqMobileCqMobileCaas) {
    this.comAdobeCqMobileCqMobileCaas = comAdobeCqMobileCqMobileCaas;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMobileCqMobileIndexBuilder(@Nullable ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder) {
    this.comAdobeCqMobileCqMobileIndexBuilder = comAdobeCqMobileCqMobileIndexBuilder;
    return this;
  }

  /**
   * Get comAdobeCqMobileCqMobileIndexBuilder
   * @return comAdobeCqMobileCqMobileIndexBuilder
   */
  @Valid 
  @Schema(name = "com.adobe.cq.mobile.cq-mobile-index-builder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder")
  public @Nullable ConfigNodePropertyString getComAdobeCqMobileCqMobileIndexBuilder() {
    return comAdobeCqMobileCqMobileIndexBuilder;
  }

  @JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder")
  public void setComAdobeCqMobileCqMobileIndexBuilder(@Nullable ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder) {
    this.comAdobeCqMobileCqMobileIndexBuilder = comAdobeCqMobileCqMobileIndexBuilder;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMobileCqMobilePhonegapBuild(@Nullable ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild) {
    this.comAdobeCqMobileCqMobilePhonegapBuild = comAdobeCqMobileCqMobilePhonegapBuild;
    return this;
  }

  /**
   * Get comAdobeCqMobileCqMobilePhonegapBuild
   * @return comAdobeCqMobileCqMobilePhonegapBuild
   */
  @Valid 
  @Schema(name = "com.adobe.cq.mobile.cq-mobile-phonegap-build", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build")
  public @Nullable ConfigNodePropertyString getComAdobeCqMobileCqMobilePhonegapBuild() {
    return comAdobeCqMobileCqMobilePhonegapBuild;
  }

  @JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build")
  public void setComAdobeCqMobileCqMobilePhonegapBuild(@Nullable ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild) {
    this.comAdobeCqMobileCqMobilePhonegapBuild = comAdobeCqMobileCqMobilePhonegapBuild;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqMyspell(@Nullable ConfigNodePropertyString comAdobeCqMyspell) {
    this.comAdobeCqMyspell = comAdobeCqMyspell;
    return this;
  }

  /**
   * Get comAdobeCqMyspell
   * @return comAdobeCqMyspell
   */
  @Valid 
  @Schema(name = "com.adobe.cq.myspell", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.myspell")
  public @Nullable ConfigNodePropertyString getComAdobeCqMyspell() {
    return comAdobeCqMyspell;
  }

  @JsonProperty("com.adobe.cq.myspell")
  public void setComAdobeCqMyspell(@Nullable ConfigNodePropertyString comAdobeCqMyspell) {
    this.comAdobeCqMyspell = comAdobeCqMyspell;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSampleWeRetailCore(@Nullable ConfigNodePropertyString comAdobeCqSampleWeRetailCore) {
    this.comAdobeCqSampleWeRetailCore = comAdobeCqSampleWeRetailCore;
    return this;
  }

  /**
   * Get comAdobeCqSampleWeRetailCore
   * @return comAdobeCqSampleWeRetailCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.sample.we.retail.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.sample.we.retail.core")
  public @Nullable ConfigNodePropertyString getComAdobeCqSampleWeRetailCore() {
    return comAdobeCqSampleWeRetailCore;
  }

  @JsonProperty("com.adobe.cq.sample.we.retail.core")
  public void setComAdobeCqSampleWeRetailCore(@Nullable ConfigNodePropertyString comAdobeCqSampleWeRetailCore) {
    this.comAdobeCqSampleWeRetailCore = comAdobeCqSampleWeRetailCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqScreensComAdobeCqScreensDcc(@Nullable ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc) {
    this.comAdobeCqScreensComAdobeCqScreensDcc = comAdobeCqScreensComAdobeCqScreensDcc;
    return this;
  }

  /**
   * Get comAdobeCqScreensComAdobeCqScreensDcc
   * @return comAdobeCqScreensComAdobeCqScreensDcc
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.com.adobe.cq.screens.dcc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensComAdobeCqScreensDcc() {
    return comAdobeCqScreensComAdobeCqScreensDcc;
  }

  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc")
  public void setComAdobeCqScreensComAdobeCqScreensDcc(@Nullable ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc) {
    this.comAdobeCqScreensComAdobeCqScreensDcc = comAdobeCqScreensComAdobeCqScreensDcc;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqScreensComAdobeCqScreensMqCore(@Nullable ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore) {
    this.comAdobeCqScreensComAdobeCqScreensMqCore = comAdobeCqScreensComAdobeCqScreensMqCore;
    return this;
  }

  /**
   * Get comAdobeCqScreensComAdobeCqScreensMqCore
   * @return comAdobeCqScreensComAdobeCqScreensMqCore
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.com.adobe.cq.screens.mq.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensComAdobeCqScreensMqCore() {
    return comAdobeCqScreensComAdobeCqScreensMqCore;
  }

  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core")
  public void setComAdobeCqScreensComAdobeCqScreensMqCore(@Nullable ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore) {
    this.comAdobeCqScreensComAdobeCqScreensMqCore = comAdobeCqScreensComAdobeCqScreensMqCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialAsProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider) {
    this.comAdobeCqSocialCqSocialAsProvider = comAdobeCqSocialCqSocialAsProvider;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialAsProvider
   * @return comAdobeCqSocialCqSocialAsProvider
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-as-provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-as-provider")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialAsProvider() {
    return comAdobeCqSocialCqSocialAsProvider;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-as-provider")
  public void setComAdobeCqSocialCqSocialAsProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider) {
    this.comAdobeCqSocialCqSocialAsProvider = comAdobeCqSocialCqSocialAsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialBadgingBasicImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl) {
    this.comAdobeCqSocialCqSocialBadgingBasicImpl = comAdobeCqSocialCqSocialBadgingBasicImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialBadgingBasicImpl
   * @return comAdobeCqSocialCqSocialBadgingBasicImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-badging-basic-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialBadgingBasicImpl() {
    return comAdobeCqSocialCqSocialBadgingBasicImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl")
  public void setComAdobeCqSocialCqSocialBadgingBasicImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl) {
    this.comAdobeCqSocialCqSocialBadgingBasicImpl = comAdobeCqSocialCqSocialBadgingBasicImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialBadgingImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl) {
    this.comAdobeCqSocialCqSocialBadgingImpl = comAdobeCqSocialCqSocialBadgingImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialBadgingImpl
   * @return comAdobeCqSocialCqSocialBadgingImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-badging-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-badging-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialBadgingImpl() {
    return comAdobeCqSocialCqSocialBadgingImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-badging-impl")
  public void setComAdobeCqSocialCqSocialBadgingImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl) {
    this.comAdobeCqSocialCqSocialBadgingImpl = comAdobeCqSocialCqSocialBadgingImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialCalendarImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl) {
    this.comAdobeCqSocialCqSocialCalendarImpl = comAdobeCqSocialCqSocialCalendarImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialCalendarImpl
   * @return comAdobeCqSocialCqSocialCalendarImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-calendar-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-calendar-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialCalendarImpl() {
    return comAdobeCqSocialCqSocialCalendarImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-calendar-impl")
  public void setComAdobeCqSocialCqSocialCalendarImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl) {
    this.comAdobeCqSocialCqSocialCalendarImpl = comAdobeCqSocialCqSocialCalendarImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialContentFragmentsImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl) {
    this.comAdobeCqSocialCqSocialContentFragmentsImpl = comAdobeCqSocialCqSocialContentFragmentsImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialContentFragmentsImpl
   * @return comAdobeCqSocialCqSocialContentFragmentsImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-content-fragments-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialContentFragmentsImpl() {
    return comAdobeCqSocialCqSocialContentFragmentsImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl")
  public void setComAdobeCqSocialCqSocialContentFragmentsImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl) {
    this.comAdobeCqSocialCqSocialContentFragmentsImpl = comAdobeCqSocialCqSocialContentFragmentsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialEnablementImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl) {
    this.comAdobeCqSocialCqSocialEnablementImpl = comAdobeCqSocialCqSocialEnablementImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialEnablementImpl
   * @return comAdobeCqSocialCqSocialEnablementImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-enablement-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-enablement-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialEnablementImpl() {
    return comAdobeCqSocialCqSocialEnablementImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-enablement-impl")
  public void setComAdobeCqSocialCqSocialEnablementImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl) {
    this.comAdobeCqSocialCqSocialEnablementImpl = comAdobeCqSocialCqSocialEnablementImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialGraphImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl) {
    this.comAdobeCqSocialCqSocialGraphImpl = comAdobeCqSocialCqSocialGraphImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialGraphImpl
   * @return comAdobeCqSocialCqSocialGraphImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-graph-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-graph-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialGraphImpl() {
    return comAdobeCqSocialCqSocialGraphImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-graph-impl")
  public void setComAdobeCqSocialCqSocialGraphImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl) {
    this.comAdobeCqSocialCqSocialGraphImpl = comAdobeCqSocialCqSocialGraphImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialIdeationImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl) {
    this.comAdobeCqSocialCqSocialIdeationImpl = comAdobeCqSocialCqSocialIdeationImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialIdeationImpl
   * @return comAdobeCqSocialCqSocialIdeationImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-ideation-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-ideation-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialIdeationImpl() {
    return comAdobeCqSocialCqSocialIdeationImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-ideation-impl")
  public void setComAdobeCqSocialCqSocialIdeationImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl) {
    this.comAdobeCqSocialCqSocialIdeationImpl = comAdobeCqSocialCqSocialIdeationImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialJcrProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider) {
    this.comAdobeCqSocialCqSocialJcrProvider = comAdobeCqSocialCqSocialJcrProvider;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialJcrProvider
   * @return comAdobeCqSocialCqSocialJcrProvider
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-jcr-provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-jcr-provider")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialJcrProvider() {
    return comAdobeCqSocialCqSocialJcrProvider;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-jcr-provider")
  public void setComAdobeCqSocialCqSocialJcrProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider) {
    this.comAdobeCqSocialCqSocialJcrProvider = comAdobeCqSocialCqSocialJcrProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialMembersImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl) {
    this.comAdobeCqSocialCqSocialMembersImpl = comAdobeCqSocialCqSocialMembersImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialMembersImpl
   * @return comAdobeCqSocialCqSocialMembersImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-members-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-members-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialMembersImpl() {
    return comAdobeCqSocialCqSocialMembersImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-members-impl")
  public void setComAdobeCqSocialCqSocialMembersImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl) {
    this.comAdobeCqSocialCqSocialMembersImpl = comAdobeCqSocialCqSocialMembersImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialMsProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider) {
    this.comAdobeCqSocialCqSocialMsProvider = comAdobeCqSocialCqSocialMsProvider;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialMsProvider
   * @return comAdobeCqSocialCqSocialMsProvider
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-ms-provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-ms-provider")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialMsProvider() {
    return comAdobeCqSocialCqSocialMsProvider;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-ms-provider")
  public void setComAdobeCqSocialCqSocialMsProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider) {
    this.comAdobeCqSocialCqSocialMsProvider = comAdobeCqSocialCqSocialMsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialNotificationsChannelsWeb(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb) {
    this.comAdobeCqSocialCqSocialNotificationsChannelsWeb = comAdobeCqSocialCqSocialNotificationsChannelsWeb;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialNotificationsChannelsWeb
   * @return comAdobeCqSocialCqSocialNotificationsChannelsWeb
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-notifications-channels-web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialNotificationsChannelsWeb() {
    return comAdobeCqSocialCqSocialNotificationsChannelsWeb;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web")
  public void setComAdobeCqSocialCqSocialNotificationsChannelsWeb(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb) {
    this.comAdobeCqSocialCqSocialNotificationsChannelsWeb = comAdobeCqSocialCqSocialNotificationsChannelsWeb;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialNotificationsImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl) {
    this.comAdobeCqSocialCqSocialNotificationsImpl = comAdobeCqSocialCqSocialNotificationsImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialNotificationsImpl
   * @return comAdobeCqSocialCqSocialNotificationsImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-notifications-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-notifications-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialNotificationsImpl() {
    return comAdobeCqSocialCqSocialNotificationsImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-notifications-impl")
  public void setComAdobeCqSocialCqSocialNotificationsImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl) {
    this.comAdobeCqSocialCqSocialNotificationsImpl = comAdobeCqSocialCqSocialNotificationsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialRdbProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider) {
    this.comAdobeCqSocialCqSocialRdbProvider = comAdobeCqSocialCqSocialRdbProvider;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialRdbProvider
   * @return comAdobeCqSocialCqSocialRdbProvider
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-rdb-provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-rdb-provider")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialRdbProvider() {
    return comAdobeCqSocialCqSocialRdbProvider;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-rdb-provider")
  public void setComAdobeCqSocialCqSocialRdbProvider(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider) {
    this.comAdobeCqSocialCqSocialRdbProvider = comAdobeCqSocialCqSocialRdbProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialScfImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl) {
    this.comAdobeCqSocialCqSocialScfImpl = comAdobeCqSocialCqSocialScfImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialScfImpl
   * @return comAdobeCqSocialCqSocialScfImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-scf-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-scf-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialScfImpl() {
    return comAdobeCqSocialCqSocialScfImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-scf-impl")
  public void setComAdobeCqSocialCqSocialScfImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl) {
    this.comAdobeCqSocialCqSocialScfImpl = comAdobeCqSocialCqSocialScfImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialScoringBasicImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl) {
    this.comAdobeCqSocialCqSocialScoringBasicImpl = comAdobeCqSocialCqSocialScoringBasicImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialScoringBasicImpl
   * @return comAdobeCqSocialCqSocialScoringBasicImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-scoring-basic-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialScoringBasicImpl() {
    return comAdobeCqSocialCqSocialScoringBasicImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl")
  public void setComAdobeCqSocialCqSocialScoringBasicImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl) {
    this.comAdobeCqSocialCqSocialScoringBasicImpl = comAdobeCqSocialCqSocialScoringBasicImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialScoringImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl) {
    this.comAdobeCqSocialCqSocialScoringImpl = comAdobeCqSocialCqSocialScoringImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialScoringImpl
   * @return comAdobeCqSocialCqSocialScoringImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-scoring-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-scoring-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialScoringImpl() {
    return comAdobeCqSocialCqSocialScoringImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-scoring-impl")
  public void setComAdobeCqSocialCqSocialScoringImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl) {
    this.comAdobeCqSocialCqSocialScoringImpl = comAdobeCqSocialCqSocialScoringImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialServiceusersImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl) {
    this.comAdobeCqSocialCqSocialServiceusersImpl = comAdobeCqSocialCqSocialServiceusersImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialServiceusersImpl
   * @return comAdobeCqSocialCqSocialServiceusersImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-serviceusers-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialServiceusersImpl() {
    return comAdobeCqSocialCqSocialServiceusersImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl")
  public void setComAdobeCqSocialCqSocialServiceusersImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl) {
    this.comAdobeCqSocialCqSocialServiceusersImpl = comAdobeCqSocialCqSocialServiceusersImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialSrpImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl) {
    this.comAdobeCqSocialCqSocialSrpImpl = comAdobeCqSocialCqSocialSrpImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialSrpImpl
   * @return comAdobeCqSocialCqSocialSrpImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-srp-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-srp-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialSrpImpl() {
    return comAdobeCqSocialCqSocialSrpImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-srp-impl")
  public void setComAdobeCqSocialCqSocialSrpImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl) {
    this.comAdobeCqSocialCqSocialSrpImpl = comAdobeCqSocialCqSocialSrpImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeCqSocialCqSocialUgcbaseImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl) {
    this.comAdobeCqSocialCqSocialUgcbaseImpl = comAdobeCqSocialCqSocialUgcbaseImpl;
    return this;
  }

  /**
   * Get comAdobeCqSocialCqSocialUgcbaseImpl
   * @return comAdobeCqSocialCqSocialUgcbaseImpl
   */
  @Valid 
  @Schema(name = "com.adobe.cq.social.cq-social-ugcbase-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl")
  public @Nullable ConfigNodePropertyString getComAdobeCqSocialCqSocialUgcbaseImpl() {
    return comAdobeCqSocialCqSocialUgcbaseImpl;
  }

  @JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl")
  public void setComAdobeCqSocialCqSocialUgcbaseImpl(@Nullable ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl) {
    this.comAdobeCqSocialCqSocialUgcbaseImpl = comAdobeCqSocialCqSocialUgcbaseImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeDamCqDamCfmImpl(@Nullable ConfigNodePropertyString comAdobeDamCqDamCfmImpl) {
    this.comAdobeDamCqDamCfmImpl = comAdobeDamCqDamCfmImpl;
    return this;
  }

  /**
   * Get comAdobeDamCqDamCfmImpl
   * @return comAdobeDamCqDamCfmImpl
   */
  @Valid 
  @Schema(name = "com.adobe.dam.cq-dam-cfm-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.dam.cq-dam-cfm-impl")
  public @Nullable ConfigNodePropertyString getComAdobeDamCqDamCfmImpl() {
    return comAdobeDamCqDamCfmImpl;
  }

  @JsonProperty("com.adobe.dam.cq-dam-cfm-impl")
  public void setComAdobeDamCqDamCfmImpl(@Nullable ConfigNodePropertyString comAdobeDamCqDamCfmImpl) {
    this.comAdobeDamCqDamCfmImpl = comAdobeDamCqDamCfmImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeFormsFoundationFormsFoundationBase(@Nullable ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase) {
    this.comAdobeFormsFoundationFormsFoundationBase = comAdobeFormsFoundationFormsFoundationBase;
    return this;
  }

  /**
   * Get comAdobeFormsFoundationFormsFoundationBase
   * @return comAdobeFormsFoundationFormsFoundationBase
   */
  @Valid 
  @Schema(name = "com.adobe.forms.foundation-forms-foundation-base", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.forms.foundation-forms-foundation-base")
  public @Nullable ConfigNodePropertyString getComAdobeFormsFoundationFormsFoundationBase() {
    return comAdobeFormsFoundationFormsFoundationBase;
  }

  @JsonProperty("com.adobe.forms.foundation-forms-foundation-base")
  public void setComAdobeFormsFoundationFormsFoundationBase(@Nullable ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase) {
    this.comAdobeFormsFoundationFormsFoundationBase = comAdobeFormsFoundationFormsFoundationBase;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteApicontroller(@Nullable ConfigNodePropertyString comAdobeGraniteApicontroller) {
    this.comAdobeGraniteApicontroller = comAdobeGraniteApicontroller;
    return this;
  }

  /**
   * Get comAdobeGraniteApicontroller
   * @return comAdobeGraniteApicontroller
   */
  @Valid 
  @Schema(name = "com.adobe.granite.apicontroller", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.apicontroller")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteApicontroller() {
    return comAdobeGraniteApicontroller;
  }

  @JsonProperty("com.adobe.granite.apicontroller")
  public void setComAdobeGraniteApicontroller(@Nullable ConfigNodePropertyString comAdobeGraniteApicontroller) {
    this.comAdobeGraniteApicontroller = comAdobeGraniteApicontroller;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteAssetCore(@Nullable ConfigNodePropertyString comAdobeGraniteAssetCore) {
    this.comAdobeGraniteAssetCore = comAdobeGraniteAssetCore;
    return this;
  }

  /**
   * Get comAdobeGraniteAssetCore
   * @return comAdobeGraniteAssetCore
   */
  @Valid 
  @Schema(name = "com.adobe.granite.asset.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.asset.core")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteAssetCore() {
    return comAdobeGraniteAssetCore;
  }

  @JsonProperty("com.adobe.granite.asset.core")
  public void setComAdobeGraniteAssetCore(@Nullable ConfigNodePropertyString comAdobeGraniteAssetCore) {
    this.comAdobeGraniteAssetCore = comAdobeGraniteAssetCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteAuthSso(@Nullable ConfigNodePropertyString comAdobeGraniteAuthSso) {
    this.comAdobeGraniteAuthSso = comAdobeGraniteAuthSso;
    return this;
  }

  /**
   * Get comAdobeGraniteAuthSso
   * @return comAdobeGraniteAuthSso
   */
  @Valid 
  @Schema(name = "com.adobe.granite.auth.sso", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.auth.sso")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteAuthSso() {
    return comAdobeGraniteAuthSso;
  }

  @JsonProperty("com.adobe.granite.auth.sso")
  public void setComAdobeGraniteAuthSso(@Nullable ConfigNodePropertyString comAdobeGraniteAuthSso) {
    this.comAdobeGraniteAuthSso = comAdobeGraniteAuthSso;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteBundlesHcImpl(@Nullable ConfigNodePropertyString comAdobeGraniteBundlesHcImpl) {
    this.comAdobeGraniteBundlesHcImpl = comAdobeGraniteBundlesHcImpl;
    return this;
  }

  /**
   * Get comAdobeGraniteBundlesHcImpl
   * @return comAdobeGraniteBundlesHcImpl
   */
  @Valid 
  @Schema(name = "com.adobe.granite.bundles.hc.impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.bundles.hc.impl")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteBundlesHcImpl() {
    return comAdobeGraniteBundlesHcImpl;
  }

  @JsonProperty("com.adobe.granite.bundles.hc.impl")
  public void setComAdobeGraniteBundlesHcImpl(@Nullable ConfigNodePropertyString comAdobeGraniteBundlesHcImpl) {
    this.comAdobeGraniteBundlesHcImpl = comAdobeGraniteBundlesHcImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCompatRouter(@Nullable ConfigNodePropertyString comAdobeGraniteCompatRouter) {
    this.comAdobeGraniteCompatRouter = comAdobeGraniteCompatRouter;
    return this;
  }

  /**
   * Get comAdobeGraniteCompatRouter
   * @return comAdobeGraniteCompatRouter
   */
  @Valid 
  @Schema(name = "com.adobe.granite.compat-router", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.compat-router")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCompatRouter() {
    return comAdobeGraniteCompatRouter;
  }

  @JsonProperty("com.adobe.granite.compat-router")
  public void setComAdobeGraniteCompatRouter(@Nullable ConfigNodePropertyString comAdobeGraniteCompatRouter) {
    this.comAdobeGraniteCompatRouter = comAdobeGraniteCompatRouter;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteConf(@Nullable ConfigNodePropertyString comAdobeGraniteConf) {
    this.comAdobeGraniteConf = comAdobeGraniteConf;
    return this;
  }

  /**
   * Get comAdobeGraniteConf
   * @return comAdobeGraniteConf
   */
  @Valid 
  @Schema(name = "com.adobe.granite.conf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.conf")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteConf() {
    return comAdobeGraniteConf;
  }

  @JsonProperty("com.adobe.granite.conf")
  public void setComAdobeGraniteConf(@Nullable ConfigNodePropertyString comAdobeGraniteConf) {
    this.comAdobeGraniteConf = comAdobeGraniteConf;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteConfUiCore(@Nullable ConfigNodePropertyString comAdobeGraniteConfUiCore) {
    this.comAdobeGraniteConfUiCore = comAdobeGraniteConfUiCore;
    return this;
  }

  /**
   * Get comAdobeGraniteConfUiCore
   * @return comAdobeGraniteConfUiCore
   */
  @Valid 
  @Schema(name = "com.adobe.granite.conf.ui.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.conf.ui.core")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteConfUiCore() {
    return comAdobeGraniteConfUiCore;
  }

  @JsonProperty("com.adobe.granite.conf.ui.core")
  public void setComAdobeGraniteConfUiCore(@Nullable ConfigNodePropertyString comAdobeGraniteConfUiCore) {
    this.comAdobeGraniteConfUiCore = comAdobeGraniteConfUiCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCors(@Nullable ConfigNodePropertyString comAdobeGraniteCors) {
    this.comAdobeGraniteCors = comAdobeGraniteCors;
    return this;
  }

  /**
   * Get comAdobeGraniteCors
   * @return comAdobeGraniteCors
   */
  @Valid 
  @Schema(name = "com.adobe.granite.cors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.cors")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCors() {
    return comAdobeGraniteCors;
  }

  @JsonProperty("com.adobe.granite.cors")
  public void setComAdobeGraniteCors(@Nullable ConfigNodePropertyString comAdobeGraniteCors) {
    this.comAdobeGraniteCors = comAdobeGraniteCors;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCrxExplorer(@Nullable ConfigNodePropertyString comAdobeGraniteCrxExplorer) {
    this.comAdobeGraniteCrxExplorer = comAdobeGraniteCrxExplorer;
    return this;
  }

  /**
   * Get comAdobeGraniteCrxExplorer
   * @return comAdobeGraniteCrxExplorer
   */
  @Valid 
  @Schema(name = "com.adobe.granite.crx-explorer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.crx-explorer")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCrxExplorer() {
    return comAdobeGraniteCrxExplorer;
  }

  @JsonProperty("com.adobe.granite.crx-explorer")
  public void setComAdobeGraniteCrxExplorer(@Nullable ConfigNodePropertyString comAdobeGraniteCrxExplorer) {
    this.comAdobeGraniteCrxExplorer = comAdobeGraniteCrxExplorer;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCrxdeLite(@Nullable ConfigNodePropertyString comAdobeGraniteCrxdeLite) {
    this.comAdobeGraniteCrxdeLite = comAdobeGraniteCrxdeLite;
    return this;
  }

  /**
   * Get comAdobeGraniteCrxdeLite
   * @return comAdobeGraniteCrxdeLite
   */
  @Valid 
  @Schema(name = "com.adobe.granite.crxde-lite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.crxde-lite")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCrxdeLite() {
    return comAdobeGraniteCrxdeLite;
  }

  @JsonProperty("com.adobe.granite.crxde-lite")
  public void setComAdobeGraniteCrxdeLite(@Nullable ConfigNodePropertyString comAdobeGraniteCrxdeLite) {
    this.comAdobeGraniteCrxdeLite = comAdobeGraniteCrxdeLite;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoConfig(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoConfig) {
    this.comAdobeGraniteCryptoConfig = comAdobeGraniteCryptoConfig;
    return this;
  }

  /**
   * Get comAdobeGraniteCryptoConfig
   * @return comAdobeGraniteCryptoConfig
   */
  @Valid 
  @Schema(name = "com.adobe.granite.crypto.config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.crypto.config")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCryptoConfig() {
    return comAdobeGraniteCryptoConfig;
  }

  @JsonProperty("com.adobe.granite.crypto.config")
  public void setComAdobeGraniteCryptoConfig(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoConfig) {
    this.comAdobeGraniteCryptoConfig = comAdobeGraniteCryptoConfig;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoExtension(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoExtension) {
    this.comAdobeGraniteCryptoExtension = comAdobeGraniteCryptoExtension;
    return this;
  }

  /**
   * Get comAdobeGraniteCryptoExtension
   * @return comAdobeGraniteCryptoExtension
   */
  @Valid 
  @Schema(name = "com.adobe.granite.crypto.extension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.crypto.extension")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCryptoExtension() {
    return comAdobeGraniteCryptoExtension;
  }

  @JsonProperty("com.adobe.granite.crypto.extension")
  public void setComAdobeGraniteCryptoExtension(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoExtension) {
    this.comAdobeGraniteCryptoExtension = comAdobeGraniteCryptoExtension;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoFile(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoFile) {
    this.comAdobeGraniteCryptoFile = comAdobeGraniteCryptoFile;
    return this;
  }

  /**
   * Get comAdobeGraniteCryptoFile
   * @return comAdobeGraniteCryptoFile
   */
  @Valid 
  @Schema(name = "com.adobe.granite.crypto.file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.crypto.file")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCryptoFile() {
    return comAdobeGraniteCryptoFile;
  }

  @JsonProperty("com.adobe.granite.crypto.file")
  public void setComAdobeGraniteCryptoFile(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoFile) {
    this.comAdobeGraniteCryptoFile = comAdobeGraniteCryptoFile;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCryptoJcr(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoJcr) {
    this.comAdobeGraniteCryptoJcr = comAdobeGraniteCryptoJcr;
    return this;
  }

  /**
   * Get comAdobeGraniteCryptoJcr
   * @return comAdobeGraniteCryptoJcr
   */
  @Valid 
  @Schema(name = "com.adobe.granite.crypto.jcr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.crypto.jcr")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCryptoJcr() {
    return comAdobeGraniteCryptoJcr;
  }

  @JsonProperty("com.adobe.granite.crypto.jcr")
  public void setComAdobeGraniteCryptoJcr(@Nullable ConfigNodePropertyString comAdobeGraniteCryptoJcr) {
    this.comAdobeGraniteCryptoJcr = comAdobeGraniteCryptoJcr;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteCsrf(@Nullable ConfigNodePropertyString comAdobeGraniteCsrf) {
    this.comAdobeGraniteCsrf = comAdobeGraniteCsrf;
    return this;
  }

  /**
   * Get comAdobeGraniteCsrf
   * @return comAdobeGraniteCsrf
   */
  @Valid 
  @Schema(name = "com.adobe.granite.csrf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.csrf")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteCsrf() {
    return comAdobeGraniteCsrf;
  }

  @JsonProperty("com.adobe.granite.csrf")
  public void setComAdobeGraniteCsrf(@Nullable ConfigNodePropertyString comAdobeGraniteCsrf) {
    this.comAdobeGraniteCsrf = comAdobeGraniteCsrf;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteDistributionCore(@Nullable ConfigNodePropertyString comAdobeGraniteDistributionCore) {
    this.comAdobeGraniteDistributionCore = comAdobeGraniteDistributionCore;
    return this;
  }

  /**
   * Get comAdobeGraniteDistributionCore
   * @return comAdobeGraniteDistributionCore
   */
  @Valid 
  @Schema(name = "com.adobe.granite.distribution.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.distribution.core")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteDistributionCore() {
    return comAdobeGraniteDistributionCore;
  }

  @JsonProperty("com.adobe.granite.distribution.core")
  public void setComAdobeGraniteDistributionCore(@Nullable ConfigNodePropertyString comAdobeGraniteDistributionCore) {
    this.comAdobeGraniteDistributionCore = comAdobeGraniteDistributionCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteDropwizardMetrics(@Nullable ConfigNodePropertyString comAdobeGraniteDropwizardMetrics) {
    this.comAdobeGraniteDropwizardMetrics = comAdobeGraniteDropwizardMetrics;
    return this;
  }

  /**
   * Get comAdobeGraniteDropwizardMetrics
   * @return comAdobeGraniteDropwizardMetrics
   */
  @Valid 
  @Schema(name = "com.adobe.granite.dropwizard.metrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.dropwizard.metrics")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteDropwizardMetrics() {
    return comAdobeGraniteDropwizardMetrics;
  }

  @JsonProperty("com.adobe.granite.dropwizard.metrics")
  public void setComAdobeGraniteDropwizardMetrics(@Nullable ConfigNodePropertyString comAdobeGraniteDropwizardMetrics) {
    this.comAdobeGraniteDropwizardMetrics = comAdobeGraniteDropwizardMetrics;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteFragsImpl(@Nullable ConfigNodePropertyString comAdobeGraniteFragsImpl) {
    this.comAdobeGraniteFragsImpl = comAdobeGraniteFragsImpl;
    return this;
  }

  /**
   * Get comAdobeGraniteFragsImpl
   * @return comAdobeGraniteFragsImpl
   */
  @Valid 
  @Schema(name = "com.adobe.granite.frags.impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.frags.impl")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteFragsImpl() {
    return comAdobeGraniteFragsImpl;
  }

  @JsonProperty("com.adobe.granite.frags.impl")
  public void setComAdobeGraniteFragsImpl(@Nullable ConfigNodePropertyString comAdobeGraniteFragsImpl) {
    this.comAdobeGraniteFragsImpl = comAdobeGraniteFragsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteGibson(@Nullable ConfigNodePropertyString comAdobeGraniteGibson) {
    this.comAdobeGraniteGibson = comAdobeGraniteGibson;
    return this;
  }

  /**
   * Get comAdobeGraniteGibson
   * @return comAdobeGraniteGibson
   */
  @Valid 
  @Schema(name = "com.adobe.granite.gibson", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.gibson")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteGibson() {
    return comAdobeGraniteGibson;
  }

  @JsonProperty("com.adobe.granite.gibson")
  public void setComAdobeGraniteGibson(@Nullable ConfigNodePropertyString comAdobeGraniteGibson) {
    this.comAdobeGraniteGibson = comAdobeGraniteGibson;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteInfocollector(@Nullable ConfigNodePropertyString comAdobeGraniteInfocollector) {
    this.comAdobeGraniteInfocollector = comAdobeGraniteInfocollector;
    return this;
  }

  /**
   * Get comAdobeGraniteInfocollector
   * @return comAdobeGraniteInfocollector
   */
  @Valid 
  @Schema(name = "com.adobe.granite.infocollector", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.infocollector")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteInfocollector() {
    return comAdobeGraniteInfocollector;
  }

  @JsonProperty("com.adobe.granite.infocollector")
  public void setComAdobeGraniteInfocollector(@Nullable ConfigNodePropertyString comAdobeGraniteInfocollector) {
    this.comAdobeGraniteInfocollector = comAdobeGraniteInfocollector;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteInstallerFactoryPackages(@Nullable ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages) {
    this.comAdobeGraniteInstallerFactoryPackages = comAdobeGraniteInstallerFactoryPackages;
    return this;
  }

  /**
   * Get comAdobeGraniteInstallerFactoryPackages
   * @return comAdobeGraniteInstallerFactoryPackages
   */
  @Valid 
  @Schema(name = "com.adobe.granite.installer.factory.packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.installer.factory.packages")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteInstallerFactoryPackages() {
    return comAdobeGraniteInstallerFactoryPackages;
  }

  @JsonProperty("com.adobe.granite.installer.factory.packages")
  public void setComAdobeGraniteInstallerFactoryPackages(@Nullable ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages) {
    this.comAdobeGraniteInstallerFactoryPackages = comAdobeGraniteInstallerFactoryPackages;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteJettySsl(@Nullable ConfigNodePropertyString comAdobeGraniteJettySsl) {
    this.comAdobeGraniteJettySsl = comAdobeGraniteJettySsl;
    return this;
  }

  /**
   * Get comAdobeGraniteJettySsl
   * @return comAdobeGraniteJettySsl
   */
  @Valid 
  @Schema(name = "com.adobe.granite.jetty.ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.jetty.ssl")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteJettySsl() {
    return comAdobeGraniteJettySsl;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl")
  public void setComAdobeGraniteJettySsl(@Nullable ConfigNodePropertyString comAdobeGraniteJettySsl) {
    this.comAdobeGraniteJettySsl = comAdobeGraniteJettySsl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteJobsAsync(@Nullable ConfigNodePropertyString comAdobeGraniteJobsAsync) {
    this.comAdobeGraniteJobsAsync = comAdobeGraniteJobsAsync;
    return this;
  }

  /**
   * Get comAdobeGraniteJobsAsync
   * @return comAdobeGraniteJobsAsync
   */
  @Valid 
  @Schema(name = "com.adobe.granite.jobs.async", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.jobs.async")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteJobsAsync() {
    return comAdobeGraniteJobsAsync;
  }

  @JsonProperty("com.adobe.granite.jobs.async")
  public void setComAdobeGraniteJobsAsync(@Nullable ConfigNodePropertyString comAdobeGraniteJobsAsync) {
    this.comAdobeGraniteJobsAsync = comAdobeGraniteJobsAsync;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteMaintenanceOak(@Nullable ConfigNodePropertyString comAdobeGraniteMaintenanceOak) {
    this.comAdobeGraniteMaintenanceOak = comAdobeGraniteMaintenanceOak;
    return this;
  }

  /**
   * Get comAdobeGraniteMaintenanceOak
   * @return comAdobeGraniteMaintenanceOak
   */
  @Valid 
  @Schema(name = "com.adobe.granite.maintenance.oak", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.maintenance.oak")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteMaintenanceOak() {
    return comAdobeGraniteMaintenanceOak;
  }

  @JsonProperty("com.adobe.granite.maintenance.oak")
  public void setComAdobeGraniteMaintenanceOak(@Nullable ConfigNodePropertyString comAdobeGraniteMaintenanceOak) {
    this.comAdobeGraniteMaintenanceOak = comAdobeGraniteMaintenanceOak;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteMonitoringCore(@Nullable ConfigNodePropertyString comAdobeGraniteMonitoringCore) {
    this.comAdobeGraniteMonitoringCore = comAdobeGraniteMonitoringCore;
    return this;
  }

  /**
   * Get comAdobeGraniteMonitoringCore
   * @return comAdobeGraniteMonitoringCore
   */
  @Valid 
  @Schema(name = "com.adobe.granite.monitoring.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.monitoring.core")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteMonitoringCore() {
    return comAdobeGraniteMonitoringCore;
  }

  @JsonProperty("com.adobe.granite.monitoring.core")
  public void setComAdobeGraniteMonitoringCore(@Nullable ConfigNodePropertyString comAdobeGraniteMonitoringCore) {
    this.comAdobeGraniteMonitoringCore = comAdobeGraniteMonitoringCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteQueries(@Nullable ConfigNodePropertyString comAdobeGraniteQueries) {
    this.comAdobeGraniteQueries = comAdobeGraniteQueries;
    return this;
  }

  /**
   * Get comAdobeGraniteQueries
   * @return comAdobeGraniteQueries
   */
  @Valid 
  @Schema(name = "com.adobe.granite.queries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.queries")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteQueries() {
    return comAdobeGraniteQueries;
  }

  @JsonProperty("com.adobe.granite.queries")
  public void setComAdobeGraniteQueries(@Nullable ConfigNodePropertyString comAdobeGraniteQueries) {
    this.comAdobeGraniteQueries = comAdobeGraniteQueries;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteReplicationHcImpl(@Nullable ConfigNodePropertyString comAdobeGraniteReplicationHcImpl) {
    this.comAdobeGraniteReplicationHcImpl = comAdobeGraniteReplicationHcImpl;
    return this;
  }

  /**
   * Get comAdobeGraniteReplicationHcImpl
   * @return comAdobeGraniteReplicationHcImpl
   */
  @Valid 
  @Schema(name = "com.adobe.granite.replication.hc.impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.replication.hc.impl")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteReplicationHcImpl() {
    return comAdobeGraniteReplicationHcImpl;
  }

  @JsonProperty("com.adobe.granite.replication.hc.impl")
  public void setComAdobeGraniteReplicationHcImpl(@Nullable ConfigNodePropertyString comAdobeGraniteReplicationHcImpl) {
    this.comAdobeGraniteReplicationHcImpl = comAdobeGraniteReplicationHcImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteRepositoryChecker(@Nullable ConfigNodePropertyString comAdobeGraniteRepositoryChecker) {
    this.comAdobeGraniteRepositoryChecker = comAdobeGraniteRepositoryChecker;
    return this;
  }

  /**
   * Get comAdobeGraniteRepositoryChecker
   * @return comAdobeGraniteRepositoryChecker
   */
  @Valid 
  @Schema(name = "com.adobe.granite.repository.checker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.repository.checker")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteRepositoryChecker() {
    return comAdobeGraniteRepositoryChecker;
  }

  @JsonProperty("com.adobe.granite.repository.checker")
  public void setComAdobeGraniteRepositoryChecker(@Nullable ConfigNodePropertyString comAdobeGraniteRepositoryChecker) {
    this.comAdobeGraniteRepositoryChecker = comAdobeGraniteRepositoryChecker;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteRepositoryHcImpl(@Nullable ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl) {
    this.comAdobeGraniteRepositoryHcImpl = comAdobeGraniteRepositoryHcImpl;
    return this;
  }

  /**
   * Get comAdobeGraniteRepositoryHcImpl
   * @return comAdobeGraniteRepositoryHcImpl
   */
  @Valid 
  @Schema(name = "com.adobe.granite.repository.hc.impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.repository.hc.impl")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteRepositoryHcImpl() {
    return comAdobeGraniteRepositoryHcImpl;
  }

  @JsonProperty("com.adobe.granite.repository.hc.impl")
  public void setComAdobeGraniteRepositoryHcImpl(@Nullable ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl) {
    this.comAdobeGraniteRepositoryHcImpl = comAdobeGraniteRepositoryHcImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteRestAssets(@Nullable ConfigNodePropertyString comAdobeGraniteRestAssets) {
    this.comAdobeGraniteRestAssets = comAdobeGraniteRestAssets;
    return this;
  }

  /**
   * Get comAdobeGraniteRestAssets
   * @return comAdobeGraniteRestAssets
   */
  @Valid 
  @Schema(name = "com.adobe.granite.rest.assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.rest.assets")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteRestAssets() {
    return comAdobeGraniteRestAssets;
  }

  @JsonProperty("com.adobe.granite.rest.assets")
  public void setComAdobeGraniteRestAssets(@Nullable ConfigNodePropertyString comAdobeGraniteRestAssets) {
    this.comAdobeGraniteRestAssets = comAdobeGraniteRestAssets;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteSecurityUi(@Nullable ConfigNodePropertyString comAdobeGraniteSecurityUi) {
    this.comAdobeGraniteSecurityUi = comAdobeGraniteSecurityUi;
    return this;
  }

  /**
   * Get comAdobeGraniteSecurityUi
   * @return comAdobeGraniteSecurityUi
   */
  @Valid 
  @Schema(name = "com.adobe.granite.security.ui", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.security.ui")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteSecurityUi() {
    return comAdobeGraniteSecurityUi;
  }

  @JsonProperty("com.adobe.granite.security.ui")
  public void setComAdobeGraniteSecurityUi(@Nullable ConfigNodePropertyString comAdobeGraniteSecurityUi) {
    this.comAdobeGraniteSecurityUi = comAdobeGraniteSecurityUi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteStartup(@Nullable ConfigNodePropertyString comAdobeGraniteStartup) {
    this.comAdobeGraniteStartup = comAdobeGraniteStartup;
    return this;
  }

  /**
   * Get comAdobeGraniteStartup
   * @return comAdobeGraniteStartup
   */
  @Valid 
  @Schema(name = "com.adobe.granite.startup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.startup")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteStartup() {
    return comAdobeGraniteStartup;
  }

  @JsonProperty("com.adobe.granite.startup")
  public void setComAdobeGraniteStartup(@Nullable ConfigNodePropertyString comAdobeGraniteStartup) {
    this.comAdobeGraniteStartup = comAdobeGraniteStartup;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteTagsoup(@Nullable ConfigNodePropertyString comAdobeGraniteTagsoup) {
    this.comAdobeGraniteTagsoup = comAdobeGraniteTagsoup;
    return this;
  }

  /**
   * Get comAdobeGraniteTagsoup
   * @return comAdobeGraniteTagsoup
   */
  @Valid 
  @Schema(name = "com.adobe.granite.tagsoup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.tagsoup")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteTagsoup() {
    return comAdobeGraniteTagsoup;
  }

  @JsonProperty("com.adobe.granite.tagsoup")
  public void setComAdobeGraniteTagsoup(@Nullable ConfigNodePropertyString comAdobeGraniteTagsoup) {
    this.comAdobeGraniteTagsoup = comAdobeGraniteTagsoup;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteTaskmanagementCore(@Nullable ConfigNodePropertyString comAdobeGraniteTaskmanagementCore) {
    this.comAdobeGraniteTaskmanagementCore = comAdobeGraniteTaskmanagementCore;
    return this;
  }

  /**
   * Get comAdobeGraniteTaskmanagementCore
   * @return comAdobeGraniteTaskmanagementCore
   */
  @Valid 
  @Schema(name = "com.adobe.granite.taskmanagement.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.taskmanagement.core")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteTaskmanagementCore() {
    return comAdobeGraniteTaskmanagementCore;
  }

  @JsonProperty("com.adobe.granite.taskmanagement.core")
  public void setComAdobeGraniteTaskmanagementCore(@Nullable ConfigNodePropertyString comAdobeGraniteTaskmanagementCore) {
    this.comAdobeGraniteTaskmanagementCore = comAdobeGraniteTaskmanagementCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteTaskmanagementWorkflow(@Nullable ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow) {
    this.comAdobeGraniteTaskmanagementWorkflow = comAdobeGraniteTaskmanagementWorkflow;
    return this;
  }

  /**
   * Get comAdobeGraniteTaskmanagementWorkflow
   * @return comAdobeGraniteTaskmanagementWorkflow
   */
  @Valid 
  @Schema(name = "com.adobe.granite.taskmanagement.workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.taskmanagement.workflow")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteTaskmanagementWorkflow() {
    return comAdobeGraniteTaskmanagementWorkflow;
  }

  @JsonProperty("com.adobe.granite.taskmanagement.workflow")
  public void setComAdobeGraniteTaskmanagementWorkflow(@Nullable ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow) {
    this.comAdobeGraniteTaskmanagementWorkflow = comAdobeGraniteTaskmanagementWorkflow;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteUiClientlibsCompilerLess(@Nullable ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess) {
    this.comAdobeGraniteUiClientlibsCompilerLess = comAdobeGraniteUiClientlibsCompilerLess;
    return this;
  }

  /**
   * Get comAdobeGraniteUiClientlibsCompilerLess
   * @return comAdobeGraniteUiClientlibsCompilerLess
   */
  @Valid 
  @Schema(name = "com.adobe.granite.ui.clientlibs.compiler.less", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteUiClientlibsCompilerLess() {
    return comAdobeGraniteUiClientlibsCompilerLess;
  }

  @JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less")
  public void setComAdobeGraniteUiClientlibsCompilerLess(@Nullable ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess) {
    this.comAdobeGraniteUiClientlibsCompilerLess = comAdobeGraniteUiClientlibsCompilerLess;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteUiClientlibsProcessorGcc(@Nullable ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc) {
    this.comAdobeGraniteUiClientlibsProcessorGcc = comAdobeGraniteUiClientlibsProcessorGcc;
    return this;
  }

  /**
   * Get comAdobeGraniteUiClientlibsProcessorGcc
   * @return comAdobeGraniteUiClientlibsProcessorGcc
   */
  @Valid 
  @Schema(name = "com.adobe.granite.ui.clientlibs.processor.gcc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteUiClientlibsProcessorGcc() {
    return comAdobeGraniteUiClientlibsProcessorGcc;
  }

  @JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc")
  public void setComAdobeGraniteUiClientlibsProcessorGcc(@Nullable ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc) {
    this.comAdobeGraniteUiClientlibsProcessorGcc = comAdobeGraniteUiClientlibsProcessorGcc;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteWebconsolePlugins(@Nullable ConfigNodePropertyString comAdobeGraniteWebconsolePlugins) {
    this.comAdobeGraniteWebconsolePlugins = comAdobeGraniteWebconsolePlugins;
    return this;
  }

  /**
   * Get comAdobeGraniteWebconsolePlugins
   * @return comAdobeGraniteWebconsolePlugins
   */
  @Valid 
  @Schema(name = "com.adobe.granite.webconsole.plugins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.webconsole.plugins")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteWebconsolePlugins() {
    return comAdobeGraniteWebconsolePlugins;
  }

  @JsonProperty("com.adobe.granite.webconsole.plugins")
  public void setComAdobeGraniteWebconsolePlugins(@Nullable ConfigNodePropertyString comAdobeGraniteWebconsolePlugins) {
    this.comAdobeGraniteWebconsolePlugins = comAdobeGraniteWebconsolePlugins;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteWorkflowConsole(@Nullable ConfigNodePropertyString comAdobeGraniteWorkflowConsole) {
    this.comAdobeGraniteWorkflowConsole = comAdobeGraniteWorkflowConsole;
    return this;
  }

  /**
   * Get comAdobeGraniteWorkflowConsole
   * @return comAdobeGraniteWorkflowConsole
   */
  @Valid 
  @Schema(name = "com.adobe.granite.workflow.console", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.workflow.console")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteWorkflowConsole() {
    return comAdobeGraniteWorkflowConsole;
  }

  @JsonProperty("com.adobe.granite.workflow.console")
  public void setComAdobeGraniteWorkflowConsole(@Nullable ConfigNodePropertyString comAdobeGraniteWorkflowConsole) {
    this.comAdobeGraniteWorkflowConsole = comAdobeGraniteWorkflowConsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeXmpWorkerFilesNativeFragmentLinux(@Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux) {
    this.comAdobeXmpWorkerFilesNativeFragmentLinux = comAdobeXmpWorkerFilesNativeFragmentLinux;
    return this;
  }

  /**
   * Get comAdobeXmpWorkerFilesNativeFragmentLinux
   * @return comAdobeXmpWorkerFilesNativeFragmentLinux
   */
  @Valid 
  @Schema(name = "com.adobe.xmp.worker.files.native.fragment.linux", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux")
  public @Nullable ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentLinux() {
    return comAdobeXmpWorkerFilesNativeFragmentLinux;
  }

  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux")
  public void setComAdobeXmpWorkerFilesNativeFragmentLinux(@Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux) {
    this.comAdobeXmpWorkerFilesNativeFragmentLinux = comAdobeXmpWorkerFilesNativeFragmentLinux;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeXmpWorkerFilesNativeFragmentMacosx(@Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx) {
    this.comAdobeXmpWorkerFilesNativeFragmentMacosx = comAdobeXmpWorkerFilesNativeFragmentMacosx;
    return this;
  }

  /**
   * Get comAdobeXmpWorkerFilesNativeFragmentMacosx
   * @return comAdobeXmpWorkerFilesNativeFragmentMacosx
   */
  @Valid 
  @Schema(name = "com.adobe.xmp.worker.files.native.fragment.macosx", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx")
  public @Nullable ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentMacosx() {
    return comAdobeXmpWorkerFilesNativeFragmentMacosx;
  }

  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx")
  public void setComAdobeXmpWorkerFilesNativeFragmentMacosx(@Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx) {
    this.comAdobeXmpWorkerFilesNativeFragmentMacosx = comAdobeXmpWorkerFilesNativeFragmentMacosx;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeXmpWorkerFilesNativeFragmentWin(@Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin) {
    this.comAdobeXmpWorkerFilesNativeFragmentWin = comAdobeXmpWorkerFilesNativeFragmentWin;
    return this;
  }

  /**
   * Get comAdobeXmpWorkerFilesNativeFragmentWin
   * @return comAdobeXmpWorkerFilesNativeFragmentWin
   */
  @Valid 
  @Schema(name = "com.adobe.xmp.worker.files.native.fragment.win", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.win")
  public @Nullable ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentWin() {
    return comAdobeXmpWorkerFilesNativeFragmentWin;
  }

  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.win")
  public void setComAdobeXmpWorkerFilesNativeFragmentWin(@Nullable ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin) {
    this.comAdobeXmpWorkerFilesNativeFragmentWin = comAdobeXmpWorkerFilesNativeFragmentWin;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCommonsOsgiWrapperSimpleJndi(@Nullable ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi) {
    this.comDayCommonsOsgiWrapperSimpleJndi = comDayCommonsOsgiWrapperSimpleJndi;
    return this;
  }

  /**
   * Get comDayCommonsOsgiWrapperSimpleJndi
   * @return comDayCommonsOsgiWrapperSimpleJndi
   */
  @Valid 
  @Schema(name = "com.day.commons.osgi.wrapper.simple-jndi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.commons.osgi.wrapper.simple-jndi")
  public @Nullable ConfigNodePropertyString getComDayCommonsOsgiWrapperSimpleJndi() {
    return comDayCommonsOsgiWrapperSimpleJndi;
  }

  @JsonProperty("com.day.commons.osgi.wrapper.simple-jndi")
  public void setComDayCommonsOsgiWrapperSimpleJndi(@Nullable ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi) {
    this.comDayCommonsOsgiWrapperSimpleJndi = comDayCommonsOsgiWrapperSimpleJndi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqAuthhandler(@Nullable ConfigNodePropertyString comDayCqCqAuthhandler) {
    this.comDayCqCqAuthhandler = comDayCqCqAuthhandler;
    return this;
  }

  /**
   * Get comDayCqCqAuthhandler
   * @return comDayCqCqAuthhandler
   */
  @Valid 
  @Schema(name = "com.day.cq.cq-authhandler", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.cq-authhandler")
  public @Nullable ConfigNodePropertyString getComDayCqCqAuthhandler() {
    return comDayCqCqAuthhandler;
  }

  @JsonProperty("com.day.cq.cq-authhandler")
  public void setComDayCqCqAuthhandler(@Nullable ConfigNodePropertyString comDayCqCqAuthhandler) {
    this.comDayCqCqAuthhandler = comDayCqCqAuthhandler;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqCompatConfigupdate(@Nullable ConfigNodePropertyString comDayCqCqCompatConfigupdate) {
    this.comDayCqCqCompatConfigupdate = comDayCqCqCompatConfigupdate;
    return this;
  }

  /**
   * Get comDayCqCqCompatConfigupdate
   * @return comDayCqCqCompatConfigupdate
   */
  @Valid 
  @Schema(name = "com.day.cq.cq-compat-configupdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.cq-compat-configupdate")
  public @Nullable ConfigNodePropertyString getComDayCqCqCompatConfigupdate() {
    return comDayCqCqCompatConfigupdate;
  }

  @JsonProperty("com.day.cq.cq-compat-configupdate")
  public void setComDayCqCqCompatConfigupdate(@Nullable ConfigNodePropertyString comDayCqCqCompatConfigupdate) {
    this.comDayCqCqCompatConfigupdate = comDayCqCqCompatConfigupdate;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqLicensebranding(@Nullable ConfigNodePropertyString comDayCqCqLicensebranding) {
    this.comDayCqCqLicensebranding = comDayCqCqLicensebranding;
    return this;
  }

  /**
   * Get comDayCqCqLicensebranding
   * @return comDayCqCqLicensebranding
   */
  @Valid 
  @Schema(name = "com.day.cq.cq-licensebranding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.cq-licensebranding")
  public @Nullable ConfigNodePropertyString getComDayCqCqLicensebranding() {
    return comDayCqCqLicensebranding;
  }

  @JsonProperty("com.day.cq.cq-licensebranding")
  public void setComDayCqCqLicensebranding(@Nullable ConfigNodePropertyString comDayCqCqLicensebranding) {
    this.comDayCqCqLicensebranding = comDayCqCqLicensebranding;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqNotifcationImpl(@Nullable ConfigNodePropertyString comDayCqCqNotifcationImpl) {
    this.comDayCqCqNotifcationImpl = comDayCqCqNotifcationImpl;
    return this;
  }

  /**
   * Get comDayCqCqNotifcationImpl
   * @return comDayCqCqNotifcationImpl
   */
  @Valid 
  @Schema(name = "com.day.cq.cq-notifcation-impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.cq-notifcation-impl")
  public @Nullable ConfigNodePropertyString getComDayCqCqNotifcationImpl() {
    return comDayCqCqNotifcationImpl;
  }

  @JsonProperty("com.day.cq.cq-notifcation-impl")
  public void setComDayCqCqNotifcationImpl(@Nullable ConfigNodePropertyString comDayCqCqNotifcationImpl) {
    this.comDayCqCqNotifcationImpl = comDayCqCqNotifcationImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqReplicationAudit(@Nullable ConfigNodePropertyString comDayCqCqReplicationAudit) {
    this.comDayCqCqReplicationAudit = comDayCqCqReplicationAudit;
    return this;
  }

  /**
   * Get comDayCqCqReplicationAudit
   * @return comDayCqCqReplicationAudit
   */
  @Valid 
  @Schema(name = "com.day.cq.cq-replication-audit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.cq-replication-audit")
  public @Nullable ConfigNodePropertyString getComDayCqCqReplicationAudit() {
    return comDayCqCqReplicationAudit;
  }

  @JsonProperty("com.day.cq.cq-replication-audit")
  public void setComDayCqCqReplicationAudit(@Nullable ConfigNodePropertyString comDayCqCqReplicationAudit) {
    this.comDayCqCqReplicationAudit = comDayCqCqReplicationAudit;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqCqSearchExt(@Nullable ConfigNodePropertyString comDayCqCqSearchExt) {
    this.comDayCqCqSearchExt = comDayCqCqSearchExt;
    return this;
  }

  /**
   * Get comDayCqCqSearchExt
   * @return comDayCqCqSearchExt
   */
  @Valid 
  @Schema(name = "com.day.cq.cq-search-ext", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.cq-search-ext")
  public @Nullable ConfigNodePropertyString getComDayCqCqSearchExt() {
    return comDayCqCqSearchExt;
  }

  @JsonProperty("com.day.cq.cq-search-ext")
  public void setComDayCqCqSearchExt(@Nullable ConfigNodePropertyString comDayCqCqSearchExt) {
    this.comDayCqCqSearchExt = comDayCqCqSearchExt;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamAnnotationPrint(@Nullable ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint) {
    this.comDayCqDamCqDamAnnotationPrint = comDayCqDamCqDamAnnotationPrint;
    return this;
  }

  /**
   * Get comDayCqDamCqDamAnnotationPrint
   * @return comDayCqDamCqDamAnnotationPrint
   */
  @Valid 
  @Schema(name = "com.day.cq.dam.cq-dam-annotation-print", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.dam.cq-dam-annotation-print")
  public @Nullable ConfigNodePropertyString getComDayCqDamCqDamAnnotationPrint() {
    return comDayCqDamCqDamAnnotationPrint;
  }

  @JsonProperty("com.day.cq.dam.cq-dam-annotation-print")
  public void setComDayCqDamCqDamAnnotationPrint(@Nullable ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint) {
    this.comDayCqDamCqDamAnnotationPrint = comDayCqDamCqDamAnnotationPrint;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamAssetUsage(@Nullable ConfigNodePropertyString comDayCqDamCqDamAssetUsage) {
    this.comDayCqDamCqDamAssetUsage = comDayCqDamCqDamAssetUsage;
    return this;
  }

  /**
   * Get comDayCqDamCqDamAssetUsage
   * @return comDayCqDamCqDamAssetUsage
   */
  @Valid 
  @Schema(name = "com.day.cq.dam.cq-dam-asset-usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.dam.cq-dam-asset-usage")
  public @Nullable ConfigNodePropertyString getComDayCqDamCqDamAssetUsage() {
    return comDayCqDamCqDamAssetUsage;
  }

  @JsonProperty("com.day.cq.dam.cq-dam-asset-usage")
  public void setComDayCqDamCqDamAssetUsage(@Nullable ConfigNodePropertyString comDayCqDamCqDamAssetUsage) {
    this.comDayCqDamCqDamAssetUsage = comDayCqDamCqDamAssetUsage;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamS7dam(@Nullable ConfigNodePropertyString comDayCqDamCqDamS7dam) {
    this.comDayCqDamCqDamS7dam = comDayCqDamCqDamS7dam;
    return this;
  }

  /**
   * Get comDayCqDamCqDamS7dam
   * @return comDayCqDamCqDamS7dam
   */
  @Valid 
  @Schema(name = "com.day.cq.dam.cq-dam-s7dam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.dam.cq-dam-s7dam")
  public @Nullable ConfigNodePropertyString getComDayCqDamCqDamS7dam() {
    return comDayCqDamCqDamS7dam;
  }

  @JsonProperty("com.day.cq.dam.cq-dam-s7dam")
  public void setComDayCqDamCqDamS7dam(@Nullable ConfigNodePropertyString comDayCqDamCqDamS7dam) {
    this.comDayCqDamCqDamS7dam = comDayCqDamCqDamS7dam;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamCqDamSimilaritysearch(@Nullable ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch) {
    this.comDayCqDamCqDamSimilaritysearch = comDayCqDamCqDamSimilaritysearch;
    return this;
  }

  /**
   * Get comDayCqDamCqDamSimilaritysearch
   * @return comDayCqDamCqDamSimilaritysearch
   */
  @Valid 
  @Schema(name = "com.day.cq.dam.cq-dam-similaritysearch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.dam.cq-dam-similaritysearch")
  public @Nullable ConfigNodePropertyString getComDayCqDamCqDamSimilaritysearch() {
    return comDayCqDamCqDamSimilaritysearch;
  }

  @JsonProperty("com.day.cq.dam.cq-dam-similaritysearch")
  public void setComDayCqDamCqDamSimilaritysearch(@Nullable ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch) {
    this.comDayCqDamCqDamSimilaritysearch = comDayCqDamCqDamSimilaritysearch;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqDamDamWebdavSupport(@Nullable ConfigNodePropertyString comDayCqDamDamWebdavSupport) {
    this.comDayCqDamDamWebdavSupport = comDayCqDamDamWebdavSupport;
    return this;
  }

  /**
   * Get comDayCqDamDamWebdavSupport
   * @return comDayCqDamDamWebdavSupport
   */
  @Valid 
  @Schema(name = "com.day.cq.dam.dam-webdav-support", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.dam.dam-webdav-support")
  public @Nullable ConfigNodePropertyString getComDayCqDamDamWebdavSupport() {
    return comDayCqDamDamWebdavSupport;
  }

  @JsonProperty("com.day.cq.dam.dam-webdav-support")
  public void setComDayCqDamDamWebdavSupport(@Nullable ConfigNodePropertyString comDayCqDamDamWebdavSupport) {
    this.comDayCqDamDamWebdavSupport = comDayCqDamDamWebdavSupport;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqPreUpgradeTasks(@Nullable ConfigNodePropertyString comDayCqPreUpgradeTasks) {
    this.comDayCqPreUpgradeTasks = comDayCqPreUpgradeTasks;
    return this;
  }

  /**
   * Get comDayCqPreUpgradeTasks
   * @return comDayCqPreUpgradeTasks
   */
  @Valid 
  @Schema(name = "com.day.cq.pre-upgrade-tasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.pre-upgrade-tasks")
  public @Nullable ConfigNodePropertyString getComDayCqPreUpgradeTasks() {
    return comDayCqPreUpgradeTasks;
  }

  @JsonProperty("com.day.cq.pre-upgrade-tasks")
  public void setComDayCqPreUpgradeTasks(@Nullable ConfigNodePropertyString comDayCqPreUpgradeTasks) {
    this.comDayCqPreUpgradeTasks = comDayCqPreUpgradeTasks;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqReplicationExtensions(@Nullable ConfigNodePropertyString comDayCqReplicationExtensions) {
    this.comDayCqReplicationExtensions = comDayCqReplicationExtensions;
    return this;
  }

  /**
   * Get comDayCqReplicationExtensions
   * @return comDayCqReplicationExtensions
   */
  @Valid 
  @Schema(name = "com.day.cq.replication.extensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.replication.extensions")
  public @Nullable ConfigNodePropertyString getComDayCqReplicationExtensions() {
    return comDayCqReplicationExtensions;
  }

  @JsonProperty("com.day.cq.replication.extensions")
  public void setComDayCqReplicationExtensions(@Nullable ConfigNodePropertyString comDayCqReplicationExtensions) {
    this.comDayCqReplicationExtensions = comDayCqReplicationExtensions;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqWcmCqMsmCore(@Nullable ConfigNodePropertyString comDayCqWcmCqMsmCore) {
    this.comDayCqWcmCqMsmCore = comDayCqWcmCqMsmCore;
    return this;
  }

  /**
   * Get comDayCqWcmCqMsmCore
   * @return comDayCqWcmCqMsmCore
   */
  @Valid 
  @Schema(name = "com.day.cq.wcm.cq-msm-core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.wcm.cq-msm-core")
  public @Nullable ConfigNodePropertyString getComDayCqWcmCqMsmCore() {
    return comDayCqWcmCqMsmCore;
  }

  @JsonProperty("com.day.cq.wcm.cq-msm-core")
  public void setComDayCqWcmCqMsmCore(@Nullable ConfigNodePropertyString comDayCqWcmCqMsmCore) {
    this.comDayCqWcmCqMsmCore = comDayCqWcmCqMsmCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comDayCqWcmCqWcmTranslation(@Nullable ConfigNodePropertyString comDayCqWcmCqWcmTranslation) {
    this.comDayCqWcmCqWcmTranslation = comDayCqWcmCqWcmTranslation;
    return this;
  }

  /**
   * Get comDayCqWcmCqWcmTranslation
   * @return comDayCqWcmCqWcmTranslation
   */
  @Valid 
  @Schema(name = "com.day.cq.wcm.cq-wcm-translation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.wcm.cq-wcm-translation")
  public @Nullable ConfigNodePropertyString getComDayCqWcmCqWcmTranslation() {
    return comDayCqWcmCqWcmTranslation;
  }

  @JsonProperty("com.day.cq.wcm.cq-wcm-translation")
  public void setComDayCqWcmCqWcmTranslation(@Nullable ConfigNodePropertyString comDayCqWcmCqWcmTranslation) {
    this.comDayCqWcmCqWcmTranslation = comDayCqWcmCqWcmTranslation;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties dayCommonsJrawio(@Nullable ConfigNodePropertyString dayCommonsJrawio) {
    this.dayCommonsJrawio = dayCommonsJrawio;
    return this;
  }

  /**
   * Get dayCommonsJrawio
   * @return dayCommonsJrawio
   */
  @Valid 
  @Schema(name = "day-commons-jrawio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("day-commons-jrawio")
  public @Nullable ConfigNodePropertyString getDayCommonsJrawio() {
    return dayCommonsJrawio;
  }

  @JsonProperty("day-commons-jrawio")
  public void setDayCommonsJrawio(@Nullable ConfigNodePropertyString dayCommonsJrawio) {
    this.dayCommonsJrawio = dayCommonsJrawio;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheAriesJmxWhiteboard(@Nullable ConfigNodePropertyString orgApacheAriesJmxWhiteboard) {
    this.orgApacheAriesJmxWhiteboard = orgApacheAriesJmxWhiteboard;
    return this;
  }

  /**
   * Get orgApacheAriesJmxWhiteboard
   * @return orgApacheAriesJmxWhiteboard
   */
  @Valid 
  @Schema(name = "org.apache.aries.jmx.whiteboard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.aries.jmx.whiteboard")
  public @Nullable ConfigNodePropertyString getOrgApacheAriesJmxWhiteboard() {
    return orgApacheAriesJmxWhiteboard;
  }

  @JsonProperty("org.apache.aries.jmx.whiteboard")
  public void setOrgApacheAriesJmxWhiteboard(@Nullable ConfigNodePropertyString orgApacheAriesJmxWhiteboard) {
    this.orgApacheAriesJmxWhiteboard = orgApacheAriesJmxWhiteboard;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixHttpSslfilter(@Nullable ConfigNodePropertyString orgApacheFelixHttpSslfilter) {
    this.orgApacheFelixHttpSslfilter = orgApacheFelixHttpSslfilter;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSslfilter
   * @return orgApacheFelixHttpSslfilter
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.sslfilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.sslfilter")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpSslfilter() {
    return orgApacheFelixHttpSslfilter;
  }

  @JsonProperty("org.apache.felix.http.sslfilter")
  public void setOrgApacheFelixHttpSslfilter(@Nullable ConfigNodePropertyString orgApacheFelixHttpSslfilter) {
    this.orgApacheFelixHttpSslfilter = orgApacheFelixHttpSslfilter;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixOrgApacheFelixThreaddump(@Nullable ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump) {
    this.orgApacheFelixOrgApacheFelixThreaddump = orgApacheFelixOrgApacheFelixThreaddump;
    return this;
  }

  /**
   * Get orgApacheFelixOrgApacheFelixThreaddump
   * @return orgApacheFelixOrgApacheFelixThreaddump
   */
  @Valid 
  @Schema(name = "org.apache.felix.org.apache.felix.threaddump", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.org.apache.felix.threaddump")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixOrgApacheFelixThreaddump() {
    return orgApacheFelixOrgApacheFelixThreaddump;
  }

  @JsonProperty("org.apache.felix.org.apache.felix.threaddump")
  public void setOrgApacheFelixOrgApacheFelixThreaddump(@Nullable ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump) {
    this.orgApacheFelixOrgApacheFelixThreaddump = orgApacheFelixOrgApacheFelixThreaddump;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsDs(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs) {
    this.orgApacheFelixWebconsolePluginsDs = orgApacheFelixWebconsolePluginsDs;
    return this;
  }

  /**
   * Get orgApacheFelixWebconsolePluginsDs
   * @return orgApacheFelixWebconsolePluginsDs
   */
  @Valid 
  @Schema(name = "org.apache.felix.webconsole.plugins.ds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.webconsole.plugins.ds")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsDs() {
    return orgApacheFelixWebconsolePluginsDs;
  }

  @JsonProperty("org.apache.felix.webconsole.plugins.ds")
  public void setOrgApacheFelixWebconsolePluginsDs(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs) {
    this.orgApacheFelixWebconsolePluginsDs = orgApacheFelixWebconsolePluginsDs;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsEvent(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent) {
    this.orgApacheFelixWebconsolePluginsEvent = orgApacheFelixWebconsolePluginsEvent;
    return this;
  }

  /**
   * Get orgApacheFelixWebconsolePluginsEvent
   * @return orgApacheFelixWebconsolePluginsEvent
   */
  @Valid 
  @Schema(name = "org.apache.felix.webconsole.plugins.event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.webconsole.plugins.event")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsEvent() {
    return orgApacheFelixWebconsolePluginsEvent;
  }

  @JsonProperty("org.apache.felix.webconsole.plugins.event")
  public void setOrgApacheFelixWebconsolePluginsEvent(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent) {
    this.orgApacheFelixWebconsolePluginsEvent = orgApacheFelixWebconsolePluginsEvent;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsMemoryusage(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage) {
    this.orgApacheFelixWebconsolePluginsMemoryusage = orgApacheFelixWebconsolePluginsMemoryusage;
    return this;
  }

  /**
   * Get orgApacheFelixWebconsolePluginsMemoryusage
   * @return orgApacheFelixWebconsolePluginsMemoryusage
   */
  @Valid 
  @Schema(name = "org.apache.felix.webconsole.plugins.memoryusage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.webconsole.plugins.memoryusage")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsMemoryusage() {
    return orgApacheFelixWebconsolePluginsMemoryusage;
  }

  @JsonProperty("org.apache.felix.webconsole.plugins.memoryusage")
  public void setOrgApacheFelixWebconsolePluginsMemoryusage(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage) {
    this.orgApacheFelixWebconsolePluginsMemoryusage = orgApacheFelixWebconsolePluginsMemoryusage;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheFelixWebconsolePluginsPackageadmin(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin) {
    this.orgApacheFelixWebconsolePluginsPackageadmin = orgApacheFelixWebconsolePluginsPackageadmin;
    return this;
  }

  /**
   * Get orgApacheFelixWebconsolePluginsPackageadmin
   * @return orgApacheFelixWebconsolePluginsPackageadmin
   */
  @Valid 
  @Schema(name = "org.apache.felix.webconsole.plugins.packageadmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.webconsole.plugins.packageadmin")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsPackageadmin() {
    return orgApacheFelixWebconsolePluginsPackageadmin;
  }

  @JsonProperty("org.apache.felix.webconsole.plugins.packageadmin")
  public void setOrgApacheFelixWebconsolePluginsPackageadmin(@Nullable ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin) {
    this.orgApacheFelixWebconsolePluginsPackageadmin = orgApacheFelixWebconsolePluginsPackageadmin;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheJackrabbitOakAuthLdap(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap) {
    this.orgApacheJackrabbitOakAuthLdap = orgApacheJackrabbitOakAuthLdap;
    return this;
  }

  /**
   * Get orgApacheJackrabbitOakAuthLdap
   * @return orgApacheJackrabbitOakAuthLdap
   */
  @Valid 
  @Schema(name = "org.apache.jackrabbit.oak-auth-ldap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.jackrabbit.oak-auth-ldap")
  public @Nullable ConfigNodePropertyString getOrgApacheJackrabbitOakAuthLdap() {
    return orgApacheJackrabbitOakAuthLdap;
  }

  @JsonProperty("org.apache.jackrabbit.oak-auth-ldap")
  public void setOrgApacheJackrabbitOakAuthLdap(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap) {
    this.orgApacheJackrabbitOakAuthLdap = orgApacheJackrabbitOakAuthLdap;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheJackrabbitOakSegmentTar(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar) {
    this.orgApacheJackrabbitOakSegmentTar = orgApacheJackrabbitOakSegmentTar;
    return this;
  }

  /**
   * Get orgApacheJackrabbitOakSegmentTar
   * @return orgApacheJackrabbitOakSegmentTar
   */
  @Valid 
  @Schema(name = "org.apache.jackrabbit.oak-segment-tar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.jackrabbit.oak-segment-tar")
  public @Nullable ConfigNodePropertyString getOrgApacheJackrabbitOakSegmentTar() {
    return orgApacheJackrabbitOakSegmentTar;
  }

  @JsonProperty("org.apache.jackrabbit.oak-segment-tar")
  public void setOrgApacheJackrabbitOakSegmentTar(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar) {
    this.orgApacheJackrabbitOakSegmentTar = orgApacheJackrabbitOakSegmentTar;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheJackrabbitOakSolrOsgi(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi) {
    this.orgApacheJackrabbitOakSolrOsgi = orgApacheJackrabbitOakSolrOsgi;
    return this;
  }

  /**
   * Get orgApacheJackrabbitOakSolrOsgi
   * @return orgApacheJackrabbitOakSolrOsgi
   */
  @Valid 
  @Schema(name = "org.apache.jackrabbit.oak-solr-osgi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.jackrabbit.oak-solr-osgi")
  public @Nullable ConfigNodePropertyString getOrgApacheJackrabbitOakSolrOsgi() {
    return orgApacheJackrabbitOakSolrOsgi;
  }

  @JsonProperty("org.apache.jackrabbit.oak-solr-osgi")
  public void setOrgApacheJackrabbitOakSolrOsgi(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi) {
    this.orgApacheJackrabbitOakSolrOsgi = orgApacheJackrabbitOakSolrOsgi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingBundleresourceImpl(@Nullable ConfigNodePropertyString orgApacheSlingBundleresourceImpl) {
    this.orgApacheSlingBundleresourceImpl = orgApacheSlingBundleresourceImpl;
    return this;
  }

  /**
   * Get orgApacheSlingBundleresourceImpl
   * @return orgApacheSlingBundleresourceImpl
   */
  @Valid 
  @Schema(name = "org.apache.sling.bundleresource.impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.bundleresource.impl")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingBundleresourceImpl() {
    return orgApacheSlingBundleresourceImpl;
  }

  @JsonProperty("org.apache.sling.bundleresource.impl")
  public void setOrgApacheSlingBundleresourceImpl(@Nullable ConfigNodePropertyString orgApacheSlingBundleresourceImpl) {
    this.orgApacheSlingBundleresourceImpl = orgApacheSlingBundleresourceImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingCommonsFsclassloader(@Nullable ConfigNodePropertyString orgApacheSlingCommonsFsclassloader) {
    this.orgApacheSlingCommonsFsclassloader = orgApacheSlingCommonsFsclassloader;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsFsclassloader
   * @return orgApacheSlingCommonsFsclassloader
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.fsclassloader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.fsclassloader")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingCommonsFsclassloader() {
    return orgApacheSlingCommonsFsclassloader;
  }

  @JsonProperty("org.apache.sling.commons.fsclassloader")
  public void setOrgApacheSlingCommonsFsclassloader(@Nullable ConfigNodePropertyString orgApacheSlingCommonsFsclassloader) {
    this.orgApacheSlingCommonsFsclassloader = orgApacheSlingCommonsFsclassloader;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingCommonsLogWebconsole(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole) {
    this.orgApacheSlingCommonsLogWebconsole = orgApacheSlingCommonsLogWebconsole;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogWebconsole
   * @return orgApacheSlingCommonsLogWebconsole
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.webconsole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.webconsole")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingCommonsLogWebconsole() {
    return orgApacheSlingCommonsLogWebconsole;
  }

  @JsonProperty("org.apache.sling.commons.log.webconsole")
  public void setOrgApacheSlingCommonsLogWebconsole(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole) {
    this.orgApacheSlingCommonsLogWebconsole = orgApacheSlingCommonsLogWebconsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDatasource(@Nullable ConfigNodePropertyString orgApacheSlingDatasource) {
    this.orgApacheSlingDatasource = orgApacheSlingDatasource;
    return this;
  }

  /**
   * Get orgApacheSlingDatasource
   * @return orgApacheSlingDatasource
   */
  @Valid 
  @Schema(name = "org.apache.sling.datasource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.datasource")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingDatasource() {
    return orgApacheSlingDatasource;
  }

  @JsonProperty("org.apache.sling.datasource")
  public void setOrgApacheSlingDatasource(@Nullable ConfigNodePropertyString orgApacheSlingDatasource) {
    this.orgApacheSlingDatasource = orgApacheSlingDatasource;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDiscoveryBase(@Nullable ConfigNodePropertyString orgApacheSlingDiscoveryBase) {
    this.orgApacheSlingDiscoveryBase = orgApacheSlingDiscoveryBase;
    return this;
  }

  /**
   * Get orgApacheSlingDiscoveryBase
   * @return orgApacheSlingDiscoveryBase
   */
  @Valid 
  @Schema(name = "org.apache.sling.discovery.base", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.discovery.base")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingDiscoveryBase() {
    return orgApacheSlingDiscoveryBase;
  }

  @JsonProperty("org.apache.sling.discovery.base")
  public void setOrgApacheSlingDiscoveryBase(@Nullable ConfigNodePropertyString orgApacheSlingDiscoveryBase) {
    this.orgApacheSlingDiscoveryBase = orgApacheSlingDiscoveryBase;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDiscoveryOak(@Nullable ConfigNodePropertyString orgApacheSlingDiscoveryOak) {
    this.orgApacheSlingDiscoveryOak = orgApacheSlingDiscoveryOak;
    return this;
  }

  /**
   * Get orgApacheSlingDiscoveryOak
   * @return orgApacheSlingDiscoveryOak
   */
  @Valid 
  @Schema(name = "org.apache.sling.discovery.oak", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.discovery.oak")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingDiscoveryOak() {
    return orgApacheSlingDiscoveryOak;
  }

  @JsonProperty("org.apache.sling.discovery.oak")
  public void setOrgApacheSlingDiscoveryOak(@Nullable ConfigNodePropertyString orgApacheSlingDiscoveryOak) {
    this.orgApacheSlingDiscoveryOak = orgApacheSlingDiscoveryOak;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDiscoverySupport(@Nullable ConfigNodePropertyString orgApacheSlingDiscoverySupport) {
    this.orgApacheSlingDiscoverySupport = orgApacheSlingDiscoverySupport;
    return this;
  }

  /**
   * Get orgApacheSlingDiscoverySupport
   * @return orgApacheSlingDiscoverySupport
   */
  @Valid 
  @Schema(name = "org.apache.sling.discovery.support", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.discovery.support")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingDiscoverySupport() {
    return orgApacheSlingDiscoverySupport;
  }

  @JsonProperty("org.apache.sling.discovery.support")
  public void setOrgApacheSlingDiscoverySupport(@Nullable ConfigNodePropertyString orgApacheSlingDiscoverySupport) {
    this.orgApacheSlingDiscoverySupport = orgApacheSlingDiscoverySupport;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDistributionApi(@Nullable ConfigNodePropertyString orgApacheSlingDistributionApi) {
    this.orgApacheSlingDistributionApi = orgApacheSlingDistributionApi;
    return this;
  }

  /**
   * Get orgApacheSlingDistributionApi
   * @return orgApacheSlingDistributionApi
   */
  @Valid 
  @Schema(name = "org.apache.sling.distribution.api", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.distribution.api")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingDistributionApi() {
    return orgApacheSlingDistributionApi;
  }

  @JsonProperty("org.apache.sling.distribution.api")
  public void setOrgApacheSlingDistributionApi(@Nullable ConfigNodePropertyString orgApacheSlingDistributionApi) {
    this.orgApacheSlingDistributionApi = orgApacheSlingDistributionApi;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingDistributionCore(@Nullable ConfigNodePropertyString orgApacheSlingDistributionCore) {
    this.orgApacheSlingDistributionCore = orgApacheSlingDistributionCore;
    return this;
  }

  /**
   * Get orgApacheSlingDistributionCore
   * @return orgApacheSlingDistributionCore
   */
  @Valid 
  @Schema(name = "org.apache.sling.distribution.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.distribution.core")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingDistributionCore() {
    return orgApacheSlingDistributionCore;
  }

  @JsonProperty("org.apache.sling.distribution.core")
  public void setOrgApacheSlingDistributionCore(@Nullable ConfigNodePropertyString orgApacheSlingDistributionCore) {
    this.orgApacheSlingDistributionCore = orgApacheSlingDistributionCore;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingExtensionsWebconsolesecurityprovider(@Nullable ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider) {
    this.orgApacheSlingExtensionsWebconsolesecurityprovider = orgApacheSlingExtensionsWebconsolesecurityprovider;
    return this;
  }

  /**
   * Get orgApacheSlingExtensionsWebconsolesecurityprovider
   * @return orgApacheSlingExtensionsWebconsolesecurityprovider
   */
  @Valid 
  @Schema(name = "org.apache.sling.extensions.webconsolesecurityprovider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingExtensionsWebconsolesecurityprovider() {
    return orgApacheSlingExtensionsWebconsolesecurityprovider;
  }

  @JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider")
  public void setOrgApacheSlingExtensionsWebconsolesecurityprovider(@Nullable ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider) {
    this.orgApacheSlingExtensionsWebconsolesecurityprovider = orgApacheSlingExtensionsWebconsolesecurityprovider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingHcWebconsole(@Nullable ConfigNodePropertyString orgApacheSlingHcWebconsole) {
    this.orgApacheSlingHcWebconsole = orgApacheSlingHcWebconsole;
    return this;
  }

  /**
   * Get orgApacheSlingHcWebconsole
   * @return orgApacheSlingHcWebconsole
   */
  @Valid 
  @Schema(name = "org.apache.sling.hc.webconsole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.hc.webconsole")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingHcWebconsole() {
    return orgApacheSlingHcWebconsole;
  }

  @JsonProperty("org.apache.sling.hc.webconsole")
  public void setOrgApacheSlingHcWebconsole(@Nullable ConfigNodePropertyString orgApacheSlingHcWebconsole) {
    this.orgApacheSlingHcWebconsole = orgApacheSlingHcWebconsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingInstallerConsole(@Nullable ConfigNodePropertyString orgApacheSlingInstallerConsole) {
    this.orgApacheSlingInstallerConsole = orgApacheSlingInstallerConsole;
    return this;
  }

  /**
   * Get orgApacheSlingInstallerConsole
   * @return orgApacheSlingInstallerConsole
   */
  @Valid 
  @Schema(name = "org.apache.sling.installer.console", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.installer.console")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingInstallerConsole() {
    return orgApacheSlingInstallerConsole;
  }

  @JsonProperty("org.apache.sling.installer.console")
  public void setOrgApacheSlingInstallerConsole(@Nullable ConfigNodePropertyString orgApacheSlingInstallerConsole) {
    this.orgApacheSlingInstallerConsole = orgApacheSlingInstallerConsole;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingInstallerProviderFile(@Nullable ConfigNodePropertyString orgApacheSlingInstallerProviderFile) {
    this.orgApacheSlingInstallerProviderFile = orgApacheSlingInstallerProviderFile;
    return this;
  }

  /**
   * Get orgApacheSlingInstallerProviderFile
   * @return orgApacheSlingInstallerProviderFile
   */
  @Valid 
  @Schema(name = "org.apache.sling.installer.provider.file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.installer.provider.file")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingInstallerProviderFile() {
    return orgApacheSlingInstallerProviderFile;
  }

  @JsonProperty("org.apache.sling.installer.provider.file")
  public void setOrgApacheSlingInstallerProviderFile(@Nullable ConfigNodePropertyString orgApacheSlingInstallerProviderFile) {
    this.orgApacheSlingInstallerProviderFile = orgApacheSlingInstallerProviderFile;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingInstallerProviderJcr(@Nullable ConfigNodePropertyString orgApacheSlingInstallerProviderJcr) {
    this.orgApacheSlingInstallerProviderJcr = orgApacheSlingInstallerProviderJcr;
    return this;
  }

  /**
   * Get orgApacheSlingInstallerProviderJcr
   * @return orgApacheSlingInstallerProviderJcr
   */
  @Valid 
  @Schema(name = "org.apache.sling.installer.provider.jcr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.installer.provider.jcr")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingInstallerProviderJcr() {
    return orgApacheSlingInstallerProviderJcr;
  }

  @JsonProperty("org.apache.sling.installer.provider.jcr")
  public void setOrgApacheSlingInstallerProviderJcr(@Nullable ConfigNodePropertyString orgApacheSlingInstallerProviderJcr) {
    this.orgApacheSlingInstallerProviderJcr = orgApacheSlingInstallerProviderJcr;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingJcrDavex(@Nullable ConfigNodePropertyString orgApacheSlingJcrDavex) {
    this.orgApacheSlingJcrDavex = orgApacheSlingJcrDavex;
    return this;
  }

  /**
   * Get orgApacheSlingJcrDavex
   * @return orgApacheSlingJcrDavex
   */
  @Valid 
  @Schema(name = "org.apache.sling.jcr.davex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.jcr.davex")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingJcrDavex() {
    return orgApacheSlingJcrDavex;
  }

  @JsonProperty("org.apache.sling.jcr.davex")
  public void setOrgApacheSlingJcrDavex(@Nullable ConfigNodePropertyString orgApacheSlingJcrDavex) {
    this.orgApacheSlingJcrDavex = orgApacheSlingJcrDavex;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingJcrResourcesecurity(@Nullable ConfigNodePropertyString orgApacheSlingJcrResourcesecurity) {
    this.orgApacheSlingJcrResourcesecurity = orgApacheSlingJcrResourcesecurity;
    return this;
  }

  /**
   * Get orgApacheSlingJcrResourcesecurity
   * @return orgApacheSlingJcrResourcesecurity
   */
  @Valid 
  @Schema(name = "org.apache.sling.jcr.resourcesecurity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.jcr.resourcesecurity")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingJcrResourcesecurity() {
    return orgApacheSlingJcrResourcesecurity;
  }

  @JsonProperty("org.apache.sling.jcr.resourcesecurity")
  public void setOrgApacheSlingJcrResourcesecurity(@Nullable ConfigNodePropertyString orgApacheSlingJcrResourcesecurity) {
    this.orgApacheSlingJcrResourcesecurity = orgApacheSlingJcrResourcesecurity;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingJmxProvider(@Nullable ConfigNodePropertyString orgApacheSlingJmxProvider) {
    this.orgApacheSlingJmxProvider = orgApacheSlingJmxProvider;
    return this;
  }

  /**
   * Get orgApacheSlingJmxProvider
   * @return orgApacheSlingJmxProvider
   */
  @Valid 
  @Schema(name = "org.apache.sling.jmx.provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.jmx.provider")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingJmxProvider() {
    return orgApacheSlingJmxProvider;
  }

  @JsonProperty("org.apache.sling.jmx.provider")
  public void setOrgApacheSlingJmxProvider(@Nullable ConfigNodePropertyString orgApacheSlingJmxProvider) {
    this.orgApacheSlingJmxProvider = orgApacheSlingJmxProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingLaunchpadInstaller(@Nullable ConfigNodePropertyString orgApacheSlingLaunchpadInstaller) {
    this.orgApacheSlingLaunchpadInstaller = orgApacheSlingLaunchpadInstaller;
    return this;
  }

  /**
   * Get orgApacheSlingLaunchpadInstaller
   * @return orgApacheSlingLaunchpadInstaller
   */
  @Valid 
  @Schema(name = "org.apache.sling.launchpad.installer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.launchpad.installer")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingLaunchpadInstaller() {
    return orgApacheSlingLaunchpadInstaller;
  }

  @JsonProperty("org.apache.sling.launchpad.installer")
  public void setOrgApacheSlingLaunchpadInstaller(@Nullable ConfigNodePropertyString orgApacheSlingLaunchpadInstaller) {
    this.orgApacheSlingLaunchpadInstaller = orgApacheSlingLaunchpadInstaller;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingModelsImpl(@Nullable ConfigNodePropertyString orgApacheSlingModelsImpl) {
    this.orgApacheSlingModelsImpl = orgApacheSlingModelsImpl;
    return this;
  }

  /**
   * Get orgApacheSlingModelsImpl
   * @return orgApacheSlingModelsImpl
   */
  @Valid 
  @Schema(name = "org.apache.sling.models.impl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.models.impl")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingModelsImpl() {
    return orgApacheSlingModelsImpl;
  }

  @JsonProperty("org.apache.sling.models.impl")
  public void setOrgApacheSlingModelsImpl(@Nullable ConfigNodePropertyString orgApacheSlingModelsImpl) {
    this.orgApacheSlingModelsImpl = orgApacheSlingModelsImpl;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingRepoinitParser(@Nullable ConfigNodePropertyString orgApacheSlingRepoinitParser) {
    this.orgApacheSlingRepoinitParser = orgApacheSlingRepoinitParser;
    return this;
  }

  /**
   * Get orgApacheSlingRepoinitParser
   * @return orgApacheSlingRepoinitParser
   */
  @Valid 
  @Schema(name = "org.apache.sling.repoinit.parser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.repoinit.parser")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingRepoinitParser() {
    return orgApacheSlingRepoinitParser;
  }

  @JsonProperty("org.apache.sling.repoinit.parser")
  public void setOrgApacheSlingRepoinitParser(@Nullable ConfigNodePropertyString orgApacheSlingRepoinitParser) {
    this.orgApacheSlingRepoinitParser = orgApacheSlingRepoinitParser;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingResourceInventory(@Nullable ConfigNodePropertyString orgApacheSlingResourceInventory) {
    this.orgApacheSlingResourceInventory = orgApacheSlingResourceInventory;
    return this;
  }

  /**
   * Get orgApacheSlingResourceInventory
   * @return orgApacheSlingResourceInventory
   */
  @Valid 
  @Schema(name = "org.apache.sling.resource.inventory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.resource.inventory")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingResourceInventory() {
    return orgApacheSlingResourceInventory;
  }

  @JsonProperty("org.apache.sling.resource.inventory")
  public void setOrgApacheSlingResourceInventory(@Nullable ConfigNodePropertyString orgApacheSlingResourceInventory) {
    this.orgApacheSlingResourceInventory = orgApacheSlingResourceInventory;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingResourceresolver(@Nullable ConfigNodePropertyString orgApacheSlingResourceresolver) {
    this.orgApacheSlingResourceresolver = orgApacheSlingResourceresolver;
    return this;
  }

  /**
   * Get orgApacheSlingResourceresolver
   * @return orgApacheSlingResourceresolver
   */
  @Valid 
  @Schema(name = "org.apache.sling.resourceresolver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.resourceresolver")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingResourceresolver() {
    return orgApacheSlingResourceresolver;
  }

  @JsonProperty("org.apache.sling.resourceresolver")
  public void setOrgApacheSlingResourceresolver(@Nullable ConfigNodePropertyString orgApacheSlingResourceresolver) {
    this.orgApacheSlingResourceresolver = orgApacheSlingResourceresolver;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingJavascript(@Nullable ConfigNodePropertyString orgApacheSlingScriptingJavascript) {
    this.orgApacheSlingScriptingJavascript = orgApacheSlingScriptingJavascript;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingJavascript
   * @return orgApacheSlingScriptingJavascript
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.javascript", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.javascript")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingScriptingJavascript() {
    return orgApacheSlingScriptingJavascript;
  }

  @JsonProperty("org.apache.sling.scripting.javascript")
  public void setOrgApacheSlingScriptingJavascript(@Nullable ConfigNodePropertyString orgApacheSlingScriptingJavascript) {
    this.orgApacheSlingScriptingJavascript = orgApacheSlingScriptingJavascript;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingJst(@Nullable ConfigNodePropertyString orgApacheSlingScriptingJst) {
    this.orgApacheSlingScriptingJst = orgApacheSlingScriptingJst;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingJst
   * @return orgApacheSlingScriptingJst
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.jst", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.jst")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingScriptingJst() {
    return orgApacheSlingScriptingJst;
  }

  @JsonProperty("org.apache.sling.scripting.jst")
  public void setOrgApacheSlingScriptingJst(@Nullable ConfigNodePropertyString orgApacheSlingScriptingJst) {
    this.orgApacheSlingScriptingJst = orgApacheSlingScriptingJst;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingSightlyJsProvider(@Nullable ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider) {
    this.orgApacheSlingScriptingSightlyJsProvider = orgApacheSlingScriptingSightlyJsProvider;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingSightlyJsProvider
   * @return orgApacheSlingScriptingSightlyJsProvider
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.sightly.js.provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.sightly.js.provider")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingScriptingSightlyJsProvider() {
    return orgApacheSlingScriptingSightlyJsProvider;
  }

  @JsonProperty("org.apache.sling.scripting.sightly.js.provider")
  public void setOrgApacheSlingScriptingSightlyJsProvider(@Nullable ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider) {
    this.orgApacheSlingScriptingSightlyJsProvider = orgApacheSlingScriptingSightlyJsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingScriptingSightlyModelsProvider(@Nullable ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider) {
    this.orgApacheSlingScriptingSightlyModelsProvider = orgApacheSlingScriptingSightlyModelsProvider;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingSightlyModelsProvider
   * @return orgApacheSlingScriptingSightlyModelsProvider
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.sightly.models.provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.sightly.models.provider")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingScriptingSightlyModelsProvider() {
    return orgApacheSlingScriptingSightlyModelsProvider;
  }

  @JsonProperty("org.apache.sling.scripting.sightly.models.provider")
  public void setOrgApacheSlingScriptingSightlyModelsProvider(@Nullable ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider) {
    this.orgApacheSlingScriptingSightlyModelsProvider = orgApacheSlingScriptingSightlyModelsProvider;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingSecurity(@Nullable ConfigNodePropertyString orgApacheSlingSecurity) {
    this.orgApacheSlingSecurity = orgApacheSlingSecurity;
    return this;
  }

  /**
   * Get orgApacheSlingSecurity
   * @return orgApacheSlingSecurity
   */
  @Valid 
  @Schema(name = "org.apache.sling.security", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.security")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingSecurity() {
    return orgApacheSlingSecurity;
  }

  @JsonProperty("org.apache.sling.security")
  public void setOrgApacheSlingSecurity(@Nullable ConfigNodePropertyString orgApacheSlingSecurity) {
    this.orgApacheSlingSecurity = orgApacheSlingSecurity;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingServletsCompat(@Nullable ConfigNodePropertyString orgApacheSlingServletsCompat) {
    this.orgApacheSlingServletsCompat = orgApacheSlingServletsCompat;
    return this;
  }

  /**
   * Get orgApacheSlingServletsCompat
   * @return orgApacheSlingServletsCompat
   */
  @Valid 
  @Schema(name = "org.apache.sling.servlets.compat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.servlets.compat")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingServletsCompat() {
    return orgApacheSlingServletsCompat;
  }

  @JsonProperty("org.apache.sling.servlets.compat")
  public void setOrgApacheSlingServletsCompat(@Nullable ConfigNodePropertyString orgApacheSlingServletsCompat) {
    this.orgApacheSlingServletsCompat = orgApacheSlingServletsCompat;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingServletsGet(@Nullable ConfigNodePropertyString orgApacheSlingServletsGet) {
    this.orgApacheSlingServletsGet = orgApacheSlingServletsGet;
    return this;
  }

  /**
   * Get orgApacheSlingServletsGet
   * @return orgApacheSlingServletsGet
   */
  @Valid 
  @Schema(name = "org.apache.sling.servlets.get", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.servlets.get")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingServletsGet() {
    return orgApacheSlingServletsGet;
  }

  @JsonProperty("org.apache.sling.servlets.get")
  public void setOrgApacheSlingServletsGet(@Nullable ConfigNodePropertyString orgApacheSlingServletsGet) {
    this.orgApacheSlingServletsGet = orgApacheSlingServletsGet;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingStartupfilterDisabler(@Nullable ConfigNodePropertyString orgApacheSlingStartupfilterDisabler) {
    this.orgApacheSlingStartupfilterDisabler = orgApacheSlingStartupfilterDisabler;
    return this;
  }

  /**
   * Get orgApacheSlingStartupfilterDisabler
   * @return orgApacheSlingStartupfilterDisabler
   */
  @Valid 
  @Schema(name = "org.apache.sling.startupfilter.disabler", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.startupfilter.disabler")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingStartupfilterDisabler() {
    return orgApacheSlingStartupfilterDisabler;
  }

  @JsonProperty("org.apache.sling.startupfilter.disabler")
  public void setOrgApacheSlingStartupfilterDisabler(@Nullable ConfigNodePropertyString orgApacheSlingStartupfilterDisabler) {
    this.orgApacheSlingStartupfilterDisabler = orgApacheSlingStartupfilterDisabler;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties orgApacheSlingTracer(@Nullable ConfigNodePropertyString orgApacheSlingTracer) {
    this.orgApacheSlingTracer = orgApacheSlingTracer;
    return this;
  }

  /**
   * Get orgApacheSlingTracer
   * @return orgApacheSlingTracer
   */
  @Valid 
  @Schema(name = "org.apache.sling.tracer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.tracer")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingTracer() {
    return orgApacheSlingTracer;
  }

  @JsonProperty("org.apache.sling.tracer")
  public void setOrgApacheSlingTracer(@Nullable ConfigNodePropertyString orgApacheSlingTracer) {
    this.orgApacheSlingTracer = orgApacheSlingTracer;
  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties weRetailClientAppCore(@Nullable ConfigNodePropertyString weRetailClientAppCore) {
    this.weRetailClientAppCore = weRetailClientAppCore;
    return this;
  }

  /**
   * Get weRetailClientAppCore
   * @return weRetailClientAppCore
   */
  @Valid 
  @Schema(name = "we.retail.client.app.core", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("we.retail.client.app.core")
  public @Nullable ConfigNodePropertyString getWeRetailClientAppCore() {
    return weRetailClientAppCore;
  }

  @JsonProperty("we.retail.client.app.core")
  public void setWeRetailClientAppCore(@Nullable ConfigNodePropertyString weRetailClientAppCore) {
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
    return Objects.equals(this.comAdobeCqCdnCdnRewriter, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCdnCdnRewriter) &&
        Objects.equals(this.comAdobeCqCloudConfigComponents, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCloudConfigComponents) &&
        Objects.equals(this.comAdobeCqCloudConfigCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCloudConfigCore) &&
        Objects.equals(this.comAdobeCqCloudConfigUi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCloudConfigUi) &&
        Objects.equals(this.comAdobeCqComAdobeCqEditor, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqEditor) &&
        Objects.equals(this.comAdobeCqComAdobeCqProjectsCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqProjectsCore) &&
        Objects.equals(this.comAdobeCqComAdobeCqProjectsWcmCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqProjectsWcmCore) &&
        Objects.equals(this.comAdobeCqComAdobeCqUiCommons, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqUiCommons) &&
        Objects.equals(this.comAdobeCqComAdobeCqWcmStyle, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqWcmStyle) &&
        Objects.equals(this.comAdobeCqCqActivitymapIntegration, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqActivitymapIntegration) &&
        Objects.equals(this.comAdobeCqCqContexthubCommons, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqContexthubCommons) &&
        Objects.equals(this.comAdobeCqCqDtm, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqDtm) &&
        Objects.equals(this.comAdobeCqCqHealthcheck, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqHealthcheck) &&
        Objects.equals(this.comAdobeCqCqMultisiteTargeting, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqMultisiteTargeting) &&
        Objects.equals(this.comAdobeCqCqPreUpgradeCleanup, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqPreUpgradeCleanup) &&
        Objects.equals(this.comAdobeCqCqProductInfoProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqProductInfoProvider) &&
        Objects.equals(this.comAdobeCqCqRestSites, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqRestSites) &&
        Objects.equals(this.comAdobeCqCqSecurityHc, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqSecurityHc) &&
        Objects.equals(this.comAdobeCqDamCqDamSvgHandler, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDamCqDamSvgHandler) &&
        Objects.equals(this.comAdobeCqDamCqScene7Imaging, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDamCqScene7Imaging) &&
        Objects.equals(this.comAdobeCqDtmReactorCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDtmReactorCore) &&
        Objects.equals(this.comAdobeCqDtmReactorUi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDtmReactorUi) &&
        Objects.equals(this.comAdobeCqExpJspelResolver, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqExpJspelResolver) &&
        Objects.equals(this.comAdobeCqInboxCqInbox, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqInboxCqInbox) &&
        Objects.equals(this.comAdobeCqJsonSchemaParser, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqJsonSchemaParser) &&
        Objects.equals(this.comAdobeCqMediaCqMediaPublishingDpsFpCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMediaCqMediaPublishingDpsFpCore) &&
        Objects.equals(this.comAdobeCqMobileCqMobileCaas, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMobileCqMobileCaas) &&
        Objects.equals(this.comAdobeCqMobileCqMobileIndexBuilder, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMobileCqMobileIndexBuilder) &&
        Objects.equals(this.comAdobeCqMobileCqMobilePhonegapBuild, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMobileCqMobilePhonegapBuild) &&
        Objects.equals(this.comAdobeCqMyspell, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMyspell) &&
        Objects.equals(this.comAdobeCqSampleWeRetailCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSampleWeRetailCore) &&
        Objects.equals(this.comAdobeCqScreensComAdobeCqScreensDcc, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqScreensComAdobeCqScreensDcc) &&
        Objects.equals(this.comAdobeCqScreensComAdobeCqScreensMqCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqScreensComAdobeCqScreensMqCore) &&
        Objects.equals(this.comAdobeCqSocialCqSocialAsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialAsProvider) &&
        Objects.equals(this.comAdobeCqSocialCqSocialBadgingBasicImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialBadgingBasicImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialBadgingImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialBadgingImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialCalendarImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialCalendarImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialContentFragmentsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialContentFragmentsImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialEnablementImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialEnablementImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialGraphImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialGraphImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialIdeationImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialIdeationImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialJcrProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialJcrProvider) &&
        Objects.equals(this.comAdobeCqSocialCqSocialMembersImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialMembersImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialMsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialMsProvider) &&
        Objects.equals(this.comAdobeCqSocialCqSocialNotificationsChannelsWeb, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialNotificationsChannelsWeb) &&
        Objects.equals(this.comAdobeCqSocialCqSocialNotificationsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialNotificationsImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialRdbProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialRdbProvider) &&
        Objects.equals(this.comAdobeCqSocialCqSocialScfImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialScfImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialScoringBasicImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialScoringBasicImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialScoringImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialScoringImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialServiceusersImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialServiceusersImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialSrpImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialSrpImpl) &&
        Objects.equals(this.comAdobeCqSocialCqSocialUgcbaseImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialUgcbaseImpl) &&
        Objects.equals(this.comAdobeDamCqDamCfmImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeDamCqDamCfmImpl) &&
        Objects.equals(this.comAdobeFormsFoundationFormsFoundationBase, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeFormsFoundationFormsFoundationBase) &&
        Objects.equals(this.comAdobeGraniteApicontroller, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteApicontroller) &&
        Objects.equals(this.comAdobeGraniteAssetCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteAssetCore) &&
        Objects.equals(this.comAdobeGraniteAuthSso, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteAuthSso) &&
        Objects.equals(this.comAdobeGraniteBundlesHcImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteBundlesHcImpl) &&
        Objects.equals(this.comAdobeGraniteCompatRouter, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCompatRouter) &&
        Objects.equals(this.comAdobeGraniteConf, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteConf) &&
        Objects.equals(this.comAdobeGraniteConfUiCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteConfUiCore) &&
        Objects.equals(this.comAdobeGraniteCors, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCors) &&
        Objects.equals(this.comAdobeGraniteCrxExplorer, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCrxExplorer) &&
        Objects.equals(this.comAdobeGraniteCrxdeLite, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCrxdeLite) &&
        Objects.equals(this.comAdobeGraniteCryptoConfig, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoConfig) &&
        Objects.equals(this.comAdobeGraniteCryptoExtension, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoExtension) &&
        Objects.equals(this.comAdobeGraniteCryptoFile, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoFile) &&
        Objects.equals(this.comAdobeGraniteCryptoJcr, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoJcr) &&
        Objects.equals(this.comAdobeGraniteCsrf, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCsrf) &&
        Objects.equals(this.comAdobeGraniteDistributionCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteDistributionCore) &&
        Objects.equals(this.comAdobeGraniteDropwizardMetrics, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteDropwizardMetrics) &&
        Objects.equals(this.comAdobeGraniteFragsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteFragsImpl) &&
        Objects.equals(this.comAdobeGraniteGibson, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteGibson) &&
        Objects.equals(this.comAdobeGraniteInfocollector, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteInfocollector) &&
        Objects.equals(this.comAdobeGraniteInstallerFactoryPackages, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteInstallerFactoryPackages) &&
        Objects.equals(this.comAdobeGraniteJettySsl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteJettySsl) &&
        Objects.equals(this.comAdobeGraniteJobsAsync, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteJobsAsync) &&
        Objects.equals(this.comAdobeGraniteMaintenanceOak, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteMaintenanceOak) &&
        Objects.equals(this.comAdobeGraniteMonitoringCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteMonitoringCore) &&
        Objects.equals(this.comAdobeGraniteQueries, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteQueries) &&
        Objects.equals(this.comAdobeGraniteReplicationHcImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteReplicationHcImpl) &&
        Objects.equals(this.comAdobeGraniteRepositoryChecker, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteRepositoryChecker) &&
        Objects.equals(this.comAdobeGraniteRepositoryHcImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteRepositoryHcImpl) &&
        Objects.equals(this.comAdobeGraniteRestAssets, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteRestAssets) &&
        Objects.equals(this.comAdobeGraniteSecurityUi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteSecurityUi) &&
        Objects.equals(this.comAdobeGraniteStartup, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteStartup) &&
        Objects.equals(this.comAdobeGraniteTagsoup, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteTagsoup) &&
        Objects.equals(this.comAdobeGraniteTaskmanagementCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteTaskmanagementCore) &&
        Objects.equals(this.comAdobeGraniteTaskmanagementWorkflow, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteTaskmanagementWorkflow) &&
        Objects.equals(this.comAdobeGraniteUiClientlibsCompilerLess, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteUiClientlibsCompilerLess) &&
        Objects.equals(this.comAdobeGraniteUiClientlibsProcessorGcc, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteUiClientlibsProcessorGcc) &&
        Objects.equals(this.comAdobeGraniteWebconsolePlugins, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteWebconsolePlugins) &&
        Objects.equals(this.comAdobeGraniteWorkflowConsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteWorkflowConsole) &&
        Objects.equals(this.comAdobeXmpWorkerFilesNativeFragmentLinux, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeXmpWorkerFilesNativeFragmentLinux) &&
        Objects.equals(this.comAdobeXmpWorkerFilesNativeFragmentMacosx, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeXmpWorkerFilesNativeFragmentMacosx) &&
        Objects.equals(this.comAdobeXmpWorkerFilesNativeFragmentWin, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeXmpWorkerFilesNativeFragmentWin) &&
        Objects.equals(this.comDayCommonsOsgiWrapperSimpleJndi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCommonsOsgiWrapperSimpleJndi) &&
        Objects.equals(this.comDayCqCqAuthhandler, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqAuthhandler) &&
        Objects.equals(this.comDayCqCqCompatConfigupdate, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqCompatConfigupdate) &&
        Objects.equals(this.comDayCqCqLicensebranding, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqLicensebranding) &&
        Objects.equals(this.comDayCqCqNotifcationImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqNotifcationImpl) &&
        Objects.equals(this.comDayCqCqReplicationAudit, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqReplicationAudit) &&
        Objects.equals(this.comDayCqCqSearchExt, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqSearchExt) &&
        Objects.equals(this.comDayCqDamCqDamAnnotationPrint, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamAnnotationPrint) &&
        Objects.equals(this.comDayCqDamCqDamAssetUsage, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamAssetUsage) &&
        Objects.equals(this.comDayCqDamCqDamS7dam, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamS7dam) &&
        Objects.equals(this.comDayCqDamCqDamSimilaritysearch, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamSimilaritysearch) &&
        Objects.equals(this.comDayCqDamDamWebdavSupport, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamDamWebdavSupport) &&
        Objects.equals(this.comDayCqPreUpgradeTasks, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqPreUpgradeTasks) &&
        Objects.equals(this.comDayCqReplicationExtensions, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqReplicationExtensions) &&
        Objects.equals(this.comDayCqWcmCqMsmCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqWcmCqMsmCore) &&
        Objects.equals(this.comDayCqWcmCqWcmTranslation, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqWcmCqWcmTranslation) &&
        Objects.equals(this.dayCommonsJrawio, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.dayCommonsJrawio) &&
        Objects.equals(this.orgApacheAriesJmxWhiteboard, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheAriesJmxWhiteboard) &&
        Objects.equals(this.orgApacheFelixHttpSslfilter, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixHttpSslfilter) &&
        Objects.equals(this.orgApacheFelixOrgApacheFelixThreaddump, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixOrgApacheFelixThreaddump) &&
        Objects.equals(this.orgApacheFelixWebconsolePluginsDs, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsDs) &&
        Objects.equals(this.orgApacheFelixWebconsolePluginsEvent, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsEvent) &&
        Objects.equals(this.orgApacheFelixWebconsolePluginsMemoryusage, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsMemoryusage) &&
        Objects.equals(this.orgApacheFelixWebconsolePluginsPackageadmin, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsPackageadmin) &&
        Objects.equals(this.orgApacheJackrabbitOakAuthLdap, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheJackrabbitOakAuthLdap) &&
        Objects.equals(this.orgApacheJackrabbitOakSegmentTar, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheJackrabbitOakSegmentTar) &&
        Objects.equals(this.orgApacheJackrabbitOakSolrOsgi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheJackrabbitOakSolrOsgi) &&
        Objects.equals(this.orgApacheSlingBundleresourceImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingBundleresourceImpl) &&
        Objects.equals(this.orgApacheSlingCommonsFsclassloader, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingCommonsFsclassloader) &&
        Objects.equals(this.orgApacheSlingCommonsLogWebconsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingCommonsLogWebconsole) &&
        Objects.equals(this.orgApacheSlingDatasource, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDatasource) &&
        Objects.equals(this.orgApacheSlingDiscoveryBase, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDiscoveryBase) &&
        Objects.equals(this.orgApacheSlingDiscoveryOak, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDiscoveryOak) &&
        Objects.equals(this.orgApacheSlingDiscoverySupport, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDiscoverySupport) &&
        Objects.equals(this.orgApacheSlingDistributionApi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDistributionApi) &&
        Objects.equals(this.orgApacheSlingDistributionCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDistributionCore) &&
        Objects.equals(this.orgApacheSlingExtensionsWebconsolesecurityprovider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingExtensionsWebconsolesecurityprovider) &&
        Objects.equals(this.orgApacheSlingHcWebconsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingHcWebconsole) &&
        Objects.equals(this.orgApacheSlingInstallerConsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingInstallerConsole) &&
        Objects.equals(this.orgApacheSlingInstallerProviderFile, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingInstallerProviderFile) &&
        Objects.equals(this.orgApacheSlingInstallerProviderJcr, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingInstallerProviderJcr) &&
        Objects.equals(this.orgApacheSlingJcrDavex, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingJcrDavex) &&
        Objects.equals(this.orgApacheSlingJcrResourcesecurity, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingJcrResourcesecurity) &&
        Objects.equals(this.orgApacheSlingJmxProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingJmxProvider) &&
        Objects.equals(this.orgApacheSlingLaunchpadInstaller, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingLaunchpadInstaller) &&
        Objects.equals(this.orgApacheSlingModelsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingModelsImpl) &&
        Objects.equals(this.orgApacheSlingRepoinitParser, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingRepoinitParser) &&
        Objects.equals(this.orgApacheSlingResourceInventory, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingResourceInventory) &&
        Objects.equals(this.orgApacheSlingResourceresolver, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingResourceresolver) &&
        Objects.equals(this.orgApacheSlingScriptingJavascript, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingJavascript) &&
        Objects.equals(this.orgApacheSlingScriptingJst, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingJst) &&
        Objects.equals(this.orgApacheSlingScriptingSightlyJsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingSightlyJsProvider) &&
        Objects.equals(this.orgApacheSlingScriptingSightlyModelsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingSightlyModelsProvider) &&
        Objects.equals(this.orgApacheSlingSecurity, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingSecurity) &&
        Objects.equals(this.orgApacheSlingServletsCompat, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingServletsCompat) &&
        Objects.equals(this.orgApacheSlingServletsGet, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingServletsGet) &&
        Objects.equals(this.orgApacheSlingStartupfilterDisabler, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingStartupfilterDisabler) &&
        Objects.equals(this.orgApacheSlingTracer, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingTracer) &&
        Objects.equals(this.weRetailClientAppCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.weRetailClientAppCore);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

