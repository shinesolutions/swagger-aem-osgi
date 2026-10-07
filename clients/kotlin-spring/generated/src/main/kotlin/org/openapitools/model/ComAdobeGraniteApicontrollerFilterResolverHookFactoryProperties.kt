package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param comAdobeCqCdnCdnRewriter 
 * @param comAdobeCqCloudConfigComponents 
 * @param comAdobeCqCloudConfigCore 
 * @param comAdobeCqCloudConfigUi 
 * @param comAdobeCqComAdobeCqEditor 
 * @param comAdobeCqComAdobeCqProjectsCore 
 * @param comAdobeCqComAdobeCqProjectsWcmCore 
 * @param comAdobeCqComAdobeCqUiCommons 
 * @param comAdobeCqComAdobeCqWcmStyle 
 * @param comAdobeCqCqActivitymapIntegration 
 * @param comAdobeCqCqContexthubCommons 
 * @param comAdobeCqCqDtm 
 * @param comAdobeCqCqHealthcheck 
 * @param comAdobeCqCqMultisiteTargeting 
 * @param comAdobeCqCqPreUpgradeCleanup 
 * @param comAdobeCqCqProductInfoProvider 
 * @param comAdobeCqCqRestSites 
 * @param comAdobeCqCqSecurityHc 
 * @param comAdobeCqDamCqDamSvgHandler 
 * @param comAdobeCqDamCqScene7Imaging 
 * @param comAdobeCqDtmReactorCore 
 * @param comAdobeCqDtmReactorUi 
 * @param comAdobeCqExpJspelResolver 
 * @param comAdobeCqInboxCqInbox 
 * @param comAdobeCqJsonSchemaParser 
 * @param comAdobeCqMediaCqMediaPublishingDpsFpCore 
 * @param comAdobeCqMobileCqMobileCaas 
 * @param comAdobeCqMobileCqMobileIndexBuilder 
 * @param comAdobeCqMobileCqMobilePhonegapBuild 
 * @param comAdobeCqMyspell 
 * @param comAdobeCqSampleWeRetailCore 
 * @param comAdobeCqScreensComAdobeCqScreensDcc 
 * @param comAdobeCqScreensComAdobeCqScreensMqCore 
 * @param comAdobeCqSocialCqSocialAsProvider 
 * @param comAdobeCqSocialCqSocialBadgingBasicImpl 
 * @param comAdobeCqSocialCqSocialBadgingImpl 
 * @param comAdobeCqSocialCqSocialCalendarImpl 
 * @param comAdobeCqSocialCqSocialContentFragmentsImpl 
 * @param comAdobeCqSocialCqSocialEnablementImpl 
 * @param comAdobeCqSocialCqSocialGraphImpl 
 * @param comAdobeCqSocialCqSocialIdeationImpl 
 * @param comAdobeCqSocialCqSocialJcrProvider 
 * @param comAdobeCqSocialCqSocialMembersImpl 
 * @param comAdobeCqSocialCqSocialMsProvider 
 * @param comAdobeCqSocialCqSocialNotificationsChannelsWeb 
 * @param comAdobeCqSocialCqSocialNotificationsImpl 
 * @param comAdobeCqSocialCqSocialRdbProvider 
 * @param comAdobeCqSocialCqSocialScfImpl 
 * @param comAdobeCqSocialCqSocialScoringBasicImpl 
 * @param comAdobeCqSocialCqSocialScoringImpl 
 * @param comAdobeCqSocialCqSocialServiceusersImpl 
 * @param comAdobeCqSocialCqSocialSrpImpl 
 * @param comAdobeCqSocialCqSocialUgcbaseImpl 
 * @param comAdobeDamCqDamCfmImpl 
 * @param comAdobeFormsFoundationFormsFoundationBase 
 * @param comAdobeGraniteApicontroller 
 * @param comAdobeGraniteAssetCore 
 * @param comAdobeGraniteAuthSso 
 * @param comAdobeGraniteBundlesHcImpl 
 * @param comAdobeGraniteCompatRouter 
 * @param comAdobeGraniteConf 
 * @param comAdobeGraniteConfUiCore 
 * @param comAdobeGraniteCors 
 * @param comAdobeGraniteCrxExplorer 
 * @param comAdobeGraniteCrxdeLite 
 * @param comAdobeGraniteCryptoConfig 
 * @param comAdobeGraniteCryptoExtension 
 * @param comAdobeGraniteCryptoFile 
 * @param comAdobeGraniteCryptoJcr 
 * @param comAdobeGraniteCsrf 
 * @param comAdobeGraniteDistributionCore 
 * @param comAdobeGraniteDropwizardMetrics 
 * @param comAdobeGraniteFragsImpl 
 * @param comAdobeGraniteGibson 
 * @param comAdobeGraniteInfocollector 
 * @param comAdobeGraniteInstallerFactoryPackages 
 * @param comAdobeGraniteJettySsl 
 * @param comAdobeGraniteJobsAsync 
 * @param comAdobeGraniteMaintenanceOak 
 * @param comAdobeGraniteMonitoringCore 
 * @param comAdobeGraniteQueries 
 * @param comAdobeGraniteReplicationHcImpl 
 * @param comAdobeGraniteRepositoryChecker 
 * @param comAdobeGraniteRepositoryHcImpl 
 * @param comAdobeGraniteRestAssets 
 * @param comAdobeGraniteSecurityUi 
 * @param comAdobeGraniteStartup 
 * @param comAdobeGraniteTagsoup 
 * @param comAdobeGraniteTaskmanagementCore 
 * @param comAdobeGraniteTaskmanagementWorkflow 
 * @param comAdobeGraniteUiClientlibsCompilerLess 
 * @param comAdobeGraniteUiClientlibsProcessorGcc 
 * @param comAdobeGraniteWebconsolePlugins 
 * @param comAdobeGraniteWorkflowConsole 
 * @param comAdobeXmpWorkerFilesNativeFragmentLinux 
 * @param comAdobeXmpWorkerFilesNativeFragmentMacosx 
 * @param comAdobeXmpWorkerFilesNativeFragmentWin 
 * @param comDayCommonsOsgiWrapperSimpleJndi 
 * @param comDayCqCqAuthhandler 
 * @param comDayCqCqCompatConfigupdate 
 * @param comDayCqCqLicensebranding 
 * @param comDayCqCqNotifcationImpl 
 * @param comDayCqCqReplicationAudit 
 * @param comDayCqCqSearchExt 
 * @param comDayCqDamCqDamAnnotationPrint 
 * @param comDayCqDamCqDamAssetUsage 
 * @param comDayCqDamCqDamS7dam 
 * @param comDayCqDamCqDamSimilaritysearch 
 * @param comDayCqDamDamWebdavSupport 
 * @param comDayCqPreUpgradeTasks 
 * @param comDayCqReplicationExtensions 
 * @param comDayCqWcmCqMsmCore 
 * @param comDayCqWcmCqWcmTranslation 
 * @param dayCommonsJrawio 
 * @param orgApacheAriesJmxWhiteboard 
 * @param orgApacheFelixHttpSslfilter 
 * @param orgApacheFelixOrgApacheFelixThreaddump 
 * @param orgApacheFelixWebconsolePluginsDs 
 * @param orgApacheFelixWebconsolePluginsEvent 
 * @param orgApacheFelixWebconsolePluginsMemoryusage 
 * @param orgApacheFelixWebconsolePluginsPackageadmin 
 * @param orgApacheJackrabbitOakAuthLdap 
 * @param orgApacheJackrabbitOakSegmentTar 
 * @param orgApacheJackrabbitOakSolrOsgi 
 * @param orgApacheSlingBundleresourceImpl 
 * @param orgApacheSlingCommonsFsclassloader 
 * @param orgApacheSlingCommonsLogWebconsole 
 * @param orgApacheSlingDatasource 
 * @param orgApacheSlingDiscoveryBase 
 * @param orgApacheSlingDiscoveryOak 
 * @param orgApacheSlingDiscoverySupport 
 * @param orgApacheSlingDistributionApi 
 * @param orgApacheSlingDistributionCore 
 * @param orgApacheSlingExtensionsWebconsolesecurityprovider 
 * @param orgApacheSlingHcWebconsole 
 * @param orgApacheSlingInstallerConsole 
 * @param orgApacheSlingInstallerProviderFile 
 * @param orgApacheSlingInstallerProviderJcr 
 * @param orgApacheSlingJcrDavex 
 * @param orgApacheSlingJcrResourcesecurity 
 * @param orgApacheSlingJmxProvider 
 * @param orgApacheSlingLaunchpadInstaller 
 * @param orgApacheSlingModelsImpl 
 * @param orgApacheSlingRepoinitParser 
 * @param orgApacheSlingResourceInventory 
 * @param orgApacheSlingResourceresolver 
 * @param orgApacheSlingScriptingJavascript 
 * @param orgApacheSlingScriptingJst 
 * @param orgApacheSlingScriptingSightlyJsProvider 
 * @param orgApacheSlingScriptingSightlyModelsProvider 
 * @param orgApacheSlingSecurity 
 * @param orgApacheSlingServletsCompat 
 * @param orgApacheSlingServletsGet 
 * @param orgApacheSlingStartupfilterDisabler 
 * @param orgApacheSlingTracer 
 * @param weRetailClientAppCore 
 */
data class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cdn.cdn-rewriter")
    @get:JsonProperty("com.adobe.cq.cdn.cdn-rewriter") val comAdobeCqCdnCdnRewriter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cloud-config.components")
    @get:JsonProperty("com.adobe.cq.cloud-config.components") val comAdobeCqCloudConfigComponents: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cloud-config.core")
    @get:JsonProperty("com.adobe.cq.cloud-config.core") val comAdobeCqCloudConfigCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cloud-config.ui")
    @get:JsonProperty("com.adobe.cq.cloud-config.ui") val comAdobeCqCloudConfigUi: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.com.adobe.cq.editor")
    @get:JsonProperty("com.adobe.cq.com.adobe.cq.editor") val comAdobeCqComAdobeCqEditor: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.com.adobe.cq.projects.core")
    @get:JsonProperty("com.adobe.cq.com.adobe.cq.projects.core") val comAdobeCqComAdobeCqProjectsCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core")
    @get:JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core") val comAdobeCqComAdobeCqProjectsWcmCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons")
    @get:JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons") val comAdobeCqComAdobeCqUiCommons: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style")
    @get:JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style") val comAdobeCqComAdobeCqWcmStyle: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-activitymap-integration")
    @get:JsonProperty("com.adobe.cq.cq-activitymap-integration") val comAdobeCqCqActivitymapIntegration: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-contexthub-commons")
    @get:JsonProperty("com.adobe.cq.cq-contexthub-commons") val comAdobeCqCqContexthubCommons: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-dtm")
    @get:JsonProperty("com.adobe.cq.cq-dtm") val comAdobeCqCqDtm: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-healthcheck")
    @get:JsonProperty("com.adobe.cq.cq-healthcheck") val comAdobeCqCqHealthcheck: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-multisite-targeting")
    @get:JsonProperty("com.adobe.cq.cq-multisite-targeting") val comAdobeCqCqMultisiteTargeting: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup")
    @get:JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup") val comAdobeCqCqPreUpgradeCleanup: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-product-info-provider")
    @get:JsonProperty("com.adobe.cq.cq-product-info-provider") val comAdobeCqCqProductInfoProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-rest-sites")
    @get:JsonProperty("com.adobe.cq.cq-rest-sites") val comAdobeCqCqRestSites: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.cq-security-hc")
    @get:JsonProperty("com.adobe.cq.cq-security-hc") val comAdobeCqCqSecurityHc: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler")
    @get:JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler") val comAdobeCqDamCqDamSvgHandler: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dam.cq-scene7-imaging")
    @get:JsonProperty("com.adobe.cq.dam.cq-scene7-imaging") val comAdobeCqDamCqScene7Imaging: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dtm-reactor.core")
    @get:JsonProperty("com.adobe.cq.dtm-reactor.core") val comAdobeCqDtmReactorCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dtm-reactor.ui")
    @get:JsonProperty("com.adobe.cq.dtm-reactor.ui") val comAdobeCqDtmReactorUi: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.exp-jspel-resolver")
    @get:JsonProperty("com.adobe.cq.exp-jspel-resolver") val comAdobeCqExpJspelResolver: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.inbox.cq-inbox")
    @get:JsonProperty("com.adobe.cq.inbox.cq-inbox") val comAdobeCqInboxCqInbox: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.json-schema-parser")
    @get:JsonProperty("com.adobe.cq.json-schema-parser") val comAdobeCqJsonSchemaParser: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core")
    @get:JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core") val comAdobeCqMediaCqMediaPublishingDpsFpCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.mobile.cq-mobile-caas")
    @get:JsonProperty("com.adobe.cq.mobile.cq-mobile-caas") val comAdobeCqMobileCqMobileCaas: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder")
    @get:JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder") val comAdobeCqMobileCqMobileIndexBuilder: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build")
    @get:JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build") val comAdobeCqMobileCqMobilePhonegapBuild: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.myspell")
    @get:JsonProperty("com.adobe.cq.myspell") val comAdobeCqMyspell: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.sample.we.retail.core")
    @get:JsonProperty("com.adobe.cq.sample.we.retail.core") val comAdobeCqSampleWeRetailCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc")
    @get:JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc") val comAdobeCqScreensComAdobeCqScreensDcc: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core")
    @get:JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core") val comAdobeCqScreensComAdobeCqScreensMqCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-as-provider")
    @get:JsonProperty("com.adobe.cq.social.cq-social-as-provider") val comAdobeCqSocialCqSocialAsProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl") val comAdobeCqSocialCqSocialBadgingBasicImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-badging-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-badging-impl") val comAdobeCqSocialCqSocialBadgingImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-calendar-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-calendar-impl") val comAdobeCqSocialCqSocialCalendarImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl") val comAdobeCqSocialCqSocialContentFragmentsImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-enablement-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-enablement-impl") val comAdobeCqSocialCqSocialEnablementImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-graph-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-graph-impl") val comAdobeCqSocialCqSocialGraphImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-ideation-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-ideation-impl") val comAdobeCqSocialCqSocialIdeationImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-jcr-provider")
    @get:JsonProperty("com.adobe.cq.social.cq-social-jcr-provider") val comAdobeCqSocialCqSocialJcrProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-members-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-members-impl") val comAdobeCqSocialCqSocialMembersImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-ms-provider")
    @get:JsonProperty("com.adobe.cq.social.cq-social-ms-provider") val comAdobeCqSocialCqSocialMsProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web")
    @get:JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web") val comAdobeCqSocialCqSocialNotificationsChannelsWeb: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-notifications-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-notifications-impl") val comAdobeCqSocialCqSocialNotificationsImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-rdb-provider")
    @get:JsonProperty("com.adobe.cq.social.cq-social-rdb-provider") val comAdobeCqSocialCqSocialRdbProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-scf-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-scf-impl") val comAdobeCqSocialCqSocialScfImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl") val comAdobeCqSocialCqSocialScoringBasicImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-scoring-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-scoring-impl") val comAdobeCqSocialCqSocialScoringImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl") val comAdobeCqSocialCqSocialServiceusersImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-srp-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-srp-impl") val comAdobeCqSocialCqSocialSrpImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl")
    @get:JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl") val comAdobeCqSocialCqSocialUgcbaseImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.dam.cq-dam-cfm-impl")
    @get:JsonProperty("com.adobe.dam.cq-dam-cfm-impl") val comAdobeDamCqDamCfmImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.forms.foundation-forms-foundation-base")
    @get:JsonProperty("com.adobe.forms.foundation-forms-foundation-base") val comAdobeFormsFoundationFormsFoundationBase: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.apicontroller")
    @get:JsonProperty("com.adobe.granite.apicontroller") val comAdobeGraniteApicontroller: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.asset.core")
    @get:JsonProperty("com.adobe.granite.asset.core") val comAdobeGraniteAssetCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.auth.sso")
    @get:JsonProperty("com.adobe.granite.auth.sso") val comAdobeGraniteAuthSso: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.bundles.hc.impl")
    @get:JsonProperty("com.adobe.granite.bundles.hc.impl") val comAdobeGraniteBundlesHcImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.compat-router")
    @get:JsonProperty("com.adobe.granite.compat-router") val comAdobeGraniteCompatRouter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.conf")
    @get:JsonProperty("com.adobe.granite.conf") val comAdobeGraniteConf: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.conf.ui.core")
    @get:JsonProperty("com.adobe.granite.conf.ui.core") val comAdobeGraniteConfUiCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.cors")
    @get:JsonProperty("com.adobe.granite.cors") val comAdobeGraniteCors: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.crx-explorer")
    @get:JsonProperty("com.adobe.granite.crx-explorer") val comAdobeGraniteCrxExplorer: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.crxde-lite")
    @get:JsonProperty("com.adobe.granite.crxde-lite") val comAdobeGraniteCrxdeLite: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.crypto.config")
    @get:JsonProperty("com.adobe.granite.crypto.config") val comAdobeGraniteCryptoConfig: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.crypto.extension")
    @get:JsonProperty("com.adobe.granite.crypto.extension") val comAdobeGraniteCryptoExtension: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.crypto.file")
    @get:JsonProperty("com.adobe.granite.crypto.file") val comAdobeGraniteCryptoFile: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.crypto.jcr")
    @get:JsonProperty("com.adobe.granite.crypto.jcr") val comAdobeGraniteCryptoJcr: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.csrf")
    @get:JsonProperty("com.adobe.granite.csrf") val comAdobeGraniteCsrf: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.distribution.core")
    @get:JsonProperty("com.adobe.granite.distribution.core") val comAdobeGraniteDistributionCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.dropwizard.metrics")
    @get:JsonProperty("com.adobe.granite.dropwizard.metrics") val comAdobeGraniteDropwizardMetrics: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.frags.impl")
    @get:JsonProperty("com.adobe.granite.frags.impl") val comAdobeGraniteFragsImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.gibson")
    @get:JsonProperty("com.adobe.granite.gibson") val comAdobeGraniteGibson: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.infocollector")
    @get:JsonProperty("com.adobe.granite.infocollector") val comAdobeGraniteInfocollector: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.installer.factory.packages")
    @get:JsonProperty("com.adobe.granite.installer.factory.packages") val comAdobeGraniteInstallerFactoryPackages: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl")
    @get:JsonProperty("com.adobe.granite.jetty.ssl") val comAdobeGraniteJettySsl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jobs.async")
    @get:JsonProperty("com.adobe.granite.jobs.async") val comAdobeGraniteJobsAsync: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.maintenance.oak")
    @get:JsonProperty("com.adobe.granite.maintenance.oak") val comAdobeGraniteMaintenanceOak: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.monitoring.core")
    @get:JsonProperty("com.adobe.granite.monitoring.core") val comAdobeGraniteMonitoringCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.queries")
    @get:JsonProperty("com.adobe.granite.queries") val comAdobeGraniteQueries: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.replication.hc.impl")
    @get:JsonProperty("com.adobe.granite.replication.hc.impl") val comAdobeGraniteReplicationHcImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.repository.checker")
    @get:JsonProperty("com.adobe.granite.repository.checker") val comAdobeGraniteRepositoryChecker: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.repository.hc.impl")
    @get:JsonProperty("com.adobe.granite.repository.hc.impl") val comAdobeGraniteRepositoryHcImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.rest.assets")
    @get:JsonProperty("com.adobe.granite.rest.assets") val comAdobeGraniteRestAssets: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.security.ui")
    @get:JsonProperty("com.adobe.granite.security.ui") val comAdobeGraniteSecurityUi: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.startup")
    @get:JsonProperty("com.adobe.granite.startup") val comAdobeGraniteStartup: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.tagsoup")
    @get:JsonProperty("com.adobe.granite.tagsoup") val comAdobeGraniteTagsoup: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.taskmanagement.core")
    @get:JsonProperty("com.adobe.granite.taskmanagement.core") val comAdobeGraniteTaskmanagementCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.taskmanagement.workflow")
    @get:JsonProperty("com.adobe.granite.taskmanagement.workflow") val comAdobeGraniteTaskmanagementWorkflow: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less")
    @get:JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less") val comAdobeGraniteUiClientlibsCompilerLess: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc")
    @get:JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc") val comAdobeGraniteUiClientlibsProcessorGcc: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.webconsole.plugins")
    @get:JsonProperty("com.adobe.granite.webconsole.plugins") val comAdobeGraniteWebconsolePlugins: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.workflow.console")
    @get:JsonProperty("com.adobe.granite.workflow.console") val comAdobeGraniteWorkflowConsole: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux")
    @get:JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux") val comAdobeXmpWorkerFilesNativeFragmentLinux: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx")
    @get:JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx") val comAdobeXmpWorkerFilesNativeFragmentMacosx: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.xmp.worker.files.native.fragment.win")
    @get:JsonProperty("com.adobe.xmp.worker.files.native.fragment.win") val comAdobeXmpWorkerFilesNativeFragmentWin: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.commons.osgi.wrapper.simple-jndi")
    @get:JsonProperty("com.day.commons.osgi.wrapper.simple-jndi") val comDayCommonsOsgiWrapperSimpleJndi: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.cq-authhandler")
    @get:JsonProperty("com.day.cq.cq-authhandler") val comDayCqCqAuthhandler: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.cq-compat-configupdate")
    @get:JsonProperty("com.day.cq.cq-compat-configupdate") val comDayCqCqCompatConfigupdate: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.cq-licensebranding")
    @get:JsonProperty("com.day.cq.cq-licensebranding") val comDayCqCqLicensebranding: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.cq-notifcation-impl")
    @get:JsonProperty("com.day.cq.cq-notifcation-impl") val comDayCqCqNotifcationImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.cq-replication-audit")
    @get:JsonProperty("com.day.cq.cq-replication-audit") val comDayCqCqReplicationAudit: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.cq-search-ext")
    @get:JsonProperty("com.day.cq.cq-search-ext") val comDayCqCqSearchExt: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.dam.cq-dam-annotation-print")
    @get:JsonProperty("com.day.cq.dam.cq-dam-annotation-print") val comDayCqDamCqDamAnnotationPrint: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.dam.cq-dam-asset-usage")
    @get:JsonProperty("com.day.cq.dam.cq-dam-asset-usage") val comDayCqDamCqDamAssetUsage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.dam.cq-dam-s7dam")
    @get:JsonProperty("com.day.cq.dam.cq-dam-s7dam") val comDayCqDamCqDamS7dam: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.dam.cq-dam-similaritysearch")
    @get:JsonProperty("com.day.cq.dam.cq-dam-similaritysearch") val comDayCqDamCqDamSimilaritysearch: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.dam.dam-webdav-support")
    @get:JsonProperty("com.day.cq.dam.dam-webdav-support") val comDayCqDamDamWebdavSupport: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.pre-upgrade-tasks")
    @get:JsonProperty("com.day.cq.pre-upgrade-tasks") val comDayCqPreUpgradeTasks: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.replication.extensions")
    @get:JsonProperty("com.day.cq.replication.extensions") val comDayCqReplicationExtensions: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.wcm.cq-msm-core")
    @get:JsonProperty("com.day.cq.wcm.cq-msm-core") val comDayCqWcmCqMsmCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.day.cq.wcm.cq-wcm-translation")
    @get:JsonProperty("com.day.cq.wcm.cq-wcm-translation") val comDayCqWcmCqWcmTranslation: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("day-commons-jrawio")
    @get:JsonProperty("day-commons-jrawio") val dayCommonsJrawio: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.aries.jmx.whiteboard")
    @get:JsonProperty("org.apache.aries.jmx.whiteboard") val orgApacheAriesJmxWhiteboard: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.sslfilter")
    @get:JsonProperty("org.apache.felix.http.sslfilter") val orgApacheFelixHttpSslfilter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.org.apache.felix.threaddump")
    @get:JsonProperty("org.apache.felix.org.apache.felix.threaddump") val orgApacheFelixOrgApacheFelixThreaddump: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.webconsole.plugins.ds")
    @get:JsonProperty("org.apache.felix.webconsole.plugins.ds") val orgApacheFelixWebconsolePluginsDs: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.webconsole.plugins.event")
    @get:JsonProperty("org.apache.felix.webconsole.plugins.event") val orgApacheFelixWebconsolePluginsEvent: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.webconsole.plugins.memoryusage")
    @get:JsonProperty("org.apache.felix.webconsole.plugins.memoryusage") val orgApacheFelixWebconsolePluginsMemoryusage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.webconsole.plugins.packageadmin")
    @get:JsonProperty("org.apache.felix.webconsole.plugins.packageadmin") val orgApacheFelixWebconsolePluginsPackageadmin: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.jackrabbit.oak-auth-ldap")
    @get:JsonProperty("org.apache.jackrabbit.oak-auth-ldap") val orgApacheJackrabbitOakAuthLdap: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.jackrabbit.oak-segment-tar")
    @get:JsonProperty("org.apache.jackrabbit.oak-segment-tar") val orgApacheJackrabbitOakSegmentTar: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.jackrabbit.oak-solr-osgi")
    @get:JsonProperty("org.apache.jackrabbit.oak-solr-osgi") val orgApacheJackrabbitOakSolrOsgi: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.bundleresource.impl")
    @get:JsonProperty("org.apache.sling.bundleresource.impl") val orgApacheSlingBundleresourceImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.fsclassloader")
    @get:JsonProperty("org.apache.sling.commons.fsclassloader") val orgApacheSlingCommonsFsclassloader: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.commons.log.webconsole")
    @get:JsonProperty("org.apache.sling.commons.log.webconsole") val orgApacheSlingCommonsLogWebconsole: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.datasource")
    @get:JsonProperty("org.apache.sling.datasource") val orgApacheSlingDatasource: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.discovery.base")
    @get:JsonProperty("org.apache.sling.discovery.base") val orgApacheSlingDiscoveryBase: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.discovery.oak")
    @get:JsonProperty("org.apache.sling.discovery.oak") val orgApacheSlingDiscoveryOak: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.discovery.support")
    @get:JsonProperty("org.apache.sling.discovery.support") val orgApacheSlingDiscoverySupport: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.distribution.api")
    @get:JsonProperty("org.apache.sling.distribution.api") val orgApacheSlingDistributionApi: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.distribution.core")
    @get:JsonProperty("org.apache.sling.distribution.core") val orgApacheSlingDistributionCore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider")
    @get:JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider") val orgApacheSlingExtensionsWebconsolesecurityprovider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.hc.webconsole")
    @get:JsonProperty("org.apache.sling.hc.webconsole") val orgApacheSlingHcWebconsole: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.installer.console")
    @get:JsonProperty("org.apache.sling.installer.console") val orgApacheSlingInstallerConsole: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.installer.provider.file")
    @get:JsonProperty("org.apache.sling.installer.provider.file") val orgApacheSlingInstallerProviderFile: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.installer.provider.jcr")
    @get:JsonProperty("org.apache.sling.installer.provider.jcr") val orgApacheSlingInstallerProviderJcr: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.jcr.davex")
    @get:JsonProperty("org.apache.sling.jcr.davex") val orgApacheSlingJcrDavex: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.jcr.resourcesecurity")
    @get:JsonProperty("org.apache.sling.jcr.resourcesecurity") val orgApacheSlingJcrResourcesecurity: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.jmx.provider")
    @get:JsonProperty("org.apache.sling.jmx.provider") val orgApacheSlingJmxProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.launchpad.installer")
    @get:JsonProperty("org.apache.sling.launchpad.installer") val orgApacheSlingLaunchpadInstaller: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.models.impl")
    @get:JsonProperty("org.apache.sling.models.impl") val orgApacheSlingModelsImpl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.repoinit.parser")
    @get:JsonProperty("org.apache.sling.repoinit.parser") val orgApacheSlingRepoinitParser: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.resource.inventory")
    @get:JsonProperty("org.apache.sling.resource.inventory") val orgApacheSlingResourceInventory: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.resourceresolver")
    @get:JsonProperty("org.apache.sling.resourceresolver") val orgApacheSlingResourceresolver: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.scripting.javascript")
    @get:JsonProperty("org.apache.sling.scripting.javascript") val orgApacheSlingScriptingJavascript: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.scripting.jst")
    @get:JsonProperty("org.apache.sling.scripting.jst") val orgApacheSlingScriptingJst: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.scripting.sightly.js.provider")
    @get:JsonProperty("org.apache.sling.scripting.sightly.js.provider") val orgApacheSlingScriptingSightlyJsProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.scripting.sightly.models.provider")
    @get:JsonProperty("org.apache.sling.scripting.sightly.models.provider") val orgApacheSlingScriptingSightlyModelsProvider: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.security")
    @get:JsonProperty("org.apache.sling.security") val orgApacheSlingSecurity: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.servlets.compat")
    @get:JsonProperty("org.apache.sling.servlets.compat") val orgApacheSlingServletsCompat: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.servlets.get")
    @get:JsonProperty("org.apache.sling.servlets.get") val orgApacheSlingServletsGet: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.startupfilter.disabler")
    @get:JsonProperty("org.apache.sling.startupfilter.disabler") val orgApacheSlingStartupfilterDisabler: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.sling.tracer")
    @get:JsonProperty("org.apache.sling.tracer") val orgApacheSlingTracer: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("we.retail.client.app.core")
    @get:JsonProperty("we.retail.client.app.core") val weRetailClientAppCore: ConfigNodePropertyString? = null
) {

}

