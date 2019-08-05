'use strict';

var utils = require('../utils/writer.js');
var Configmgr = require('../service/ConfigmgrService');

module.exports.adaptiveFormAndInteractiveCommunicationWebChannelConfiguration = function adaptiveFormAndInteractiveCommunicationWebChannelConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var showPlaceholder = req.swagger.params['showPlaceholder'].value;
  var maximumCacheEntries = req.swagger.params['maximumCacheEntries'].value;
  var afPeriodscriptingPeriodcompatversion = req.swagger.params['af.scripting.compatversion'].value;
  var makeFileNameUnique = req.swagger.params['makeFileNameUnique'].value;
  var generatingCompliantData = req.swagger.params['generatingCompliantData'].value;
  Configmgr.adaptiveFormAndInteractiveCommunicationWebChannelConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,showPlaceholder,maximumCacheEntries,afPeriodscriptingPeriodcompatversion,makeFileNameUnique,generatingCompliantData)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur = function adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fontList = req.swagger.params['fontList'].value;
  Configmgr.adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur(post,apply,_delete,action,Dollarlocation,propertylist,fontList)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.analyticsComponentQueryCacheService = function analyticsComponentQueryCacheService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize = req.swagger.params['cq.analytics.component.query.cache.size'].value;
  Configmgr.analyticsComponentQueryCacheService(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.apacheSlingHealthCheckResultHTMLSerializer = function apacheSlingHealthCheckResultHTMLSerializer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var styleString = req.swagger.params['styleString'].value;
  Configmgr.apacheSlingHealthCheckResultHTMLSerializer(post,apply,_delete,action,Dollarlocation,propertylist,styleString)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration = function comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var formsManagerConfigPeriodincludeOOTBTemplates = req.swagger.params['formsManagerConfig.includeOOTBTemplates'].value;
  var formsManagerConfigPeriodincludeDeprecatedTemplates = req.swagger.params['formsManagerConfig.includeDeprecatedTemplates'].value;
  Configmgr.comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,formsManagerConfigPeriodincludeOOTBTemplates,formsManagerConfigPeriodincludeDeprecatedTemplates)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeAemTransactionCoreImplTransactionRecorder = function comAdobeAemTransactionCoreImplTransactionRecorder (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var isTransactionRecordingEnabled = req.swagger.params['isTransactionRecordingEnabled'].value;
  Configmgr.comAdobeAemTransactionCoreImplTransactionRecorder(post,apply,_delete,action,Dollarlocation,propertylist,isTransactionRecordingEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC = function comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  Configmgr.comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC = function comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  Configmgr.comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl = function comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var preUpgradePeriodmaintenancePeriodtasks = req.swagger.params['pre-upgrade.maintenance.tasks'].value;
  var preUpgradePeriodhcPeriodtags = req.swagger.params['pre-upgrade.hc.tags'].value;
  Configmgr.comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl(post,apply,_delete,action,Dollarlocation,propertylist,preUpgradePeriodmaintenancePeriodtasks,preUpgradePeriodhcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl = function comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var rootPeriodpath = req.swagger.params['root.path'].value;
  var fixPeriodinconsistencies = req.swagger.params['fix.inconsistencies'].value;
  Configmgr.comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl(post,apply,_delete,action,Dollarlocation,propertylist,rootPeriodpath,fixPeriodinconsistencies)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqAccountApiAccountManagementService = function comAdobeCqAccountApiAccountManagementService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod = req.swagger.params['cq.accountmanager.token.validity.period'].value;
  var cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail = req.swagger.params['cq.accountmanager.config.requestnewaccount.mail'].value;
  var cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail = req.swagger.params['cq.accountmanager.config.requestnewpwd.mail'].value;
  Configmgr.comAdobeCqAccountApiAccountManagementService(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod,cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail,cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqAccountImplAccountManagementServlet = function comAdobeCqAccountImplAccountManagementServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail = req.swagger.params['cq.accountmanager.config.informnewaccount.mail'].value;
  var cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail = req.swagger.params['cq.accountmanager.config.informnewpwd.mail'].value;
  Configmgr.comAdobeCqAccountImplAccountManagementServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail,cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqAddressImplLocationLocationListServlet = function comAdobeCqAddressImplLocationLocationListServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults = req.swagger.params['cq.address.location.default.maxResults'].value;
  Configmgr.comAdobeCqAddressImplLocationLocationListServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqAuditPurgeDam = function comAdobeCqAuditPurgeDam (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var auditlogPeriodrulePeriodname = req.swagger.params['auditlog.rule.name'].value;
  var auditlogPeriodrulePeriodcontentpath = req.swagger.params['auditlog.rule.contentpath'].value;
  var auditlogPeriodrulePeriodminimumage = req.swagger.params['auditlog.rule.minimumage'].value;
  var auditlogPeriodrulePeriodtypes = req.swagger.params['auditlog.rule.types'].value;
  Configmgr.comAdobeCqAuditPurgeDam(post,apply,_delete,action,Dollarlocation,propertylist,auditlogPeriodrulePeriodname,auditlogPeriodrulePeriodcontentpath,auditlogPeriodrulePeriodminimumage,auditlogPeriodrulePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqAuditPurgePages = function comAdobeCqAuditPurgePages (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var auditlogPeriodrulePeriodname = req.swagger.params['auditlog.rule.name'].value;
  var auditlogPeriodrulePeriodcontentpath = req.swagger.params['auditlog.rule.contentpath'].value;
  var auditlogPeriodrulePeriodminimumage = req.swagger.params['auditlog.rule.minimumage'].value;
  var auditlogPeriodrulePeriodtypes = req.swagger.params['auditlog.rule.types'].value;
  Configmgr.comAdobeCqAuditPurgePages(post,apply,_delete,action,Dollarlocation,propertylist,auditlogPeriodrulePeriodname,auditlogPeriodrulePeriodcontentpath,auditlogPeriodrulePeriodminimumage,auditlogPeriodrulePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqAuditPurgeReplication = function comAdobeCqAuditPurgeReplication (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var auditlogPeriodrulePeriodname = req.swagger.params['auditlog.rule.name'].value;
  var auditlogPeriodrulePeriodcontentpath = req.swagger.params['auditlog.rule.contentpath'].value;
  var auditlogPeriodrulePeriodminimumage = req.swagger.params['auditlog.rule.minimumage'].value;
  var auditlogPeriodrulePeriodtypes = req.swagger.params['auditlog.rule.types'].value;
  Configmgr.comAdobeCqAuditPurgeReplication(post,apply,_delete,action,Dollarlocation,propertylist,auditlogPeriodrulePeriodname,auditlogPeriodrulePeriodcontentpath,auditlogPeriodrulePeriodminimumage,auditlogPeriodrulePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCdnRewriterImplAWSCloudFrontRewriter = function comAdobeCqCdnRewriterImplAWSCloudFrontRewriter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var keypairPeriodid = req.swagger.params['keypair.id'].value;
  var keypairPeriodalias = req.swagger.params['keypair.alias'].value;
  var cdnrewriterPeriodattributes = req.swagger.params['cdnrewriter.attributes'].value;
  var cdnPeriodrewriterPerioddistributionPerioddomain = req.swagger.params['cdn.rewriter.distribution.domain'].value;
  Configmgr.comAdobeCqCdnRewriterImplAWSCloudFrontRewriter(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,keypairPeriodid,keypairPeriodalias,cdnrewriterPeriodattributes,cdnPeriodrewriterPerioddistributionPerioddomain)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCdnRewriterImplCDNConfigServiceImpl = function comAdobeCqCdnRewriterImplCDNConfigServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cdnPeriodconfigPerioddistributionPerioddomain = req.swagger.params['cdn.config.distribution.domain'].value;
  var cdnPeriodconfigPeriodenablePeriodrewriting = req.swagger.params['cdn.config.enable.rewriting'].value;
  var cdnPeriodconfigPeriodpathPeriodprefixes = req.swagger.params['cdn.config.path.prefixes'].value;
  var cdnPeriodconfigPeriodcdnttl = req.swagger.params['cdn.config.cdnttl'].value;
  var cdnPeriodconfigPeriodapplicationPeriodprotocol = req.swagger.params['cdn.config.application.protocol'].value;
  Configmgr.comAdobeCqCdnRewriterImplCDNConfigServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,cdnPeriodconfigPerioddistributionPerioddomain,cdnPeriodconfigPeriodenablePeriodrewriting,cdnPeriodconfigPeriodpathPeriodprefixes,cdnPeriodconfigPeriodcdnttl,cdnPeriodconfigPeriodapplicationPeriodprotocol)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCdnRewriterImplCDNRewriter = function comAdobeCqCdnRewriterImplCDNRewriter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var cdnrewriterPeriodattributes = req.swagger.params['cdnrewriter.attributes'].value;
  var cdnPeriodrewriterPerioddistributionPerioddomain = req.swagger.params['cdn.rewriter.distribution.domain'].value;
  Configmgr.comAdobeCqCdnRewriterImplCDNRewriter(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,cdnrewriterPeriodattributes,cdnPeriodrewriterPerioddistributionPerioddomain)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle = function comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var flushPeriodagents = req.swagger.params['flush.agents'].value;
  Configmgr.comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle(post,apply,_delete,action,Dollarlocation,propertylist,flushPeriodagents)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommerceImplAssetDynamicImageHandler = function comAdobeCqCommerceImplAssetDynamicImageHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodactive = req.swagger.params['cq.commerce.asset.handler.active'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodname = req.swagger.params['cq.commerce.asset.handler.name'].value;
  Configmgr.comAdobeCqCommerceImplAssetDynamicImageHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodassetPeriodhandlerPeriodactive,cqPeriodcommercePeriodassetPeriodhandlerPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl = function comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback = req.swagger.params['cq.commerce.asset.handler.fallback'].value;
  Configmgr.comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommerceImplAssetStaticImageHandler = function comAdobeCqCommerceImplAssetStaticImageHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodactive = req.swagger.params['cq.commerce.asset.handler.active'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodname = req.swagger.params['cq.commerce.asset.handler.name'].value;
  Configmgr.comAdobeCqCommerceImplAssetStaticImageHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodassetPeriodhandlerPeriodactive,cqPeriodcommercePeriodassetPeriodhandlerPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommerceImplAssetVideoHandler = function comAdobeCqCommerceImplAssetVideoHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodactive = req.swagger.params['cq.commerce.asset.handler.active'].value;
  var cqPeriodcommercePeriodassetPeriodhandlerPeriodname = req.swagger.params['cq.commerce.asset.handler.name'].value;
  Configmgr.comAdobeCqCommerceImplAssetVideoHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodassetPeriodhandlerPeriodactive,cqPeriodcommercePeriodassetPeriodhandlerPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommerceImplPromotionPromotionManagerImpl = function comAdobeCqCommerceImplPromotionPromotionManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodpromotionPeriodroot = req.swagger.params['cq.commerce.promotion.root'].value;
  Configmgr.comAdobeCqCommerceImplPromotionPromotionManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodpromotionPeriodroot)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl = function comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize = req.swagger.params['cq.commerce.cataloggenerator.bucketsize'].value;
  var cqPeriodcommercePeriodcataloggeneratorPeriodbucketname = req.swagger.params['cq.commerce.cataloggenerator.bucketname'].value;
  var cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties = req.swagger.params['cq.commerce.cataloggenerator.excludedtemplateproperties'].value;
  Configmgr.comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize,cqPeriodcommercePeriodcataloggeneratorPeriodbucketname,cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommercePimImplPageEventListener = function comAdobeCqCommercePimImplPageEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcommercePeriodpageeventlistenerPeriodenabled = req.swagger.params['cq.commerce.pageeventlistener.enabled'].value;
  Configmgr.comAdobeCqCommercePimImplPageEventListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcommercePeriodpageeventlistenerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl = function comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var feed generator algorithm = req.swagger.params['Feed generator algorithm'].value;
  Configmgr.comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,feed generator algorithm)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqContentinsightImplReportingServicesSettingsProvider = function comAdobeCqContentinsightImplReportingServicesSettingsProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var reportingservicesPeriodurl = req.swagger.params['reportingservices.url'].value;
  Configmgr.comAdobeCqContentinsightImplReportingServicesSettingsProvider(post,apply,_delete,action,Dollarlocation,propertylist,reportingservicesPeriodurl)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet = function comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var brightedgePeriodurl = req.swagger.params['brightedge.url'].value;
  Configmgr.comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet(post,apply,_delete,action,Dollarlocation,propertylist,brightedgePeriodurl)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqContentinsightImplServletsReportingServicesProxyServle = function comAdobeCqContentinsightImplServletsReportingServicesProxyServle (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var reportingservicesPeriodproxyPeriodwhitelist = req.swagger.params['reportingservices.proxy.whitelist'].value;
  Configmgr.comAdobeCqContentinsightImplServletsReportingServicesProxyServle(post,apply,_delete,action,Dollarlocation,propertylist,reportingservicesPeriodproxyPeriodwhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamCfmImplComponentComponentConfigImpl = function comAdobeCqDamCfmImplComponentComponentConfigImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var damPeriodcfmPeriodcomponentPeriodresourceType = req.swagger.params['dam.cfm.component.resourceType'].value;
  var damPeriodcfmPeriodcomponentPeriodfileReferenceProp = req.swagger.params['dam.cfm.component.fileReferenceProp'].value;
  var damPeriodcfmPeriodcomponentPeriodelementsProp = req.swagger.params['dam.cfm.component.elementsProp'].value;
  var damPeriodcfmPeriodcomponentPeriodvariationProp = req.swagger.params['dam.cfm.component.variationProp'].value;
  Configmgr.comAdobeCqDamCfmImplComponentComponentConfigImpl(post,apply,_delete,action,Dollarlocation,propertylist,damPeriodcfmPeriodcomponentPeriodresourceType,damPeriodcfmPeriodcomponentPeriodfileReferenceProp,damPeriodcfmPeriodcomponentPeriodelementsProp,damPeriodcfmPeriodcomponentPeriodvariationProp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamCfmImplConfFeatureConfigImpl = function comAdobeCqDamCfmImplConfFeatureConfigImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var damPeriodcfmPeriodresourceTypes = req.swagger.params['dam.cfm.resourceTypes'].value;
  var damPeriodcfmPeriodreferenceProperties = req.swagger.params['dam.cfm.referenceProperties'].value;
  Configmgr.comAdobeCqDamCfmImplConfFeatureConfigImpl(post,apply,_delete,action,Dollarlocation,propertylist,damPeriodcfmPeriodresourceTypes,damPeriodcfmPeriodreferenceProperties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamCfmImplContentRewriterAssetProcessor = function comAdobeCqDamCfmImplContentRewriterAssetProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pipelinePeriodtype = req.swagger.params['pipeline.type'].value;
  Configmgr.comAdobeCqDamCfmImplContentRewriterAssetProcessor(post,apply,_delete,action,Dollarlocation,propertylist,pipelinePeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamCfmImplContentRewriterParRangeFilter = function comAdobeCqDamCfmImplContentRewriterParRangeFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pipelinePeriodtype = req.swagger.params['pipeline.type'].value;
  Configmgr.comAdobeCqDamCfmImplContentRewriterParRangeFilter(post,apply,_delete,action,Dollarlocation,propertylist,pipelinePeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamCfmImplContentRewriterPayloadFilter = function comAdobeCqDamCfmImplContentRewriterPayloadFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pipelinePeriodtype = req.swagger.params['pipeline.type'].value;
  Configmgr.comAdobeCqDamCfmImplContentRewriterPayloadFilter(post,apply,_delete,action,Dollarlocation,propertylist,pipelinePeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamDmProcessImagePTiffManagerImpl = function comAdobeCqDamDmProcessImagePTiffManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxMemory = req.swagger.params['maxMemory'].value;
  Configmgr.comAdobeCqDamDmProcessImagePTiffManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,maxMemory)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker = function comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var dmreplicateonmodifyPeriodenabled = req.swagger.params['dmreplicateonmodify.enabled'].value;
  var dmreplicateonmodifyPeriodforcesyncdeletes = req.swagger.params['dmreplicateonmodify.forcesyncdeletes'].value;
  Configmgr.comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker(post,apply,_delete,action,Dollarlocation,propertylist,dmreplicateonmodifyPeriodenabled,dmreplicateonmodifyPeriodforcesyncdeletes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamMacSyncHelperImplMACSyncClientImpl = function comAdobeCqDamMacSyncHelperImplMACSyncClientImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout = req.swagger.params['com.adobe.dam.mac.sync.client.so.timeout'].value;
  Configmgr.comAdobeCqDamMacSyncHelperImplMACSyncClientImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamMacSyncImplDAMSyncServiceImpl = function comAdobeCqDamMacSyncImplDAMSyncServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredUnderscorepaths = req.swagger.params['com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths'].value;
  var comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions = req.swagger.params['com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions'].value;
  var comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms = req.swagger.params['com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms'].value;
  var comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform = req.swagger.params['com.adobe.cq.dam.mac.sync.damsyncservice.platform'].value;
  Configmgr.comAdobeCqDamMacSyncImplDAMSyncServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredUnderscorepaths,comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions,comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms,comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamProcessorNuiImplNuiAssetProcessor = function comAdobeCqDamProcessorNuiImplNuiAssetProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var nuiEnabled = req.swagger.params['nuiEnabled'].value;
  var nuiServiceUrl = req.swagger.params['nuiServiceUrl'].value;
  var nuiApiKey = req.swagger.params['nuiApiKey'].value;
  Configmgr.comAdobeCqDamProcessorNuiImplNuiAssetProcessor(post,apply,_delete,action,Dollarlocation,propertylist,nuiEnabled,nuiServiceUrl,nuiApiKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamS7imagingImplIsImageServerComponent = function comAdobeCqDamS7imagingImplIsImageServerComponent (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var tcpPort = req.swagger.params['TcpPort'].value;
  var allowRemoteAccess = req.swagger.params['AllowRemoteAccess'].value;
  var maxRenderRgnPixels = req.swagger.params['MaxRenderRgnPixels'].value;
  var maxMessageSize = req.swagger.params['MaxMessageSize'].value;
  var randomAccessUrlTimeout = req.swagger.params['RandomAccessUrlTimeout'].value;
  var workerThreads = req.swagger.params['WorkerThreads'].value;
  Configmgr.comAdobeCqDamS7imagingImplIsImageServerComponent(post,apply,_delete,action,Dollarlocation,propertylist,tcpPort,allowRemoteAccess,maxRenderRgnPixels,maxMessageSize,randomAccessUrlTimeout,workerThreads)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamS7imagingImplPsPlatformServerServlet = function comAdobeCqDamS7imagingImplPsPlatformServerServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cachePeriodenable = req.swagger.params['cache.enable'].value;
  var cachePeriodrootPaths = req.swagger.params['cache.rootPaths'].value;
  var cachePeriodmaxSize = req.swagger.params['cache.maxSize'].value;
  var cachePeriodmaxEntries = req.swagger.params['cache.maxEntries'].value;
  Configmgr.comAdobeCqDamS7imagingImplPsPlatformServerServlet(post,apply,_delete,action,Dollarlocation,propertylist,cachePeriodenable,cachePeriodrootPaths,cachePeriodmaxSize,cachePeriodmaxEntries)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamWebdavImplIoAssetIOHandler = function comAdobeCqDamWebdavImplIoAssetIOHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var pathPrefix = req.swagger.params['pathPrefix'].value;
  var createVersion = req.swagger.params['createVersion'].value;
  Configmgr.comAdobeCqDamWebdavImplIoAssetIOHandler(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,pathPrefix,createVersion)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob = function comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable = req.swagger.params['cq.dam.webdav.version.linking.enable'].value;
  var cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod = req.swagger.params['cq.dam.webdav.version.linking.scheduler.period'].value;
  var cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout = req.swagger.params['cq.dam.webdav.version.linking.staging.timeout'].value;
  Configmgr.comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable,cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod,cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDamWebdavImplIoSpecialFilesHandler = function comAdobeCqDamWebdavImplIoSpecialFilesHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPerioddayPeriodcqPerioddamPeriodcorePeriodimplPeriodioPeriodSpecialFilesHandlerPeriodfilepatters = req.swagger.params['com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters'].value;
  Configmgr.comAdobeCqDamWebdavImplIoSpecialFilesHandler(post,apply,_delete,action,Dollarlocation,propertylist,comPerioddayPeriodcqPerioddamPeriodcorePeriodimplPeriodioPeriodSpecialFilesHandlerPeriodfilepatters)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDeserfwImplDeserializationFirewallImpl = function comAdobeCqDeserfwImplDeserializationFirewallImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var firewallPerioddeserializationPeriodwhitelist = req.swagger.params['firewall.deserialization.whitelist'].value;
  var firewallPerioddeserializationPeriodblacklist = req.swagger.params['firewall.deserialization.blacklist'].value;
  var firewallPerioddeserializationPerioddiagnostics = req.swagger.params['firewall.deserialization.diagnostics'].value;
  Configmgr.comAdobeCqDeserfwImplDeserializationFirewallImpl(post,apply,_delete,action,Dollarlocation,propertylist,firewallPerioddeserializationPeriodwhitelist,firewallPerioddeserializationPeriodblacklist,firewallPerioddeserializationPerioddiagnostics)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDtmImplServiceDTMWebServiceImpl = function comAdobeCqDtmImplServiceDTMWebServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var connectionPeriodtimeout = req.swagger.params['connection.timeout'].value;
  var socketPeriodtimeout = req.swagger.params['socket.timeout'].value;
  Configmgr.comAdobeCqDtmImplServiceDTMWebServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,connectionPeriodtimeout,socketPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDtmImplServletsDTMDeployHookServlet = function comAdobeCqDtmImplServletsDTMDeployHookServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var dtmPeriodstagingPeriodipPeriodwhitelist = req.swagger.params['dtm.staging.ip.whitelist'].value;
  var dtmPeriodproductionPeriodipPeriodwhitelist = req.swagger.params['dtm.production.ip.whitelist'].value;
  Configmgr.comAdobeCqDtmImplServletsDTMDeployHookServlet(post,apply,_delete,action,Dollarlocation,propertylist,dtmPeriodstagingPeriodipPeriodwhitelist,dtmPeriodproductionPeriodipPeriodwhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqDtmReactorImplServiceWebServiceImpl = function comAdobeCqDtmReactorImplServiceWebServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var endpointUri = req.swagger.params['endpointUri'].value;
  var connectionTimeout = req.swagger.params['connectionTimeout'].value;
  var socketTimeout = req.swagger.params['socketTimeout'].value;
  Configmgr.comAdobeCqDtmReactorImplServiceWebServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,endpointUri,connectionTimeout,socketTimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqExperiencelogImplExperienceLogConfigServlet = function comAdobeCqExperiencelogImplExperienceLogConfigServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var disabledForGroups = req.swagger.params['disabledForGroups'].value;
  Configmgr.comAdobeCqExperiencelogImplExperienceLogConfigServlet(post,apply,_delete,action,Dollarlocation,propertylist,enabled,disabledForGroups)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqHcContentPackagesHealthCheck = function comAdobeCqHcContentPackagesHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  var packagePeriodnames = req.swagger.params['package.names'].value;
  Configmgr.comAdobeCqHcContentPackagesHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname,packagePeriodnames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqHistoryImplHistoryRequestFilter = function comAdobeCqHistoryImplHistoryRequestFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var historyPeriodrequestFilterPeriodexcludedSelectors = req.swagger.params['history.requestFilter.excludedSelectors'].value;
  var historyPeriodrequestFilterPeriodexcludedExtensions = req.swagger.params['history.requestFilter.excludedExtensions'].value;
  Configmgr.comAdobeCqHistoryImplHistoryRequestFilter(post,apply,_delete,action,Dollarlocation,propertylist,historyPeriodrequestFilterPeriodexcludedSelectors,historyPeriodrequestFilterPeriodexcludedExtensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqHistoryImplHistoryServiceImpl = function comAdobeCqHistoryImplHistoryServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var historyPeriodservicePeriodresourceTypes = req.swagger.params['history.service.resourceTypes'].value;
  var historyPeriodservicePeriodpathFilter = req.swagger.params['history.service.pathFilter'].value;
  Configmgr.comAdobeCqHistoryImplHistoryServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,historyPeriodservicePeriodresourceTypes,historyPeriodservicePeriodpathFilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqInboxImplTypeproviderItemTypeProvider = function comAdobeCqInboxImplTypeproviderItemTypeProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var inboxPeriodimplPeriodtypeproviderPeriodregistrypaths = req.swagger.params['inbox.impl.typeprovider.registrypaths'].value;
  var inboxPeriodimplPeriodtypeproviderPeriodlegacypaths = req.swagger.params['inbox.impl.typeprovider.legacypaths'].value;
  var inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem = req.swagger.params['inbox.impl.typeprovider.defaulturl.failureitem'].value;
  var inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem = req.swagger.params['inbox.impl.typeprovider.defaulturl.workitem'].value;
  var inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask = req.swagger.params['inbox.impl.typeprovider.defaulturl.task'].value;
  Configmgr.comAdobeCqInboxImplTypeproviderItemTypeProvider(post,apply,_delete,action,Dollarlocation,propertylist,inboxPeriodimplPeriodtypeproviderPeriodregistrypaths,inboxPeriodimplPeriodtypeproviderPeriodlegacypaths,inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem,inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem,inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqProjectsImplServletProjectImageServlet = function comAdobeCqProjectsImplServletProjectImageServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var imagePeriodquality = req.swagger.params['image.quality'].value;
  var imagePeriodsupportedPeriodresolutions = req.swagger.params['image.supported.resolutions'].value;
  Configmgr.comAdobeCqProjectsImplServletProjectImageServlet(post,apply,_delete,action,Dollarlocation,propertylist,imagePeriodquality,imagePeriodsupportedPeriodresolutions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqProjectsPurgeScheduler = function comAdobeCqProjectsPurgeScheduler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var scheduledpurgePeriodname = req.swagger.params['scheduledpurge.name'].value;
  var scheduledpurgePeriodpurgeActive = req.swagger.params['scheduledpurge.purgeActive'].value;
  var scheduledpurgePeriodtemplates = req.swagger.params['scheduledpurge.templates'].value;
  var scheduledpurgePeriodpurgeGroups = req.swagger.params['scheduledpurge.purgeGroups'].value;
  var scheduledpurgePeriodpurgeAssets = req.swagger.params['scheduledpurge.purgeAssets'].value;
  var scheduledpurgePeriodterminateRunningWorkflows = req.swagger.params['scheduledpurge.terminateRunningWorkflows'].value;
  var scheduledpurgePerioddaysold = req.swagger.params['scheduledpurge.daysold'].value;
  var scheduledpurgePeriodsaveThreshold = req.swagger.params['scheduledpurge.saveThreshold'].value;
  Configmgr.comAdobeCqProjectsPurgeScheduler(post,apply,_delete,action,Dollarlocation,propertylist,scheduledpurgePeriodname,scheduledpurgePeriodpurgeActive,scheduledpurgePeriodtemplates,scheduledpurgePeriodpurgeGroups,scheduledpurgePeriodpurgeAssets,scheduledpurgePeriodterminateRunningWorkflows,scheduledpurgePerioddaysold,scheduledpurgePeriodsaveThreshold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScheduledExporterImplScheduledExporterImpl = function comAdobeCqScheduledExporterImplScheduledExporterImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var includePeriodpaths = req.swagger.params['include.paths'].value;
  var exporterPerioduser = req.swagger.params['exporter.user'].value;
  Configmgr.comAdobeCqScheduledExporterImplScheduledExporterImpl(post,apply,_delete,action,Dollarlocation,propertylist,includePeriodpaths,exporterPerioduser)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl = function comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl = req.swagger.params['com.adobe.cq.screens.analytics.impl.url'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey = req.swagger.params['com.adobe.cq.screens.analytics.impl.apikey'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject = req.swagger.params['com.adobe.cq.screens.analytics.impl.project'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment = req.swagger.params['com.adobe.cq.screens.analytics.impl.environment'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency = req.swagger.params['com.adobe.cq.screens.analytics.impl.sendFrequency'].value;
  Configmgr.comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl,comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey,comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject,comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment,comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensDeviceImplDeviceService = function comAdobeCqScreensDeviceImplDeviceService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency = req.swagger.params['com.adobe.aem.screens.player.pingfrequency'].value;
  var comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars = req.swagger.params['com.adobe.aem.screens.device.pasword.specialchars'].value;
  var comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars = req.swagger.params['com.adobe.aem.screens.device.pasword.minlowercasechars'].value;
  var comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars = req.swagger.params['com.adobe.aem.screens.device.pasword.minuppercasechars'].value;
  var comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars = req.swagger.params['com.adobe.aem.screens.device.pasword.minnumberchars'].value;
  var comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars = req.swagger.params['com.adobe.aem.screens.device.pasword.minspecialchars'].value;
  var comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength = req.swagger.params['com.adobe.aem.screens.device.pasword.minlength'].value;
  Configmgr.comAdobeCqScreensDeviceImplDeviceService(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency,comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars,comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars,comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars,comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars,comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars,comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl = function comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var deviceRegistrationTimeout = req.swagger.params['deviceRegistrationTimeout'].value;
  Configmgr.comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,deviceRegistrationTimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensImplHandlerChannelsUpdateHandler = function comAdobeCqScreensImplHandlerChannelsUpdateHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodpagesupdatehandlerPeriodimageresourcetypes = req.swagger.params['cq.pagesupdatehandler.imageresourcetypes'].value;
  var cqPeriodpagesupdatehandlerPeriodproductresourcetypes = req.swagger.params['cq.pagesupdatehandler.productresourcetypes'].value;
  var cqPeriodpagesupdatehandlerPeriodvideoresourcetypes = req.swagger.params['cq.pagesupdatehandler.videoresourcetypes'].value;
  var cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes = req.swagger.params['cq.pagesupdatehandler.dynamicsequenceresourcetypes'].value;
  var cqPeriodpagesupdatehandlerPeriodpreviewmodepaths = req.swagger.params['cq.pagesupdatehandler.previewmodepaths'].value;
  Configmgr.comAdobeCqScreensImplHandlerChannelsUpdateHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodpagesupdatehandlerPeriodimageresourcetypes,cqPeriodpagesupdatehandlerPeriodproductresourcetypes,cqPeriodpagesupdatehandlerPeriodvideoresourcetypes,cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes,cqPeriodpagesupdatehandlerPeriodpreviewmodepaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob = function comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  Configmgr.comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl = function comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestUnderscoretimeout = req.swagger.params['com.adobe.aem.screens.impl.remote.request_timeout'].value;
  Configmgr.comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestUnderscoretimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensImplScreensChannelPostProcessor = function comAdobeCqScreensImplScreensChannelPostProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove = req.swagger.params['screens.channels.properties.to.remove'].value;
  Configmgr.comAdobeCqScreensImplScreensChannelPostProcessor(post,apply,_delete,action,Dollarlocation,propertylist,screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl = function comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword = req.swagger.params['com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password'].value;
  Configmgr.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername,comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensMqActivemqImplArtemisJMSProvider = function comAdobeCqScreensMqActivemqImplArtemisJMSProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var globalPeriodsize = req.swagger.params['global.size'].value;
  var maxPerioddiskPeriodusage = req.swagger.params['max.disk.usage'].value;
  var persistencePeriodenabled = req.swagger.params['persistence.enabled'].value;
  var threadPeriodpoolPeriodmaxPeriodsize = req.swagger.params['thread.pool.max.size'].value;
  var scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize = req.swagger.params['scheduled.thread.pool.max.size'].value;
  var gracefulPeriodshutdownPeriodtimeout = req.swagger.params['graceful.shutdown.timeout'].value;
  var queues = req.swagger.params['queues'].value;
  var topics = req.swagger.params['topics'].value;
  var addressesPeriodmaxPerioddeliveryPeriodattempts = req.swagger.params['addresses.max.delivery.attempts'].value;
  var addressesPeriodexpiryPerioddelay = req.swagger.params['addresses.expiry.delay'].value;
  var addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy = req.swagger.params['addresses.address.full.message.policy'].value;
  var addressesPeriodmaxPeriodsizePeriodbytes = req.swagger.params['addresses.max.size.bytes'].value;
  var addressesPeriodpagePeriodsizePeriodbytes = req.swagger.params['addresses.page.size.bytes'].value;
  var addressesPeriodpagePeriodcachePeriodmaxPeriodsize = req.swagger.params['addresses.page.cache.max.size'].value;
  var clusterPerioduser = req.swagger.params['cluster.user'].value;
  var clusterPeriodpassword = req.swagger.params['cluster.password'].value;
  var clusterPeriodcallPeriodtimeout = req.swagger.params['cluster.call.timeout'].value;
  var clusterPeriodcallPeriodfailoverPeriodtimeout = req.swagger.params['cluster.call.failover.timeout'].value;
  var clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod = req.swagger.params['cluster.client.failure.check.period'].value;
  var clusterPeriodnotificationPeriodattempts = req.swagger.params['cluster.notification.attempts'].value;
  var clusterPeriodnotificationPeriodinterval = req.swagger.params['cluster.notification.interval'].value;
  var idPeriodcachePeriodsize = req.swagger.params['id.cache.size'].value;
  var clusterPeriodconfirmationPeriodwindowPeriodsize = req.swagger.params['cluster.confirmation.window.size'].value;
  var clusterPeriodconnectionPeriodttl = req.swagger.params['cluster.connection.ttl'].value;
  var clusterPeriodduplicatePerioddetection = req.swagger.params['cluster.duplicate.detection'].value;
  var clusterPeriodinitialPeriodconnectPeriodattempts = req.swagger.params['cluster.initial.connect.attempts'].value;
  var clusterPeriodmaxPeriodretryPeriodinterval = req.swagger.params['cluster.max.retry.interval'].value;
  var clusterPeriodminPeriodlargePeriodmessagePeriodsize = req.swagger.params['cluster.min.large.message.size'].value;
  var clusterPeriodproducerPeriodwindowPeriodsize = req.swagger.params['cluster.producer.window.size'].value;
  var clusterPeriodreconnectPeriodattempts = req.swagger.params['cluster.reconnect.attempts'].value;
  var clusterPeriodretryPeriodinterval = req.swagger.params['cluster.retry.interval'].value;
  var clusterPeriodretryPeriodintervalPeriodmultiplier = req.swagger.params['cluster.retry.interval.multiplier'].value;
  Configmgr.comAdobeCqScreensMqActivemqImplArtemisJMSProvider(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,globalPeriodsize,maxPerioddiskPeriodusage,persistencePeriodenabled,threadPeriodpoolPeriodmaxPeriodsize,scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize,gracefulPeriodshutdownPeriodtimeout,queues,topics,addressesPeriodmaxPerioddeliveryPeriodattempts,addressesPeriodexpiryPerioddelay,addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy,addressesPeriodmaxPeriodsizePeriodbytes,addressesPeriodpagePeriodsizePeriodbytes,addressesPeriodpagePeriodcachePeriodmaxPeriodsize,clusterPerioduser,clusterPeriodpassword,clusterPeriodcallPeriodtimeout,clusterPeriodcallPeriodfailoverPeriodtimeout,clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod,clusterPeriodnotificationPeriodattempts,clusterPeriodnotificationPeriodinterval,idPeriodcachePeriodsize,clusterPeriodconfirmationPeriodwindowPeriodsize,clusterPeriodconnectionPeriodttl,clusterPeriodduplicatePerioddetection,clusterPeriodinitialPeriodconnectPeriodattempts,clusterPeriodmaxPeriodretryPeriodinterval,clusterPeriodminPeriodlargePeriodmessagePeriodsize,clusterPeriodproducerPeriodwindowPeriodsize,clusterPeriodreconnectPeriodattempts,clusterPeriodretryPeriodinterval,clusterPeriodretryPeriodintervalPeriodmultiplier)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl = function comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath = req.swagger.params['com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency = req.swagger.params['com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency'].value;
  Configmgr.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath,comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl = function comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var disableSmartSync = req.swagger.params['disableSmartSync'].value;
  Configmgr.comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,disableSmartSync)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqScreensSegmentationImplSegmentationFeatureFlag = function comAdobeCqScreensSegmentationImplSegmentationFeatureFlag (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enableDataTriggeredContent = req.swagger.params['enableDataTriggeredContent'].value;
  Configmgr.comAdobeCqScreensSegmentationImplSegmentationFeatureFlag(post,apply,_delete,action,Dollarlocation,propertylist,enableDataTriggeredContent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh = function comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck = function comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck = function comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var dispatcherPeriodaddress = req.swagger.params['dispatcher.address'].value;
  var dispatcherPeriodfilterPeriodallowed = req.swagger.params['dispatcher.filter.allowed'].value;
  var dispatcherPeriodfilterPeriodblocked = req.swagger.params['dispatcher.filter.blocked'].value;
  Configmgr.comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,dispatcherPeriodaddress,dispatcherPeriodfilterPeriodallowed,dispatcherPeriodfilterPeriodblocked)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck = function comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck = function comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var webserverPeriodaddress = req.swagger.params['webserver.address'].value;
  Configmgr.comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,webserverPeriodaddress)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialAccountverificationImplAccountManagementConfigIm = function comAdobeCqSocialAccountverificationImplAccountManagementConfigIm (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enable = req.swagger.params['enable'].value;
  var ttl1 = req.swagger.params['ttl1'].value;
  var ttl2 = req.swagger.params['ttl2'].value;
  Configmgr.comAdobeCqSocialAccountverificationImplAccountManagementConfigIm(post,apply,_delete,action,Dollarlocation,propertylist,enable,ttl1,ttl2)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen = function comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen(post,apply,_delete,action,Dollarlocation,propertylist,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo = function comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo(post,apply,_delete,action,Dollarlocation,propertylist,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler = function comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  Configmgr.comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics,eventPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialActivitystreamsListenerImplModerationEventExten = function comAdobeCqSocialActivitystreamsListenerImplModerationEventExten (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var accepted = req.swagger.params['accepted'].value;
  var ranked = req.swagger.params['ranked'].value;
  Configmgr.comAdobeCqSocialActivitystreamsListenerImplModerationEventExten(post,apply,_delete,action,Dollarlocation,propertylist,accepted,ranked)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS = function comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var ranking = req.swagger.params['ranking'].value;
  var enable = req.swagger.params['enable'].value;
  Configmgr.comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS(post,apply,_delete,action,Dollarlocation,propertylist,ranking,enable)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre = function comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var streamPath = req.swagger.params['streamPath'].value;
  var streamName = req.swagger.params['streamName'].value;
  Configmgr.comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre(post,apply,_delete,action,Dollarlocation,propertylist,streamPath,streamName)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI = function comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxRetry = req.swagger.params['MaxRetry'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI(post,apply,_delete,action,Dollarlocation,propertylist,maxRetry,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen = function comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  var extensionPeriodorder = req.swagger.params['extension.order'].value;
  Configmgr.comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen(post,apply,_delete,action,Dollarlocation,propertylist,attachmentTypeBlacklist,extensionPeriodorder)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCalendarServletsTimeZoneServlet = function comAdobeCqSocialCalendarServletsTimeZoneServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var timezonesPeriodexpirytime = req.swagger.params['timezones.expirytime'].value;
  Configmgr.comAdobeCqSocialCalendarServletsTimeZoneServlet(post,apply,_delete,action,Dollarlocation,propertylist,timezonesPeriodexpirytime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent = function comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var ranking = req.swagger.params['ranking'].value;
  Configmgr.comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent(post,apply,_delete,action,Dollarlocation,propertylist,ranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe = function comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati = function comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC = function comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var numUserLimit = req.swagger.params['numUserLimit'].value;
  Configmgr.comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC(post,apply,_delete,action,Dollarlocation,propertylist,numUserLimit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos = function comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enableScheduledPostsSearch = req.swagger.params['enableScheduledPostsSearch'].value;
  var numberOfMinutes = req.swagger.params['numberOfMinutes'].value;
  var maxSearchLimit = req.swagger.params['maxSearchLimit'].value;
  Configmgr.comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos(post,apply,_delete,action,Dollarlocation,propertylist,enableScheduledPostsSearch,numberOfMinutes,maxSearchLimit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsCorsCORSAuthenticationFilter = function comAdobeCqSocialCommonsCorsCORSAuthenticationFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var corsPeriodenabling = req.swagger.params['cors.enabling'].value;
  Configmgr.comAdobeCqSocialCommonsCorsCORSAuthenticationFilter(post,apply,_delete,action,Dollarlocation,propertylist,corsPeriodenabling)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl = function comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var contextPeriodpath = req.swagger.params['context.path'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl(post,apply,_delete,action,Dollarlocation,propertylist,contextPeriodpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener = function comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp = function comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var patternPeriodtime = req.swagger.params['pattern.time'].value;
  var patternPeriodnewline = req.swagger.params['pattern.newline'].value;
  var patternPerioddayOfMonth = req.swagger.params['pattern.dayOfMonth'].value;
  var patternPeriodmonth = req.swagger.params['pattern.month'].value;
  var patternPeriodyear = req.swagger.params['pattern.year'].value;
  var patternPerioddate = req.swagger.params['pattern.date'].value;
  var patternPerioddateTime = req.swagger.params['pattern.dateTime'].value;
  var patternPeriodemail = req.swagger.params['pattern.email'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp(post,apply,_delete,action,Dollarlocation,propertylist,patternPeriodtime,patternPeriodnewline,patternPerioddayOfMonth,patternPeriodmonth,patternPeriodyear,patternPerioddate,patternPerioddateTime,patternPeriodemail)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp = function comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var emailPeriodname = req.swagger.params['email.name'].value;
  var emailPeriodcreatePostFromReply = req.swagger.params['email.createPostFromReply'].value;
  var emailPeriodaddCommentIdTo = req.swagger.params['email.addCommentIdTo'].value;
  var emailPeriodsubjectMaximumLength = req.swagger.params['email.subjectMaximumLength'].value;
  var emailPeriodreplyToAddress = req.swagger.params['email.replyToAddress'].value;
  var emailPeriodreplyToDelimiter = req.swagger.params['email.replyToDelimiter'].value;
  var emailPeriodtrackerIdPrefixInSubject = req.swagger.params['email.trackerIdPrefixInSubject'].value;
  var emailPeriodtrackerIdPrefixInBody = req.swagger.params['email.trackerIdPrefixInBody'].value;
  var emailPeriodasHTML = req.swagger.params['email.asHTML'].value;
  var emailPerioddefaultUserName = req.swagger.params['email.defaultUserName'].value;
  var emailPeriodtemplatesPeriodrootPath = req.swagger.params['email.templates.rootPath'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp(post,apply,_delete,action,Dollarlocation,propertylist,emailPeriodname,emailPeriodcreatePostFromReply,emailPeriodaddCommentIdTo,emailPeriodsubjectMaximumLength,emailPeriodreplyToAddress,emailPeriodreplyToDelimiter,emailPeriodtrackerIdPrefixInSubject,emailPeriodtrackerIdPrefixInBody,emailPeriodasHTML,emailPerioddefaultUserName,emailPeriodtemplatesPeriodrootPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter = function comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var connectProtocol = req.swagger.params['connectProtocol'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter(post,apply,_delete,action,Dollarlocation,propertylist,connectProtocol)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,replyEmailPatterns,priorityOrder)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider = function comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priorityOrder = req.swagger.params['priorityOrder'].value;
  var replyEmailPatterns = req.swagger.params['replyEmailPatterns'].value;
  Configmgr.comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider(post,apply,_delete,action,Dollarlocation,propertylist,priorityOrder,replyEmailPatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload = function comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var numberOfDays = req.swagger.params['numberOfDays'].value;
  var ageOfFile = req.swagger.params['ageOfFile'].value;
  Configmgr.comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload(post,apply,_delete,action,Dollarlocation,propertylist,numberOfDays,ageOfFile)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl = function comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var verbs = req.swagger.params['verbs'].value;
  Configmgr.comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics,eventPeriodfilter,verbs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit = function comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enable = req.swagger.params['enable'].value;
  var uGCLimit = req.swagger.params['UGCLimit'].value;
  var ugcLimitDuration = req.swagger.params['ugcLimitDuration'].value;
  var domains = req.swagger.params['domains'].value;
  var toList = req.swagger.params['toList'].value;
  Configmgr.comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit(post,apply,_delete,action,Dollarlocation,propertylist,enable,uGCLimit,ugcLimitDuration,domains,toList)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialConnectOauthImplFacebookProviderImpl = function comAdobeCqSocialConnectOauthImplFacebookProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  var oauthPeriodcloudPeriodconfigPeriodroot = req.swagger.params['oauth.cloud.config.root'].value;
  var providerPeriodconfigPeriodroot = req.swagger.params['provider.config.root'].value;
  var providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled = req.swagger.params['provider.config.create.tags.enabled'].value;
  var providerPeriodconfigPerioduserPeriodfolder = req.swagger.params['provider.config.user.folder'].value;
  var providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields = req.swagger.params['provider.config.facebook.fetch.fields'].value;
  var providerPeriodconfigPeriodfacebookPeriodfields = req.swagger.params['provider.config.facebook.fields'].value;
  var providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled = req.swagger.params['provider.config.refresh.userdata.enabled'].value;
  Configmgr.comAdobeCqSocialConnectOauthImplFacebookProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid,oauthPeriodcloudPeriodconfigPeriodroot,providerPeriodconfigPeriodroot,providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled,providerPeriodconfigPerioduserPeriodfolder,providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields,providerPeriodconfigPeriodfacebookPeriodfields,providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle = function comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle(post,apply,_delete,action,Dollarlocation,propertylist,path,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper = function comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var facebook = req.swagger.params['facebook'].value;
  var twitter = req.swagger.params['twitter'].value;
  var providerPeriodconfigPerioduserPeriodfolder = req.swagger.params['provider.config.user.folder'].value;
  Configmgr.comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper(post,apply,_delete,action,Dollarlocation,propertylist,facebook,twitter,providerPeriodconfigPerioduserPeriodfolder)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialConnectOauthImplTwitterProviderImpl = function comAdobeCqSocialConnectOauthImplTwitterProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  var oauthPeriodcloudPeriodconfigPeriodroot = req.swagger.params['oauth.cloud.config.root'].value;
  var providerPeriodconfigPeriodroot = req.swagger.params['provider.config.root'].value;
  var providerPeriodconfigPerioduserPeriodfolder = req.swagger.params['provider.config.user.folder'].value;
  var providerPeriodconfigPeriodtwitterPeriodenablePeriodparams = req.swagger.params['provider.config.twitter.enable.params'].value;
  var providerPeriodconfigPeriodtwitterPeriodparams = req.swagger.params['provider.config.twitter.params'].value;
  var providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled = req.swagger.params['provider.config.refresh.userdata.enabled'].value;
  Configmgr.comAdobeCqSocialConnectOauthImplTwitterProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid,oauthPeriodcloudPeriodconfigPeriodroot,providerPeriodconfigPeriodroot,providerPeriodconfigPerioduserPeriodfolder,providerPeriodconfigPeriodtwitterPeriodenablePeriodparams,providerPeriodconfigPeriodtwitterPeriodparams,providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen = function comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled = req.swagger.params['cq.social.content.fragments.services.enabled'].value;
  var cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds = req.swagger.params['cq.social.content.fragments.services.waitTimeSeconds'].value;
  Configmgr.comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled,cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialDatastoreAsImplASResourceProviderFactory = function comAdobeCqSocialDatastoreAsImplASResourceProviderFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var versionPeriodid = req.swagger.params['version.id'].value;
  var cachePeriodon = req.swagger.params['cache.on'].value;
  var concurrencyPeriodlevel = req.swagger.params['concurrency.level'].value;
  var cachePeriodstartPeriodsize = req.swagger.params['cache.start.size'].value;
  var cachePeriodttl = req.swagger.params['cache.ttl'].value;
  var cachePeriodsize = req.swagger.params['cache.size'].value;
  var timePeriodlimit = req.swagger.params['time.limit'].value;
  Configmgr.comAdobeCqSocialDatastoreAsImplASResourceProviderFactory(post,apply,_delete,action,Dollarlocation,propertylist,versionPeriodid,cachePeriodon,concurrencyPeriodlevel,cachePeriodstartPeriodsize,cachePeriodttl,cachePeriodsize,timePeriodlimit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory = function comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var solrPeriodzkPeriodtimeout = req.swagger.params['solr.zk.timeout'].value;
  var solrPeriodcommit = req.swagger.params['solr.commit'].value;
  var cachePeriodon = req.swagger.params['cache.on'].value;
  var concurrencyPeriodlevel = req.swagger.params['concurrency.level'].value;
  var cachePeriodstartPeriodsize = req.swagger.params['cache.start.size'].value;
  var cachePeriodttl = req.swagger.params['cache.ttl'].value;
  var cachePeriodsize = req.swagger.params['cache.size'].value;
  Configmgr.comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory(post,apply,_delete,action,Dollarlocation,propertylist,solrPeriodzkPeriodtimeout,solrPeriodcommit,cachePeriodon,concurrencyPeriodlevel,cachePeriodstartPeriodsize,cachePeriodttl,cachePeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor = function comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var solrPeriodzkPeriodtimeout = req.swagger.params['solr.zk.timeout'].value;
  var solrPeriodcommit = req.swagger.params['solr.commit'].value;
  var cachePeriodon = req.swagger.params['cache.on'].value;
  var concurrencyPeriodlevel = req.swagger.params['concurrency.level'].value;
  var cachePeriodstartPeriodsize = req.swagger.params['cache.start.size'].value;
  var cachePeriodttl = req.swagger.params['cache.ttl'].value;
  var cachePeriodsize = req.swagger.params['cache.size'].value;
  Configmgr.comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor(post,apply,_delete,action,Dollarlocation,propertylist,solrPeriodzkPeriodtimeout,solrPeriodcommit,cachePeriodon,concurrencyPeriodlevel,cachePeriodstartPeriodsize,cachePeriodttl,cachePeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF = function comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var isMemberCheck = req.swagger.params['isMemberCheck'].value;
  Configmgr.comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF(post,apply,_delete,action,Dollarlocation,propertylist,isMemberCheck)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto = function comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var isMemberCheck = req.swagger.params['isMemberCheck'].value;
  Configmgr.comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto(post,apply,_delete,action,Dollarlocation,propertylist,isMemberCheck)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL = function comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  Configmgr.comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou = function comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  Configmgr.comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl = function comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe = function comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var slingPeriodservletPeriodextensions = req.swagger.params['sling.servlet.extensions'].value;
  Configmgr.comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodselectors,slingPeriodservletPeriodextensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera = function comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialForumClientEndpointsImplForumOperationsService = function comAdobeCqSocialForumClientEndpointsImplForumOperationsService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialForumClientEndpointsImplForumOperationsService(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialForumDispatcherImplFlushOperations = function comAdobeCqSocialForumDispatcherImplFlushOperations (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var extensionPeriodorder = req.swagger.params['extension.order'].value;
  var flushPeriodforumontopic = req.swagger.params['flush.forumontopic'].value;
  Configmgr.comAdobeCqSocialForumDispatcherImplFlushOperations(post,apply,_delete,action,Dollarlocation,propertylist,extensionPeriodorder,flushPeriodforumontopic)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen = function comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var groupPeriodlistingPeriodpaginationPeriodenable = req.swagger.params['group.listing.pagination.enable'].value;
  var groupPeriodlistingPeriodlazyloadingPeriodenable = req.swagger.params['group.listing.lazyloading.enable'].value;
  var pagePeriodsize = req.swagger.params['page.size'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen(post,apply,_delete,action,Dollarlocation,propertylist,groupPeriodlistingPeriodpaginationPeriodenable,groupPeriodlistingPeriodlazyloadingPeriodenable,pagePeriodsize,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialGroupImplGroupServiceImpl = function comAdobeCqSocialGroupImplGroupServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxWaitTime = req.swagger.params['maxWaitTime'].value;
  var minWaitBetweenRetries = req.swagger.params['minWaitBetweenRetries'].value;
  Configmgr.comAdobeCqSocialGroupImplGroupServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,maxWaitTime,minWaitBetweenRetries)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl = function comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var parameterPeriodguavaPeriodcachePeriodenabled = req.swagger.params['parameter.guava.cache.enabled'].value;
  var parameterPeriodguavaPeriodcachePeriodparams = req.swagger.params['parameter.guava.cache.params'].value;
  var parameterPeriodguavaPeriodcachePeriodreload = req.swagger.params['parameter.guava.cache.reload'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl(post,apply,_delete,action,Dollarlocation,propertylist,parameterPeriodguavaPeriodcachePeriodenabled,parameterPeriodguavaPeriodcachePeriodparams,parameterPeriodguavaPeriodcachePeriodreload,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS = function comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer = function comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile = function comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  Configmgr.comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO = function comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  Configmgr.comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF = function comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var everyoneLimit = req.swagger.params['everyoneLimit'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF(post,apply,_delete,action,Dollarlocation,propertylist,everyoneLimit,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation = function comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var messagePeriodproperties = req.swagger.params['message.properties'].value;
  var messageBoxSizeLimit = req.swagger.params['messageBoxSizeLimit'].value;
  var messageCountLimit = req.swagger.params['messageCountLimit'].value;
  var notifyFailure = req.swagger.params['notifyFailure'].value;
  var failureMessageFrom = req.swagger.params['failureMessageFrom'].value;
  var failureTemplatePath = req.swagger.params['failureTemplatePath'].value;
  var maxRetries = req.swagger.params['maxRetries'].value;
  var minWaitBetweenRetries = req.swagger.params['minWaitBetweenRetries'].value;
  var countUpdatePoolSize = req.swagger.params['countUpdatePoolSize'].value;
  var inboxPeriodpath = req.swagger.params['inbox.path'].value;
  var sentitemsPeriodpath = req.swagger.params['sentitems.path'].value;
  var supportAttachments = req.swagger.params['supportAttachments'].value;
  var supportGroupMessaging = req.swagger.params['supportGroupMessaging'].value;
  var maxTotalRecipients = req.swagger.params['maxTotalRecipients'].value;
  var batchSize = req.swagger.params['batchSize'].value;
  var maxTotalAttachmentSize = req.swagger.params['maxTotalAttachmentSize'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  var allowedAttachmentTypes = req.swagger.params['allowedAttachmentTypes'].value;
  var serviceSelector = req.swagger.params['serviceSelector'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  Configmgr.comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation(post,apply,_delete,action,Dollarlocation,propertylist,messagePeriodproperties,messageBoxSizeLimit,messageCountLimit,notifyFailure,failureMessageFrom,failureTemplatePath,maxRetries,minWaitBetweenRetries,countUpdatePoolSize,inboxPeriodpath,sentitemsPeriodpath,supportAttachments,supportGroupMessaging,maxTotalRecipients,batchSize,maxTotalAttachmentSize,attachmentTypeBlacklist,allowedAttachmentTypes,serviceSelector,fieldWhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen = function comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var resourceTypePeriodfilters = req.swagger.params['resourceType.filters'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen(post,apply,_delete,action,Dollarlocation,propertylist,resourceTypePeriodfilters,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialModerationDashboardApiModerationDashboardSocial = function comAdobeCqSocialModerationDashboardApiModerationDashboardSocial (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialModerationDashboardApiModerationDashboardSocial(post,apply,_delete,action,Dollarlocation,propertylist,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen = function comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen(post,apply,_delete,action,Dollarlocation,propertylist,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci = function comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var resourceTypePeriodfilters = req.swagger.params['resourceType.filters'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci(post,apply,_delete,action,Dollarlocation,propertylist,resourceTypePeriodfilters,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialNotificationsImplMentionsRouter = function comAdobeCqSocialNotificationsImplMentionsRouter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  Configmgr.comAdobeCqSocialNotificationsImplMentionsRouter(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics,eventPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialNotificationsImplNotificationManagerImpl = function comAdobeCqSocialNotificationsImplNotificationManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxPeriodunreadPeriodnotificationPeriodcount = req.swagger.params['max.unread.notification.count'].value;
  Configmgr.comAdobeCqSocialNotificationsImplNotificationManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,maxPeriodunreadPeriodnotificationPeriodcount)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialNotificationsImplNotificationsRouter = function comAdobeCqSocialNotificationsImplNotificationsRouter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  Configmgr.comAdobeCqSocialNotificationsImplNotificationsRouter(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics,eventPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic = function comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI = function comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval = req.swagger.params['cq.social.reporting.analytics.polling.importer.interval'].value;
  var cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize = req.swagger.params['cq.social.reporting.analytics.polling.importer.pageSize'].value;
  Configmgr.comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval,cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM = function comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var reportPeriodfetchPerioddelay = req.swagger.params['report.fetch.delay'].value;
  Configmgr.comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM(post,apply,_delete,action,Dollarlocation,propertylist,reportPeriodfetchPerioddelay)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS = function comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping = req.swagger.params['cq.social.console.analytics.sites.mapping'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi = function comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var attachmentTypeBlacklist = req.swagger.params['attachmentTypeBlacklist'].value;
  Configmgr.comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,attachmentTypeBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet = function comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var slingPeriodservletPeriodextensions = req.swagger.params['sling.servlet.extensions'].value;
  Configmgr.comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodselectors,slingPeriodservletPeriodextensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet = function comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var slingPeriodservletPeriodextensions = req.swagger.params['sling.servlet.extensions'].value;
  Configmgr.comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodselectors,slingPeriodservletPeriodextensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialScoringImplScoringEventListener = function comAdobeCqSocialScoringImplScoringEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  Configmgr.comAdobeCqSocialScoringImplScoringEventListener(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics,eventPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl = function comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enableFallback = req.swagger.params['enableFallback'].value;
  Configmgr.comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl(post,apply,_delete,action,Dollarlocation,propertylist,enableFallback)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSiteEndpointsImplSiteOperationService = function comAdobeCqSocialSiteEndpointsImplSiteOperationService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fieldWhitelist = req.swagger.params['fieldWhitelist'].value;
  var sitePathFilters = req.swagger.params['sitePathFilters'].value;
  var sitePackageGroup = req.swagger.params['sitePackageGroup'].value;
  Configmgr.comAdobeCqSocialSiteEndpointsImplSiteOperationService(post,apply,_delete,action,Dollarlocation,propertylist,fieldWhitelist,sitePathFilters,sitePackageGroup)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm = function comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents = req.swagger.params['cq.social.console.analytics.components'].value;
  Configmgr.comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSiteImplSiteConfiguratorImpl = function comAdobeCqSocialSiteImplSiteConfiguratorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var componentsUsingTags = req.swagger.params['componentsUsingTags'].value;
  Configmgr.comAdobeCqSocialSiteImplSiteConfiguratorImpl(post,apply,_delete,action,Dollarlocation,propertylist,componentsUsingTags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSrpImplSocialSolrConnector = function comAdobeCqSocialSrpImplSocialSolrConnector (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var srpPeriodtype = req.swagger.params['srp.type'].value;
  Configmgr.comAdobeCqSocialSrpImplSocialSolrConnector(post,apply,_delete,action,Dollarlocation,propertylist,srpPeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSyncImplDiffChangesObserver = function comAdobeCqSocialSyncImplDiffChangesObserver (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var agentName = req.swagger.params['agentName'].value;
  var diffPath = req.swagger.params['diffPath'].value;
  var propertyNames = req.swagger.params['propertyNames'].value;
  Configmgr.comAdobeCqSocialSyncImplDiffChangesObserver(post,apply,_delete,action,Dollarlocation,propertylist,enabled,agentName,diffPath,propertyNames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSyncImplGroupSyncListenerImpl = function comAdobeCqSocialSyncImplGroupSyncListenerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var nodetypes = req.swagger.params['nodetypes'].value;
  var ignorableprops = req.swagger.params['ignorableprops'].value;
  var ignorablenodes = req.swagger.params['ignorablenodes'].value;
  var enabled = req.swagger.params['enabled'].value;
  var distfolders = req.swagger.params['distfolders'].value;
  Configmgr.comAdobeCqSocialSyncImplGroupSyncListenerImpl(post,apply,_delete,action,Dollarlocation,propertylist,nodetypes,ignorableprops,ignorablenodes,enabled,distfolders)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSyncImplPublisherSyncServiceImpl = function comAdobeCqSocialSyncImplPublisherSyncServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var activeRunModes = req.swagger.params['activeRunModes'].value;
  Configmgr.comAdobeCqSocialSyncImplPublisherSyncServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,activeRunModes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialSyncImplUserSyncListenerImpl = function comAdobeCqSocialSyncImplUserSyncListenerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var nodetypes = req.swagger.params['nodetypes'].value;
  var ignorableprops = req.swagger.params['ignorableprops'].value;
  var ignorablenodes = req.swagger.params['ignorablenodes'].value;
  var enabled = req.swagger.params['enabled'].value;
  var distfolders = req.swagger.params['distfolders'].value;
  Configmgr.comAdobeCqSocialSyncImplUserSyncListenerImpl(post,apply,_delete,action,Dollarlocation,propertylist,nodetypes,ignorableprops,ignorablenodes,enabled,distfolders)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialTranslationImplTranslationServiceConfigManager = function comAdobeCqSocialTranslationImplTranslationServiceConfigManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var translatePeriodlanguage = req.swagger.params['translate.language'].value;
  var translatePerioddisplay = req.swagger.params['translate.display'].value;
  var translatePeriodattribution = req.swagger.params['translate.attribution'].value;
  var translatePeriodcaching = req.swagger.params['translate.caching'].value;
  var translatePeriodsmartPeriodrendering = req.swagger.params['translate.smart.rendering'].value;
  var translatePeriodcachingPeriodduration = req.swagger.params['translate.caching.duration'].value;
  var translatePeriodsessionPeriodsavePeriodinterval = req.swagger.params['translate.session.save.interval'].value;
  var translatePeriodsessionPeriodsavePeriodbatchLimit = req.swagger.params['translate.session.save.batchLimit'].value;
  Configmgr.comAdobeCqSocialTranslationImplTranslationServiceConfigManager(post,apply,_delete,action,Dollarlocation,propertylist,translatePeriodlanguage,translatePerioddisplay,translatePeriodattribution,translatePeriodcaching,translatePeriodsmartPeriodrendering,translatePeriodcachingPeriodduration,translatePeriodsessionPeriodsavePeriodinterval,translatePeriodsessionPeriodsavePeriodbatchLimit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialTranslationImplUGCLanguageDetector = function comAdobeCqSocialTranslationImplUGCLanguageDetector (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var translatePeriodlistenerPeriodtype = req.swagger.params['translate.listener.type'].value;
  var translatePeriodpropertyPeriodlist = req.swagger.params['translate.property.list'].value;
  var poolSize = req.swagger.params['poolSize'].value;
  var maxPoolSize = req.swagger.params['maxPoolSize'].value;
  var queueSize = req.swagger.params['queueSize'].value;
  var keepAliveTime = req.swagger.params['keepAliveTime'].value;
  Configmgr.comAdobeCqSocialTranslationImplUGCLanguageDetector(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics,eventPeriodfilter,translatePeriodlistenerPeriodtype,translatePeriodpropertyPeriodlist,poolSize,maxPoolSize,queueSize,keepAliveTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl = function comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var threadPoolSize = req.swagger.params['threadPoolSize'].value;
  var delayTime = req.swagger.params['delayTime'].value;
  var workerSleepTime = req.swagger.params['workerSleepTime'].value;
  Configmgr.comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,threadPoolSize,delayTime,workerSleepTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl = function comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var poolSize = req.swagger.params['poolSize'].value;
  var maxPoolSize = req.swagger.params['maxPoolSize'].value;
  var queueSize = req.swagger.params['queueSize'].value;
  var keepAliveTime = req.swagger.params['keepAliveTime'].value;
  Configmgr.comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,poolSize,maxPoolSize,queueSize,keepAliveTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl = function comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var isPrimaryPublisher = req.swagger.params['isPrimaryPublisher'].value;
  Configmgr.comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl(post,apply,_delete,action,Dollarlocation,propertylist,isPrimaryPublisher)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseImplSocialUtilsImpl = function comAdobeCqSocialUgcbaseImplSocialUtilsImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var legacyCloudUGCPathMapping = req.swagger.params['legacyCloudUGCPathMapping'].value;
  Configmgr.comAdobeCqSocialUgcbaseImplSocialUtilsImpl(post,apply,_delete,action,Dollarlocation,propertylist,legacyCloudUGCPathMapping)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl = function comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var automoderationPeriodsequence = req.swagger.params['automoderation.sequence'].value;
  var automoderationPeriodonfailurestop = req.swagger.params['automoderation.onfailurestop'].value;
  Configmgr.comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl(post,apply,_delete,action,Dollarlocation,propertylist,automoderationPeriodsequence,automoderationPeriodonfailurestop)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseModerationImplSentimentProcess = function comAdobeCqSocialUgcbaseModerationImplSentimentProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var watchwordsPeriodpositive = req.swagger.params['watchwords.positive'].value;
  var watchwordsPeriodnegative = req.swagger.params['watchwords.negative'].value;
  var watchwordsPeriodpath = req.swagger.params['watchwords.path'].value;
  var sentimentPeriodpath = req.swagger.params['sentiment.path'].value;
  Configmgr.comAdobeCqSocialUgcbaseModerationImplSentimentProcess(post,apply,_delete,action,Dollarlocation,propertylist,watchwordsPeriodpositive,watchwordsPeriodnegative,watchwordsPeriodpath,sentimentPeriodpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli = function comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultPeriodattachmentPeriodtypePeriodblacklist = req.swagger.params['default.attachment.type.blacklist'].value;
  var baselinePeriodattachmentPeriodtypePeriodblacklist = req.swagger.params['baseline.attachment.type.blacklist'].value;
  Configmgr.comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli(post,apply,_delete,action,Dollarlocation,propertylist,defaultPeriodattachmentPeriodtypePeriodblacklist,baselinePeriodattachmentPeriodtypePeriodblacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl = function comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var parameterPeriodwhitelist = req.swagger.params['parameter.whitelist'].value;
  var parameterPeriodwhitelistPeriodprefixes = req.swagger.params['parameter.whitelist.prefixes'].value;
  var binaryPeriodparameterPeriodwhitelist = req.swagger.params['binary.parameter.whitelist'].value;
  var modifierPeriodwhitelist = req.swagger.params['modifier.whitelist'].value;
  var operationPeriodwhitelist = req.swagger.params['operation.whitelist'].value;
  var operationPeriodwhitelistPeriodprefixes = req.swagger.params['operation.whitelist.prefixes'].value;
  var typehintPeriodwhitelist = req.swagger.params['typehint.whitelist'].value;
  var resourcetypePeriodwhitelist = req.swagger.params['resourcetype.whitelist'].value;
  Configmgr.comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,parameterPeriodwhitelist,parameterPeriodwhitelistPeriodprefixes,binaryPeriodparameterPeriodwhitelist,modifierPeriodwhitelist,operationPeriodwhitelist,operationPeriodwhitelistPeriodprefixes,typehintPeriodwhitelist,resourcetypePeriodwhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet = function comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodextensions = req.swagger.params['sling.servlet.extensions'].value;
  var slingPeriodservletPeriodpaths = req.swagger.params['sling.servlet.paths'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  Configmgr.comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodextensions,slingPeriodservletPeriodpaths,slingPeriodservletPeriodmethods)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqSocialUserImplTransportHttpToPublisher = function comAdobeCqSocialUserImplTransportHttpToPublisher (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enable = req.swagger.params['enable'].value;
  var agentPeriodconfiguration = req.swagger.params['agent.configuration'].value;
  var contextPeriodpath = req.swagger.params['context.path'].value;
  var disabledPeriodcipherPeriodsuites = req.swagger.params['disabled.cipher.suites'].value;
  var enabledPeriodcipherPeriodsuites = req.swagger.params['enabled.cipher.suites'].value;
  Configmgr.comAdobeCqSocialUserImplTransportHttpToPublisher(post,apply,_delete,action,Dollarlocation,propertylist,enable,agentPeriodconfiguration,contextPeriodpath,disabledPeriodcipherPeriodsuites,enabledPeriodcipherPeriodsuites)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact = function comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var resourcePeriodtypes = req.swagger.params['resource.types'].value;
  Configmgr.comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact(post,apply,_delete,action,Dollarlocation,propertylist,resourcePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqUpgradesCleanupImplUpgradeContentCleanup = function comAdobeCqUpgradesCleanupImplUpgradeContentCleanup (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var deletePeriodpathPeriodregexps = req.swagger.params['delete.path.regexps'].value;
  var deletePeriodsql2Periodquery = req.swagger.params['delete.sql2.query'].value;
  Configmgr.comAdobeCqUpgradesCleanupImplUpgradeContentCleanup(post,apply,_delete,action,Dollarlocation,propertylist,deletePeriodpathPeriodregexps,deletePeriodsql2Periodquery)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup = function comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var deletePeriodnamePeriodregexps = req.swagger.params['delete.name.regexps'].value;
  Configmgr.comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup(post,apply,_delete,action,Dollarlocation,propertylist,deletePeriodnamePeriodregexps)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService = function comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var threshold = req.swagger.params['threshold'].value;
  var jobTopicName = req.swagger.params['jobTopicName'].value;
  var emailEnabled = req.swagger.params['emailEnabled'].value;
  Configmgr.comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService(post,apply,_delete,action,Dollarlocation,propertylist,threshold,jobTopicName,emailEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask = function comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var jobPeriodpurgePeriodthreshold = req.swagger.params['job.purge.threshold'].value;
  var jobPeriodpurgePeriodmaxPeriodjobs = req.swagger.params['job.purge.max.jobs'].value;
  Configmgr.comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,jobPeriodpurgePeriodthreshold,jobPeriodpurgePeriodmaxPeriodjobs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService = function comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var threshold = req.swagger.params['threshold'].value;
  var jobTopicName = req.swagger.params['jobTopicName'].value;
  var emailEnabled = req.swagger.params['emailEnabled'].value;
  Configmgr.comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService(post,apply,_delete,action,Dollarlocation,propertylist,threshold,jobTopicName,emailEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService = function comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var threshold = req.swagger.params['threshold'].value;
  var jobTopicName = req.swagger.params['jobTopicName'].value;
  var emailEnabled = req.swagger.params['emailEnabled'].value;
  Configmgr.comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService(post,apply,_delete,action,Dollarlocation,propertylist,threshold,jobTopicName,emailEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmLaunchesImplLaunchesEventHandler = function comAdobeCqWcmLaunchesImplLaunchesEventHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize = req.swagger.params['launches.eventhandler.threadpool.maxsize'].value;
  var launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority = req.swagger.params['launches.eventhandler.threadpool.priority'].value;
  var launchesPeriodeventhandlerPeriodupdatelastmodification = req.swagger.params['launches.eventhandler.updatelastmodification'].value;
  Configmgr.comAdobeCqWcmLaunchesImplLaunchesEventHandler(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter,launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize,launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority,launchesPeriodeventhandlerPeriodupdatelastmodification)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator = function comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist = req.swagger.params['cq.wcm.qrcode.servlet.whitelist'].value;
  Configmgr.comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl = function comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var size = req.swagger.params['size'].value;
  Configmgr.comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl(post,apply,_delete,action,Dollarlocation,propertylist,size)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl = function comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var syncTranslationStatePeriodschedulingFormat = req.swagger.params['syncTranslationState.schedulingFormat'].value;
  var schedulingRepeatTranslationPeriodschedulingFormat = req.swagger.params['schedulingRepeatTranslation.schedulingFormat'].value;
  var syncTranslationStatePeriodlockTimeoutInMinutes = req.swagger.params['syncTranslationState.lockTimeoutInMinutes'].value;
  var exportPeriodformat = req.swagger.params['export.format'].value;
  Configmgr.comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl(post,apply,_delete,action,Dollarlocation,propertylist,syncTranslationStatePeriodschedulingFormat,schedulingRepeatTranslationPeriodschedulingFormat,syncTranslationStatePeriodlockTimeoutInMinutes,exportPeriodformat)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService = function comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var portalPeriodoutboxes = req.swagger.params['portal.outboxes'].value;
  var draftPerioddataPeriodservice = req.swagger.params['draft.data.service'].value;
  var draftPeriodmetadataPeriodservice = req.swagger.params['draft.metadata.service'].value;
  var submitPerioddataPeriodservice = req.swagger.params['submit.data.service'].value;
  var submitPeriodmetadataPeriodservice = req.swagger.params['submit.metadata.service'].value;
  var pendingSignPerioddataPeriodservice = req.swagger.params['pendingSign.data.service'].value;
  var pendingSignPeriodmetadataPeriodservice = req.swagger.params['pendingSign.metadata.service'].value;
  Configmgr.comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService(post,apply,_delete,action,Dollarlocation,propertylist,portalPeriodoutboxes,draftPerioddataPeriodservice,draftPeriodmetadataPeriodservice,submitPerioddataPeriodservice,submitPeriodmetadataPeriodservice,pendingSignPerioddataPeriodservice,pendingSignPeriodmetadataPeriodservice)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeFdFpConfigFormsPortalSchedulerService = function comAdobeFdFpConfigFormsPortalSchedulerService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var formportalPeriodinterval = req.swagger.params['formportal.interval'].value;
  Configmgr.comAdobeFdFpConfigFormsPortalSchedulerService(post,apply,_delete,action,Dollarlocation,propertylist,formportalPeriodinterval)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeFormsCommonServiceImplDefaultDataProvider = function comAdobeFormsCommonServiceImplDefaultDataProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var alloweddataFileLocations = req.swagger.params['alloweddataFileLocations'].value;
  Configmgr.comAdobeFormsCommonServiceImplDefaultDataProvider(post,apply,_delete,action,Dollarlocation,propertylist,alloweddataFileLocations)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp = function comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var tempStorageConfig = req.swagger.params['tempStorageConfig'].value;
  Configmgr.comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp(post,apply,_delete,action,Dollarlocation,propertylist,tempStorageConfig)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeFormsCommonServletTempCleanUpTask = function comAdobeFormsCommonServletTempCleanUpTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var duration for Temporary Storage = req.swagger.params['Duration for Temporary Storage'].value;
  var duration for Anonymous Storage = req.swagger.params['Duration for Anonymous Storage'].value;
  Configmgr.comAdobeFormsCommonServletTempCleanUpTask(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,duration for Temporary Storage,duration for Anonymous Storage)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAcpPlatformPlatformServlet = function comAdobeGraniteAcpPlatformPlatformServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var queryPeriodlimit = req.swagger.params['query.limit'].value;
  var filePeriodtypePeriodextensionPeriodmap = req.swagger.params['file.type.extension.map'].value;
  Configmgr.comAdobeGraniteAcpPlatformPlatformServlet(post,apply,_delete,action,Dollarlocation,propertylist,queryPeriodlimit,filePeriodtypePeriodextensionPeriodmap)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteActivitystreamsImplActivityManagerImpl = function comAdobeGraniteActivitystreamsImplActivityManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var aggregatePeriodrelationships = req.swagger.params['aggregate.relationships'].value;
  var aggregatePerioddescendPeriodvirtual = req.swagger.params['aggregate.descend.virtual'].value;
  Configmgr.comAdobeGraniteActivitystreamsImplActivityManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,aggregatePeriodrelationships,aggregatePerioddescendPeriodvirtual)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAnalyzerBaseSystemStatusServlet = function comAdobeGraniteAnalyzerBaseSystemStatusServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var disabled = req.swagger.params['disabled'].value;
  Configmgr.comAdobeGraniteAnalyzerBaseSystemStatusServlet(post,apply,_delete,action,Dollarlocation,propertylist,disabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet = function comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var disabled = req.swagger.params['disabled'].value;
  Configmgr.comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet(post,apply,_delete,action,Dollarlocation,propertylist,disabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteApicontrollerFilterResolverHookFactory = function comAdobeGraniteApicontrollerFilterResolverHookFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodcqPeriodcdnPeriodcdnRewriter = req.swagger.params['com.adobe.cq.cdn.cdn-rewriter'].value;
  var comPeriodadobePeriodcqPeriodcloudConfigPeriodcomponents = req.swagger.params['com.adobe.cq.cloud-config.components'].value;
  var comPeriodadobePeriodcqPeriodcloudConfigPeriodcore = req.swagger.params['com.adobe.cq.cloud-config.core'].value;
  var comPeriodadobePeriodcqPeriodcloudConfigPeriodui = req.swagger.params['com.adobe.cq.cloud-config.ui'].value;
  var comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodeditor = req.swagger.params['com.adobe.cq.com.adobe.cq.editor'].value;
  var comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodcore = req.swagger.params['com.adobe.cq.com.adobe.cq.projects.core'].value;
  var comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodwcmPeriodcore = req.swagger.params['com.adobe.cq.com.adobe.cq.projects.wcm.core'].value;
  var comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPerioduiPeriodcommons = req.swagger.params['com.adobe.cq.com.adobe.cq.ui.commons'].value;
  var comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodwcmPeriodstyle = req.swagger.params['com.adobe.cq.com.adobe.cq.wcm.style'].value;
  var comPeriodadobePeriodcqPeriodcqActivitymapIntegration = req.swagger.params['com.adobe.cq.cq-activitymap-integration'].value;
  var comPeriodadobePeriodcqPeriodcqContexthubCommons = req.swagger.params['com.adobe.cq.cq-contexthub-commons'].value;
  var comPeriodadobePeriodcqPeriodcqDtm = req.swagger.params['com.adobe.cq.cq-dtm'].value;
  var comPeriodadobePeriodcqPeriodcqHealthcheck = req.swagger.params['com.adobe.cq.cq-healthcheck'].value;
  var comPeriodadobePeriodcqPeriodcqMultisiteTargeting = req.swagger.params['com.adobe.cq.cq-multisite-targeting'].value;
  var comPeriodadobePeriodcqPeriodcqPreUpgradeCleanup = req.swagger.params['com.adobe.cq.cq-pre-upgrade-cleanup'].value;
  var comPeriodadobePeriodcqPeriodcqProductInfoProvider = req.swagger.params['com.adobe.cq.cq-product-info-provider'].value;
  var comPeriodadobePeriodcqPeriodcqRestSites = req.swagger.params['com.adobe.cq.cq-rest-sites'].value;
  var comPeriodadobePeriodcqPeriodcqSecurityHc = req.swagger.params['com.adobe.cq.cq-security-hc'].value;
  var comPeriodadobePeriodcqPerioddamPeriodcqDamSvgHandler = req.swagger.params['com.adobe.cq.dam.cq-dam-svg-handler'].value;
  var comPeriodadobePeriodcqPerioddamPeriodcqScene7Imaging = req.swagger.params['com.adobe.cq.dam.cq-scene7-imaging'].value;
  var comPeriodadobePeriodcqPerioddtmReactorPeriodcore = req.swagger.params['com.adobe.cq.dtm-reactor.core'].value;
  var comPeriodadobePeriodcqPerioddtmReactorPeriodui = req.swagger.params['com.adobe.cq.dtm-reactor.ui'].value;
  var comPeriodadobePeriodcqPeriodexpJspelResolver = req.swagger.params['com.adobe.cq.exp-jspel-resolver'].value;
  var comPeriodadobePeriodcqPeriodinboxPeriodcqInbox = req.swagger.params['com.adobe.cq.inbox.cq-inbox'].value;
  var comPeriodadobePeriodcqPeriodjsonSchemaParser = req.swagger.params['com.adobe.cq.json-schema-parser'].value;
  var comPeriodadobePeriodcqPeriodmediaPeriodcqMediaPublishingDpsFpCore = req.swagger.params['com.adobe.cq.media.cq-media-publishing-dps-fp-core'].value;
  var comPeriodadobePeriodcqPeriodmobilePeriodcqMobileCaas = req.swagger.params['com.adobe.cq.mobile.cq-mobile-caas'].value;
  var comPeriodadobePeriodcqPeriodmobilePeriodcqMobileIndexBuilder = req.swagger.params['com.adobe.cq.mobile.cq-mobile-index-builder'].value;
  var comPeriodadobePeriodcqPeriodmobilePeriodcqMobilePhonegapBuild = req.swagger.params['com.adobe.cq.mobile.cq-mobile-phonegap-build'].value;
  var comPeriodadobePeriodcqPeriodmyspell = req.swagger.params['com.adobe.cq.myspell'].value;
  var comPeriodadobePeriodcqPeriodsamplePeriodwePeriodretailPeriodcore = req.swagger.params['com.adobe.cq.sample.we.retail.core'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPerioddcc = req.swagger.params['com.adobe.cq.screens.com.adobe.cq.screens.dcc'].value;
  var comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPeriodmqPeriodcore = req.swagger.params['com.adobe.cq.screens.com.adobe.cq.screens.mq.core'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialAsProvider = req.swagger.params['com.adobe.cq.social.cq-social-as-provider'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialBadgingBasicImpl = req.swagger.params['com.adobe.cq.social.cq-social-badging-basic-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialBadgingImpl = req.swagger.params['com.adobe.cq.social.cq-social-badging-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialCalendarImpl = req.swagger.params['com.adobe.cq.social.cq-social-calendar-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialContentFragmentsImpl = req.swagger.params['com.adobe.cq.social.cq-social-content-fragments-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialEnablementImpl = req.swagger.params['com.adobe.cq.social.cq-social-enablement-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialGraphImpl = req.swagger.params['com.adobe.cq.social.cq-social-graph-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialIdeationImpl = req.swagger.params['com.adobe.cq.social.cq-social-ideation-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialJcrProvider = req.swagger.params['com.adobe.cq.social.cq-social-jcr-provider'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialMembersImpl = req.swagger.params['com.adobe.cq.social.cq-social-members-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialMsProvider = req.swagger.params['com.adobe.cq.social.cq-social-ms-provider'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialNotificationsChannelsWeb = req.swagger.params['com.adobe.cq.social.cq-social-notifications-channels-web'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialNotificationsImpl = req.swagger.params['com.adobe.cq.social.cq-social-notifications-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialRdbProvider = req.swagger.params['com.adobe.cq.social.cq-social-rdb-provider'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScfImpl = req.swagger.params['com.adobe.cq.social.cq-social-scf-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScoringBasicImpl = req.swagger.params['com.adobe.cq.social.cq-social-scoring-basic-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScoringImpl = req.swagger.params['com.adobe.cq.social.cq-social-scoring-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialServiceusersImpl = req.swagger.params['com.adobe.cq.social.cq-social-serviceusers-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialSrpImpl = req.swagger.params['com.adobe.cq.social.cq-social-srp-impl'].value;
  var comPeriodadobePeriodcqPeriodsocialPeriodcqSocialUgcbaseImpl = req.swagger.params['com.adobe.cq.social.cq-social-ugcbase-impl'].value;
  var comPeriodadobePerioddamPeriodcqDamCfmImpl = req.swagger.params['com.adobe.dam.cq-dam-cfm-impl'].value;
  var comPeriodadobePeriodformsPeriodfoundationFormsFoundationBase = req.swagger.params['com.adobe.forms.foundation-forms-foundation-base'].value;
  var comPeriodadobePeriodgranitePeriodapicontroller = req.swagger.params['com.adobe.granite.apicontroller'].value;
  var comPeriodadobePeriodgranitePeriodassetPeriodcore = req.swagger.params['com.adobe.granite.asset.core'].value;
  var comPeriodadobePeriodgranitePeriodauthPeriodsso = req.swagger.params['com.adobe.granite.auth.sso'].value;
  var comPeriodadobePeriodgranitePeriodbundlesPeriodhcPeriodimpl = req.swagger.params['com.adobe.granite.bundles.hc.impl'].value;
  var comPeriodadobePeriodgranitePeriodcompatRouter = req.swagger.params['com.adobe.granite.compat-router'].value;
  var comPeriodadobePeriodgranitePeriodconf = req.swagger.params['com.adobe.granite.conf'].value;
  var comPeriodadobePeriodgranitePeriodconfPerioduiPeriodcore = req.swagger.params['com.adobe.granite.conf.ui.core'].value;
  var comPeriodadobePeriodgranitePeriodcors = req.swagger.params['com.adobe.granite.cors'].value;
  var comPeriodadobePeriodgranitePeriodcrxExplorer = req.swagger.params['com.adobe.granite.crx-explorer'].value;
  var comPeriodadobePeriodgranitePeriodcrxdeLite = req.swagger.params['com.adobe.granite.crxde-lite'].value;
  var comPeriodadobePeriodgranitePeriodcryptoPeriodconfig = req.swagger.params['com.adobe.granite.crypto.config'].value;
  var comPeriodadobePeriodgranitePeriodcryptoPeriodextension = req.swagger.params['com.adobe.granite.crypto.extension'].value;
  var comPeriodadobePeriodgranitePeriodcryptoPeriodfile = req.swagger.params['com.adobe.granite.crypto.file'].value;
  var comPeriodadobePeriodgranitePeriodcryptoPeriodjcr = req.swagger.params['com.adobe.granite.crypto.jcr'].value;
  var comPeriodadobePeriodgranitePeriodcsrf = req.swagger.params['com.adobe.granite.csrf'].value;
  var comPeriodadobePeriodgranitePerioddistributionPeriodcore = req.swagger.params['com.adobe.granite.distribution.core'].value;
  var comPeriodadobePeriodgranitePerioddropwizardPeriodmetrics = req.swagger.params['com.adobe.granite.dropwizard.metrics'].value;
  var comPeriodadobePeriodgranitePeriodfragsPeriodimpl = req.swagger.params['com.adobe.granite.frags.impl'].value;
  var comPeriodadobePeriodgranitePeriodgibson = req.swagger.params['com.adobe.granite.gibson'].value;
  var comPeriodadobePeriodgranitePeriodinfocollector = req.swagger.params['com.adobe.granite.infocollector'].value;
  var comPeriodadobePeriodgranitePeriodinstallerPeriodfactoryPeriodpackages = req.swagger.params['com.adobe.granite.installer.factory.packages'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodssl = req.swagger.params['com.adobe.granite.jetty.ssl'].value;
  var comPeriodadobePeriodgranitePeriodjobsPeriodasync = req.swagger.params['com.adobe.granite.jobs.async'].value;
  var comPeriodadobePeriodgranitePeriodmaintenancePeriodoak = req.swagger.params['com.adobe.granite.maintenance.oak'].value;
  var comPeriodadobePeriodgranitePeriodmonitoringPeriodcore = req.swagger.params['com.adobe.granite.monitoring.core'].value;
  var comPeriodadobePeriodgranitePeriodqueries = req.swagger.params['com.adobe.granite.queries'].value;
  var comPeriodadobePeriodgranitePeriodreplicationPeriodhcPeriodimpl = req.swagger.params['com.adobe.granite.replication.hc.impl'].value;
  var comPeriodadobePeriodgranitePeriodrepositoryPeriodchecker = req.swagger.params['com.adobe.granite.repository.checker'].value;
  var comPeriodadobePeriodgranitePeriodrepositoryPeriodhcPeriodimpl = req.swagger.params['com.adobe.granite.repository.hc.impl'].value;
  var comPeriodadobePeriodgranitePeriodrestPeriodassets = req.swagger.params['com.adobe.granite.rest.assets'].value;
  var comPeriodadobePeriodgranitePeriodsecurityPeriodui = req.swagger.params['com.adobe.granite.security.ui'].value;
  var comPeriodadobePeriodgranitePeriodstartup = req.swagger.params['com.adobe.granite.startup'].value;
  var comPeriodadobePeriodgranitePeriodtagsoup = req.swagger.params['com.adobe.granite.tagsoup'].value;
  var comPeriodadobePeriodgranitePeriodtaskmanagementPeriodcore = req.swagger.params['com.adobe.granite.taskmanagement.core'].value;
  var comPeriodadobePeriodgranitePeriodtaskmanagementPeriodworkflow = req.swagger.params['com.adobe.granite.taskmanagement.workflow'].value;
  var comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodcompilerPeriodless = req.swagger.params['com.adobe.granite.ui.clientlibs.compiler.less'].value;
  var comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodprocessorPeriodgcc = req.swagger.params['com.adobe.granite.ui.clientlibs.processor.gcc'].value;
  var comPeriodadobePeriodgranitePeriodwebconsolePeriodplugins = req.swagger.params['com.adobe.granite.webconsole.plugins'].value;
  var comPeriodadobePeriodgranitePeriodworkflowPeriodconsole = req.swagger.params['com.adobe.granite.workflow.console'].value;
  var comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodlinux = req.swagger.params['com.adobe.xmp.worker.files.native.fragment.linux'].value;
  var comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodmacosx = req.swagger.params['com.adobe.xmp.worker.files.native.fragment.macosx'].value;
  var comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodwin = req.swagger.params['com.adobe.xmp.worker.files.native.fragment.win'].value;
  var comPerioddayPeriodcommonsPeriodosgiPeriodwrapperPeriodsimpleJndi = req.swagger.params['com.day.commons.osgi.wrapper.simple-jndi'].value;
  var comPerioddayPeriodcqPeriodcqAuthhandler = req.swagger.params['com.day.cq.cq-authhandler'].value;
  var comPerioddayPeriodcqPeriodcqCompatConfigupdate = req.swagger.params['com.day.cq.cq-compat-configupdate'].value;
  var comPerioddayPeriodcqPeriodcqLicensebranding = req.swagger.params['com.day.cq.cq-licensebranding'].value;
  var comPerioddayPeriodcqPeriodcqNotifcationImpl = req.swagger.params['com.day.cq.cq-notifcation-impl'].value;
  var comPerioddayPeriodcqPeriodcqReplicationAudit = req.swagger.params['com.day.cq.cq-replication-audit'].value;
  var comPerioddayPeriodcqPeriodcqSearchExt = req.swagger.params['com.day.cq.cq-search-ext'].value;
  var comPerioddayPeriodcqPerioddamPeriodcqDamAnnotationPrint = req.swagger.params['com.day.cq.dam.cq-dam-annotation-print'].value;
  var comPerioddayPeriodcqPerioddamPeriodcqDamAssetUsage = req.swagger.params['com.day.cq.dam.cq-dam-asset-usage'].value;
  var comPerioddayPeriodcqPerioddamPeriodcqDamS7dam = req.swagger.params['com.day.cq.dam.cq-dam-s7dam'].value;
  var comPerioddayPeriodcqPerioddamPeriodcqDamSimilaritysearch = req.swagger.params['com.day.cq.dam.cq-dam-similaritysearch'].value;
  var comPerioddayPeriodcqPerioddamPerioddamWebdavSupport = req.swagger.params['com.day.cq.dam.dam-webdav-support'].value;
  var comPerioddayPeriodcqPeriodpreUpgradeTasks = req.swagger.params['com.day.cq.pre-upgrade-tasks'].value;
  var comPerioddayPeriodcqPeriodreplicationPeriodextensions = req.swagger.params['com.day.cq.replication.extensions'].value;
  var comPerioddayPeriodcqPeriodwcmPeriodcqMsmCore = req.swagger.params['com.day.cq.wcm.cq-msm-core'].value;
  var comPerioddayPeriodcqPeriodwcmPeriodcqWcmTranslation = req.swagger.params['com.day.cq.wcm.cq-wcm-translation'].value;
  var dayCommonsJrawio = req.swagger.params['day-commons-jrawio'].value;
  var orgPeriodapachePeriodariesPeriodjmxPeriodwhiteboard = req.swagger.params['org.apache.aries.jmx.whiteboard'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodsslfilter = req.swagger.params['org.apache.felix.http.sslfilter'].value;
  var orgPeriodapachePeriodfelixPeriodorgPeriodapachePeriodfelixPeriodthreaddump = req.swagger.params['org.apache.felix.org.apache.felix.threaddump'].value;
  var orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodds = req.swagger.params['org.apache.felix.webconsole.plugins.ds'].value;
  var orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodevent = req.swagger.params['org.apache.felix.webconsole.plugins.event'].value;
  var orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodmemoryusage = req.swagger.params['org.apache.felix.webconsole.plugins.memoryusage'].value;
  var orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodpackageadmin = req.swagger.params['org.apache.felix.webconsole.plugins.packageadmin'].value;
  var orgPeriodapachePeriodjackrabbitPeriodoakAuthLdap = req.swagger.params['org.apache.jackrabbit.oak-auth-ldap'].value;
  var orgPeriodapachePeriodjackrabbitPeriodoakSegmentTar = req.swagger.params['org.apache.jackrabbit.oak-segment-tar'].value;
  var orgPeriodapachePeriodjackrabbitPeriodoakSolrOsgi = req.swagger.params['org.apache.jackrabbit.oak-solr-osgi'].value;
  var orgPeriodapachePeriodslingPeriodbundleresourcePeriodimpl = req.swagger.params['org.apache.sling.bundleresource.impl'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodfsclassloader = req.swagger.params['org.apache.sling.commons.fsclassloader'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodwebconsole = req.swagger.params['org.apache.sling.commons.log.webconsole'].value;
  var orgPeriodapachePeriodslingPerioddatasource = req.swagger.params['org.apache.sling.datasource'].value;
  var orgPeriodapachePeriodslingPerioddiscoveryPeriodbase = req.swagger.params['org.apache.sling.discovery.base'].value;
  var orgPeriodapachePeriodslingPerioddiscoveryPeriodoak = req.swagger.params['org.apache.sling.discovery.oak'].value;
  var orgPeriodapachePeriodslingPerioddiscoveryPeriodsupport = req.swagger.params['org.apache.sling.discovery.support'].value;
  var orgPeriodapachePeriodslingPerioddistributionPeriodapi = req.swagger.params['org.apache.sling.distribution.api'].value;
  var orgPeriodapachePeriodslingPerioddistributionPeriodcore = req.swagger.params['org.apache.sling.distribution.core'].value;
  var orgPeriodapachePeriodslingPeriodextensionsPeriodwebconsolesecurityprovider = req.swagger.params['org.apache.sling.extensions.webconsolesecurityprovider'].value;
  var orgPeriodapachePeriodslingPeriodhcPeriodwebconsole = req.swagger.params['org.apache.sling.hc.webconsole'].value;
  var orgPeriodapachePeriodslingPeriodinstallerPeriodconsole = req.swagger.params['org.apache.sling.installer.console'].value;
  var orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodfile = req.swagger.params['org.apache.sling.installer.provider.file'].value;
  var orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodjcr = req.swagger.params['org.apache.sling.installer.provider.jcr'].value;
  var orgPeriodapachePeriodslingPeriodjcrPerioddavex = req.swagger.params['org.apache.sling.jcr.davex'].value;
  var orgPeriodapachePeriodslingPeriodjcrPeriodresourcesecurity = req.swagger.params['org.apache.sling.jcr.resourcesecurity'].value;
  var orgPeriodapachePeriodslingPeriodjmxPeriodprovider = req.swagger.params['org.apache.sling.jmx.provider'].value;
  var orgPeriodapachePeriodslingPeriodlaunchpadPeriodinstaller = req.swagger.params['org.apache.sling.launchpad.installer'].value;
  var orgPeriodapachePeriodslingPeriodmodelsPeriodimpl = req.swagger.params['org.apache.sling.models.impl'].value;
  var orgPeriodapachePeriodslingPeriodrepoinitPeriodparser = req.swagger.params['org.apache.sling.repoinit.parser'].value;
  var orgPeriodapachePeriodslingPeriodresourcePeriodinventory = req.swagger.params['org.apache.sling.resource.inventory'].value;
  var orgPeriodapachePeriodslingPeriodresourceresolver = req.swagger.params['org.apache.sling.resourceresolver'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodjavascript = req.swagger.params['org.apache.sling.scripting.javascript'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodjst = req.swagger.params['org.apache.sling.scripting.jst'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodprovider = req.swagger.params['org.apache.sling.scripting.sightly.js.provider'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodmodelsPeriodprovider = req.swagger.params['org.apache.sling.scripting.sightly.models.provider'].value;
  var orgPeriodapachePeriodslingPeriodsecurity = req.swagger.params['org.apache.sling.security'].value;
  var orgPeriodapachePeriodslingPeriodservletsPeriodcompat = req.swagger.params['org.apache.sling.servlets.compat'].value;
  var orgPeriodapachePeriodslingPeriodservletsPeriodget = req.swagger.params['org.apache.sling.servlets.get'].value;
  var orgPeriodapachePeriodslingPeriodstartupfilterPerioddisabler = req.swagger.params['org.apache.sling.startupfilter.disabler'].value;
  var orgPeriodapachePeriodslingPeriodtracer = req.swagger.params['org.apache.sling.tracer'].value;
  var wePeriodretailPeriodclientPeriodappPeriodcore = req.swagger.params['we.retail.client.app.core'].value;
  Configmgr.comAdobeGraniteApicontrollerFilterResolverHookFactory(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodcqPeriodcdnPeriodcdnRewriter,comPeriodadobePeriodcqPeriodcloudConfigPeriodcomponents,comPeriodadobePeriodcqPeriodcloudConfigPeriodcore,comPeriodadobePeriodcqPeriodcloudConfigPeriodui,comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodeditor,comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodcore,comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodwcmPeriodcore,comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPerioduiPeriodcommons,comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodwcmPeriodstyle,comPeriodadobePeriodcqPeriodcqActivitymapIntegration,comPeriodadobePeriodcqPeriodcqContexthubCommons,comPeriodadobePeriodcqPeriodcqDtm,comPeriodadobePeriodcqPeriodcqHealthcheck,comPeriodadobePeriodcqPeriodcqMultisiteTargeting,comPeriodadobePeriodcqPeriodcqPreUpgradeCleanup,comPeriodadobePeriodcqPeriodcqProductInfoProvider,comPeriodadobePeriodcqPeriodcqRestSites,comPeriodadobePeriodcqPeriodcqSecurityHc,comPeriodadobePeriodcqPerioddamPeriodcqDamSvgHandler,comPeriodadobePeriodcqPerioddamPeriodcqScene7Imaging,comPeriodadobePeriodcqPerioddtmReactorPeriodcore,comPeriodadobePeriodcqPerioddtmReactorPeriodui,comPeriodadobePeriodcqPeriodexpJspelResolver,comPeriodadobePeriodcqPeriodinboxPeriodcqInbox,comPeriodadobePeriodcqPeriodjsonSchemaParser,comPeriodadobePeriodcqPeriodmediaPeriodcqMediaPublishingDpsFpCore,comPeriodadobePeriodcqPeriodmobilePeriodcqMobileCaas,comPeriodadobePeriodcqPeriodmobilePeriodcqMobileIndexBuilder,comPeriodadobePeriodcqPeriodmobilePeriodcqMobilePhonegapBuild,comPeriodadobePeriodcqPeriodmyspell,comPeriodadobePeriodcqPeriodsamplePeriodwePeriodretailPeriodcore,comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPerioddcc,comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPeriodmqPeriodcore,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialAsProvider,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialBadgingBasicImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialBadgingImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialCalendarImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialContentFragmentsImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialEnablementImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialGraphImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialIdeationImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialJcrProvider,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialMembersImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialMsProvider,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialNotificationsChannelsWeb,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialNotificationsImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialRdbProvider,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScfImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScoringBasicImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScoringImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialServiceusersImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialSrpImpl,comPeriodadobePeriodcqPeriodsocialPeriodcqSocialUgcbaseImpl,comPeriodadobePerioddamPeriodcqDamCfmImpl,comPeriodadobePeriodformsPeriodfoundationFormsFoundationBase,comPeriodadobePeriodgranitePeriodapicontroller,comPeriodadobePeriodgranitePeriodassetPeriodcore,comPeriodadobePeriodgranitePeriodauthPeriodsso,comPeriodadobePeriodgranitePeriodbundlesPeriodhcPeriodimpl,comPeriodadobePeriodgranitePeriodcompatRouter,comPeriodadobePeriodgranitePeriodconf,comPeriodadobePeriodgranitePeriodconfPerioduiPeriodcore,comPeriodadobePeriodgranitePeriodcors,comPeriodadobePeriodgranitePeriodcrxExplorer,comPeriodadobePeriodgranitePeriodcrxdeLite,comPeriodadobePeriodgranitePeriodcryptoPeriodconfig,comPeriodadobePeriodgranitePeriodcryptoPeriodextension,comPeriodadobePeriodgranitePeriodcryptoPeriodfile,comPeriodadobePeriodgranitePeriodcryptoPeriodjcr,comPeriodadobePeriodgranitePeriodcsrf,comPeriodadobePeriodgranitePerioddistributionPeriodcore,comPeriodadobePeriodgranitePerioddropwizardPeriodmetrics,comPeriodadobePeriodgranitePeriodfragsPeriodimpl,comPeriodadobePeriodgranitePeriodgibson,comPeriodadobePeriodgranitePeriodinfocollector,comPeriodadobePeriodgranitePeriodinstallerPeriodfactoryPeriodpackages,comPeriodadobePeriodgranitePeriodjettyPeriodssl,comPeriodadobePeriodgranitePeriodjobsPeriodasync,comPeriodadobePeriodgranitePeriodmaintenancePeriodoak,comPeriodadobePeriodgranitePeriodmonitoringPeriodcore,comPeriodadobePeriodgranitePeriodqueries,comPeriodadobePeriodgranitePeriodreplicationPeriodhcPeriodimpl,comPeriodadobePeriodgranitePeriodrepositoryPeriodchecker,comPeriodadobePeriodgranitePeriodrepositoryPeriodhcPeriodimpl,comPeriodadobePeriodgranitePeriodrestPeriodassets,comPeriodadobePeriodgranitePeriodsecurityPeriodui,comPeriodadobePeriodgranitePeriodstartup,comPeriodadobePeriodgranitePeriodtagsoup,comPeriodadobePeriodgranitePeriodtaskmanagementPeriodcore,comPeriodadobePeriodgranitePeriodtaskmanagementPeriodworkflow,comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodcompilerPeriodless,comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodprocessorPeriodgcc,comPeriodadobePeriodgranitePeriodwebconsolePeriodplugins,comPeriodadobePeriodgranitePeriodworkflowPeriodconsole,comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodlinux,comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodmacosx,comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodwin,comPerioddayPeriodcommonsPeriodosgiPeriodwrapperPeriodsimpleJndi,comPerioddayPeriodcqPeriodcqAuthhandler,comPerioddayPeriodcqPeriodcqCompatConfigupdate,comPerioddayPeriodcqPeriodcqLicensebranding,comPerioddayPeriodcqPeriodcqNotifcationImpl,comPerioddayPeriodcqPeriodcqReplicationAudit,comPerioddayPeriodcqPeriodcqSearchExt,comPerioddayPeriodcqPerioddamPeriodcqDamAnnotationPrint,comPerioddayPeriodcqPerioddamPeriodcqDamAssetUsage,comPerioddayPeriodcqPerioddamPeriodcqDamS7dam,comPerioddayPeriodcqPerioddamPeriodcqDamSimilaritysearch,comPerioddayPeriodcqPerioddamPerioddamWebdavSupport,comPerioddayPeriodcqPeriodpreUpgradeTasks,comPerioddayPeriodcqPeriodreplicationPeriodextensions,comPerioddayPeriodcqPeriodwcmPeriodcqMsmCore,comPerioddayPeriodcqPeriodwcmPeriodcqWcmTranslation,dayCommonsJrawio,orgPeriodapachePeriodariesPeriodjmxPeriodwhiteboard,orgPeriodapachePeriodfelixPeriodhttpPeriodsslfilter,orgPeriodapachePeriodfelixPeriodorgPeriodapachePeriodfelixPeriodthreaddump,orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodds,orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodevent,orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodmemoryusage,orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodpackageadmin,orgPeriodapachePeriodjackrabbitPeriodoakAuthLdap,orgPeriodapachePeriodjackrabbitPeriodoakSegmentTar,orgPeriodapachePeriodjackrabbitPeriodoakSolrOsgi,orgPeriodapachePeriodslingPeriodbundleresourcePeriodimpl,orgPeriodapachePeriodslingPeriodcommonsPeriodfsclassloader,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodwebconsole,orgPeriodapachePeriodslingPerioddatasource,orgPeriodapachePeriodslingPerioddiscoveryPeriodbase,orgPeriodapachePeriodslingPerioddiscoveryPeriodoak,orgPeriodapachePeriodslingPerioddiscoveryPeriodsupport,orgPeriodapachePeriodslingPerioddistributionPeriodapi,orgPeriodapachePeriodslingPerioddistributionPeriodcore,orgPeriodapachePeriodslingPeriodextensionsPeriodwebconsolesecurityprovider,orgPeriodapachePeriodslingPeriodhcPeriodwebconsole,orgPeriodapachePeriodslingPeriodinstallerPeriodconsole,orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodfile,orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodjcr,orgPeriodapachePeriodslingPeriodjcrPerioddavex,orgPeriodapachePeriodslingPeriodjcrPeriodresourcesecurity,orgPeriodapachePeriodslingPeriodjmxPeriodprovider,orgPeriodapachePeriodslingPeriodlaunchpadPeriodinstaller,orgPeriodapachePeriodslingPeriodmodelsPeriodimpl,orgPeriodapachePeriodslingPeriodrepoinitPeriodparser,orgPeriodapachePeriodslingPeriodresourcePeriodinventory,orgPeriodapachePeriodslingPeriodresourceresolver,orgPeriodapachePeriodslingPeriodscriptingPeriodjavascript,orgPeriodapachePeriodslingPeriodscriptingPeriodjst,orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodprovider,orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodmodelsPeriodprovider,orgPeriodapachePeriodslingPeriodsecurity,orgPeriodapachePeriodslingPeriodservletsPeriodcompat,orgPeriodapachePeriodslingPeriodservletsPeriodget,orgPeriodapachePeriodslingPeriodstartupfilterPerioddisabler,orgPeriodapachePeriodslingPeriodtracer,wePeriodretailPeriodclientPeriodappPeriodcore)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthCertImplClientCertAuthHandler = function comAdobeGraniteAuthCertImplClientCertAuthHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.comAdobeGraniteAuthCertImplClientCertAuthHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthIms = function comAdobeGraniteAuthIms (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var configid = req.swagger.params['configid'].value;
  var scope = req.swagger.params['scope'].value;
  Configmgr.comAdobeGraniteAuthIms(post,apply,_delete,action,Dollarlocation,propertylist,configid,scope)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension = function comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  Configmgr.comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl = function comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var authPeriodimsPeriodclientPeriodsecret = req.swagger.params['auth.ims.client.secret'].value;
  var customizerPeriodtype = req.swagger.params['customizer.type'].value;
  Configmgr.comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl(post,apply,_delete,action,Dollarlocation,propertylist,authPeriodimsPeriodclientPeriodsecret,customizerPeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator = function comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  Configmgr.comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthImsImplIMSProviderImpl = function comAdobeGraniteAuthImsImplIMSProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  var oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl = req.swagger.params['oauth.provider.ims.authorization.url'].value;
  var oauthPeriodproviderPeriodimsPeriodtokenPeriodurl = req.swagger.params['oauth.provider.ims.token.url'].value;
  var oauthPeriodproviderPeriodimsPeriodprofilePeriodurl = req.swagger.params['oauth.provider.ims.profile.url'].value;
  var oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls = req.swagger.params['oauth.provider.ims.extended.details.urls'].value;
  var oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl = req.swagger.params['oauth.provider.ims.validate.token.url'].value;
  var oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty = req.swagger.params['oauth.provider.ims.session.property'].value;
  var oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid = req.swagger.params['oauth.provider.ims.service.token.client.id'].value;
  var oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret = req.swagger.params['oauth.provider.ims.service.token.client.secret'].value;
  var oauthPeriodproviderPeriodimsPeriodservicePeriodtoken = req.swagger.params['oauth.provider.ims.service.token'].value;
  var imsPeriodorgPeriodref = req.swagger.params['ims.org.ref'].value;
  var imsPeriodgroupPeriodmapping = req.swagger.params['ims.group.mapping'].value;
  var oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup = req.swagger.params['oauth.provider.ims.only.license.group'].value;
  Configmgr.comAdobeGraniteAuthImsImplIMSProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid,oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl,oauthPeriodproviderPeriodimsPeriodtokenPeriodurl,oauthPeriodproviderPeriodimsPeriodprofilePeriodurl,oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls,oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl,oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty,oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid,oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret,oauthPeriodproviderPeriodimsPeriodservicePeriodtoken,imsPeriodorgPeriodref,imsPeriodgroupPeriodmapping,oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthImsImplImsConfigProviderImpl = function comAdobeGraniteAuthImsImplImsConfigProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodconfigmanagerPeriodimsPeriodconfigid = req.swagger.params['oauth.configmanager.ims.configid'].value;
  var imsPeriodowningEntity = req.swagger.params['ims.owningEntity'].value;
  var aemPeriodinstanceId = req.swagger.params['aem.instanceId'].value;
  var imsPeriodserviceCode = req.swagger.params['ims.serviceCode'].value;
  Configmgr.comAdobeGraniteAuthImsImplImsConfigProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodconfigmanagerPeriodimsPeriodconfigid,imsPeriodowningEntity,aemPeriodinstanceId,imsPeriodserviceCode)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthAccesstokenProvider = function comAdobeGraniteAuthOauthAccesstokenProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var authPeriodtokenPeriodproviderPeriodtitle = req.swagger.params['auth.token.provider.title'].value;
  var authPeriodtokenPeriodproviderPerioddefaultPeriodclaims = req.swagger.params['auth.token.provider.default.claims'].value;
  var authPeriodtokenPeriodproviderPeriodendpoint = req.swagger.params['auth.token.provider.endpoint'].value;
  var authPeriodaccessPeriodtokenPeriodrequest = req.swagger.params['auth.access.token.request'].value;
  var authPeriodtokenPeriodproviderPeriodkeypairPeriodalias = req.swagger.params['auth.token.provider.keypair.alias'].value;
  var authPeriodtokenPeriodproviderPeriodconnPeriodtimeout = req.swagger.params['auth.token.provider.conn.timeout'].value;
  var authPeriodtokenPeriodproviderPeriodsoPeriodtimeout = req.swagger.params['auth.token.provider.so.timeout'].value;
  var authPeriodtokenPeriodproviderPeriodclientPeriodid = req.swagger.params['auth.token.provider.client.id'].value;
  var authPeriodtokenPeriodproviderPeriodscope = req.swagger.params['auth.token.provider.scope'].value;
  var authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken = req.swagger.params['auth.token.provider.reuse.access.token'].value;
  var authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl = req.swagger.params['auth.token.provider.relaxed.ssl'].value;
  var tokenPeriodrequestPeriodcustomizerPeriodtype = req.swagger.params['token.request.customizer.type'].value;
  var authPeriodtokenPeriodvalidatorPeriodtype = req.swagger.params['auth.token.validator.type'].value;
  Configmgr.comAdobeGraniteAuthOauthAccesstokenProvider(post,apply,_delete,action,Dollarlocation,propertylist,name,authPeriodtokenPeriodproviderPeriodtitle,authPeriodtokenPeriodproviderPerioddefaultPeriodclaims,authPeriodtokenPeriodproviderPeriodendpoint,authPeriodaccessPeriodtokenPeriodrequest,authPeriodtokenPeriodproviderPeriodkeypairPeriodalias,authPeriodtokenPeriodproviderPeriodconnPeriodtimeout,authPeriodtokenPeriodproviderPeriodsoPeriodtimeout,authPeriodtokenPeriodproviderPeriodclientPeriodid,authPeriodtokenPeriodproviderPeriodscope,authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken,authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl,tokenPeriodrequestPeriodcustomizerPeriodtype,authPeriodtokenPeriodvalidatorPeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplBearerAuthenticationHandler = function comAdobeGraniteAuthOauthImplBearerAuthenticationHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var oauthPeriodclientIdsPeriodallowed = req.swagger.params['oauth.clientIds.allowed'].value;
  var authPeriodbearerPeriodsyncPeriodims = req.swagger.params['auth.bearer.sync.ims'].value;
  var authPeriodtokenRequestParameter = req.swagger.params['auth.tokenRequestParameter'].value;
  var oauthPeriodbearerPeriodconfigid = req.swagger.params['oauth.bearer.configid'].value;
  var oauthPeriodjwtPeriodsupport = req.swagger.params['oauth.jwt.support'].value;
  Configmgr.comAdobeGraniteAuthOauthImplBearerAuthenticationHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,oauthPeriodclientIdsPeriodallowed,authPeriodbearerPeriodsyncPeriodims,authPeriodtokenRequestParameter,oauthPeriodbearerPeriodconfigid,oauthPeriodjwtPeriodsupport)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl = function comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var authPeriodtokenPeriodvalidatorPeriodtype = req.swagger.params['auth.token.validator.type'].value;
  Configmgr.comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,authPeriodtokenPeriodvalidatorPeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplFacebookProviderImpl = function comAdobeGraniteAuthOauthImplFacebookProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  Configmgr.comAdobeGraniteAuthOauthImplFacebookProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplGithubProviderImpl = function comAdobeGraniteAuthOauthImplGithubProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  var oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl = req.swagger.params['oauth.provider.github.authorization.url'].value;
  var oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl = req.swagger.params['oauth.provider.github.token.url'].value;
  var oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl = req.swagger.params['oauth.provider.github.profile.url'].value;
  Configmgr.comAdobeGraniteAuthOauthImplGithubProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid,oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl,oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl,oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplGraniteProvider = function comAdobeGraniteAuthOauthImplGraniteProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  var oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl = req.swagger.params['oauth.provider.granite.authorization.url'].value;
  var oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl = req.swagger.params['oauth.provider.granite.token.url'].value;
  var oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl = req.swagger.params['oauth.provider.granite.profile.url'].value;
  var oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls = req.swagger.params['oauth.provider.granite.extended.details.urls'].value;
  Configmgr.comAdobeGraniteAuthOauthImplGraniteProvider(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid,oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl,oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl,oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl,oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplHelperProviderConfigManager = function comAdobeGraniteAuthOauthImplHelperProviderConfigManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodcookiePeriodloginPeriodtimeout = req.swagger.params['oauth.cookie.login.timeout'].value;
  var oauthPeriodcookiePeriodmaxPeriodage = req.swagger.params['oauth.cookie.max.age'].value;
  Configmgr.comAdobeGraniteAuthOauthImplHelperProviderConfigManager(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodcookiePeriodloginPeriodtimeout,oauthPeriodcookiePeriodmaxPeriodage)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal = function comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodcookiePeriodloginPeriodtimeout = req.swagger.params['oauth.cookie.login.timeout'].value;
  var oauthPeriodcookiePeriodmaxPeriodage = req.swagger.params['oauth.cookie.max.age'].value;
  Configmgr.comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodcookiePeriodloginPeriodtimeout,oauthPeriodcookiePeriodmaxPeriodage)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler = function comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  Configmgr.comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler(post,apply,_delete,action,Dollarlocation,propertylist,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthImplTwitterProviderImpl = function comAdobeGraniteAuthOauthImplTwitterProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodproviderPeriodid = req.swagger.params['oauth.provider.id'].value;
  Configmgr.comAdobeGraniteAuthOauthImplTwitterProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodproviderPeriodid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthOauthProvider = function comAdobeGraniteAuthOauthProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodconfigPeriodid = req.swagger.params['oauth.config.id'].value;
  var oauthPeriodclientPeriodid = req.swagger.params['oauth.client.id'].value;
  var oauthPeriodclientPeriodsecret = req.swagger.params['oauth.client.secret'].value;
  var oauthPeriodscope = req.swagger.params['oauth.scope'].value;
  var oauthPeriodconfigPeriodproviderPeriodid = req.swagger.params['oauth.config.provider.id'].value;
  var oauthPeriodcreatePeriodusers = req.swagger.params['oauth.create.users'].value;
  var oauthPerioduseridPeriodproperty = req.swagger.params['oauth.userid.property'].value;
  var forcePeriodstrictPeriodusernamePeriodmatching = req.swagger.params['force.strict.username.matching'].value;
  var oauthPeriodencodePerioduserids = req.swagger.params['oauth.encode.userids'].value;
  var oauthPeriodhashPerioduserids = req.swagger.params['oauth.hash.userids'].value;
  var oauthPeriodcallBackUrl = req.swagger.params['oauth.callBackUrl'].value;
  var oauthPeriodaccessPeriodtokenPeriodpersist = req.swagger.params['oauth.access.token.persist'].value;
  var oauthPeriodaccessPeriodtokenPeriodpersistPeriodcookie = req.swagger.params['oauth.access.token.persist.cookie'].value;
  var oauthPeriodcsrfPeriodstatePeriodprotection = req.swagger.params['oauth.csrf.state.protection'].value;
  var oauthPeriodredirectPeriodrequestPeriodparams = req.swagger.params['oauth.redirect.request.params'].value;
  var oauthPeriodconfigPeriodsiblingsPeriodallow = req.swagger.params['oauth.config.siblings.allow'].value;
  Configmgr.comAdobeGraniteAuthOauthProvider(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodconfigPeriodid,oauthPeriodclientPeriodid,oauthPeriodclientPeriodsecret,oauthPeriodscope,oauthPeriodconfigPeriodproviderPeriodid,oauthPeriodcreatePeriodusers,oauthPerioduseridPeriodproperty,forcePeriodstrictPeriodusernamePeriodmatching,oauthPeriodencodePerioduserids,oauthPeriodhashPerioduserids,oauthPeriodcallBackUrl,oauthPeriodaccessPeriodtokenPeriodpersist,oauthPeriodaccessPeriodtokenPeriodpersistPeriodcookie,oauthPeriodcsrfPeriodstatePeriodprotection,oauthPeriodredirectPeriodrequestPeriodparams,oauthPeriodconfigPeriodsiblingsPeriodallow)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthRequirementImplDefaultRequirementHandler = function comAdobeGraniteAuthRequirementImplDefaultRequirementHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var supportedPaths = req.swagger.params['supportedPaths'].value;
  Configmgr.comAdobeGraniteAuthRequirementImplDefaultRequirementHandler(post,apply,_delete,action,Dollarlocation,propertylist,supportedPaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthSamlSamlAuthenticationHandler = function comAdobeGraniteAuthSamlSamlAuthenticationHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var idpUrl = req.swagger.params['idpUrl'].value;
  var idpCertAlias = req.swagger.params['idpCertAlias'].value;
  var idpHttpRedirect = req.swagger.params['idpHttpRedirect'].value;
  var serviceProviderEntityId = req.swagger.params['serviceProviderEntityId'].value;
  var assertionConsumerServiceURL = req.swagger.params['assertionConsumerServiceURL'].value;
  var spPrivateKeyAlias = req.swagger.params['spPrivateKeyAlias'].value;
  var keyStorePassword = req.swagger.params['keyStorePassword'].value;
  var defaultRedirectUrl = req.swagger.params['defaultRedirectUrl'].value;
  var userIDAttribute = req.swagger.params['userIDAttribute'].value;
  var useEncryption = req.swagger.params['useEncryption'].value;
  var createUser = req.swagger.params['createUser'].value;
  var userIntermediatePath = req.swagger.params['userIntermediatePath'].value;
  var addGroupMemberships = req.swagger.params['addGroupMemberships'].value;
  var groupMembershipAttribute = req.swagger.params['groupMembershipAttribute'].value;
  var defaultGroups = req.swagger.params['defaultGroups'].value;
  var nameIdFormat = req.swagger.params['nameIdFormat'].value;
  var synchronizeAttributes = req.swagger.params['synchronizeAttributes'].value;
  var handleLogout = req.swagger.params['handleLogout'].value;
  var logoutUrl = req.swagger.params['logoutUrl'].value;
  var clockTolerance = req.swagger.params['clockTolerance'].value;
  var digestMethod = req.swagger.params['digestMethod'].value;
  var signatureMethod = req.swagger.params['signatureMethod'].value;
  var identitySyncType = req.swagger.params['identitySyncType'].value;
  var idpIdentifier = req.swagger.params['idpIdentifier'].value;
  Configmgr.comAdobeGraniteAuthSamlSamlAuthenticationHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,servicePeriodranking,idpUrl,idpCertAlias,idpHttpRedirect,serviceProviderEntityId,assertionConsumerServiceURL,spPrivateKeyAlias,keyStorePassword,defaultRedirectUrl,userIDAttribute,useEncryption,createUser,userIntermediatePath,addGroupMemberships,groupMembershipAttribute,defaultGroups,nameIdFormat,synchronizeAttributes,handleLogout,logoutUrl,clockTolerance,digestMethod,signatureMethod,identitySyncType,idpIdentifier)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteAuthSsoImplSsoAuthenticationHandler = function comAdobeGraniteAuthSsoImplSsoAuthenticationHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var jaasPeriodcontrolFlag = req.swagger.params['jaas.controlFlag'].value;
  var jaasPeriodrealmName = req.swagger.params['jaas.realmName'].value;
  var jaasPeriodranking = req.swagger.params['jaas.ranking'].value;
  var headers = req.swagger.params['headers'].value;
  var cookies = req.swagger.params['cookies'].value;
  var parameters = req.swagger.params['parameters'].value;
  var usermap = req.swagger.params['usermap'].value;
  var format = req.swagger.params['format'].value;
  var trustedCredentialsAttribute = req.swagger.params['trustedCredentialsAttribute'].value;
  Configmgr.comAdobeGraniteAuthSsoImplSsoAuthenticationHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,servicePeriodranking,jaasPeriodcontrolFlag,jaasPeriodrealmName,jaasPeriodranking,headers,cookies,parameters,usermap,format,trustedCredentialsAttribute)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplCodeCacheHealthCheck = function comAdobeGraniteBundlesHcImplCodeCacheHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var minimumPeriodcodePeriodcachePeriodsize = req.swagger.params['minimum.code.cache.size'].value;
  Configmgr.comAdobeGraniteBundlesHcImplCodeCacheHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,minimumPeriodcodePeriodcachePeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck = function comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplDavExBundleHealthCheck = function comAdobeGraniteBundlesHcImplDavExBundleHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplDavExBundleHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck = function comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var ignoredPeriodbundles = req.swagger.params['ignored.bundles'].value;
  Configmgr.comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,ignoredPeriodbundles)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplJobsHealthCheck = function comAdobeGraniteBundlesHcImplJobsHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var maxPeriodqueuedPeriodjobs = req.swagger.params['max.queued.jobs'].value;
  Configmgr.comAdobeGraniteBundlesHcImplJobsHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,maxPeriodqueuedPeriodjobs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck = function comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck = function comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck = function comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck = function comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck = function comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac = function comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var replicatePeriodcommentPeriodresourceTypes = req.swagger.params['replicate.comment.resourceTypes'].value;
  Configmgr.comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac(post,apply,_delete,action,Dollarlocation,propertylist,replicatePeriodcommentPeriodresourceTypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl = function comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var compatgroups = req.swagger.params['compatgroups'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,compatgroups,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCompatrouterImplRoutingConfig = function comAdobeGraniteCompatrouterImplRoutingConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var id = req.swagger.params['id'].value;
  var compatPath = req.swagger.params['compatPath'].value;
  var newPath = req.swagger.params['newPath'].value;
  Configmgr.comAdobeGraniteCompatrouterImplRoutingConfig(post,apply,_delete,action,Dollarlocation,propertylist,id,compatPath,newPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCompatrouterImplSwitchMappingConfig = function comAdobeGraniteCompatrouterImplSwitchMappingConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var group = req.swagger.params['group'].value;
  var ids = req.swagger.params['ids'].value;
  Configmgr.comAdobeGraniteCompatrouterImplSwitchMappingConfig(post,apply,_delete,action,Dollarlocation,propertylist,group,ids)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving = function comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var fallbackPaths = req.swagger.params['fallbackPaths'].value;
  Configmgr.comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving(post,apply,_delete,action,Dollarlocation,propertylist,enabled,fallbackPaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteContexthubImplContextHubImpl = function comAdobeGraniteContexthubImplContextHubImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentUnderscoremode = req.swagger.params['com.adobe.granite.contexthub.silent_mode'].value;
  var comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUnderscoreui = req.swagger.params['com.adobe.granite.contexthub.show_ui'].value;
  Configmgr.comAdobeGraniteContexthubImplContextHubImpl(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentUnderscoremode,comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUnderscoreui)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCorsImplCORSPolicyImpl = function comAdobeGraniteCorsImplCORSPolicyImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var alloworigin = req.swagger.params['alloworigin'].value;
  var alloworiginregexp = req.swagger.params['alloworiginregexp'].value;
  var allowedpaths = req.swagger.params['allowedpaths'].value;
  var exposedheaders = req.swagger.params['exposedheaders'].value;
  var maxage = req.swagger.params['maxage'].value;
  var supportedheaders = req.swagger.params['supportedheaders'].value;
  var supportedmethods = req.swagger.params['supportedmethods'].value;
  var supportscredentials = req.swagger.params['supportscredentials'].value;
  Configmgr.comAdobeGraniteCorsImplCORSPolicyImpl(post,apply,_delete,action,Dollarlocation,propertylist,alloworigin,alloworiginregexp,allowedpaths,exposedheaders,maxage,supportedheaders,supportedmethods,supportscredentials)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCsrfImplCSRFFilter = function comAdobeGraniteCsrfImplCSRFFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var filterPeriodmethods = req.swagger.params['filter.methods'].value;
  var filterPeriodenablePeriodsafePerioduserPeriodagents = req.swagger.params['filter.enable.safe.user.agents'].value;
  var filterPeriodsafePerioduserPeriodagents = req.swagger.params['filter.safe.user.agents'].value;
  var filterPeriodexcludedPeriodpaths = req.swagger.params['filter.excluded.paths'].value;
  Configmgr.comAdobeGraniteCsrfImplCSRFFilter(post,apply,_delete,action,Dollarlocation,propertylist,filterPeriodmethods,filterPeriodenablePeriodsafePerioduserPeriodagents,filterPeriodsafePerioduserPeriodagents,filterPeriodexcludedPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteCsrfImplCSRFServlet = function comAdobeGraniteCsrfImplCSRFServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var csrfPeriodtokenPeriodexpiresPeriodin = req.swagger.params['csrf.token.expires.in'].value;
  var slingPeriodauthPeriodrequirements = req.swagger.params['sling.auth.requirements'].value;
  Configmgr.comAdobeGraniteCsrfImplCSRFServlet(post,apply,_delete,action,Dollarlocation,propertylist,csrfPeriodtokenPeriodexpiresPeriodin,slingPeriodauthPeriodrequirements)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe = function comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var username = req.swagger.params['username'].value;
  var encryptedPassword = req.swagger.params['encryptedPassword'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe(post,apply,_delete,action,Dollarlocation,propertylist,name,username,encryptedPassword)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver = function comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var agentName = req.swagger.params['agentName'].value;
  var diffPath = req.swagger.params['diffPath'].value;
  var observedPath = req.swagger.params['observedPath'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var propertyNames = req.swagger.params['propertyNames'].value;
  var distributionDelay = req.swagger.params['distributionDelay'].value;
  var serviceUserPeriodtarget = req.swagger.params['serviceUser.target'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver(post,apply,_delete,action,Dollarlocation,propertylist,enabled,agentName,diffPath,observedPath,serviceName,propertyNames,distributionDelay,serviceUserPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplDiffDiffEventListener = function comAdobeGraniteDistributionCoreImplDiffDiffEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var diffPath = req.swagger.params['diffPath'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var serviceUserPeriodtarget = req.swagger.params['serviceUser.target'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplDiffDiffEventListener(post,apply,_delete,action,Dollarlocation,propertylist,diffPath,serviceName,serviceUserPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplDistributionToReplicationEven = function comAdobeGraniteDistributionCoreImplDistributionToReplicationEven (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var importerPeriodname = req.swagger.params['importer.name'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplDistributionToReplicationEven(post,apply,_delete,action,Dollarlocation,propertylist,importerPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat = function comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerName = req.swagger.params['providerName'].value;
  var forwardPeriodrequests = req.swagger.params['forward.requests'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat(post,apply,_delete,action,Dollarlocation,propertylist,providerName,forwardPeriodrequests)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplReplicationDistributionTrans = function comAdobeGraniteDistributionCoreImplReplicationDistributionTrans (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var forwardPeriodrequests = req.swagger.params['forward.requests'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplReplicationDistributionTrans(post,apply,_delete,action,Dollarlocation,propertylist,forwardPeriodrequests)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu = function comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var userId = req.swagger.params['userId'].value;
  var accessTokenProviderPeriodtarget = req.swagger.params['accessTokenProvider.target'].value;
  Configmgr.comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu(post,apply,_delete,action,Dollarlocation,propertylist,name,serviceName,userId,accessTokenProviderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteFragsImplCheckHttpHeaderFlag = function comAdobeGraniteFragsImplCheckHttpHeaderFlag (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var featurePeriodname = req.swagger.params['feature.name'].value;
  var featurePerioddescription = req.swagger.params['feature.description'].value;
  var httpPeriodheaderPeriodname = req.swagger.params['http.header.name'].value;
  var httpPeriodheaderPeriodvaluepattern = req.swagger.params['http.header.valuepattern'].value;
  Configmgr.comAdobeGraniteFragsImplCheckHttpHeaderFlag(post,apply,_delete,action,Dollarlocation,propertylist,featurePeriodname,featurePerioddescription,httpPeriodheaderPeriodname,httpPeriodheaderPeriodvaluepattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteFragsImplRandomFeature = function comAdobeGraniteFragsImplRandomFeature (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var featurePeriodname = req.swagger.params['feature.name'].value;
  var featurePerioddescription = req.swagger.params['feature.description'].value;
  var activePeriodpercentage = req.swagger.params['active.percentage'].value;
  var cookiePeriodname = req.swagger.params['cookie.name'].value;
  var cookiePeriodmaxAge = req.swagger.params['cookie.maxAge'].value;
  Configmgr.comAdobeGraniteFragsImplRandomFeature(post,apply,_delete,action,Dollarlocation,propertylist,featurePeriodname,featurePerioddescription,activePeriodpercentage,cookiePeriodname,cookiePeriodmaxAge)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteHttpcacheFileFileCacheStore = function comAdobeGraniteHttpcacheFileFileCacheStore (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot = req.swagger.params['com.adobe.granite.httpcache.file.documentRoot'].value;
  var comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost = req.swagger.params['com.adobe.granite.httpcache.file.includeHost'].value;
  Configmgr.comAdobeGraniteHttpcacheFileFileCacheStore(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot,comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteHttpcacheImplOuterCacheFilter = function comAdobeGraniteHttpcacheImplOuterCacheFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths = req.swagger.params['com.adobe.granite.httpcache.url.paths'].value;
  Configmgr.comAdobeGraniteHttpcacheImplOuterCacheFilter(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteI18nImplBundlePseudoTranslations = function comAdobeGraniteI18nImplBundlePseudoTranslations (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pseudoPeriodpatterns = req.swagger.params['pseudo.patterns'].value;
  Configmgr.comAdobeGraniteI18nImplBundlePseudoTranslations(post,apply,_delete,action,Dollarlocation,propertylist,pseudoPeriodpatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteI18nImplPreferencesLocaleResolverService = function comAdobeGraniteI18nImplPreferencesLocaleResolverService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var securityPeriodpreferencesPeriodname = req.swagger.params['security.preferences.name'].value;
  Configmgr.comAdobeGraniteI18nImplPreferencesLocaleResolverService(post,apply,_delete,action,Dollarlocation,propertylist,securityPeriodpreferencesPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteInfocollectorInfoCollector = function comAdobeGraniteInfocollectorInfoCollector (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var granitePeriodinfocollectorPeriodincludeThreadDumps = req.swagger.params['granite.infocollector.includeThreadDumps'].value;
  var granitePeriodinfocollectorPeriodincludeHeapDump = req.swagger.params['granite.infocollector.includeHeapDump'].value;
  Configmgr.comAdobeGraniteInfocollectorInfoCollector(post,apply,_delete,action,Dollarlocation,propertylist,granitePeriodinfocollectorPeriodincludeThreadDumps,granitePeriodinfocollectorPeriodincludeHeapDump)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteJettySslInternalGraniteSslConnectorFactory = function comAdobeGraniteJettySslInternalGraniteSslConnectorFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport = req.swagger.params['com.adobe.granite.jetty.ssl.port'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser = req.swagger.params['com.adobe.granite.jetty.ssl.keystore.user'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword = req.swagger.params['com.adobe.granite.jetty.ssl.keystore.password'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded = req.swagger.params['com.adobe.granite.jetty.ssl.ciphersuites.excluded'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded = req.swagger.params['com.adobe.granite.jetty.ssl.ciphersuites.included'].value;
  var comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate = req.swagger.params['com.adobe.granite.jetty.ssl.client.certificate'].value;
  Configmgr.comAdobeGraniteJettySslInternalGraniteSslConnectorFactory(post,apply,_delete,action,Dollarlocation,propertylist,comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport,comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser,comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword,comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded,comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded,comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteLicenseImplLicenseCheckFilter = function comAdobeGraniteLicenseImplLicenseCheckFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var checkInternval = req.swagger.params['checkInternval'].value;
  var excludeIds = req.swagger.params['excludeIds'].value;
  var encryptPing = req.swagger.params['encryptPing'].value;
  Configmgr.comAdobeGraniteLicenseImplLicenseCheckFilter(post,apply,_delete,action,Dollarlocation,propertylist,checkInternval,excludeIds,encryptPing)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteLoggingImplLogAnalyserImpl = function comAdobeGraniteLoggingImplLogAnalyserImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var messagesPeriodqueuePeriodsize = req.swagger.params['messages.queue.size'].value;
  var loggerPeriodconfig = req.swagger.params['logger.config'].value;
  var messagesPeriodsize = req.swagger.params['messages.size'].value;
  Configmgr.comAdobeGraniteLoggingImplLogAnalyserImpl(post,apply,_delete,action,Dollarlocation,propertylist,messagesPeriodqueuePeriodsize,loggerPeriodconfig,messagesPeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteLoggingImplLogErrorHealthCheck = function comAdobeGraniteLoggingImplLogErrorHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteLoggingImplLogErrorHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask = function comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var granitePeriodmaintenancePeriodmandatory = req.swagger.params['granite.maintenance.mandatory'].value;
  var jobPeriodtopics = req.swagger.params['job.topics'].value;
  Configmgr.comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask(post,apply,_delete,action,Dollarlocation,propertylist,granitePeriodmaintenancePeriodmandatory,jobPeriodtopics)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask = function comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jobPeriodtopics = req.swagger.params['job.topics'].value;
  Configmgr.comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask(post,apply,_delete,action,Dollarlocation,propertylist,jobPeriodtopics)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask = function comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fullPeriodgcPerioddays = req.swagger.params['full.gc.days'].value;
  Configmgr.comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask(post,apply,_delete,action,Dollarlocation,propertylist,fullPeriodgcPerioddays)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteMonitoringImplScriptConfigImpl = function comAdobeGraniteMonitoringImplScriptConfigImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var scriptPeriodfilename = req.swagger.params['script.filename'].value;
  var scriptPerioddisplay = req.swagger.params['script.display'].value;
  var scriptPeriodpath = req.swagger.params['script.path'].value;
  var scriptPeriodplatform = req.swagger.params['script.platform'].value;
  var interval = req.swagger.params['interval'].value;
  var jmxdomain = req.swagger.params['jmxdomain'].value;
  Configmgr.comAdobeGraniteMonitoringImplScriptConfigImpl(post,apply,_delete,action,Dollarlocation,propertylist,scriptPeriodfilename,scriptPerioddisplay,scriptPeriodpath,scriptPeriodplatform,interval,jmxdomain)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan = function comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var jaasPeriodcontrolFlag = req.swagger.params['jaas.controlFlag'].value;
  var jaasPeriodrealmName = req.swagger.params['jaas.realmName'].value;
  var jaasPeriodranking = req.swagger.params['jaas.ranking'].value;
  var oauthPeriodofflinePeriodvalidation = req.swagger.params['oauth.offline.validation'].value;
  Configmgr.comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan(post,apply,_delete,action,Dollarlocation,propertylist,path,jaasPeriodcontrolFlag,jaasPeriodrealmName,jaasPeriodranking,oauthPeriodofflinePeriodvalidation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOauthServerImplAccessTokenCleanupTask = function comAdobeGraniteOauthServerImplAccessTokenCleanupTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  Configmgr.comAdobeGraniteOauthServerImplAccessTokenCleanupTask(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet = function comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodclientPeriodrevocationPeriodactive = req.swagger.params['oauth.client.revocation.active'].value;
  Configmgr.comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodclientPeriodrevocationPeriodactive)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet = function comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodpaths = req.swagger.params['sling.servlet.paths'].value;
  var oauthPeriodrevocationPeriodactive = req.swagger.params['oauth.revocation.active'].value;
  Configmgr.comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodpaths,oauthPeriodrevocationPeriodactive)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet = function comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodissuer = req.swagger.params['oauth.issuer'].value;
  var oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin = req.swagger.params['oauth.access.token.expires.in'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern = req.swagger.params['osgi.http.whiteboard.servlet.pattern'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect = req.swagger.params['osgi.http.whiteboard.context.select'].value;
  Configmgr.comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodissuer,oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin,osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern,osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet = function comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var oauthPeriodtokenPeriodrevocationPeriodactive = req.swagger.params['oauth.token.revocation.active'].value;
  Configmgr.comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet(post,apply,_delete,action,Dollarlocation,propertylist,oauthPeriodtokenPeriodrevocationPeriodactive)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOffloadingImplOffloadingConfigurator = function comAdobeGraniteOffloadingImplOffloadingConfigurator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var offloadingPeriodtransporter = req.swagger.params['offloading.transporter'].value;
  var offloadingPeriodcleanupPeriodpayload = req.swagger.params['offloading.cleanup.payload'].value;
  Configmgr.comAdobeGraniteOffloadingImplOffloadingConfigurator(post,apply,_delete,action,Dollarlocation,propertylist,offloadingPeriodtransporter,offloadingPeriodcleanupPeriodpayload)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOffloadingImplOffloadingJobCloner = function comAdobeGraniteOffloadingImplOffloadingJobCloner (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var offloadingPeriodjobclonerPeriodenabled = req.swagger.params['offloading.jobcloner.enabled'].value;
  Configmgr.comAdobeGraniteOffloadingImplOffloadingJobCloner(post,apply,_delete,action,Dollarlocation,propertylist,offloadingPeriodjobclonerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOffloadingImplOffloadingJobOffloader = function comAdobeGraniteOffloadingImplOffloadingJobOffloader (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var offloadingPeriodoffloaderPeriodenabled = req.swagger.params['offloading.offloader.enabled'].value;
  Configmgr.comAdobeGraniteOffloadingImplOffloadingJobOffloader(post,apply,_delete,action,Dollarlocation,propertylist,offloadingPeriodoffloaderPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager = function comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var offloadingPeriodagentmanagerPeriodenabled = req.swagger.params['offloading.agentmanager.enabled'].value;
  Configmgr.comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager(post,apply,_delete,action,Dollarlocation,propertylist,offloadingPeriodagentmanagerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo = function comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultPeriodtransportPeriodagentToWorkerPeriodprefix = req.swagger.params['default.transport.agent-to-worker.prefix'].value;
  var defaultPeriodtransportPeriodagentToMasterPeriodprefix = req.swagger.params['default.transport.agent-to-master.prefix'].value;
  var defaultPeriodtransportPeriodinputPeriodpackage = req.swagger.params['default.transport.input.package'].value;
  var defaultPeriodtransportPeriodoutputPeriodpackage = req.swagger.params['default.transport.output.package'].value;
  var defaultPeriodtransportPeriodreplicationPeriodsynchronous = req.swagger.params['default.transport.replication.synchronous'].value;
  var defaultPeriodtransportPeriodcontentpackage = req.swagger.params['default.transport.contentpackage'].value;
  var offloadingPeriodtransporterPerioddefaultPeriodenabled = req.swagger.params['offloading.transporter.default.enabled'].value;
  Configmgr.comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo(post,apply,_delete,action,Dollarlocation,propertylist,defaultPeriodtransportPeriodagentToWorkerPeriodprefix,defaultPeriodtransportPeriodagentToMasterPeriodprefix,defaultPeriodtransportPeriodinputPeriodpackage,defaultPeriodtransportPeriodoutputPeriodpackage,defaultPeriodtransportPeriodreplicationPeriodsynchronous,defaultPeriodtransportPeriodcontentpackage,offloadingPeriodtransporterPerioddefaultPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl = function comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var omnisearchPeriodsuggestionPeriodrequiretextPeriodmin = req.swagger.params['omnisearch.suggestion.requiretext.min'].value;
  var omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire = req.swagger.params['omnisearch.suggestion.spellcheck.require'].value;
  Configmgr.comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,omnisearchPeriodsuggestionPeriodrequiretextPeriodmin,omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteOptoutImplOptOutServiceImpl = function comAdobeGraniteOptoutImplOptOutServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var optoutPeriodcookies = req.swagger.params['optout.cookies'].value;
  var optoutPeriodheaders = req.swagger.params['optout.headers'].value;
  var optoutPeriodwhitelistPeriodcookies = req.swagger.params['optout.whitelist.cookies'].value;
  Configmgr.comAdobeGraniteOptoutImplOptOutServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,optoutPeriodcookies,optoutPeriodheaders,optoutPeriodwhitelistPeriodcookies)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck = function comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var indexingPeriodcriticalPeriodthreshold = req.swagger.params['indexing.critical.threshold'].value;
  var indexingPeriodwarnPeriodthreshold = req.swagger.params['indexing.warn.threshold'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,indexingPeriodcriticalPeriodthreshold,indexingPeriodwarnPeriodthreshold,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteQueriesImplHcLargeIndexHealthCheck = function comAdobeGraniteQueriesImplHcLargeIndexHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var largePeriodindexPeriodcriticalPeriodthreshold = req.swagger.params['large.index.critical.threshold'].value;
  var largePeriodindexPeriodwarnPeriodthreshold = req.swagger.params['large.index.warn.threshold'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteQueriesImplHcLargeIndexHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,largePeriodindexPeriodcriticalPeriodthreshold,largePeriodindexPeriodwarnPeriodthreshold,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck = function comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics = function comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var getPeriod = req.swagger.params['getPeriod'].value;
  Configmgr.comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics(post,apply,_delete,action,Dollarlocation,propertylist,getPeriod)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck = function comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck = function comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var numberPeriodofPeriodretriesPeriodallowed = req.swagger.params['number.of.retries.allowed'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,numberPeriodofPeriodretriesPeriodallowed,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC = function comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck = function comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC = function comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var excludePeriodsearchPeriodpath = req.swagger.params['exclude.search.path'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,excludePeriodsearchPeriodpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck = function comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe = function comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck = function comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var accountPeriodlogins = req.swagger.params['account.logins'].value;
  var consolePeriodlogins = req.swagger.params['console.logins'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,accountPeriodlogins,consolePeriodlogins)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck = function comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var diskPeriodspacePeriodwarnPeriodthreshold = req.swagger.params['disk.space.warn.threshold'].value;
  var diskPeriodspacePerioderrorPeriodthreshold = req.swagger.params['disk.space.error.threshold'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags,diskPeriodspacePeriodwarnPeriodthreshold,diskPeriodspacePerioderrorPeriodthreshold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck = function comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryImplCommitStatsConfig = function comAdobeGraniteRepositoryImplCommitStatsConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var intervalSeconds = req.swagger.params['intervalSeconds'].value;
  var commitsPerIntervalThreshold = req.swagger.params['commitsPerIntervalThreshold'].value;
  var maxLocationLength = req.swagger.params['maxLocationLength'].value;
  var maxDetailsShown = req.swagger.params['maxDetailsShown'].value;
  var minDetailsPercentage = req.swagger.params['minDetailsPercentage'].value;
  var threadMatchers = req.swagger.params['threadMatchers'].value;
  var maxGreedyDepth = req.swagger.params['maxGreedyDepth'].value;
  var greedyStackMatchers = req.swagger.params['greedyStackMatchers'].value;
  var stackFilters = req.swagger.params['stackFilters'].value;
  var stackMatchers = req.swagger.params['stackMatchers'].value;
  var stackCategorizers = req.swagger.params['stackCategorizers'].value;
  var stackShorteners = req.swagger.params['stackShorteners'].value;
  Configmgr.comAdobeGraniteRepositoryImplCommitStatsConfig(post,apply,_delete,action,Dollarlocation,propertylist,enabled,intervalSeconds,commitsPerIntervalThreshold,maxLocationLength,maxDetailsShown,minDetailsPercentage,threadMatchers,maxGreedyDepth,greedyStackMatchers,stackFilters,stackMatchers,stackCategorizers,stackShorteners)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRepositoryServiceUserConfiguration = function comAdobeGraniteRepositoryServiceUserConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var serviceusersPeriodsimpleSubjectPopulation = req.swagger.params['serviceusers.simpleSubjectPopulation'].value;
  var serviceusersPeriodlist = req.swagger.params['serviceusers.list'].value;
  Configmgr.comAdobeGraniteRepositoryServiceUserConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,serviceusersPeriodsimpleSubjectPopulation,serviceusersPeriodlist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm = function comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteResourcestatusImplCompositeStatusType = function comAdobeGraniteResourcestatusImplCompositeStatusType (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var types = req.swagger.params['types'].value;
  Configmgr.comAdobeGraniteResourcestatusImplCompositeStatusType(post,apply,_delete,action,Dollarlocation,propertylist,name,types)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteResourcestatusImplStatusResourceProviderImpl = function comAdobeGraniteResourcestatusImplStatusResourceProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerPeriodroot = req.swagger.params['provider.root'].value;
  Configmgr.comAdobeGraniteResourcestatusImplStatusResourceProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,providerPeriodroot)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRestAssetsImplAssetContentDispositionFilter = function comAdobeGraniteRestAssetsImplAssetContentDispositionFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mimePeriodallowEmpty = req.swagger.params['mime.allowEmpty'].value;
  var mimePeriodallowed = req.swagger.params['mime.allowed'].value;
  Configmgr.comAdobeGraniteRestAssetsImplAssetContentDispositionFilter(post,apply,_delete,action,Dollarlocation,propertylist,mimePeriodallowEmpty,mimePeriodallowed)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl = function comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerPeriodroots = req.swagger.params['provider.roots'].value;
  Configmgr.comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl(post,apply,_delete,action,Dollarlocation,propertylist,providerPeriodroots)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteRestImplServletDefaultGETServlet = function comAdobeGraniteRestImplServletDefaultGETServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultPeriodlimit = req.swagger.params['default.limit'].value;
  var usePeriodabsolutePerioduri = req.swagger.params['use.absolute.uri'].value;
  Configmgr.comAdobeGraniteRestImplServletDefaultGETServlet(post,apply,_delete,action,Dollarlocation,propertylist,defaultPeriodlimit,usePeriodabsolutePerioduri)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS = function comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  Configmgr.comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodtags)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteSecurityUserUserPropertiesService = function comAdobeGraniteSecurityUserUserPropertiesService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var adapterPeriodcondition = req.swagger.params['adapter.condition'].value;
  var granitePerioduserpropertiesPeriodnodetypes = req.swagger.params['granite.userproperties.nodetypes'].value;
  var granitePerioduserpropertiesPeriodresourcetypes = req.swagger.params['granite.userproperties.resourcetypes'].value;
  Configmgr.comAdobeGraniteSecurityUserUserPropertiesService(post,apply,_delete,action,Dollarlocation,propertylist,adapterPeriodcondition,granitePerioduserpropertiesPeriodnodetypes,granitePerioduserpropertiesPeriodresourcetypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl = function comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var group2memberPeriodrelationshipPeriodoutgoing = req.swagger.params['group2member.relationship.outgoing'].value;
  var group2memberPeriodexcludedPeriodoutgoing = req.swagger.params['group2member.excluded.outgoing'].value;
  var group2memberPeriodrelationshipPeriodincoming = req.swagger.params['group2member.relationship.incoming'].value;
  var group2memberPeriodexcludedPeriodincoming = req.swagger.params['group2member.excluded.incoming'].value;
  Configmgr.comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl(post,apply,_delete,action,Dollarlocation,propertylist,group2memberPeriodrelationshipPeriodoutgoing,group2memberPeriodexcludedPeriodoutgoing,group2memberPeriodrelationshipPeriodincoming,group2memberPeriodexcludedPeriodincoming)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl = function comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var jmxPeriodobjectname = req.swagger.params['jmx.objectname'].value;
  Configmgr.comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,jmxPeriodobjectname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory = function comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var adapterPeriodcondition = req.swagger.params['adapter.condition'].value;
  Configmgr.comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory(post,apply,_delete,action,Dollarlocation,propertylist,adapterPeriodcondition)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteTaskmanagementImplJcrTaskArchiveService = function comAdobeGraniteTaskmanagementImplJcrTaskArchiveService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var archivingPeriodenabled = req.swagger.params['archiving.enabled'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var archivePeriodsincePerioddaysPeriodcompleted = req.swagger.params['archive.since.days.completed'].value;
  Configmgr.comAdobeGraniteTaskmanagementImplJcrTaskArchiveService(post,apply,_delete,action,Dollarlocation,propertylist,archivingPeriodenabled,schedulerPeriodexpression,archivePeriodsincePerioddaysPeriodcompleted)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask = function comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var purgeCompleted = req.swagger.params['purgeCompleted'].value;
  var completedAge = req.swagger.params['completedAge'].value;
  var purgeActive = req.swagger.params['purgeActive'].value;
  var activeAge = req.swagger.params['activeAge'].value;
  var saveThreshold = req.swagger.params['saveThreshold'].value;
  Configmgr.comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask(post,apply,_delete,action,Dollarlocation,propertylist,purgeCompleted,completedAge,purgeActive,activeAge,saveThreshold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor = function comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var adapterPeriodcondition = req.swagger.params['adapter.condition'].value;
  var taskmanagerPeriodadmingroups = req.swagger.params['taskmanager.admingroups'].value;
  Configmgr.comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor(post,apply,_delete,action,Dollarlocation,propertylist,adapterPeriodcondition,taskmanagerPeriodadmingroups)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteThreaddumpThreadDumpCollector = function comAdobeGraniteThreaddumpThreadDumpCollector (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodperiod = req.swagger.params['scheduler.period'].value;
  var schedulerPeriodrunOn = req.swagger.params['scheduler.runOn'].value;
  var granitePeriodthreaddumpPeriodenabled = req.swagger.params['granite.threaddump.enabled'].value;
  var granitePeriodthreaddumpPerioddumpsPerFile = req.swagger.params['granite.threaddump.dumpsPerFile'].value;
  var granitePeriodthreaddumpPeriodenableGzipCompression = req.swagger.params['granite.threaddump.enableGzipCompression'].value;
  var granitePeriodthreaddumpPeriodenableDirectoriesCompression = req.swagger.params['granite.threaddump.enableDirectoriesCompression'].value;
  var granitePeriodthreaddumpPeriodenableJStack = req.swagger.params['granite.threaddump.enableJStack'].value;
  var granitePeriodthreaddumpPeriodmaxBackupDays = req.swagger.params['granite.threaddump.maxBackupDays'].value;
  var granitePeriodthreaddumpPeriodbackupCleanTrigger = req.swagger.params['granite.threaddump.backupCleanTrigger'].value;
  Configmgr.comAdobeGraniteThreaddumpThreadDumpCollector(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodperiod,schedulerPeriodrunOn,granitePeriodthreaddumpPeriodenabled,granitePeriodthreaddumpPerioddumpsPerFile,granitePeriodthreaddumpPeriodenableGzipCompression,granitePeriodthreaddumpPeriodenableDirectoriesCompression,granitePeriodthreaddumpPeriodenableJStack,granitePeriodthreaddumpPeriodmaxBackupDays,granitePeriodthreaddumpPeriodbackupCleanTrigger)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl = function comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var translationFactory = req.swagger.params['translationFactory'].value;
  var defaultConnectorLabel = req.swagger.params['defaultConnectorLabel'].value;
  var defaultConnectorAttribution = req.swagger.params['defaultConnectorAttribution'].value;
  var defaultConnectorWorkspaceId = req.swagger.params['defaultConnectorWorkspaceId'].value;
  var defaultConnectorSubscriptionKey = req.swagger.params['defaultConnectorSubscriptionKey'].value;
  var languageMapLocation = req.swagger.params['languageMapLocation'].value;
  var categoryMapLocation = req.swagger.params['categoryMapLocation'].value;
  var retryAttempts = req.swagger.params['retryAttempts'].value;
  var timeoutCount = req.swagger.params['timeoutCount'].value;
  Configmgr.comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl(post,apply,_delete,action,Dollarlocation,propertylist,translationFactory,defaultConnectorLabel,defaultConnectorAttribution,defaultConnectorWorkspaceId,defaultConnectorSubscriptionKey,languageMapLocation,categoryMapLocation,retryAttempts,timeoutCount)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteTranslationCoreImplTranslationManagerImpl = function comAdobeGraniteTranslationCoreImplTranslationManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultConnectorName = req.swagger.params['defaultConnectorName'].value;
  var defaultCategory = req.swagger.params['defaultCategory'].value;
  Configmgr.comAdobeGraniteTranslationCoreImplTranslationManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,defaultConnectorName,defaultCategory)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl = function comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var htmllibmanagerPeriodtiming = req.swagger.params['htmllibmanager.timing'].value;
  var htmllibmanagerPerioddebugPeriodinitPeriodjs = req.swagger.params['htmllibmanager.debug.init.js'].value;
  var htmllibmanagerPeriodminify = req.swagger.params['htmllibmanager.minify'].value;
  var htmllibmanagerPerioddebug = req.swagger.params['htmllibmanager.debug'].value;
  var htmllibmanagerPeriodgzip = req.swagger.params['htmllibmanager.gzip'].value;
  var htmllibmanagerPeriodmaxDataUriSize = req.swagger.params['htmllibmanager.maxDataUriSize'].value;
  var htmllibmanagerPeriodmaxage = req.swagger.params['htmllibmanager.maxage'].value;
  var htmllibmanagerPeriodforceCQUrlInfo = req.swagger.params['htmllibmanager.forceCQUrlInfo'].value;
  var htmllibmanagerPerioddefaultthemename = req.swagger.params['htmllibmanager.defaultthemename'].value;
  var htmllibmanagerPerioddefaultuserthemename = req.swagger.params['htmllibmanager.defaultuserthemename'].value;
  var htmllibmanagerPeriodclientmanager = req.swagger.params['htmllibmanager.clientmanager'].value;
  var htmllibmanagerPeriodpathPeriodlist = req.swagger.params['htmllibmanager.path.list'].value;
  var htmllibmanagerPeriodexcludedPeriodpathPeriodlist = req.swagger.params['htmllibmanager.excluded.path.list'].value;
  var htmllibmanagerPeriodprocessorPeriodjs = req.swagger.params['htmllibmanager.processor.js'].value;
  var htmllibmanagerPeriodprocessorPeriodcss = req.swagger.params['htmllibmanager.processor.css'].value;
  var htmllibmanagerPeriodlongcachePeriodpatterns = req.swagger.params['htmllibmanager.longcache.patterns'].value;
  var htmllibmanagerPeriodlongcachePeriodformat = req.swagger.params['htmllibmanager.longcache.format'].value;
  var htmllibmanagerPerioduseFileSystemOutputCache = req.swagger.params['htmllibmanager.useFileSystemOutputCache'].value;
  var htmllibmanagerPeriodfileSystemOutputCacheLocation = req.swagger.params['htmllibmanager.fileSystemOutputCacheLocation'].value;
  var htmllibmanagerPerioddisablePeriodreplacement = req.swagger.params['htmllibmanager.disable.replacement'].value;
  Configmgr.comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,htmllibmanagerPeriodtiming,htmllibmanagerPerioddebugPeriodinitPeriodjs,htmllibmanagerPeriodminify,htmllibmanagerPerioddebug,htmllibmanagerPeriodgzip,htmllibmanagerPeriodmaxDataUriSize,htmllibmanagerPeriodmaxage,htmllibmanagerPeriodforceCQUrlInfo,htmllibmanagerPerioddefaultthemename,htmllibmanagerPerioddefaultuserthemename,htmllibmanagerPeriodclientmanager,htmllibmanagerPeriodpathPeriodlist,htmllibmanagerPeriodexcludedPeriodpathPeriodlist,htmllibmanagerPeriodprocessorPeriodjs,htmllibmanagerPeriodprocessorPeriodcss,htmllibmanagerPeriodlongcachePeriodpatterns,htmllibmanagerPeriodlongcachePeriodformat,htmllibmanagerPerioduseFileSystemOutputCache,htmllibmanagerPeriodfileSystemOutputCacheLocation,htmllibmanagerPerioddisablePeriodreplacement)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature = function comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService = function comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled = req.swagger.params['granite.workflow.WorkflowPublishEventService.enabled'].value;
  Configmgr.comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService(post,apply,_delete,action,Dollarlocation,propertylist,granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager = function comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var bucketSize = req.swagger.params['bucketSize'].value;
  Configmgr.comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager(post,apply,_delete,action,Dollarlocation,propertylist,bucketSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler = function comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultPeriodtimeout = req.swagger.params['default.timeout'].value;
  var maxPeriodtimeout = req.swagger.params['max.timeout'].value;
  var defaultPeriodperiod = req.swagger.params['default.period'].value;
  Configmgr.comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler(post,apply,_delete,action,Dollarlocation,propertylist,defaultPeriodtimeout,maxPeriodtimeout,defaultPeriodperiod)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCoreJobJobHandler = function comAdobeGraniteWorkflowCoreJobJobHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jobPeriodtopics = req.swagger.params['job.topics'].value;
  var allowPeriodselfPeriodprocessPeriodtermination = req.swagger.params['allow.self.process.termination'].value;
  Configmgr.comAdobeGraniteWorkflowCoreJobJobHandler(post,apply,_delete,action,Dollarlocation,propertylist,jobPeriodtopics,allowPeriodselfPeriodprocessPeriodtermination)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum = function comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jobPeriodtopics = req.swagger.params['job.topics'].value;
  Configmgr.comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum(post,apply,_delete,action,Dollarlocation,propertylist,jobPeriodtopics)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCorePayloadMapCache = function comAdobeGraniteWorkflowCorePayloadMapCache (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var getSystemWorkflowModels = req.swagger.params['getSystemWorkflowModels'].value;
  var getPackageRootPath = req.swagger.params['getPackageRootPath'].value;
  Configmgr.comAdobeGraniteWorkflowCorePayloadMapCache(post,apply,_delete,action,Dollarlocation,propertylist,getSystemWorkflowModels,getPackageRootPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener = function comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var payloadPeriodmovePeriodwhitePeriodlist = req.swagger.params['payload.move.white.list'].value;
  var payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess = req.swagger.params['payload.move.handle.from.workflow.process'].value;
  Configmgr.comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener(post,apply,_delete,action,Dollarlocation,propertylist,payloadPeriodmovePeriodwhitePeriodlist,payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCoreWorkflowConfig = function comAdobeGraniteWorkflowCoreWorkflowConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath = req.swagger.params['cq.workflow.config.workflow.packages.root.path'].value;
  var cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode = req.swagger.params['cq.workflow.config.workflow.process.legacy.mode'].value;
  var cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking = req.swagger.params['cq.workflow.config.allow.locking'].value;
  Configmgr.comAdobeGraniteWorkflowCoreWorkflowConfig(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath,cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode,cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowCoreWorkflowSessionFactory = function comAdobeGraniteWorkflowCoreWorkflowSessionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var granitePeriodworkflowinboxPeriodsortPeriodpropertyName = req.swagger.params['granite.workflowinbox.sort.propertyName'].value;
  var granitePeriodworkflowinboxPeriodsortPeriodorder = req.swagger.params['granite.workflowinbox.sort.order'].value;
  var cqPeriodworkflowPeriodjobPeriodretry = req.swagger.params['cq.workflow.job.retry'].value;
  var cqPeriodworkflowPeriodsuperuser = req.swagger.params['cq.workflow.superuser'].value;
  var granitePeriodworkflowPeriodinboxQuerySize = req.swagger.params['granite.workflow.inboxQuerySize'].value;
  var granitePeriodworkflowPeriodadminUserGroupFilter = req.swagger.params['granite.workflow.adminUserGroupFilter'].value;
  var granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions = req.swagger.params['granite.workflow.enforceWorkitemAssigneePermissions'].value;
  var granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions = req.swagger.params['granite.workflow.enforceWorkflowInitiatorPermissions'].value;
  var granitePeriodworkflowPeriodinjectTenantIdInJobTopics = req.swagger.params['granite.workflow.injectTenantIdInJobTopics'].value;
  var granitePeriodworkflowPeriodmaxPurgeSaveThreshold = req.swagger.params['granite.workflow.maxPurgeSaveThreshold'].value;
  var granitePeriodworkflowPeriodmaxPurgeQueryCount = req.swagger.params['granite.workflow.maxPurgeQueryCount'].value;
  Configmgr.comAdobeGraniteWorkflowCoreWorkflowSessionFactory(post,apply,_delete,action,Dollarlocation,propertylist,granitePeriodworkflowinboxPeriodsortPeriodpropertyName,granitePeriodworkflowinboxPeriodsortPeriodorder,cqPeriodworkflowPeriodjobPeriodretry,cqPeriodworkflowPeriodsuperuser,granitePeriodworkflowPeriodinboxQuerySize,granitePeriodworkflowPeriodadminUserGroupFilter,granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions,granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions,granitePeriodworkflowPeriodinjectTenantIdInJobTopics,granitePeriodworkflowPeriodmaxPurgeSaveThreshold,granitePeriodworkflowPeriodmaxPurgeQueryCount)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeGraniteWorkflowPurgeScheduler = function comAdobeGraniteWorkflowPurgeScheduler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var scheduledpurgePeriodname = req.swagger.params['scheduledpurge.name'].value;
  var scheduledpurgePeriodworkflowStatus = req.swagger.params['scheduledpurge.workflowStatus'].value;
  var scheduledpurgePeriodmodelIds = req.swagger.params['scheduledpurge.modelIds'].value;
  var scheduledpurgePerioddaysold = req.swagger.params['scheduledpurge.daysold'].value;
  Configmgr.comAdobeGraniteWorkflowPurgeScheduler(post,apply,_delete,action,Dollarlocation,propertylist,scheduledpurgePeriodname,scheduledpurgePeriodworkflowStatus,scheduledpurgePeriodmodelIds,scheduledpurgePerioddaysold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeOctopusNcommBootstrap = function comAdobeOctopusNcommBootstrap (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxConnections = req.swagger.params['maxConnections'].value;
  var maxRequests = req.swagger.params['maxRequests'].value;
  var requestTimeout = req.swagger.params['requestTimeout'].value;
  var requestRetries = req.swagger.params['requestRetries'].value;
  var launchTimeout = req.swagger.params['launchTimeout'].value;
  Configmgr.comAdobeOctopusNcommBootstrap(post,apply,_delete,action,Dollarlocation,propertylist,maxConnections,maxRequests,requestTimeout,requestRetries,launchTimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS = function comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter = req.swagger.params['communities.integration.livefyre.sling.event.filter'].value;
  Configmgr.comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS(post,apply,_delete,action,Dollarlocation,propertylist,communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comAdobeXmpWorkerFilesNcommXMPFilesNComm = function comAdobeXmpWorkerFilesNcommXMPFilesNComm (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxConnections = req.swagger.params['maxConnections'].value;
  var maxRequests = req.swagger.params['maxRequests'].value;
  var requestTimeout = req.swagger.params['requestTimeout'].value;
  var logDir = req.swagger.params['logDir'].value;
  Configmgr.comAdobeXmpWorkerFilesNcommXMPFilesNComm(post,apply,_delete,action,Dollarlocation,propertylist,maxConnections,maxRequests,requestTimeout,logDir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCommonsDatasourceJdbcpoolJdbcPoolService = function comDayCommonsDatasourceJdbcpoolJdbcPoolService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jdbcPerioddriverPeriodclass = req.swagger.params['jdbc.driver.class'].value;
  var jdbcPeriodconnectionPerioduri = req.swagger.params['jdbc.connection.uri'].value;
  var jdbcPeriodusername = req.swagger.params['jdbc.username'].value;
  var jdbcPeriodpassword = req.swagger.params['jdbc.password'].value;
  var jdbcPeriodvalidationPeriodquery = req.swagger.params['jdbc.validation.query'].value;
  var defaultPeriodreadonly = req.swagger.params['default.readonly'].value;
  var defaultPeriodautocommit = req.swagger.params['default.autocommit'].value;
  var poolPeriodsize = req.swagger.params['pool.size'].value;
  var poolPeriodmaxPeriodwaitPeriodmsec = req.swagger.params['pool.max.wait.msec'].value;
  var datasourcePeriodname = req.swagger.params['datasource.name'].value;
  var datasourcePeriodsvcPeriodproperties = req.swagger.params['datasource.svc.properties'].value;
  Configmgr.comDayCommonsDatasourceJdbcpoolJdbcPoolService(post,apply,_delete,action,Dollarlocation,propertylist,jdbcPerioddriverPeriodclass,jdbcPeriodconnectionPerioduri,jdbcPeriodusername,jdbcPeriodpassword,jdbcPeriodvalidationPeriodquery,defaultPeriodreadonly,defaultPeriodautocommit,poolPeriodsize,poolPeriodmaxPeriodwaitPeriodmsec,datasourcePeriodname,datasourcePeriodsvcPeriodproperties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCommonsHttpclient = function comDayCommonsHttpclient (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var proxyPeriodenabled = req.swagger.params['proxy.enabled'].value;
  var proxyPeriodhost = req.swagger.params['proxy.host'].value;
  var proxyPerioduser = req.swagger.params['proxy.user'].value;
  var proxyPeriodpassword = req.swagger.params['proxy.password'].value;
  var proxyPeriodntlmPeriodhost = req.swagger.params['proxy.ntlm.host'].value;
  var proxyPeriodntlmPerioddomain = req.swagger.params['proxy.ntlm.domain'].value;
  var proxyPeriodexceptions = req.swagger.params['proxy.exceptions'].value;
  Configmgr.comDayCommonsHttpclient(post,apply,_delete,action,Dollarlocation,propertylist,proxyPeriodenabled,proxyPeriodhost,proxyPerioduser,proxyPeriodpassword,proxyPeriodntlmPeriodhost,proxyPeriodntlmPerioddomain,proxyPeriodexceptions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsImplStorePropertiesChangeListener = function comDayCqAnalyticsImplStorePropertiesChangeListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodstorePeriodlistenerPeriodadditionalStorePaths = req.swagger.params['cq.store.listener.additionalStorePaths'].value;
  Configmgr.comDayCqAnalyticsImplStorePropertiesChangeListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodstorePeriodlistenerPeriodadditionalStorePaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte = function comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var allowedPeriodpaths = req.swagger.params['allowed.paths'].value;
  var cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize = req.swagger.params['cq.analytics.saint.exporter.pagesize'].value;
  Configmgr.comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte(post,apply,_delete,action,Dollarlocation,propertylist,allowedPeriodpaths,cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsSitecatalystImplImporterReportImporter = function comDayCqAnalyticsSitecatalystImplImporterReportImporter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var reportPeriodfetchPeriodattempts = req.swagger.params['report.fetch.attempts'].value;
  var reportPeriodfetchPerioddelay = req.swagger.params['report.fetch.delay'].value;
  Configmgr.comDayCqAnalyticsSitecatalystImplImporterReportImporter(post,apply,_delete,action,Dollarlocation,propertylist,reportPeriodfetchPeriodattempts,reportPeriodfetchPerioddelay)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory = function comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores = req.swagger.params['cq.analytics.adapterfactory.contextstores'].value;
  Configmgr.comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl = function comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl = req.swagger.params['cq.analytics.sitecatalyst.service.datacenter.url'].value;
  var devhostnamepatterns = req.swagger.params['devhostnamepatterns'].value;
  var connectionPeriodtimeout = req.swagger.params['connection.timeout'].value;
  var socketPeriodtimeout = req.swagger.params['socket.timeout'].value;
  Configmgr.comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl,devhostnamepatterns,connectionPeriodtimeout,socketPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater = function comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled = req.swagger.params['cq.analytics.testandtarget.accountoptionsupdater.enabled'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener = function comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled = req.swagger.params['cq.analytics.testandtarget.deleteauthoractivitylistener.enabled'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener = function comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled = req.swagger.params['cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplSegmentImporter = function comDayCqAnalyticsTestandtargetImplSegmentImporter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled = req.swagger.params['cq.analytics.testandtarget.segmentimporter.enabled'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplSegmentImporter(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl = function comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var endpointUri = req.swagger.params['endpointUri'].value;
  var connectionTimeout = req.swagger.params['connectionTimeout'].value;
  var socketTimeout = req.swagger.params['socketTimeout'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,endpointUri,connectionTimeout,socketTimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet = function comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var testandtargetPeriodendpointPeriodurl = req.swagger.params['testandtarget.endpoint.url'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet(post,apply,_delete,action,Dollarlocation,propertylist,testandtargetPeriodendpointPeriodurl)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl = function comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl = req.swagger.params['cq.analytics.testandtarget.api.url'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodtimeout = req.swagger.params['cq.analytics.testandtarget.timeout'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout = req.swagger.params['cq.analytics.testandtarget.sockettimeout'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace = req.swagger.params['cq.analytics.testandtarget.recommendations.url.replace'].value;
  var cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith = req.swagger.params['cq.analytics.testandtarget.recommendations.url.replacewith'].value;
  Configmgr.comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl,cqPeriodanalyticsPeriodtestandtargetPeriodtimeout,cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout,cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace,cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAuthImplCugCugSupportImpl = function comDayCqAuthImplCugCugSupportImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cugPeriodexemptedPeriodprincipals = req.swagger.params['cug.exempted.principals'].value;
  var cugPeriodenabled = req.swagger.params['cug.enabled'].value;
  var cugPeriodprincipalsPeriodregex = req.swagger.params['cug.principals.regex'].value;
  var cugPeriodprincipalsPeriodreplacement = req.swagger.params['cug.principals.replacement'].value;
  Configmgr.comDayCqAuthImplCugCugSupportImpl(post,apply,_delete,action,Dollarlocation,propertylist,cugPeriodexemptedPeriodprincipals,cugPeriodenabled,cugPeriodprincipalsPeriodregex,cugPeriodprincipalsPeriodreplacement)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqAuthImplLoginSelectorHandler = function comDayCqAuthImplLoginSelectorHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var authPeriodloginselectorPeriodmappings = req.swagger.params['auth.loginselector.mappings'].value;
  var authPeriodloginselectorPeriodchangepwPeriodmappings = req.swagger.params['auth.loginselector.changepw.mappings'].value;
  var authPeriodloginselectorPerioddefaultloginpage = req.swagger.params['auth.loginselector.defaultloginpage'].value;
  var authPeriodloginselectorPerioddefaultchangepwpage = req.swagger.params['auth.loginselector.defaultchangepwpage'].value;
  var authPeriodloginselectorPeriodhandle = req.swagger.params['auth.loginselector.handle'].value;
  var authPeriodloginselectorPeriodhandlePeriodallPeriodextensions = req.swagger.params['auth.loginselector.handle.all.extensions'].value;
  Configmgr.comDayCqAuthImplLoginSelectorHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,servicePeriodranking,authPeriodloginselectorPeriodmappings,authPeriodloginselectorPeriodchangepwPeriodmappings,authPeriodloginselectorPerioddefaultloginpage,authPeriodloginselectorPerioddefaultchangepwpage,authPeriodloginselectorPeriodhandle,authPeriodloginselectorPeriodhandlePeriodallPeriodextensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqCommonsImplExternalizerImpl = function comDayCqCommonsImplExternalizerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var externalizerPerioddomains = req.swagger.params['externalizer.domains'].value;
  var externalizerPeriodhost = req.swagger.params['externalizer.host'].value;
  var externalizerPeriodcontextpath = req.swagger.params['externalizer.contextpath'].value;
  var externalizerPeriodencodedpath = req.swagger.params['externalizer.encodedpath'].value;
  Configmgr.comDayCqCommonsImplExternalizerImpl(post,apply,_delete,action,Dollarlocation,propertylist,externalizerPerioddomains,externalizerPeriodhost,externalizerPeriodcontextpath,externalizerPeriodencodedpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqCommonsServletsRootMappingServlet = function comDayCqCommonsServletsRootMappingServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var rootmappingPeriodtarget = req.swagger.params['rootmapping.target'].value;
  Configmgr.comDayCqCommonsServletsRootMappingServlet(post,apply,_delete,action,Dollarlocation,propertylist,rootmappingPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke = function comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var codeupgradetasks = req.swagger.params['codeupgradetasks'].value;
  var codeupgradetaskfilters = req.swagger.params['codeupgradetaskfilters'].value;
  Configmgr.comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke(post,apply,_delete,action,Dollarlocation,propertylist,codeupgradetasks,codeupgradetaskfilters)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList = function comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var upgradeTaskIgnoreList = req.swagger.params['upgradeTaskIgnoreList'].value;
  Configmgr.comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList(post,apply,_delete,action,Dollarlocation,propertylist,upgradeTaskIgnoreList)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist = function comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var effectiveBundleListPath = req.swagger.params['effectiveBundleListPath'].value;
  Configmgr.comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist(post,apply,_delete,action,Dollarlocation,propertylist,effectiveBundleListPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqContentsyncImplContentSyncManagerImpl = function comDayCqContentsyncImplContentSyncManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var contentsyncPeriodfallbackPeriodauthorizable = req.swagger.params['contentsync.fallback.authorizable'].value;
  var contentsyncPeriodfallbackPeriodupdateuser = req.swagger.params['contentsync.fallback.updateuser'].value;
  Configmgr.comDayCqContentsyncImplContentSyncManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,contentsyncPeriodfallbackPeriodauthorizable,contentsyncPeriodfallbackPeriodupdateuser)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCommonsHandlerStandardImageHandler = function comDayCqDamCommonsHandlerStandardImageHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var largeUnderscorefileUnderscorethreshold = req.swagger.params['large_file_threshold'].value;
  var largeUnderscorecommentUnderscorethreshold = req.swagger.params['large_comment_threshold'].value;
  var cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction = req.swagger.params['cq.dam.enable.ext.meta.extraction'].value;
  Configmgr.comDayCqDamCommonsHandlerStandardImageHandler(post,apply,_delete,action,Dollarlocation,propertylist,largeUnderscorefileUnderscorethreshold,largeUnderscorecommentUnderscorethreshold,cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCommonsMetadataXmpFilterBlackWhite = function comDayCqDamCommonsMetadataXmpFilterBlackWhite (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var xmpPeriodfilterPeriodapplyUnderscorewhitelist = req.swagger.params['xmp.filter.apply_whitelist'].value;
  var xmpPeriodfilterPeriodwhitelist = req.swagger.params['xmp.filter.whitelist'].value;
  var xmpPeriodfilterPeriodapplyUnderscoreblacklist = req.swagger.params['xmp.filter.apply_blacklist'].value;
  var xmpPeriodfilterPeriodblacklist = req.swagger.params['xmp.filter.blacklist'].value;
  Configmgr.comDayCqDamCommonsMetadataXmpFilterBlackWhite(post,apply,_delete,action,Dollarlocation,propertylist,xmpPeriodfilterPeriodapplyUnderscorewhitelist,xmpPeriodfilterPeriodwhitelist,xmpPeriodfilterPeriodapplyUnderscoreblacklist,xmpPeriodfilterPeriodblacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCommonsUtilImplAssetCacheImpl = function comDayCqDamCommonsUtilImplAssetCacheImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var largePeriodfilePeriodmin = req.swagger.params['large.file.min'].value;
  var cachePeriodapply = req.swagger.params['cache.apply'].value;
  var mimePeriodtypes = req.swagger.params['mime.types'].value;
  Configmgr.comDayCqDamCommonsUtilImplAssetCacheImpl(post,apply,_delete,action,Dollarlocation,propertylist,largePeriodfilePeriodmin,cachePeriodapply,mimePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig = function comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth = req.swagger.params['cq.dam.config.annotation.pdf.document.width'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight = req.swagger.params['cq.dam.config.annotation.pdf.document.height'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal = req.swagger.params['cq.dam.config.annotation.pdf.document.padding.horizontal'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical = req.swagger.params['cq.dam.config.annotation.pdf.document.padding.vertical'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize = req.swagger.params['cq.dam.config.annotation.pdf.font.size'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor = req.swagger.params['cq.dam.config.annotation.pdf.font.color'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily = req.swagger.params['cq.dam.config.annotation.pdf.font.family'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight = req.swagger.params['cq.dam.config.annotation.pdf.font.light'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage = req.swagger.params['cq.dam.config.annotation.pdf.marginTextImage'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight = req.swagger.params['cq.dam.config.annotation.pdf.minImageHeight'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth = req.swagger.params['cq.dam.config.annotation.pdf.reviewStatus.width'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved = req.swagger.params['cq.dam.config.annotation.pdf.reviewStatus.color.approved'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected = req.swagger.params['cq.dam.config.annotation.pdf.reviewStatus.color.rejected'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested = req.swagger.params['cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth = req.swagger.params['cq.dam.config.annotation.pdf.annotationMarker.width'].value;
  var cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight = req.swagger.params['cq.dam.config.annotation.pdf.asset.minheight'].value;
  Configmgr.comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth,cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplAssetMoveListener = function comDayCqDamCoreImplAssetMoveListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.comDayCqDamCoreImplAssetMoveListener(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplAssethomeAssetHomePageConfiguration = function comDayCqDamCoreImplAssethomeAssetHomePageConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var isEnabled = req.swagger.params['isEnabled'].value;
  Configmgr.comDayCqDamCoreImplAssethomeAssetHomePageConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,isEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet = function comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize = req.swagger.params['cq.dam.adhoc.asset.share.prezip.maxcontentsize'].value;
  Configmgr.comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplCacheCQBufferedImageCache = function comDayCqDamCoreImplCacheCQBufferedImageCache (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory = req.swagger.params['cq.dam.image.cache.max.memory'].value;
  var cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage = req.swagger.params['cq.dam.image.cache.max.age'].value;
  var cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension = req.swagger.params['cq.dam.image.cache.max.dimension'].value;
  Configmgr.comDayCqDamCoreImplCacheCQBufferedImageCache(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory,cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage,cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplDamChangeEventListener = function comDayCqDamCoreImplDamChangeEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var changeeventlistenerPeriodobservedPeriodpaths = req.swagger.params['changeeventlistener.observed.paths'].value;
  Configmgr.comDayCqDamCoreImplDamChangeEventListener(post,apply,_delete,action,Dollarlocation,propertylist,changeeventlistenerPeriodobservedPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplDamEventPurgeService = function comDayCqDamCoreImplDamEventPurgeService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var maxSavedActivities = req.swagger.params['maxSavedActivities'].value;
  var saveInterval = req.swagger.params['saveInterval'].value;
  var enableActivityPurge = req.swagger.params['enableActivityPurge'].value;
  var eventTypes = req.swagger.params['eventTypes'].value;
  Configmgr.comDayCqDamCoreImplDamEventPurgeService(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,maxSavedActivities,saveInterval,enableActivityPurge,eventTypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplDamEventRecorderImpl = function comDayCqDamCoreImplDamEventRecorderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var eventPeriodqueuePeriodlength = req.swagger.params['event.queue.length'].value;
  var eventrecorderPeriodenabled = req.swagger.params['eventrecorder.enabled'].value;
  var eventrecorderPeriodblacklist = req.swagger.params['eventrecorder.blacklist'].value;
  var eventrecorderPeriodeventtypes = req.swagger.params['eventrecorder.eventtypes'].value;
  Configmgr.comDayCqDamCoreImplDamEventRecorderImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter,eventPeriodqueuePeriodlength,eventrecorderPeriodenabled,eventrecorderPeriodblacklist,eventrecorderPeriodeventtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplEventDamEventAuditListener = function comDayCqDamCoreImplEventDamEventAuditListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.comDayCqDamCoreImplEventDamEventAuditListener(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplExpiryNotificationJobImpl = function comDayCqDamCoreImplExpiryNotificationJobImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased = req.swagger.params['cq.dam.expiry.notification.scheduler.istimebased'].value;
  var cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule = req.swagger.params['cq.dam.expiry.notification.scheduler.timebased.rule'].value;
  var cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule = req.swagger.params['cq.dam.expiry.notification.scheduler.period.rule'].value;
  var sendUnderscoreemail = req.swagger.params['send_email'].value;
  var assetUnderscoreexpiredUnderscorelimit = req.swagger.params['asset_expired_limit'].value;
  var priorUnderscorenotificationUnderscoreseconds = req.swagger.params['prior_notification_seconds'].value;
  var cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol = req.swagger.params['cq.dam.expiry.notification.url.protocol'].value;
  Configmgr.comDayCqDamCoreImplExpiryNotificationJobImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased,cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule,cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule,sendUnderscoreemail,assetUnderscoreexpiredUnderscorelimit,priorUnderscorenotificationUnderscoreseconds,cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat = function comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var isEnabled = req.swagger.params['isEnabled'].value;
  Configmgr.comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat(post,apply,_delete,action,Dollarlocation,propertylist,isEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplGfxCommonsGfxRenderer = function comDayCqDamCoreImplGfxCommonsGfxRenderer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var skipPeriodbufferedcache = req.swagger.params['skip.bufferedcache'].value;
  Configmgr.comDayCqDamCoreImplGfxCommonsGfxRenderer(post,apply,_delete,action,Dollarlocation,propertylist,skipPeriodbufferedcache)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplHandlerEPSFormatHandler = function comDayCqDamCoreImplHandlerEPSFormatHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mimetype = req.swagger.params['mimetype'].value;
  Configmgr.comDayCqDamCoreImplHandlerEPSFormatHandler(post,apply,_delete,action,Dollarlocation,propertylist,mimetype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplHandlerIndesignFormatHandler = function comDayCqDamCoreImplHandlerIndesignFormatHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mimetype = req.swagger.params['mimetype'].value;
  Configmgr.comDayCqDamCoreImplHandlerIndesignFormatHandler(post,apply,_delete,action,Dollarlocation,propertylist,mimetype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplHandlerJpegHandler = function comDayCqDamCoreImplHandlerJpegHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction = req.swagger.params['cq.dam.enable.ext.meta.extraction'].value;
  var largeUnderscorefileUnderscorethreshold = req.swagger.params['large_file_threshold'].value;
  var largeUnderscorecommentUnderscorethreshold = req.swagger.params['large_comment_threshold'].value;
  Configmgr.comDayCqDamCoreImplHandlerJpegHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction,largeUnderscorefileUnderscorethreshold,largeUnderscorecommentUnderscorethreshold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplHandlerXmpNCommXMPHandler = function comDayCqDamCoreImplHandlerXmpNCommXMPHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var xmphandlerPeriodcqPeriodformats = req.swagger.params['xmphandler.cq.formats'].value;
  Configmgr.comDayCqDamCoreImplHandlerXmpNCommXMPHandler(post,apply,_delete,action,Dollarlocation,propertylist,xmphandlerPeriodcqPeriodformats)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplJmxAssetIndexUpdateMonitor = function comDayCqDamCoreImplJmxAssetIndexUpdateMonitor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jmxPeriodobjectname = req.swagger.params['jmx.objectname'].value;
  var propertyPeriodmeasurePeriodenabled = req.swagger.params['property.measure.enabled'].value;
  var propertyPeriodname = req.swagger.params['property.name'].value;
  var propertyPeriodmaxPeriodwaitPeriodms = req.swagger.params['property.max.wait.ms'].value;
  var propertyPeriodmaxPeriodrate = req.swagger.params['property.max.rate'].value;
  var fulltextPeriodmeasurePeriodenabled = req.swagger.params['fulltext.measure.enabled'].value;
  var fulltextPeriodname = req.swagger.params['fulltext.name'].value;
  var fulltextPeriodmaxPeriodwaitPeriodms = req.swagger.params['fulltext.max.wait.ms'].value;
  var fulltextPeriodmaxPeriodrate = req.swagger.params['fulltext.max.rate'].value;
  Configmgr.comDayCqDamCoreImplJmxAssetIndexUpdateMonitor(post,apply,_delete,action,Dollarlocation,propertylist,jmxPeriodobjectname,propertyPeriodmeasurePeriodenabled,propertyPeriodname,propertyPeriodmaxPeriodwaitPeriodms,propertyPeriodmaxPeriodrate,fulltextPeriodmeasurePeriodenabled,fulltextPeriodname,fulltextPeriodmaxPeriodwaitPeriodms,fulltextPeriodmaxPeriodrate)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplJmxAssetMigrationMBeanImpl = function comDayCqDamCoreImplJmxAssetMigrationMBeanImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jmxPeriodobjectname = req.swagger.params['jmx.objectname'].value;
  Configmgr.comDayCqDamCoreImplJmxAssetMigrationMBeanImpl(post,apply,_delete,action,Dollarlocation,propertylist,jmxPeriodobjectname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplJmxAssetUpdateMonitorImpl = function comDayCqDamCoreImplJmxAssetUpdateMonitorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jmxPeriodobjectname = req.swagger.params['jmx.objectname'].value;
  var active = req.swagger.params['active'].value;
  Configmgr.comDayCqDamCoreImplJmxAssetUpdateMonitorImpl(post,apply,_delete,action,Dollarlocation,propertylist,jmxPeriodobjectname,active)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig = function comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var operation = req.swagger.params['operation'].value;
  var emailEnabled = req.swagger.params['emailEnabled'].value;
  Configmgr.comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig(post,apply,_delete,action,Dollarlocation,propertylist,operation,emailEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig = function comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var operation = req.swagger.params['operation'].value;
  var operationIcon = req.swagger.params['operationIcon'].value;
  var topicName = req.swagger.params['topicName'].value;
  var emailEnabled = req.swagger.params['emailEnabled'].value;
  Configmgr.comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig(post,apply,_delete,action,Dollarlocation,propertylist,operation,operationIcon,topicName,emailEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplLightboxLightboxServlet = function comDayCqDamCoreImplLightboxLightboxServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodpaths = req.swagger.params['sling.servlet.paths'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  var cqPerioddamPeriodenablePeriodanonymous = req.swagger.params['cq.dam.enable.anonymous'].value;
  Configmgr.comDayCqDamCoreImplLightboxLightboxServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodpaths,slingPeriodservletPeriodmethods,cqPerioddamPeriodenablePeriodanonymous)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplMetadataEditorSelectComponentHandler = function comDayCqDamCoreImplMetadataEditorSelectComponentHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var graniteData = req.swagger.params['granite:data'].value;
  Configmgr.comDayCqDamCoreImplMetadataEditorSelectComponentHandler(post,apply,_delete,action,Dollarlocation,propertylist,graniteData)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper = function comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodallowPeriodallPeriodmime = req.swagger.params['cq.dam.allow.all.mime'].value;
  var cqPerioddamPeriodallowedPeriodassetPeriodmimes = req.swagger.params['cq.dam.allowed.asset.mimes'].value;
  Configmgr.comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodallowPeriodallPeriodmime,cqPerioddamPeriodallowedPeriodassetPeriodmimes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl = function comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent = req.swagger.params['cq.dam.detect.asset.mime.from.content'].value;
  Configmgr.comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplMissingMetadataNotificationJob = function comDayCqDamCoreImplMissingMetadataNotificationJob (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased = req.swagger.params['cq.dam.missingmetadata.notification.scheduler.istimebased'].value;
  var cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule = req.swagger.params['cq.dam.missingmetadata.notification.scheduler.timebased.rule'].value;
  var cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule = req.swagger.params['cq.dam.missingmetadata.notification.scheduler.period.rule'].value;
  var cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient = req.swagger.params['cq.dam.missingmetadata.notification.recipient'].value;
  Configmgr.comDayCqDamCoreImplMissingMetadataNotificationJob(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased,cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule,cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule,cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr = function comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var notify on Complete = req.swagger.params['Notify on Complete'].value;
  Configmgr.comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel,notify on Complete)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplProcessTextExtractionProcess = function comDayCqDamCoreImplProcessTextExtractionProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mimeTypes = req.swagger.params['mimeTypes'].value;
  var maxExtract = req.swagger.params['maxExtract'].value;
  Configmgr.comDayCqDamCoreImplProcessTextExtractionProcess(post,apply,_delete,action,Dollarlocation,propertylist,mimeTypes,maxExtract)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplRenditionMakerImpl = function comDayCqDamCoreImplRenditionMakerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var xmpPeriodpropagate = req.swagger.params['xmp.propagate'].value;
  var xmpPeriodexcludes = req.swagger.params['xmp.excludes'].value;
  Configmgr.comDayCqDamCoreImplRenditionMakerImpl(post,apply,_delete,action,Dollarlocation,propertylist,xmpPeriodpropagate,xmpPeriodexcludes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplReportsReportExportService = function comDayCqDamCoreImplReportsReportExportService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var queryBatchSize = req.swagger.params['queryBatchSize'].value;
  Configmgr.comDayCqDamCoreImplReportsReportExportService(post,apply,_delete,action,Dollarlocation,propertylist,queryBatchSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplReportsReportPurgeService = function comDayCqDamCoreImplReportsReportPurgeService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var maxSavedReports = req.swagger.params['maxSavedReports'].value;
  var timeDuration = req.swagger.params['timeDuration'].value;
  var enableReportPurge = req.swagger.params['enableReportPurge'].value;
  Configmgr.comDayCqDamCoreImplReportsReportPurgeService(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,maxSavedReports,timeDuration,enableReportPurge)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletAssetDownloadServlet = function comDayCqDamCoreImplServletAssetDownloadServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.comDayCqDamCoreImplServletAssetDownloadServlet(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletAssetStatusServlet = function comDayCqDamCoreImplServletAssetStatusServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets = req.swagger.params['cq.dam.batch.status.maxassets'].value;
  Configmgr.comDayCqDamCoreImplServletAssetStatusServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletAssetXMPSearchServlet = function comDayCqDamCoreImplServletAssetXMPSearchServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets = req.swagger.params['cq.dam.batch.indesign.maxassets'].value;
  Configmgr.comDayCqDamCoreImplServletAssetXMPSearchServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletBatchMetadataServlet = function comDayCqDamCoreImplServletBatchMetadataServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault = req.swagger.params['cq.dam.batch.metadata.asset.default'].value;
  var cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault = req.swagger.params['cq.dam.batch.metadata.collection.default'].value;
  var cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources = req.swagger.params['cq.dam.batch.metadata.maxresources'].value;
  Configmgr.comDayCqDamCoreImplServletBatchMetadataServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault,cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault,cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletBinaryProviderServlet = function comDayCqDamCoreImplServletBinaryProviderServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodresourceTypes = req.swagger.params['sling.servlet.resourceTypes'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  var cqPerioddamPerioddrmPeriodenable = req.swagger.params['cq.dam.drm.enable'].value;
  Configmgr.comDayCqDamCoreImplServletBinaryProviderServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodresourceTypes,slingPeriodservletPeriodmethods,cqPerioddamPerioddrmPeriodenable)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletCollectionServlet = function comDayCqDamCoreImplServletCollectionServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodbatchPeriodcollectionPeriodproperties = req.swagger.params['cq.dam.batch.collection.properties'].value;
  var cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections = req.swagger.params['cq.dam.batch.collection.maxcollections'].value;
  Configmgr.comDayCqDamCoreImplServletCollectionServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodbatchPeriodcollectionPeriodproperties,cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletCollectionsServlet = function comDayCqDamCoreImplServletCollectionsServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties = req.swagger.params['cq.dam.batch.collections.properties'].value;
  var cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit = req.swagger.params['cq.dam.batch.collections.limit'].value;
  Configmgr.comDayCqDamCoreImplServletCollectionsServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties,cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletCompanionServlet = function comDayCqDamCoreImplServletCompanionServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var more Info = req.swagger.params['More Info'].value;
  var SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket = req.swagger.params['/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}'].value;
  Configmgr.comDayCqDamCoreImplServletCompanionServlet(post,apply,_delete,action,Dollarlocation,propertylist,more Info,SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletCreateAssetServlet = function comDayCqDamCoreImplServletCreateAssetServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var detectUnderscoreduplicate = req.swagger.params['detect_duplicate'].value;
  Configmgr.comDayCqDamCoreImplServletCreateAssetServlet(post,apply,_delete,action,Dollarlocation,propertylist,detectUnderscoreduplicate)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletDamContentDispositionFilter = function comDayCqDamCoreImplServletDamContentDispositionFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodmimePeriodtypePeriodblacklist = req.swagger.params['cq.mime.type.blacklist'].value;
  var cqPerioddamPeriodemptyPeriodmime = req.swagger.params['cq.dam.empty.mime'].value;
  Configmgr.comDayCqDamCoreImplServletDamContentDispositionFilter(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodmimePeriodtypePeriodblacklist,cqPerioddamPeriodemptyPeriodmime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletGuidLookupFilter = function comDayCqDamCoreImplServletGuidLookupFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled = req.swagger.params['cq.dam.core.guidlookupfilter.enabled'].value;
  Configmgr.comDayCqDamCoreImplServletGuidLookupFilter(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletHealthCheckServlet = function comDayCqDamCoreImplServletHealthCheckServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodsyncPeriodworkflowPeriodid = req.swagger.params['cq.dam.sync.workflow.id'].value;
  var cqPerioddamPeriodsyncPeriodfolderPeriodtypes = req.swagger.params['cq.dam.sync.folder.types'].value;
  Configmgr.comDayCqDamCoreImplServletHealthCheckServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodsyncPeriodworkflowPeriodid,cqPerioddamPeriodsyncPeriodfolderPeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletMetadataGetServlet = function comDayCqDamCoreImplServletMetadataGetServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodresourceTypes = req.swagger.params['sling.servlet.resourceTypes'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  var slingPeriodservletPeriodextensions = req.swagger.params['sling.servlet.extensions'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  Configmgr.comDayCqDamCoreImplServletMetadataGetServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodresourceTypes,slingPeriodservletPeriodmethods,slingPeriodservletPeriodextensions,slingPeriodservletPeriodselectors)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletMultipleLicenseAcceptServlet = function comDayCqDamCoreImplServletMultipleLicenseAcceptServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPerioddrmPeriodenable = req.swagger.params['cq.dam.drm.enable'].value;
  Configmgr.comDayCqDamCoreImplServletMultipleLicenseAcceptServlet(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPerioddrmPeriodenable)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplServletResourceCollectionServlet = function comDayCqDamCoreImplServletResourceCollectionServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodresourceTypes = req.swagger.params['sling.servlet.resourceTypes'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var downloadPeriodconfig = req.swagger.params['download.config'].value;
  var viewPeriodselector = req.swagger.params['view.selector'].value;
  var sendUnderscoreemail = req.swagger.params['send_email'].value;
  Configmgr.comDayCqDamCoreImplServletResourceCollectionServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodresourceTypes,slingPeriodservletPeriodmethods,slingPeriodservletPeriodselectors,downloadPeriodconfig,viewPeriodselector,sendUnderscoreemail)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl = function comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var createPreviewEnabled = req.swagger.params['createPreviewEnabled'].value;
  var updatePreviewEnabled = req.swagger.params['updatePreviewEnabled'].value;
  var queueSize = req.swagger.params['queueSize'].value;
  var folderPreviewRenditionRegex = req.swagger.params['folderPreviewRenditionRegex'].value;
  Configmgr.comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl(post,apply,_delete,action,Dollarlocation,propertylist,createPreviewEnabled,updatePreviewEnabled,queueSize,folderPreviewRenditionRegex)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreImplUnzipUnzipConfig = function comDayCqDamCoreImplUnzipUnzipConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize = req.swagger.params['cq.dam.config.unzip.maxuncompressedsize'].value;
  var cqPerioddamPeriodconfigPeriodunzipPeriodencoding = req.swagger.params['cq.dam.config.unzip.encoding'].value;
  Configmgr.comDayCqDamCoreImplUnzipUnzipConfig(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize,cqPerioddamPeriodconfigPeriodunzipPeriodencoding)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreProcessExifToolExtractMetadataProcess = function comDayCqDamCoreProcessExifToolExtractMetadataProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var cqPerioddamPeriodenablePeriodsha1 = req.swagger.params['cq.dam.enable.sha1'].value;
  Configmgr.comDayCqDamCoreProcessExifToolExtractMetadataProcess(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel,cqPerioddamPeriodenablePeriodsha1)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreProcessExtractMetadataProcess = function comDayCqDamCoreProcessExtractMetadataProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var cqPerioddamPeriodenablePeriodsha1 = req.swagger.params['cq.dam.enable.sha1'].value;
  Configmgr.comDayCqDamCoreProcessExtractMetadataProcess(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel,cqPerioddamPeriodenablePeriodsha1)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamCoreProcessMetadataProcessorProcess = function comDayCqDamCoreProcessMetadataProcessorProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var cqPerioddamPeriodenablePeriodsha1 = req.swagger.params['cq.dam.enable.sha1'].value;
  var cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties = req.swagger.params['cq.dam.metadata.xssprotected.properties'].value;
  Configmgr.comDayCqDamCoreProcessMetadataProcessorProcess(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel,cqPerioddamPeriodenablePeriodsha1,cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamHandlerFfmpegLocatorImpl = function comDayCqDamHandlerFfmpegLocatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var executablePeriodsearchpath = req.swagger.params['executable.searchpath'].value;
  Configmgr.comDayCqDamHandlerFfmpegLocatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,executablePeriodsearchpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl = function comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var fontmgrPeriodsystemPeriodfontPerioddir = req.swagger.params['fontmgr.system.font.dir'].value;
  var fontmgrPeriodadobePeriodfontPerioddir = req.swagger.params['fontmgr.adobe.font.dir'].value;
  var fontmgrPeriodcustomerPeriodfontPerioddir = req.swagger.params['fontmgr.customer.font.dir'].value;
  Configmgr.comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter,fontmgrPeriodsystemPeriodfontPerioddir,fontmgrPeriodadobePeriodfontPerioddir,fontmgrPeriodcustomerPeriodfontPerioddir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamHandlerStandardPdfPdfHandler = function comDayCqDamHandlerStandardPdfPdfHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var rasterPeriodannotation = req.swagger.params['raster.annotation'].value;
  Configmgr.comDayCqDamHandlerStandardPdfPdfHandler(post,apply,_delete,action,Dollarlocation,propertylist,rasterPeriodannotation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamHandlerStandardPsPostScriptHandler = function comDayCqDamHandlerStandardPsPostScriptHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var rasterPeriodannotation = req.swagger.params['raster.annotation'].value;
  Configmgr.comDayCqDamHandlerStandardPsPostScriptHandler(post,apply,_delete,action,Dollarlocation,propertylist,rasterPeriodannotation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamHandlerStandardPsdPsdHandler = function comDayCqDamHandlerStandardPsdPsdHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var largeUnderscorefileUnderscorethreshold = req.swagger.params['large_file_threshold'].value;
  Configmgr.comDayCqDamHandlerStandardPsdPsdHandler(post,apply,_delete,action,Dollarlocation,propertylist,largeUnderscorefileUnderscorethreshold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamIdsImplIDSJobProcessor = function comDayCqDamIdsImplIDSJobProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enablePeriodmultisession = req.swagger.params['enable.multisession'].value;
  var idsPeriodccPeriodenable = req.swagger.params['ids.cc.enable'].value;
  var enablePeriodretry = req.swagger.params['enable.retry'].value;
  var enablePeriodretryPeriodscripterror = req.swagger.params['enable.retry.scripterror'].value;
  var externalizerPerioddomainPeriodcqhost = req.swagger.params['externalizer.domain.cqhost'].value;
  var externalizerPerioddomainPeriodhttp = req.swagger.params['externalizer.domain.http'].value;
  Configmgr.comDayCqDamIdsImplIDSJobProcessor(post,apply,_delete,action,Dollarlocation,propertylist,enablePeriodmultisession,idsPeriodccPeriodenable,enablePeriodretry,enablePeriodretryPeriodscripterror,externalizerPerioddomainPeriodcqhost,externalizerPerioddomainPeriodhttp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamIdsImplIDSPoolManagerImpl = function comDayCqDamIdsImplIDSPoolManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxPerioderrorsPeriodtoPeriodblacklist = req.swagger.params['max.errors.to.blacklist'].value;
  var retryPeriodintervalPeriodtoPeriodwhitelist = req.swagger.params['retry.interval.to.whitelist'].value;
  var connectPeriodtimeout = req.swagger.params['connect.timeout'].value;
  var socketPeriodtimeout = req.swagger.params['socket.timeout'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var connectionPeriodusePeriodmax = req.swagger.params['connection.use.max'].value;
  Configmgr.comDayCqDamIdsImplIDSPoolManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,maxPerioderrorsPeriodtoPeriodblacklist,retryPeriodintervalPeriodtoPeriodwhitelist,connectPeriodtimeout,socketPeriodtimeout,processPeriodlabel,connectionPeriodusePeriodmax)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamInddImplHandlerIndesignXMPHandler = function comDayCqDamInddImplHandlerIndesignXMPHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var extractPeriodpages = req.swagger.params['extract.pages'].value;
  Configmgr.comDayCqDamInddImplHandlerIndesignXMPHandler(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel,extractPeriodpages)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamInddImplServletSnippetCreationServlet = function comDayCqDamInddImplServletSnippetCreationServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var snippetcreationPeriodmaxcollections = req.swagger.params['snippetcreation.maxcollections'].value;
  Configmgr.comDayCqDamInddImplServletSnippetCreationServlet(post,apply,_delete,action,Dollarlocation,propertylist,snippetcreationPeriodmaxcollections)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamInddProcessINDDMediaExtractProcess = function comDayCqDamInddProcessINDDMediaExtractProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  var cqPerioddamPeriodinddPeriodpagesPeriodregex = req.swagger.params['cq.dam.indd.pages.regex'].value;
  var idsPeriodjobPerioddecoupled = req.swagger.params['ids.job.decoupled'].value;
  var idsPeriodjobPeriodworkflowPeriodmodel = req.swagger.params['ids.job.workflow.model'].value;
  Configmgr.comDayCqDamInddProcessINDDMediaExtractProcess(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel,cqPerioddamPeriodinddPeriodpagesPeriodregex,idsPeriodjobPerioddecoupled,idsPeriodjobPeriodworkflowPeriodmodel)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl = function comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var batchPeriodcommitPeriodsize = req.swagger.params['batch.commit.size'].value;
  Configmgr.comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl(post,apply,_delete,action,Dollarlocation,propertylist,batchPeriodcommitPeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob = function comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  Configmgr.comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro = function comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var deletePeriodzipPeriodfile = req.swagger.params['delete.zip.file'].value;
  Configmgr.comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro(post,apply,_delete,action,Dollarlocation,propertylist,deletePeriodzipPeriodfile)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven = function comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled = req.swagger.params['cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled'].value;
  Configmgr.comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner = function comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var schedulerPeriodconcurrent = req.swagger.params['scheduler.concurrent'].value;
  Configmgr.comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,schedulerPeriodconcurrent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonPostServletsSetCreateHandler = function comDayCqDamS7damCommonPostServletsSetCreateHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodpostPeriodoperation = req.swagger.params['sling.post.operation'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  Configmgr.comDayCqDamS7damCommonPostServletsSetCreateHandler(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodpostPeriodoperation,slingPeriodservletPeriodmethods)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonPostServletsSetModifyHandler = function comDayCqDamS7damCommonPostServletsSetModifyHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodpostPeriodoperation = req.swagger.params['sling.post.operation'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  Configmgr.comDayCqDamS7damCommonPostServletsSetModifyHandler(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodpostPeriodoperation,slingPeriodservletPeriodmethods)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess = function comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var processPeriodlabel = req.swagger.params['process.label'].value;
  Configmgr.comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess(post,apply,_delete,action,Dollarlocation,propertylist,processPeriodlabel)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonS7damDamChangeEventListener = function comDayCqDamS7damCommonS7damDamChangeEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled = req.swagger.params['cq.dam.s7dam.damchangeeventlistener.enabled'].value;
  Configmgr.comDayCqDamS7damCommonS7damDamChangeEventListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonServletsS7damProductInfoServlet = function comDayCqDamS7damCommonServletsS7damProductInfoServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodpaths = req.swagger.params['sling.servlet.paths'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  Configmgr.comDayCqDamS7damCommonServletsS7damProductInfoServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodpaths,slingPeriodservletPeriodmethods)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl = function comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name'].value;
  var cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname = req.swagger.params['cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name'].value;
  Configmgr.comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname,cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname,cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname,cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname,cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname,cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname,cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamScene7ImplScene7APIClientImpl = function comDayCqDamScene7ImplScene7APIClientImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname = req.swagger.params['cq.dam.scene7.apiclient.recordsperpage.nofilter.name'].value;
  var cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname = req.swagger.params['cq.dam.scene7.apiclient.recordsperpage.withfilter.name'].value;
  Configmgr.comDayCqDamScene7ImplScene7APIClientImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname,cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl = function comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping = req.swagger.params['cq.dam.scene7.assetmimetypeservice.mapping'].value;
  Configmgr.comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamScene7ImplScene7ConfigurationEventListener = function comDayCqDamScene7ImplScene7ConfigurationEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled = req.swagger.params['cq.dam.scene7.configurationeventlistener.enabled'].value;
  Configmgr.comDayCqDamScene7ImplScene7ConfigurationEventListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamScene7ImplScene7DamChangeEventListener = function comDayCqDamScene7ImplScene7DamChangeEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled = req.swagger.params['cq.dam.scene7.damchangeeventlistener.enabled'].value;
  var cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths = req.swagger.params['cq.dam.scene7.damchangeeventlistener.observed.paths'].value;
  Configmgr.comDayCqDamScene7ImplScene7DamChangeEventListener(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled,cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl = function comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var scene7FlashTemplatesPeriodrti = req.swagger.params['scene7FlashTemplates.rti'].value;
  var scene7FlashTemplatesPeriodrsi = req.swagger.params['scene7FlashTemplates.rsi'].value;
  var scene7FlashTemplatesPeriodrb = req.swagger.params['scene7FlashTemplates.rb'].value;
  var scene7FlashTemplatesPeriodrurl = req.swagger.params['scene7FlashTemplates.rurl'].value;
  var scene7FlashTemplatePeriodurlFormatParameter = req.swagger.params['scene7FlashTemplate.urlFormatParameter'].value;
  Configmgr.comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,scene7FlashTemplatesPeriodrti,scene7FlashTemplatesPeriodrsi,scene7FlashTemplatesPeriodrb,scene7FlashTemplatesPeriodrurl,scene7FlashTemplatePeriodurlFormatParameter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamScene7ImplScene7UploadServiceImpl = function comDayCqDamScene7ImplScene7UploadServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel = req.swagger.params['cq.dam.scene7.uploadservice.activejobtimeout.label'].value;
  var cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel = req.swagger.params['cq.dam.scene7.uploadservice.connectionmaxperroute.label'].value;
  Configmgr.comDayCqDamScene7ImplScene7UploadServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel,cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer = function comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var getCacheExpirationUnit = req.swagger.params['getCacheExpirationUnit'].value;
  var getCacheExpirationValue = req.swagger.params['getCacheExpirationValue'].value;
  Configmgr.comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer(post,apply,_delete,action,Dollarlocation,propertylist,getCacheExpirationUnit,getCacheExpirationValue)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamStockIntegrationImplConfigurationStockConfiguration = function comDayCqDamStockIntegrationImplConfigurationStockConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var locale = req.swagger.params['locale'].value;
  var imsConfig = req.swagger.params['imsConfig'].value;
  Configmgr.comDayCqDamStockIntegrationImplConfigurationStockConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,name,locale,imsConfig)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqDamVideoImplServletVideoTestServlet = function comDayCqDamVideoImplServletVideoTestServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.comDayCqDamVideoImplServletVideoTestServlet(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqExtwidgetServletsImageSpriteServlet = function comDayCqExtwidgetServletsImageSpriteServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxWidth = req.swagger.params['maxWidth'].value;
  var maxHeight = req.swagger.params['maxHeight'].value;
  Configmgr.comDayCqExtwidgetServletsImageSpriteServlet(post,apply,_delete,action,Dollarlocation,propertylist,maxWidth,maxHeight)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqImageInternalFontFontHelper = function comDayCqImageInternalFontFontHelper (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fontpath = req.swagger.params['fontpath'].value;
  var oversamplingFactor = req.swagger.params['oversamplingFactor'].value;
  Configmgr.comDayCqImageInternalFontFontHelper(post,apply,_delete,action,Dollarlocation,propertylist,fontpath,oversamplingFactor)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqJcrclustersupportClusterStartLevelController = function comDayCqJcrclustersupportClusterStartLevelController (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var clusterPeriodlevelPeriodenable = req.swagger.params['cluster.level.enable'].value;
  var clusterPeriodmasterPeriodlevel = req.swagger.params['cluster.master.level'].value;
  var clusterPeriodslavePeriodlevel = req.swagger.params['cluster.slave.level'].value;
  Configmgr.comDayCqJcrclustersupportClusterStartLevelController(post,apply,_delete,action,Dollarlocation,propertylist,clusterPeriodlevelPeriodenable,clusterPeriodmasterPeriodlevel,clusterPeriodslavePeriodlevel)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMailerDefaultMailService = function comDayCqMailerDefaultMailService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var smtpPeriodhost = req.swagger.params['smtp.host'].value;
  var smtpPeriodport = req.swagger.params['smtp.port'].value;
  var smtpPerioduser = req.swagger.params['smtp.user'].value;
  var smtpPeriodpassword = req.swagger.params['smtp.password'].value;
  var fromPeriodaddress = req.swagger.params['from.address'].value;
  var smtpPeriodssl = req.swagger.params['smtp.ssl'].value;
  var smtpPeriodstarttls = req.swagger.params['smtp.starttls'].value;
  var debugPeriodemail = req.swagger.params['debug.email'].value;
  Configmgr.comDayCqMailerDefaultMailService(post,apply,_delete,action,Dollarlocation,propertylist,smtpPeriodhost,smtpPeriodport,smtpPerioduser,smtpPeriodpassword,fromPeriodaddress,smtpPeriodssl,smtpPeriodstarttls,debugPeriodemail)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMailerImplCqMailingService = function comDayCqMailerImplCqMailingService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxPeriodrecipientPeriodcount = req.swagger.params['max.recipient.count'].value;
  Configmgr.comDayCqMailerImplCqMailingService(post,apply,_delete,action,Dollarlocation,propertylist,maxPeriodrecipientPeriodcount)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMailerImplEmailCqEmailTemplateFactory = function comDayCqMailerImplEmailCqEmailTemplateFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mailerPeriodemailPeriodcharset = req.swagger.params['mailer.email.charset'].value;
  Configmgr.comDayCqMailerImplEmailCqEmailTemplateFactory(post,apply,_delete,action,Dollarlocation,propertylist,mailerPeriodemailPeriodcharset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMailerImplEmailCqRetrieverTemplateFactory = function comDayCqMailerImplEmailCqRetrieverTemplateFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mailerPeriodemailPeriodembed = req.swagger.params['mailer.email.embed'].value;
  var mailerPeriodemailPeriodcharset = req.swagger.params['mailer.email.charset'].value;
  var mailerPeriodemailPeriodretrieverUserID = req.swagger.params['mailer.email.retrieverUserID'].value;
  var mailerPeriodemailPeriodretrieverUserPWD = req.swagger.params['mailer.email.retrieverUserPWD'].value;
  Configmgr.comDayCqMailerImplEmailCqRetrieverTemplateFactory(post,apply,_delete,action,Dollarlocation,propertylist,mailerPeriodemailPeriodembed,mailerPeriodemailPeriodcharset,mailerPeriodemailPeriodretrieverUserID,mailerPeriodemailPeriodretrieverUserPWD)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmCampaignImplIntegrationConfigImpl = function comDayCqMcmCampaignImplIntegrationConfigImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var aemPeriodmcmPeriodcampaignPeriodformConstraints = req.swagger.params['aem.mcm.campaign.formConstraints'].value;
  var aemPeriodmcmPeriodcampaignPeriodpublicUrl = req.swagger.params['aem.mcm.campaign.publicUrl'].value;
  var aemPeriodmcmPeriodcampaignPeriodrelaxedSSL = req.swagger.params['aem.mcm.campaign.relaxedSSL'].value;
  Configmgr.comDayCqMcmCampaignImplIntegrationConfigImpl(post,apply,_delete,action,Dollarlocation,propertylist,aemPeriodmcmPeriodcampaignPeriodformConstraints,aemPeriodmcmPeriodcampaignPeriodpublicUrl,aemPeriodmcmPeriodcampaignPeriodrelaxedSSL)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory = function comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl = function comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fromPeriodaddress = req.swagger.params['from.address'].value;
  var senderPeriodhost = req.swagger.params['sender.host'].value;
  var maxPeriodbouncePeriodcount = req.swagger.params['max.bounce.count'].value;
  Configmgr.comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,fromPeriodaddress,senderPeriodhost,maxPeriodbouncePeriodcount)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmImplMCMConfiguration = function comDayCqMcmImplMCMConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var experiencePeriodindirection = req.swagger.params['experience.indirection'].value;
  var touchpointPeriodindirection = req.swagger.params['touchpoint.indirection'].value;
  Configmgr.comDayCqMcmImplMCMConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,experiencePeriodindirection,touchpointPeriodindirection)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen = function comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug = function comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent = function comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa = function comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH = function comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqNotificationImplNotificationServiceImpl = function comDayCqNotificationImplNotificationServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  Configmgr.comDayCqNotificationImplNotificationServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqPersonalizationImplServletsTargetingConfigurationServlet = function comDayCqPersonalizationImplServletsTargetingConfigurationServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var forcelocation = req.swagger.params['forcelocation'].value;
  Configmgr.comDayCqPersonalizationImplServletsTargetingConfigurationServlet(post,apply,_delete,action,Dollarlocation,propertylist,forcelocation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqPollingImporterImplManagedPollConfigImpl = function comDayCqPollingImporterImplManagedPollConfigImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var id = req.swagger.params['id'].value;
  var enabled = req.swagger.params['enabled'].value;
  var reference = req.swagger.params['reference'].value;
  var interval = req.swagger.params['interval'].value;
  var expression = req.swagger.params['expression'].value;
  var source = req.swagger.params['source'].value;
  var target = req.swagger.params['target'].value;
  var login = req.swagger.params['login'].value;
  var password = req.swagger.params['password'].value;
  Configmgr.comDayCqPollingImporterImplManagedPollConfigImpl(post,apply,_delete,action,Dollarlocation,propertylist,id,enabled,reference,interval,expression,source,target,login,password)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqPollingImporterImplManagedPollingImporterImpl = function comDayCqPollingImporterImplManagedPollingImporterImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var importerPerioduser = req.swagger.params['importer.user'].value;
  Configmgr.comDayCqPollingImporterImplManagedPollingImporterImpl(post,apply,_delete,action,Dollarlocation,propertylist,importerPerioduser)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqPollingImporterImplPollingImporterImpl = function comDayCqPollingImporterImplPollingImporterImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var importerPeriodminPeriodinterval = req.swagger.params['importer.min.interval'].value;
  var importerPerioduser = req.swagger.params['importer.user'].value;
  var excludePeriodpaths = req.swagger.params['exclude.paths'].value;
  var includePeriodpaths = req.swagger.params['include.paths'].value;
  Configmgr.comDayCqPollingImporterImplPollingImporterImpl(post,apply,_delete,action,Dollarlocation,propertylist,importerPeriodminPeriodinterval,importerPerioduser,excludePeriodpaths,includePeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationAuditReplicationEventListener = function comDayCqReplicationAuditReplicationEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.comDayCqReplicationAuditReplicationEventListener(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationContentStaticContentBuilder = function comDayCqReplicationContentStaticContentBuilder (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var host = req.swagger.params['host'].value;
  var port = req.swagger.params['port'].value;
  Configmgr.comDayCqReplicationContentStaticContentBuilder(post,apply,_delete,action,Dollarlocation,propertylist,host,port)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplAgentManagerImpl = function comDayCqReplicationImplAgentManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jobPeriodtopics = req.swagger.params['job.topics'].value;
  var serviceUserPeriodtarget = req.swagger.params['serviceUser.target'].value;
  var agentProviderPeriodtarget = req.swagger.params['agentProvider.target'].value;
  Configmgr.comDayCqReplicationImplAgentManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,jobPeriodtopics,serviceUserPeriodtarget,agentProviderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplContentDurboBinaryLessContentBuilder = function comDayCqReplicationImplContentDurboBinaryLessContentBuilder (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var binaryPeriodthreshold = req.swagger.params['binary.threshold'].value;
  Configmgr.comDayCqReplicationImplContentDurboBinaryLessContentBuilder(post,apply,_delete,action,Dollarlocation,propertylist,binaryPeriodthreshold)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplContentDurboDurboImportConfigurationProv = function comDayCqReplicationImplContentDurboDurboImportConfigurationProv (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var preservePeriodhierarchyPeriodnodes = req.swagger.params['preserve.hierarchy.nodes'].value;
  var ignorePeriodversioning = req.swagger.params['ignore.versioning'].value;
  var importPeriodacl = req.swagger.params['import.acl'].value;
  var savePeriodthreshold = req.swagger.params['save.threshold'].value;
  var preservePerioduserPeriodpaths = req.swagger.params['preserve.user.paths'].value;
  var preservePerioduuid = req.swagger.params['preserve.uuid'].value;
  var preservePerioduuidPeriodnodetypes = req.swagger.params['preserve.uuid.nodetypes'].value;
  var preservePerioduuidPeriodsubtrees = req.swagger.params['preserve.uuid.subtrees'].value;
  var autoPeriodcommit = req.swagger.params['auto.commit'].value;
  Configmgr.comDayCqReplicationImplContentDurboDurboImportConfigurationProv(post,apply,_delete,action,Dollarlocation,propertylist,preservePeriodhierarchyPeriodnodes,ignorePeriodversioning,importPeriodacl,savePeriodthreshold,preservePerioduserPeriodpaths,preservePerioduuid,preservePerioduuidPeriodnodetypes,preservePerioduuidPeriodsubtrees,autoPeriodcommit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplReplicationContentFactoryProviderImpl = function comDayCqReplicationImplReplicationContentFactoryProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var replicationPeriodcontentPerioduseFileStorage = req.swagger.params['replication.content.useFileStorage'].value;
  var replicationPeriodcontentPeriodmaxCommitAttempts = req.swagger.params['replication.content.maxCommitAttempts'].value;
  Configmgr.comDayCqReplicationImplReplicationContentFactoryProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,replicationPeriodcontentPerioduseFileStorage,replicationPeriodcontentPeriodmaxCommitAttempts)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplReplicationReceiverImpl = function comDayCqReplicationImplReplicationReceiverImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var receiverPeriodtmpfilePeriodthreshold = req.swagger.params['receiver.tmpfile.threshold'].value;
  var receiverPeriodpackagesPeriodusePeriodinstall = req.swagger.params['receiver.packages.use.install'].value;
  Configmgr.comDayCqReplicationImplReplicationReceiverImpl(post,apply,_delete,action,Dollarlocation,propertylist,receiverPeriodtmpfilePeriodthreshold,receiverPeriodpackagesPeriodusePeriodinstall)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplReplicatorImpl = function comDayCqReplicationImplReplicatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var distributeUnderscoreevents = req.swagger.params['distribute_events'].value;
  Configmgr.comDayCqReplicationImplReplicatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,distributeUnderscoreevents)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplReverseReplicator = function comDayCqReplicationImplReverseReplicator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodperiod = req.swagger.params['scheduler.period'].value;
  Configmgr.comDayCqReplicationImplReverseReplicator(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodperiod)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplTransportBinaryLessTransportHandler = function comDayCqReplicationImplTransportBinaryLessTransportHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var disabledPeriodcipherPeriodsuites = req.swagger.params['disabled.cipher.suites'].value;
  var enabledPeriodcipherPeriodsuites = req.swagger.params['enabled.cipher.suites'].value;
  Configmgr.comDayCqReplicationImplTransportBinaryLessTransportHandler(post,apply,_delete,action,Dollarlocation,propertylist,disabledPeriodcipherPeriodsuites,enabledPeriodcipherPeriodsuites)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReplicationImplTransportHttp = function comDayCqReplicationImplTransportHttp (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var disabledPeriodcipherPeriodsuites = req.swagger.params['disabled.cipher.suites'].value;
  var enabledPeriodcipherPeriodsuites = req.swagger.params['enabled.cipher.suites'].value;
  Configmgr.comDayCqReplicationImplTransportHttp(post,apply,_delete,action,Dollarlocation,propertylist,disabledPeriodcipherPeriodsuites,enabledPeriodcipherPeriodsuites)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReportingImplCacheCacheImpl = function comDayCqReportingImplCacheCacheImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var repcachePeriodenable = req.swagger.params['repcache.enable'].value;
  var repcachePeriodttl = req.swagger.params['repcache.ttl'].value;
  var repcachePeriodmax = req.swagger.params['repcache.max'].value;
  Configmgr.comDayCqReportingImplCacheCacheImpl(post,apply,_delete,action,Dollarlocation,propertylist,repcachePeriodenable,repcachePeriodttl,repcachePeriodmax)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReportingImplConfigServiceImpl = function comDayCqReportingImplConfigServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var repconfPeriodtimezone = req.swagger.params['repconf.timezone'].value;
  var repconfPeriodlocale = req.swagger.params['repconf.locale'].value;
  var repconfPeriodsnapshots = req.swagger.params['repconf.snapshots'].value;
  var repconfPeriodrepdir = req.swagger.params['repconf.repdir'].value;
  var repconfPeriodhourofday = req.swagger.params['repconf.hourofday'].value;
  var repconfPeriodminofhour = req.swagger.params['repconf.minofhour'].value;
  var repconfPeriodmaxrows = req.swagger.params['repconf.maxrows'].value;
  var repconfPeriodfakedata = req.swagger.params['repconf.fakedata'].value;
  var repconfPeriodsnapshotuser = req.swagger.params['repconf.snapshotuser'].value;
  var repconfPeriodenforcesnapshotuser = req.swagger.params['repconf.enforcesnapshotuser'].value;
  Configmgr.comDayCqReportingImplConfigServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,repconfPeriodtimezone,repconfPeriodlocale,repconfPeriodsnapshots,repconfPeriodrepdir,repconfPeriodhourofday,repconfPeriodminofhour,repconfPeriodmaxrows,repconfPeriodfakedata,repconfPeriodsnapshotuser,repconfPeriodenforcesnapshotuser)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqReportingImplRLogAnalyzer = function comDayCqReportingImplRLogAnalyzer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var requestPeriodlogPeriodoutput = req.swagger.params['request.log.output'].value;
  Configmgr.comDayCqReportingImplRLogAnalyzer(post,apply,_delete,action,Dollarlocation,propertylist,requestPeriodlogPeriodoutput)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqRewriterLinkcheckerImplLinkCheckerImpl = function comDayCqRewriterLinkcheckerImplLinkCheckerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodperiod = req.swagger.params['scheduler.period'].value;
  var schedulerPeriodconcurrent = req.swagger.params['scheduler.concurrent'].value;
  var servicePeriodbadUnderscorelinkUnderscoretoleranceUnderscoreinterval = req.swagger.params['service.bad_link_tolerance_interval'].value;
  var servicePeriodcheckUnderscoreoverrideUnderscorepatterns = req.swagger.params['service.check_override_patterns'].value;
  var servicePeriodcacheUnderscorebrokenUnderscoreinternalUnderscorelinks = req.swagger.params['service.cache_broken_internal_links'].value;
  var servicePeriodspecialUnderscorelinkUnderscoreprefix = req.swagger.params['service.special_link_prefix'].value;
  var servicePeriodspecialUnderscorelinkUnderscorepatterns = req.swagger.params['service.special_link_patterns'].value;
  Configmgr.comDayCqRewriterLinkcheckerImplLinkCheckerImpl(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodperiod,schedulerPeriodconcurrent,servicePeriodbadUnderscorelinkUnderscoretoleranceUnderscoreinterval,servicePeriodcheckUnderscoreoverrideUnderscorepatterns,servicePeriodcacheUnderscorebrokenUnderscoreinternalUnderscorelinks,servicePeriodspecialUnderscorelinkUnderscoreprefix,servicePeriodspecialUnderscorelinkUnderscorepatterns)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqRewriterLinkcheckerImplLinkCheckerTask = function comDayCqRewriterLinkcheckerImplLinkCheckerTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodperiod = req.swagger.params['scheduler.period'].value;
  var schedulerPeriodconcurrent = req.swagger.params['scheduler.concurrent'].value;
  var goodUnderscorelinkUnderscoretestUnderscoreinterval = req.swagger.params['good_link_test_interval'].value;
  var badUnderscorelinkUnderscoretestUnderscoreinterval = req.swagger.params['bad_link_test_interval'].value;
  var linkUnderscoreunusedUnderscoreinterval = req.swagger.params['link_unused_interval'].value;
  var connectionPeriodtimeout = req.swagger.params['connection.timeout'].value;
  Configmgr.comDayCqRewriterLinkcheckerImplLinkCheckerTask(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodperiod,schedulerPeriodconcurrent,goodUnderscorelinkUnderscoretestUnderscoreinterval,badUnderscorelinkUnderscoretestUnderscoreinterval,linkUnderscoreunusedUnderscoreinterval,connectionPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory = function comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var linkcheckertransformerPerioddisableRewriting = req.swagger.params['linkcheckertransformer.disableRewriting'].value;
  var linkcheckertransformerPerioddisableChecking = req.swagger.params['linkcheckertransformer.disableChecking'].value;
  var linkcheckertransformerPeriodmapCacheSize = req.swagger.params['linkcheckertransformer.mapCacheSize'].value;
  var linkcheckertransformerPeriodstrictExtensionCheck = req.swagger.params['linkcheckertransformer.strictExtensionCheck'].value;
  var linkcheckertransformerPeriodstripHtmltExtension = req.swagger.params['linkcheckertransformer.stripHtmltExtension'].value;
  var linkcheckertransformerPeriodrewriteElements = req.swagger.params['linkcheckertransformer.rewriteElements'].value;
  var linkcheckertransformerPeriodstripExtensionPathBlacklist = req.swagger.params['linkcheckertransformer.stripExtensionPathBlacklist'].value;
  Configmgr.comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory(post,apply,_delete,action,Dollarlocation,propertylist,linkcheckertransformerPerioddisableRewriting,linkcheckertransformerPerioddisableChecking,linkcheckertransformerPeriodmapCacheSize,linkcheckertransformerPeriodstrictExtensionCheck,linkcheckertransformerPeriodstripHtmltExtension,linkcheckertransformerPeriodrewriteElements,linkcheckertransformerPeriodstripExtensionPathBlacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl = function comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodmaxUnderscorelinksUnderscoreperUnderscorehost = req.swagger.params['service.max_links_per_host'].value;
  var servicePeriodsaveUnderscoreexternalUnderscorelinkUnderscorereferences = req.swagger.params['service.save_external_link_references'].value;
  Configmgr.comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodmaxUnderscorelinksUnderscoreperUnderscorehost,servicePeriodsaveUnderscoreexternalUnderscorelinkUnderscorereferences)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqRewriterProcessorImplHtmlParserFactory = function comDayCqRewriterProcessorImplHtmlParserFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var htmlparserPeriodprocessTags = req.swagger.params['htmlparser.processTags'].value;
  var htmlparserPeriodpreserveCamelCase = req.swagger.params['htmlparser.preserveCamelCase'].value;
  Configmgr.comDayCqRewriterProcessorImplHtmlParserFactory(post,apply,_delete,action,Dollarlocation,propertylist,htmlparserPeriodprocessTags,htmlparserPeriodpreserveCamelCase)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqSearchImplBuilderQueryBuilderImpl = function comDayCqSearchImplBuilderQueryBuilderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var excerptPeriodproperties = req.swagger.params['excerpt.properties'].value;
  var cachePeriodmaxPeriodentries = req.swagger.params['cache.max.entries'].value;
  var cachePeriodentryPeriodlifetime = req.swagger.params['cache.entry.lifetime'].value;
  var xpathPeriodunion = req.swagger.params['xpath.union'].value;
  Configmgr.comDayCqSearchImplBuilderQueryBuilderImpl(post,apply,_delete,action,Dollarlocation,propertylist,excerptPeriodproperties,cachePeriodmaxPeriodentries,cachePeriodentryPeriodlifetime,xpathPeriodunion)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqSearchSuggestImplSuggestionIndexManagerImpl = function comDayCqSearchSuggestImplSuggestionIndexManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pathBuilderPeriodtarget = req.swagger.params['pathBuilder.target'].value;
  var suggestPeriodbasepath = req.swagger.params['suggest.basepath'].value;
  Configmgr.comDayCqSearchSuggestImplSuggestionIndexManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,pathBuilderPeriodtarget,suggestPeriodbasepath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler = function comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodsearchpromotePeriodconfighandlerPeriodenabled = req.swagger.params['cq.searchpromote.confighandler.enabled'].value;
  Configmgr.comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodsearchpromotePeriodconfighandlerPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqSearchpromoteImplSearchPromoteServiceImpl = function comDayCqSearchpromoteImplSearchPromoteServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri = req.swagger.params['cq.searchpromote.configuration.server.uri'].value;
  var cqPeriodsearchpromotePeriodconfigurationPeriodenvironment = req.swagger.params['cq.searchpromote.configuration.environment'].value;
  var connectionPeriodtimeout = req.swagger.params['connection.timeout'].value;
  var socketPeriodtimeout = req.swagger.params['socket.timeout'].value;
  Configmgr.comDayCqSearchpromoteImplSearchPromoteServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri,cqPeriodsearchpromotePeriodconfigurationPeriodenvironment,connectionPeriodtimeout,socketPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqSecurityACLSetup = function comDayCqSecurityACLSetup (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodaclsetupPeriodrules = req.swagger.params['cq.aclsetup.rules'].value;
  Configmgr.comDayCqSecurityACLSetup(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodaclsetupPeriodrules)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqStatisticsImplStatisticsServiceImpl = function comDayCqStatisticsImplStatisticsServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodperiod = req.swagger.params['scheduler.period'].value;
  var schedulerPeriodconcurrent = req.swagger.params['scheduler.concurrent'].value;
  var path = req.swagger.params['path'].value;
  var workspace = req.swagger.params['workspace'].value;
  var keywordsPath = req.swagger.params['keywordsPath'].value;
  var asyncEntries = req.swagger.params['asyncEntries'].value;
  Configmgr.comDayCqStatisticsImplStatisticsServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodperiod,schedulerPeriodconcurrent,path,workspace,keywordsPath,asyncEntries)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqTaggingImplJcrTagManagerFactoryImpl = function comDayCqTaggingImplJcrTagManagerFactoryImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var validationPeriodenabled = req.swagger.params['validation.enabled'].value;
  Configmgr.comDayCqTaggingImplJcrTagManagerFactoryImpl(post,apply,_delete,action,Dollarlocation,propertylist,validationPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqTaggingImplSearchTagPredicateEvaluator = function comDayCqTaggingImplSearchTagPredicateEvaluator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var ignoreUnderscorepath = req.swagger.params['ignore_path'].value;
  Configmgr.comDayCqTaggingImplSearchTagPredicateEvaluator(post,apply,_delete,action,Dollarlocation,propertylist,ignoreUnderscorepath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqTaggingImplTagGarbageCollector = function comDayCqTaggingImplTagGarbageCollector (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  Configmgr.comDayCqTaggingImplTagGarbageCollector(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmContentsyncImplHandlerPagesUpdateHandler = function comDayCqWcmContentsyncImplHandlerPagesUpdateHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodpagesupdatehandlerPeriodimageresourcetypes = req.swagger.params['cq.pagesupdatehandler.imageresourcetypes'].value;
  Configmgr.comDayCqWcmContentsyncImplHandlerPagesUpdateHandler(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodpagesupdatehandlerPeriodimageresourcetypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor = function comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks = req.swagger.params['cq.contentsync.pathrewritertransformer.mapping.links'].value;
  var cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs = req.swagger.params['cq.contentsync.pathrewritertransformer.mapping.clientlibs'].value;
  var cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages = req.swagger.params['cq.contentsync.pathrewritertransformer.mapping.images'].value;
  var cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern = req.swagger.params['cq.contentsync.pathrewritertransformer.attribute.pattern'].value;
  var cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern = req.swagger.params['cq.contentsync.pathrewritertransformer.clientlibrary.pattern'].value;
  var cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace = req.swagger.params['cq.contentsync.pathrewritertransformer.clientlibrary.replace'].value;
  Configmgr.comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks,cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs,cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages,cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern,cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern,cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplAuthoringUIModeServiceImpl = function comDayCqWcmCoreImplAuthoringUIModeServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var authoringUIModeServicePerioddefault = req.swagger.params['authoringUIModeService.default'].value;
  Configmgr.comDayCqWcmCoreImplAuthoringUIModeServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,authoringUIModeServicePerioddefault)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplCommandsWCMCommandServlet = function comDayCqWcmCoreImplCommandsWCMCommandServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var wcmcommandservletPerioddeleteUnderscorewhitelist = req.swagger.params['wcmcommandservlet.delete_whitelist'].value;
  Configmgr.comDayCqWcmCoreImplCommandsWCMCommandServlet(post,apply,_delete,action,Dollarlocation,propertylist,wcmcommandservletPerioddeleteUnderscorewhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl = function comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var dimPerioddefaultPeriodmode = req.swagger.params['dim.default.mode'].value;
  var dimPeriodappcachePeriodenabled = req.swagger.params['dim.appcache.enabled'].value;
  Configmgr.comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl(post,apply,_delete,action,Dollarlocation,propertylist,dimPerioddefaultPeriodmode,dimPeriodappcachePeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplEventPageEventAuditListener = function comDayCqWcmCoreImplEventPageEventAuditListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var configured = req.swagger.params['configured'].value;
  Configmgr.comDayCqWcmCoreImplEventPageEventAuditListener(post,apply,_delete,action,Dollarlocation,propertylist,configured)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplEventPagePostProcessor = function comDayCqWcmCoreImplEventPagePostProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var paths = req.swagger.params['paths'].value;
  Configmgr.comDayCqWcmCoreImplEventPagePostProcessor(post,apply,_delete,action,Dollarlocation,propertylist,paths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplEventRepositoryChangeEventListener = function comDayCqWcmCoreImplEventRepositoryChangeEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var paths = req.swagger.params['paths'].value;
  var excludedPaths = req.swagger.params['excludedPaths'].value;
  Configmgr.comDayCqWcmCoreImplEventRepositoryChangeEventListener(post,apply,_delete,action,Dollarlocation,propertylist,paths,excludedPaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplEventTemplatePostProcessor = function comDayCqWcmCoreImplEventTemplatePostProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var paths = req.swagger.params['paths'].value;
  Configmgr.comDayCqWcmCoreImplEventTemplatePostProcessor(post,apply,_delete,action,Dollarlocation,propertylist,paths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplLanguageManagerImpl = function comDayCqWcmCoreImplLanguageManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var langmgrPeriodlistPeriodpath = req.swagger.params['langmgr.list.path'].value;
  var langmgrPeriodcountryPerioddefault = req.swagger.params['langmgr.country.default'].value;
  Configmgr.comDayCqWcmCoreImplLanguageManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,langmgrPeriodlistPeriodpath,langmgrPeriodcountryPerioddefault)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl = function comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var linkPeriodexpiredPeriodprefix = req.swagger.params['link.expired.prefix'].value;
  var linkPeriodexpiredPeriodremove = req.swagger.params['link.expired.remove'].value;
  var linkPeriodexpiredPeriodsuffix = req.swagger.params['link.expired.suffix'].value;
  var linkPeriodinvalidPeriodprefix = req.swagger.params['link.invalid.prefix'].value;
  var linkPeriodinvalidPeriodremove = req.swagger.params['link.invalid.remove'].value;
  var linkPeriodinvalidPeriodsuffix = req.swagger.params['link.invalid.suffix'].value;
  var linkPeriodpredatedPeriodprefix = req.swagger.params['link.predated.prefix'].value;
  var linkPeriodpredatedPeriodremove = req.swagger.params['link.predated.remove'].value;
  var linkPeriodpredatedPeriodsuffix = req.swagger.params['link.predated.suffix'].value;
  var linkPeriodwcmmodes = req.swagger.params['link.wcmmodes'].value;
  Configmgr.comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl(post,apply,_delete,action,Dollarlocation,propertylist,linkPeriodexpiredPeriodprefix,linkPeriodexpiredPeriodremove,linkPeriodexpiredPeriodsuffix,linkPeriodinvalidPeriodprefix,linkPeriodinvalidPeriodremove,linkPeriodinvalidPeriodsuffix,linkPeriodpredatedPeriodprefix,linkPeriodpredatedPeriodremove,linkPeriodpredatedPeriodsuffix,linkPeriodwcmmodes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplPagePageInfoAggregatorImpl = function comDayCqWcmCoreImplPagePageInfoAggregatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault = req.swagger.params['page.info.provider.property.regex.default'].value;
  var pagePeriodinfoPeriodproviderPeriodpropertyPeriodname = req.swagger.params['page.info.provider.property.name'].value;
  Configmgr.comDayCqWcmCoreImplPagePageInfoAggregatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault,pagePeriodinfoPeriodproviderPeriodpropertyPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplPagePageManagerFactoryImpl = function comDayCqWcmCoreImplPagePageManagerFactoryImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var illegalCharMapping = req.swagger.params['illegalCharMapping'].value;
  var pageSubTreeActivationCheck = req.swagger.params['pageSubTreeActivationCheck'].value;
  Configmgr.comDayCqWcmCoreImplPagePageManagerFactoryImpl(post,apply,_delete,action,Dollarlocation,propertylist,illegalCharMapping,pageSubTreeActivationCheck)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplReferencesContentContentReferenceConfig = function comDayCqWcmCoreImplReferencesContentContentReferenceConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var contentReferenceConfigPeriodresourceTypes = req.swagger.params['contentReferenceConfig.resourceTypes'].value;
  Configmgr.comDayCqWcmCoreImplReferencesContentContentReferenceConfig(post,apply,_delete,action,Dollarlocation,propertylist,contentReferenceConfigPeriodresourceTypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplServletsContentfinderAssetViewHandler = function comDayCqWcmCoreImplServletsContentfinderAssetViewHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var damPeriodshowexpired = req.swagger.params['dam.showexpired'].value;
  var damPeriodshowhidden = req.swagger.params['dam.showhidden'].value;
  var tagTitleSearch = req.swagger.params['tagTitleSearch'].value;
  var guessTotal = req.swagger.params['guessTotal'].value;
  var damPeriodexpiryProperty = req.swagger.params['dam.expiryProperty'].value;
  Configmgr.comDayCqWcmCoreImplServletsContentfinderAssetViewHandler(post,apply,_delete,action,Dollarlocation,propertylist,damPeriodshowexpired,damPeriodshowhidden,tagTitleSearch,guessTotal,damPeriodexpiryProperty)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie = function comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var itemPeriodresourcePeriodtypes = req.swagger.params['item.resource.types'].value;
  Configmgr.comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie(post,apply,_delete,action,Dollarlocation,propertylist,itemPeriodresourcePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplServletsContentfinderPageViewHandler = function comDayCqWcmCoreImplServletsContentfinderPageViewHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var guessTotal = req.swagger.params['guessTotal'].value;
  var tagTitleSearch = req.swagger.params['tagTitleSearch'].value;
  Configmgr.comDayCqWcmCoreImplServletsContentfinderPageViewHandler(post,apply,_delete,action,Dollarlocation,propertylist,guessTotal,tagTitleSearch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplServletsFindReplaceServlet = function comDayCqWcmCoreImplServletsFindReplaceServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var scope = req.swagger.params['scope'].value;
  Configmgr.comDayCqWcmCoreImplServletsFindReplaceServlet(post,apply,_delete,action,Dollarlocation,propertylist,scope)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplServletsReferenceSearchServlet = function comDayCqWcmCoreImplServletsReferenceSearchServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var referencesearchservletPeriodmaxReferencesPerPage = req.swagger.params['referencesearchservlet.maxReferencesPerPage'].value;
  var referencesearchservletPeriodmaxPages = req.swagger.params['referencesearchservlet.maxPages'].value;
  Configmgr.comDayCqWcmCoreImplServletsReferenceSearchServlet(post,apply,_delete,action,Dollarlocation,propertylist,referencesearchservletPeriodmaxReferencesPerPage,referencesearchservletPeriodmaxPages)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplServletsThumbnailServlet = function comDayCqWcmCoreImplServletsThumbnailServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var workspace = req.swagger.params['workspace'].value;
  var dimensions = req.swagger.params['dimensions'].value;
  Configmgr.comDayCqWcmCoreImplServletsThumbnailServlet(post,apply,_delete,action,Dollarlocation,propertylist,workspace,dimensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplUtilsDefaultPageNameValidator = function comDayCqWcmCoreImplUtilsDefaultPageNameValidator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var nonValidChars = req.swagger.params['nonValidChars'].value;
  Configmgr.comDayCqWcmCoreImplUtilsDefaultPageNameValidator(post,apply,_delete,action,Dollarlocation,propertylist,nonValidChars)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplVariantsPageVariantsProviderImpl = function comDayCqWcmCoreImplVariantsPageVariantsProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultPeriodexternalizerPerioddomain = req.swagger.params['default.externalizer.domain'].value;
  Configmgr.comDayCqWcmCoreImplVariantsPageVariantsProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,defaultPeriodexternalizerPerioddomain)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplVersionManagerImpl = function comDayCqWcmCoreImplVersionManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var versionmanagerPeriodcreateVersionOnActivation = req.swagger.params['versionmanager.createVersionOnActivation'].value;
  var versionmanagerPeriodpurgingEnabled = req.swagger.params['versionmanager.purgingEnabled'].value;
  var versionmanagerPeriodpurgePaths = req.swagger.params['versionmanager.purgePaths'].value;
  var versionmanagerPeriodivPaths = req.swagger.params['versionmanager.ivPaths'].value;
  var versionmanagerPeriodmaxAgeDays = req.swagger.params['versionmanager.maxAgeDays'].value;
  var versionmanagerPeriodmaxNumberVersions = req.swagger.params['versionmanager.maxNumberVersions'].value;
  var versionmanagerPeriodminNumberVersions = req.swagger.params['versionmanager.minNumberVersions'].value;
  Configmgr.comDayCqWcmCoreImplVersionManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,versionmanagerPeriodcreateVersionOnActivation,versionmanagerPeriodpurgingEnabled,versionmanagerPeriodpurgePaths,versionmanagerPeriodivPaths,versionmanagerPeriodmaxAgeDays,versionmanagerPeriodmaxNumberVersions,versionmanagerPeriodminNumberVersions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplVersionPurgeTask = function comDayCqWcmCoreImplVersionPurgeTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var versionpurgePeriodpaths = req.swagger.params['versionpurge.paths'].value;
  var versionpurgePeriodrecursive = req.swagger.params['versionpurge.recursive'].value;
  var versionpurgePeriodmaxVersions = req.swagger.params['versionpurge.maxVersions'].value;
  var versionpurgePeriodminVersions = req.swagger.params['versionpurge.minVersions'].value;
  var versionpurgePeriodmaxAgeDays = req.swagger.params['versionpurge.maxAgeDays'].value;
  Configmgr.comDayCqWcmCoreImplVersionPurgeTask(post,apply,_delete,action,Dollarlocation,propertylist,versionpurgePeriodpaths,versionpurgePeriodrecursive,versionpurgePeriodmaxVersions,versionpurgePeriodminVersions,versionpurgePeriodmaxAgeDays)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplWCMDebugFilter = function comDayCqWcmCoreImplWCMDebugFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var wcmdbgfilterPeriodenabled = req.swagger.params['wcmdbgfilter.enabled'].value;
  var wcmdbgfilterPeriodjspDebug = req.swagger.params['wcmdbgfilter.jspDebug'].value;
  Configmgr.comDayCqWcmCoreImplWCMDebugFilter(post,apply,_delete,action,Dollarlocation,propertylist,wcmdbgfilterPeriodenabled,wcmdbgfilterPeriodjspDebug)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplWCMDeveloperModeFilter = function comDayCqWcmCoreImplWCMDeveloperModeFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var wcmdevmodefilterPeriodenabled = req.swagger.params['wcmdevmodefilter.enabled'].value;
  Configmgr.comDayCqWcmCoreImplWCMDeveloperModeFilter(post,apply,_delete,action,Dollarlocation,propertylist,wcmdevmodefilterPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreImplWarpTimeWarpFilter = function comDayCqWcmCoreImplWarpTimeWarpFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var filterPeriodorder = req.swagger.params['filter.order'].value;
  var filterPeriodscope = req.swagger.params['filter.scope'].value;
  Configmgr.comDayCqWcmCoreImplWarpTimeWarpFilter(post,apply,_delete,action,Dollarlocation,propertylist,filterPeriodorder,filterPeriodscope)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreMvtMVTStatisticsImpl = function comDayCqWcmCoreMvtMVTStatisticsImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mvtstatisticsPeriodtrackingurl = req.swagger.params['mvtstatistics.trackingurl'].value;
  Configmgr.comDayCqWcmCoreMvtMVTStatisticsImpl(post,apply,_delete,action,Dollarlocation,propertylist,mvtstatisticsPeriodtrackingurl)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreStatsPageViewStatisticsImpl = function comDayCqWcmCoreStatsPageViewStatisticsImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pageviewstatisticsPeriodtrackingurl = req.swagger.params['pageviewstatistics.trackingurl'].value;
  var pageviewstatisticsPeriodtrackingscriptPeriodenabled = req.swagger.params['pageviewstatistics.trackingscript.enabled'].value;
  Configmgr.comDayCqWcmCoreStatsPageViewStatisticsImpl(post,apply,_delete,action,Dollarlocation,propertylist,pageviewstatisticsPeriodtrackingurl,pageviewstatisticsPeriodtrackingscriptPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmCoreWCMRequestFilter = function comDayCqWcmCoreWCMRequestFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var wcmfilterPeriodmode = req.swagger.params['wcmfilter.mode'].value;
  Configmgr.comDayCqWcmCoreWCMRequestFilter(post,apply,_delete,action,Dollarlocation,propertylist,wcmfilterPeriodmode)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterDesignPackageImporter = function comDayCqWcmDesignimporterDesignPackageImporter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var extractPeriodfilter = req.swagger.params['extract.filter'].value;
  Configmgr.comDayCqWcmDesignimporterDesignPackageImporter(post,apply,_delete,action,Dollarlocation,propertylist,extractPeriodfilter)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterImplCanvasBuilderImpl = function comDayCqWcmDesignimporterImplCanvasBuilderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var filepattern = req.swagger.params['filepattern'].value;
  var buildPeriodpagePeriodnodes = req.swagger.params['build.page.nodes'].value;
  var buildPeriodclientPeriodlibs = req.swagger.params['build.client.libs'].value;
  var buildPeriodcanvasPeriodcomponent = req.swagger.params['build.canvas.component'].value;
  Configmgr.comDayCqWcmDesignimporterImplCanvasBuilderImpl(post,apply,_delete,action,Dollarlocation,propertylist,filepattern,buildPeriodpagePeriodnodes,buildPeriodclientPeriodlibs,buildPeriodcanvasPeriodcomponent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterImplCanvasPageDeleteHandler = function comDayCqWcmDesignimporterImplCanvasPageDeleteHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var minThreadPoolSize = req.swagger.params['minThreadPoolSize'].value;
  var maxThreadPoolSize = req.swagger.params['maxThreadPoolSize'].value;
  Configmgr.comDayCqWcmDesignimporterImplCanvasPageDeleteHandler(post,apply,_delete,action,Dollarlocation,propertylist,minThreadPoolSize,maxThreadPoolSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterImplEntryPreprocessorImpl = function comDayCqWcmDesignimporterImplEntryPreprocessorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var searchPeriodpattern = req.swagger.params['search.pattern'].value;
  var replacePeriodpattern = req.swagger.params['replace.pattern'].value;
  Configmgr.comDayCqWcmDesignimporterImplEntryPreprocessorImpl(post,apply,_delete,action,Dollarlocation,propertylist,searchPeriodpattern,replacePeriodpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl = function comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var filepattern = req.swagger.params['filepattern'].value;
  var devicePeriodgroups = req.swagger.params['device.groups'].value;
  var buildPeriodpagePeriodnodes = req.swagger.params['build.page.nodes'].value;
  var buildPeriodclientPeriodlibs = req.swagger.params['build.client.libs'].value;
  var buildPeriodcanvasPeriodcomponent = req.swagger.params['build.canvas.component'].value;
  Configmgr.comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl(post,apply,_delete,action,Dollarlocation,propertylist,filepattern,devicePeriodgroups,buildPeriodpagePeriodnodes,buildPeriodclientPeriodlibs,buildPeriodcanvasPeriodcomponent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone = function comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon = function comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan = function comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle = function comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand = function comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen = function comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler = function comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT = function comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle = function comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle = function comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH = function comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone = function comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand = function comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl = function comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent = function comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen = function comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  var componentPeriodresourceType = req.swagger.params['component.resourceType'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern,componentPeriodresourceType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl = function comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var tagpattern = req.swagger.params['tagpattern'].value;
  Configmgr.comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,tagpattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationFormsImplFormChooserServlet = function comDayCqWcmFoundationFormsImplFormChooserServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodname = req.swagger.params['service.name'].value;
  var slingPeriodservletPeriodresourceTypes = req.swagger.params['sling.servlet.resourceTypes'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  var formsPeriodformchooserservletPeriodadvansesearchPeriodrequire = req.swagger.params['forms.formchooserservlet.advansesearch.require'].value;
  Configmgr.comDayCqWcmFoundationFormsImplFormChooserServlet(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodname,slingPeriodservletPeriodresourceTypes,slingPeriodservletPeriodselectors,slingPeriodservletPeriodmethods,formsPeriodformchooserservletPeriodadvansesearchPeriodrequire)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationFormsImplFormParagraphPostProcessor = function comDayCqWcmFoundationFormsImplFormParagraphPostProcessor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var formsPeriodformparagraphpostprocessorPeriodenabled = req.swagger.params['forms.formparagraphpostprocessor.enabled'].value;
  var formsPeriodformparagraphpostprocessorPeriodformresourcetypes = req.swagger.params['forms.formparagraphpostprocessor.formresourcetypes'].value;
  Configmgr.comDayCqWcmFoundationFormsImplFormParagraphPostProcessor(post,apply,_delete,action,Dollarlocation,propertylist,formsPeriodformparagraphpostprocessorPeriodenabled,formsPeriodformparagraphpostprocessorPeriodformresourcetypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationFormsImplFormsHandlingServlet = function comDayCqWcmFoundationFormsImplFormsHandlingServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var namePeriodwhitelist = req.swagger.params['name.whitelist'].value;
  var allowPeriodexpressions = req.swagger.params['allow.expressions'].value;
  Configmgr.comDayCqWcmFoundationFormsImplFormsHandlingServlet(post,apply,_delete,action,Dollarlocation,propertylist,namePeriodwhitelist,allowPeriodexpressions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationFormsImplMailServlet = function comDayCqWcmFoundationFormsImplMailServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodresourceTypes = req.swagger.params['sling.servlet.resourceTypes'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var resourcePeriodwhitelist = req.swagger.params['resource.whitelist'].value;
  var resourcePeriodblacklist = req.swagger.params['resource.blacklist'].value;
  Configmgr.comDayCqWcmFoundationFormsImplMailServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodresourceTypes,slingPeriodservletPeriodselectors,resourcePeriodwhitelist,resourcePeriodblacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationImplAdaptiveImageComponentServlet = function comDayCqWcmFoundationImplAdaptiveImageComponentServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var adaptPeriodsupportedPeriodwidths = req.swagger.params['adapt.supported.widths'].value;
  Configmgr.comDayCqWcmFoundationImplAdaptiveImageComponentServlet(post,apply,_delete,action,Dollarlocation,propertylist,adaptPeriodsupportedPeriodwidths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationImplHTTPAuthHandler = function comDayCqWcmFoundationImplHTTPAuthHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var authPeriodhttpPeriodnologin = req.swagger.params['auth.http.nologin'].value;
  var authPeriodhttpPeriodrealm = req.swagger.params['auth.http.realm'].value;
  var authPerioddefaultPeriodloginpage = req.swagger.params['auth.default.loginpage'].value;
  var authPeriodcredPeriodform = req.swagger.params['auth.cred.form'].value;
  var authPeriodcredPeriodutf8 = req.swagger.params['auth.cred.utf8'].value;
  Configmgr.comDayCqWcmFoundationImplHTTPAuthHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,authPeriodhttpPeriodnologin,authPeriodhttpPeriodrealm,authPerioddefaultPeriodloginpage,authPeriodcredPeriodform,authPeriodcredPeriodutf8)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationImplPageImpressionsTracker = function comDayCqWcmFoundationImplPageImpressionsTracker (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodauthPeriodrequirements = req.swagger.params['sling.auth.requirements'].value;
  Configmgr.comDayCqWcmFoundationImplPageImpressionsTracker(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodauthPeriodrequirements)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationImplPageRedirectServlet = function comDayCqWcmFoundationImplPageRedirectServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var excludedPeriodresourcePeriodtypes = req.swagger.params['excluded.resource.types'].value;
  Configmgr.comDayCqWcmFoundationImplPageRedirectServlet(post,apply,_delete,action,Dollarlocation,propertylist,excludedPeriodresourcePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist = function comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var defaultPeriodattachmentPeriodtypePeriodblacklist = req.swagger.params['default.attachment.type.blacklist'].value;
  var baselinePeriodattachmentPeriodtypePeriodblacklist = req.swagger.params['baseline.attachment.type.blacklist'].value;
  Configmgr.comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist(post,apply,_delete,action,Dollarlocation,propertylist,defaultPeriodattachmentPeriodtypePeriodblacklist,baselinePeriodattachmentPeriodtypePeriodblacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl = function comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var parameterPeriodwhitelist = req.swagger.params['parameter.whitelist'].value;
  var parameterPeriodwhitelistPeriodprefixes = req.swagger.params['parameter.whitelist.prefixes'].value;
  var binaryPeriodparameterPeriodwhitelist = req.swagger.params['binary.parameter.whitelist'].value;
  var modifierPeriodwhitelist = req.swagger.params['modifier.whitelist'].value;
  var operationPeriodwhitelist = req.swagger.params['operation.whitelist'].value;
  var operationPeriodwhitelistPeriodprefixes = req.swagger.params['operation.whitelist.prefixes'].value;
  var typehintPeriodwhitelist = req.swagger.params['typehint.whitelist'].value;
  var resourcetypePeriodwhitelist = req.swagger.params['resourcetype.whitelist'].value;
  Configmgr.comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl(post,apply,_delete,action,Dollarlocation,propertylist,parameterPeriodwhitelist,parameterPeriodwhitelistPeriodprefixes,binaryPeriodparameterPeriodwhitelist,modifierPeriodwhitelist,operationPeriodwhitelist,operationPeriodwhitelistPeriodprefixes,typehintPeriodwhitelist,resourcetypePeriodwhitelist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory = function comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var devicePeriodinfoPeriodtransformerPeriodenabled = req.swagger.params['device.info.transformer.enabled'].value;
  var devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle = req.swagger.params['device.info.transformer.css.style'].value;
  Configmgr.comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory(post,apply,_delete,action,Dollarlocation,propertylist,devicePeriodinfoPeriodtransformerPeriodenabled,devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMobileCoreImplRedirectRedirectFilter = function comDayCqWcmMobileCoreImplRedirectRedirectFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var redirectPeriodenabled = req.swagger.params['redirect.enabled'].value;
  var redirectPeriodstatsPeriodenabled = req.swagger.params['redirect.stats.enabled'].value;
  var redirectPeriodextensions = req.swagger.params['redirect.extensions'].value;
  var redirectPeriodpaths = req.swagger.params['redirect.paths'].value;
  Configmgr.comDayCqWcmMobileCoreImplRedirectRedirectFilter(post,apply,_delete,action,Dollarlocation,propertylist,redirectPeriodenabled,redirectPeriodstatsPeriodenabled,redirectPeriodextensions,redirectPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsContentCopyActionFactory = function comDayCqWcmMsmImplActionsContentCopyActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  var contentcopyactionPeriodorderPeriodstyle = req.swagger.params['contentcopyaction.order.style'].value;
  Configmgr.comDayCqWcmMsmImplActionsContentCopyActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops,contentcopyactionPeriodorderPeriodstyle)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsContentDeleteActionFactory = function comDayCqWcmMsmImplActionsContentDeleteActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  Configmgr.comDayCqWcmMsmImplActionsContentDeleteActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsContentUpdateActionFactory = function comDayCqWcmMsmImplActionsContentUpdateActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin = req.swagger.params['cq.wcm.msm.action.ignoredMixin'].value;
  Configmgr.comDayCqWcmMsmImplActionsContentUpdateActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops,cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsOrderChildrenActionFactory = function comDayCqWcmMsmImplActionsOrderChildrenActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  Configmgr.comDayCqWcmMsmImplActionsOrderChildrenActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsPageMoveActionFactory = function comDayCqWcmMsmImplActionsPageMoveActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  var cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropUnderscorereferenceUpdate = req.swagger.params['cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate'].value;
  Configmgr.comDayCqWcmMsmImplActionsPageMoveActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops,cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropUnderscorereferenceUpdate)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsReferencesUpdateActionFactory = function comDayCqWcmMsmImplActionsReferencesUpdateActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  var cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUnderscoreupdateNested = req.swagger.params['cq.wcm.msm.impl.action.referencesupdate.prop_updateNested'].value;
  Configmgr.comDayCqWcmMsmImplActionsReferencesUpdateActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops,cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUnderscoreupdateNested)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplActionsVersionCopyActionFactory = function comDayCqWcmMsmImplActionsVersionCopyActionFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes = req.swagger.params['cq.wcm.msm.action.excludednodetypes'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems = req.swagger.params['cq.wcm.msm.action.excludedparagraphitems'].value;
  var cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops = req.swagger.params['cq.wcm.msm.action.excludedprops'].value;
  Configmgr.comDayCqWcmMsmImplActionsVersionCopyActionFactory(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems,cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplLiveRelationshipManagerImpl = function comDayCqWcmMsmImplLiveRelationshipManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var liverelationshipmgrPeriodrelationsconfigPerioddefault = req.swagger.params['liverelationshipmgr.relationsconfig.default'].value;
  Configmgr.comDayCqWcmMsmImplLiveRelationshipManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,liverelationshipmgrPeriodrelationsconfigPerioddefault)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplRolloutManagerImpl = function comDayCqWcmMsmImplRolloutManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var rolloutmgrPeriodexcludedpropsPerioddefault = req.swagger.params['rolloutmgr.excludedprops.default'].value;
  var rolloutmgrPeriodexcludedparagraphpropsPerioddefault = req.swagger.params['rolloutmgr.excludedparagraphprops.default'].value;
  var rolloutmgrPeriodexcludednodetypesPerioddefault = req.swagger.params['rolloutmgr.excludednodetypes.default'].value;
  var rolloutmgrPeriodthreadpoolPeriodmaxsize = req.swagger.params['rolloutmgr.threadpool.maxsize'].value;
  var rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime = req.swagger.params['rolloutmgr.threadpool.maxshutdowntime'].value;
  var rolloutmgrPeriodthreadpoolPeriodpriority = req.swagger.params['rolloutmgr.threadpool.priority'].value;
  var rolloutmgrPeriodcommitPeriodsize = req.swagger.params['rolloutmgr.commit.size'].value;
  var rolloutmgrPeriodconflicthandlingPeriodenabled = req.swagger.params['rolloutmgr.conflicthandling.enabled'].value;
  Configmgr.comDayCqWcmMsmImplRolloutManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter,rolloutmgrPeriodexcludedpropsPerioddefault,rolloutmgrPeriodexcludedparagraphpropsPerioddefault,rolloutmgrPeriodexcludednodetypesPerioddefault,rolloutmgrPeriodthreadpoolPeriodmaxsize,rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime,rolloutmgrPeriodthreadpoolPeriodpriority,rolloutmgrPeriodcommitPeriodsize,rolloutmgrPeriodconflicthandlingPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmMsmImplServletsAuditLogServlet = function comDayCqWcmMsmImplServletsAuditLogServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var auditlogservletPerioddefaultPeriodeventsPeriodcount = req.swagger.params['auditlogservlet.default.events.count'].value;
  var auditlogservletPerioddefaultPeriodpath = req.swagger.params['auditlogservlet.default.path'].value;
  Configmgr.comDayCqWcmMsmImplServletsAuditLogServlet(post,apply,_delete,action,Dollarlocation,propertylist,auditlogservletPerioddefaultPeriodeventsPeriodcount,auditlogservletPerioddefaultPeriodpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmNotificationEmailImplEmailChannel = function comDayCqWcmNotificationEmailImplEmailChannel (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var emailPeriodfrom = req.swagger.params['email.from'].value;
  Configmgr.comDayCqWcmNotificationEmailImplEmailChannel(post,apply,_delete,action,Dollarlocation,propertylist,emailPeriodfrom)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmNotificationImplNotificationManagerImpl = function comDayCqWcmNotificationImplNotificationManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodtopics = req.swagger.params['event.topics'].value;
  Configmgr.comDayCqWcmNotificationImplNotificationManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodtopics)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmScriptingImplBVPManager = function comDayCqWcmScriptingImplBVPManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines = req.swagger.params['com.day.cq.wcm.scripting.bvp.script.engines'].value;
  Configmgr.comDayCqWcmScriptingImplBVPManager(post,apply,_delete,action,Dollarlocation,propertylist,comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmUndoUndoConfig = function comDayCqWcmUndoUndoConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cqPeriodwcmPeriodundoPeriodenabled = req.swagger.params['cq.wcm.undo.enabled'].value;
  var cqPeriodwcmPeriodundoPeriodpath = req.swagger.params['cq.wcm.undo.path'].value;
  var cqPeriodwcmPeriodundoPeriodvalidity = req.swagger.params['cq.wcm.undo.validity'].value;
  var cqPeriodwcmPeriodundoPeriodsteps = req.swagger.params['cq.wcm.undo.steps'].value;
  var cqPeriodwcmPeriodundoPeriodpersistence = req.swagger.params['cq.wcm.undo.persistence'].value;
  var cqPeriodwcmPeriodundoPeriodpersistencePeriodmode = req.swagger.params['cq.wcm.undo.persistence.mode'].value;
  var cqPeriodwcmPeriodundoPeriodmarkermode = req.swagger.params['cq.wcm.undo.markermode'].value;
  var cqPeriodwcmPeriodundoPeriodwhitelist = req.swagger.params['cq.wcm.undo.whitelist'].value;
  var cqPeriodwcmPeriodundoPeriodblacklist = req.swagger.params['cq.wcm.undo.blacklist'].value;
  Configmgr.comDayCqWcmUndoUndoConfig(post,apply,_delete,action,Dollarlocation,propertylist,cqPeriodwcmPeriodundoPeriodenabled,cqPeriodwcmPeriodundoPeriodpath,cqPeriodwcmPeriodundoPeriodvalidity,cqPeriodwcmPeriodundoPeriodsteps,cqPeriodwcmPeriodundoPeriodpersistence,cqPeriodwcmPeriodundoPeriodpersistencePeriodmode,cqPeriodwcmPeriodundoPeriodmarkermode,cqPeriodwcmPeriodundoPeriodwhitelist,cqPeriodwcmPeriodundoPeriodblacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmWebservicesupportImplReplicationEventListener = function comDayCqWcmWebservicesupportImplReplicationEventListener (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var flush agents = req.swagger.params['Flush agents'].value;
  Configmgr.comDayCqWcmWebservicesupportImplReplicationEventListener(post,apply,_delete,action,Dollarlocation,propertylist,flush agents)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmWorkflowImplWcmWorkflowServiceImpl = function comDayCqWcmWorkflowImplWcmWorkflowServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var eventPeriodfilter = req.swagger.params['event.filter'].value;
  var minThreadPoolSize = req.swagger.params['minThreadPoolSize'].value;
  var maxThreadPoolSize = req.swagger.params['maxThreadPoolSize'].value;
  var cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate = req.swagger.params['cq.wcm.workflow.terminate.on.activate'].value;
  var cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist = req.swagger.params['cq.wcm.worklfow.terminate.exclusion.list'].value;
  Configmgr.comDayCqWcmWorkflowImplWcmWorkflowServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,eventPeriodfilter,minThreadPoolSize,maxThreadPoolSize,cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate,cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWcmWorkflowImplWorkflowPackageInfoProvider = function comDayCqWcmWorkflowImplWorkflowPackageInfoProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var workflowpackageinfoproviderPeriodfilter = req.swagger.params['workflowpackageinfoprovider.filter'].value;
  var workflowpackageinfoproviderPeriodfilterPeriodrootpath = req.swagger.params['workflowpackageinfoprovider.filter.rootpath'].value;
  Configmgr.comDayCqWcmWorkflowImplWorkflowPackageInfoProvider(post,apply,_delete,action,Dollarlocation,propertylist,workflowpackageinfoproviderPeriodfilter,workflowpackageinfoproviderPeriodfilterPeriodrootpath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWidgetImplHtmlLibraryManagerImpl = function comDayCqWidgetImplHtmlLibraryManagerImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var htmllibmanagerPeriodclientmanager = req.swagger.params['htmllibmanager.clientmanager'].value;
  var htmllibmanagerPerioddebug = req.swagger.params['htmllibmanager.debug'].value;
  var htmllibmanagerPerioddebugPeriodconsole = req.swagger.params['htmllibmanager.debug.console'].value;
  var htmllibmanagerPerioddebugPeriodinitPeriodjs = req.swagger.params['htmllibmanager.debug.init.js'].value;
  var htmllibmanagerPerioddefaultthemename = req.swagger.params['htmllibmanager.defaultthemename'].value;
  var htmllibmanagerPerioddefaultuserthemename = req.swagger.params['htmllibmanager.defaultuserthemename'].value;
  var htmllibmanagerPeriodfirebuglitePeriodpath = req.swagger.params['htmllibmanager.firebuglite.path'].value;
  var htmllibmanagerPeriodforceCQUrlInfo = req.swagger.params['htmllibmanager.forceCQUrlInfo'].value;
  var htmllibmanagerPeriodgzip = req.swagger.params['htmllibmanager.gzip'].value;
  var htmllibmanagerPeriodmaxage = req.swagger.params['htmllibmanager.maxage'].value;
  var htmllibmanagerPeriodmaxDataUriSize = req.swagger.params['htmllibmanager.maxDataUriSize'].value;
  var htmllibmanagerPeriodminify = req.swagger.params['htmllibmanager.minify'].value;
  var htmllibmanagerPeriodpathPeriodlist = req.swagger.params['htmllibmanager.path.list'].value;
  var htmllibmanagerPeriodtiming = req.swagger.params['htmllibmanager.timing'].value;
  Configmgr.comDayCqWidgetImplHtmlLibraryManagerImpl(post,apply,_delete,action,Dollarlocation,propertylist,htmllibmanagerPeriodclientmanager,htmllibmanagerPerioddebug,htmllibmanagerPerioddebugPeriodconsole,htmllibmanagerPerioddebugPeriodinitPeriodjs,htmllibmanagerPerioddefaultthemename,htmllibmanagerPerioddefaultuserthemename,htmllibmanagerPeriodfirebuglitePeriodpath,htmllibmanagerPeriodforceCQUrlInfo,htmllibmanagerPeriodgzip,htmllibmanagerPeriodmaxage,htmllibmanagerPeriodmaxDataUriSize,htmllibmanagerPeriodminify,htmllibmanagerPeriodpathPeriodlist,htmllibmanagerPeriodtiming)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWidgetImplWidgetExtensionProviderImpl = function comDayCqWidgetImplWidgetExtensionProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var extendablePeriodwidgets = req.swagger.params['extendable.widgets'].value;
  var widgetextensionproviderPerioddebug = req.swagger.params['widgetextensionprovider.debug'].value;
  Configmgr.comDayCqWidgetImplWidgetExtensionProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,extendablePeriodwidgets,widgetextensionproviderPerioddebug)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWorkflowImplEmailEMailNotificationService = function comDayCqWorkflowImplEmailEMailNotificationService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var fromPeriodaddress = req.swagger.params['from.address'].value;
  var hostPeriodprefix = req.swagger.params['host.prefix'].value;
  var notifyPeriodonabort = req.swagger.params['notify.onabort'].value;
  var notifyPeriodoncomplete = req.swagger.params['notify.oncomplete'].value;
  var notifyPeriodoncontainercomplete = req.swagger.params['notify.oncontainercomplete'].value;
  var notifyPerioduseronly = req.swagger.params['notify.useronly'].value;
  Configmgr.comDayCqWorkflowImplEmailEMailNotificationService(post,apply,_delete,action,Dollarlocation,propertylist,fromPeriodaddress,hostPeriodprefix,notifyPeriodonabort,notifyPeriodoncomplete,notifyPeriodoncontainercomplete,notifyPerioduseronly)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCqWorkflowImplEmailTaskEMailNotificationService = function comDayCqWorkflowImplEmailTaskEMailNotificationService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var notifyPeriodonupdate = req.swagger.params['notify.onupdate'].value;
  var notifyPeriodoncomplete = req.swagger.params['notify.oncomplete'].value;
  Configmgr.comDayCqWorkflowImplEmailTaskEMailNotificationService(post,apply,_delete,action,Dollarlocation,propertylist,notifyPeriodonupdate,notifyPeriodoncomplete)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCrxSecurityTokenImplImplTokenAuthenticationHandler = function comDayCrxSecurityTokenImplImplTokenAuthenticationHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var tokenPeriodrequiredPeriodattr = req.swagger.params['token.required.attr'].value;
  var tokenPeriodalternatePeriodurl = req.swagger.params['token.alternate.url'].value;
  var tokenPeriodencapsulated = req.swagger.params['token.encapsulated'].value;
  var skipPeriodtokenPeriodrefresh = req.swagger.params['skip.token.refresh'].value;
  Configmgr.comDayCrxSecurityTokenImplImplTokenAuthenticationHandler(post,apply,_delete,action,Dollarlocation,propertylist,path,tokenPeriodrequiredPeriodattr,tokenPeriodalternatePeriodurl,tokenPeriodencapsulated,skipPeriodtokenPeriodrefresh)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.comDayCrxSecurityTokenImplTokenCleanupTask = function comDayCrxSecurityTokenImplTokenCleanupTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enablePeriodtokenPeriodcleanupPeriodtask = req.swagger.params['enable.token.cleanup.task'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var batchPeriodsize = req.swagger.params['batch.size'].value;
  Configmgr.comDayCrxSecurityTokenImplTokenCleanupTask(post,apply,_delete,action,Dollarlocation,propertylist,enablePeriodtokenPeriodcleanupPeriodtask,schedulerPeriodexpression,batchPeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.guideLocalizationService = function guideLocalizationService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var supportedLocales = req.swagger.params['supportedLocales'].value;
  var localizable Properties = req.swagger.params['Localizable Properties'].value;
  Configmgr.guideLocalizationService(post,apply,_delete,action,Dollarlocation,propertylist,supportedLocales,localizable Properties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.messagingUserComponentFactory = function messagingUserComponentFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.messagingUserComponentFactory(post,apply,_delete,action,Dollarlocation,propertylist,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheAriesJmxFrameworkStateConfig = function orgApacheAriesJmxFrameworkStateConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var attributeChangeNotificationEnabled = req.swagger.params['attributeChangeNotificationEnabled'].value;
  Configmgr.orgApacheAriesJmxFrameworkStateConfig(post,apply,_delete,action,Dollarlocation,propertylist,attributeChangeNotificationEnabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixEventadminImplEventAdmin = function orgApacheFelixEventadminImplEventAdmin (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize = req.swagger.params['org.apache.felix.eventadmin.ThreadPoolSize'].value;
  var orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio = req.swagger.params['org.apache.felix.eventadmin.AsyncToSyncThreadRatio'].value;
  var orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout = req.swagger.params['org.apache.felix.eventadmin.Timeout'].value;
  var orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic = req.swagger.params['org.apache.felix.eventadmin.RequireTopic'].value;
  var orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout = req.swagger.params['org.apache.felix.eventadmin.IgnoreTimeout'].value;
  var orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic = req.swagger.params['org.apache.felix.eventadmin.IgnoreTopic'].value;
  Configmgr.orgApacheFelixEventadminImplEventAdmin(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize,orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio,orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout,orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic,orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout,orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixHttp = function orgApacheFelixHttp (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodhost = req.swagger.params['org.apache.felix.http.host'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodenable = req.swagger.params['org.apache.felix.http.enable'].value;
  var orgPeriodosgiPeriodservicePeriodhttpPeriodport = req.swagger.params['org.osgi.service.http.port'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout = req.swagger.params['org.apache.felix.http.timeout'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodenable = req.swagger.params['org.apache.felix.https.enable'].value;
  var orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure = req.swagger.params['org.osgi.service.http.port.secure'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore = req.swagger.params['org.apache.felix.https.keystore'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword = req.swagger.params['org.apache.felix.https.keystore.password'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword = req.swagger.params['org.apache.felix.https.keystore.key.password'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore = req.swagger.params['org.apache.felix.https.truststore'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword = req.swagger.params['org.apache.felix.https.truststore.password'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate = req.swagger.params['org.apache.felix.https.clientcertificate'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodcontextUnderscorepath = req.swagger.params['org.apache.felix.http.context_path'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans = req.swagger.params['org.apache.felix.http.mbeans'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout = req.swagger.params['org.apache.felix.http.session.timeout'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax = req.swagger.params['org.apache.felix.http.jetty.threadpool.max'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors = req.swagger.params['org.apache.felix.http.jetty.acceptors'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors = req.swagger.params['org.apache.felix.http.jetty.selectors'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize = req.swagger.params['org.apache.felix.http.jetty.headerBufferSize'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize = req.swagger.params['org.apache.felix.http.jetty.requestBufferSize'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize = req.swagger.params['org.apache.felix.http.jetty.responseBufferSize'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize = req.swagger.params['org.apache.felix.http.jetty.maxFormSize'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodpathUnderscoreexclusions = req.swagger.params['org.apache.felix.http.path_exclusions'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded = req.swagger.params['org.apache.felix.https.jetty.ciphersuites.excluded'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded = req.swagger.params['org.apache.felix.https.jetty.ciphersuites.included'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader = req.swagger.params['org.apache.felix.http.jetty.sendServerHeader'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded = req.swagger.params['org.apache.felix.https.jetty.protocols.included'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded = req.swagger.params['org.apache.felix.https.jetty.protocols.excluded'].value;
  var orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable = req.swagger.params['org.apache.felix.proxy.load.balancer.connection.enable'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed = req.swagger.params['org.apache.felix.https.jetty.renegotiateAllowed'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly = req.swagger.params['org.apache.felix.https.jetty.session.cookie.httpOnly'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure = req.swagger.params['org.apache.felix.https.jetty.session.cookie.secure'].value;
  var orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName = req.swagger.params['org.eclipse.jetty.servlet.SessionIdPathParameterName'].value;
  var orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding = req.swagger.params['org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding'].value;
  var orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie = req.swagger.params['org.eclipse.jetty.servlet.SessionCookie'].value;
  var orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain = req.swagger.params['org.eclipse.jetty.servlet.SessionDomain'].value;
  var orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath = req.swagger.params['org.eclipse.jetty.servlet.SessionPath'].value;
  var orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge = req.swagger.params['org.eclipse.jetty.servlet.MaxAge'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodname = req.swagger.params['org.apache.felix.http.name'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable = req.swagger.params['org.apache.felix.jetty.gziphandler.enable'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize = req.swagger.params['org.apache.felix.jetty.gzip.minGzipSize'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel = req.swagger.params['org.apache.felix.jetty.gzip.compressionLevel'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize = req.swagger.params['org.apache.felix.jetty.gzip.inflateBufferSize'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush = req.swagger.params['org.apache.felix.jetty.gzip.syncFlush'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents = req.swagger.params['org.apache.felix.jetty.gzip.excludedUserAgents'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods = req.swagger.params['org.apache.felix.jetty.gzip.includedMethods'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods = req.swagger.params['org.apache.felix.jetty.gzip.excludedMethods'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths = req.swagger.params['org.apache.felix.jetty.gzip.includedPaths'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths = req.swagger.params['org.apache.felix.jetty.gzip.excludedPaths'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes = req.swagger.params['org.apache.felix.jetty.gzip.includedMimeTypes'].value;
  var orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes = req.swagger.params['org.apache.felix.jetty.gzip.excludedMimeTypes'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate = req.swagger.params['org.apache.felix.http.session.invalidate'].value;
  var orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid = req.swagger.params['org.apache.felix.http.session.uniqueid'].value;
  Configmgr.orgApacheFelixHttp(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodfelixPeriodhttpPeriodhost,orgPeriodapachePeriodfelixPeriodhttpPeriodenable,orgPeriodosgiPeriodservicePeriodhttpPeriodport,orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout,orgPeriodapachePeriodfelixPeriodhttpsPeriodenable,orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate,orgPeriodapachePeriodfelixPeriodhttpPeriodcontextUnderscorepath,orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans,orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize,orgPeriodapachePeriodfelixPeriodhttpPeriodpathUnderscoreexclusions,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded,orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded,orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly,orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure,orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName,orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding,orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie,orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain,orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath,orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge,orgPeriodapachePeriodfelixPeriodhttpPeriodname,orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes,orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes,orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate,orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixHttpSslfilterSslFilter = function orgApacheFelixHttpSslfilterSslFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var sslForwardPeriodheader = req.swagger.params['ssl-forward.header'].value;
  var sslForwardPeriodvalue = req.swagger.params['ssl-forward.value'].value;
  var sslForwardCertPeriodheader = req.swagger.params['ssl-forward-cert.header'].value;
  var rewritePeriodabsolutePeriodurls = req.swagger.params['rewrite.absolute.urls'].value;
  Configmgr.orgApacheFelixHttpSslfilterSslFilter(post,apply,_delete,action,Dollarlocation,propertylist,sslForwardPeriodheader,sslForwardPeriodvalue,sslForwardCertPeriodheader,rewritePeriodabsolutePeriodurls)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixJaasConfigurationFactory = function orgApacheFelixJaasConfigurationFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jaasPeriodcontrolFlag = req.swagger.params['jaas.controlFlag'].value;
  var jaasPeriodranking = req.swagger.params['jaas.ranking'].value;
  var jaasPeriodrealmName = req.swagger.params['jaas.realmName'].value;
  var jaasPeriodclassname = req.swagger.params['jaas.classname'].value;
  var jaasPeriodoptions = req.swagger.params['jaas.options'].value;
  Configmgr.orgApacheFelixJaasConfigurationFactory(post,apply,_delete,action,Dollarlocation,propertylist,jaasPeriodcontrolFlag,jaasPeriodranking,jaasPeriodrealmName,jaasPeriodclassname,jaasPeriodoptions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixJaasConfigurationSpi = function orgApacheFelixJaasConfigurationSpi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jaasPerioddefaultRealmName = req.swagger.params['jaas.defaultRealmName'].value;
  var jaasPeriodconfigProviderName = req.swagger.params['jaas.configProviderName'].value;
  var jaasPeriodglobalConfigPolicy = req.swagger.params['jaas.globalConfigPolicy'].value;
  Configmgr.orgApacheFelixJaasConfigurationSpi(post,apply,_delete,action,Dollarlocation,propertylist,jaasPerioddefaultRealmName,jaasPeriodconfigProviderName,jaasPeriodglobalConfigPolicy)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixScrScrService = function orgApacheFelixScrScrService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var dsPeriodloglevel = req.swagger.params['ds.loglevel'].value;
  var dsPeriodfactoryPeriodenabled = req.swagger.params['ds.factory.enabled'].value;
  var dsPerioddelayedPeriodkeepInstances = req.swagger.params['ds.delayed.keepInstances'].value;
  var dsPeriodlockPeriodtimeoutPeriodmilliseconds = req.swagger.params['ds.lock.timeout.milliseconds'].value;
  var dsPeriodstopPeriodtimeoutPeriodmilliseconds = req.swagger.params['ds.stop.timeout.milliseconds'].value;
  var dsPeriodglobalPeriodextender = req.swagger.params['ds.global.extender'].value;
  Configmgr.orgApacheFelixScrScrService(post,apply,_delete,action,Dollarlocation,propertylist,dsPeriodloglevel,dsPeriodfactoryPeriodenabled,dsPerioddelayedPeriodkeepInstances,dsPeriodlockPeriodtimeoutPeriodmilliseconds,dsPeriodstopPeriodtimeoutPeriodmilliseconds,dsPeriodglobalPeriodextender)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixSystemreadyImplComponentsCheck = function orgApacheFelixSystemreadyImplComponentsCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var componentsPeriodlist = req.swagger.params['components.list'].value;
  var type = req.swagger.params['type'].value;
  Configmgr.orgApacheFelixSystemreadyImplComponentsCheck(post,apply,_delete,action,Dollarlocation,propertylist,componentsPeriodlist,type)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixSystemreadyImplFrameworkStartCheck = function orgApacheFelixSystemreadyImplFrameworkStartCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var timeout = req.swagger.params['timeout'].value;
  var targetPeriodstartPeriodlevel = req.swagger.params['target.start.level'].value;
  var targetPeriodstartPeriodlevelPeriodpropPeriodname = req.swagger.params['target.start.level.prop.name'].value;
  var type = req.swagger.params['type'].value;
  Configmgr.orgApacheFelixSystemreadyImplFrameworkStartCheck(post,apply,_delete,action,Dollarlocation,propertylist,timeout,targetPeriodstartPeriodlevel,targetPeriodstartPeriodlevelPeriodpropPeriodname,type)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixSystemreadyImplServicesCheck = function orgApacheFelixSystemreadyImplServicesCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicesPeriodlist = req.swagger.params['services.list'].value;
  var type = req.swagger.params['type'].value;
  Configmgr.orgApacheFelixSystemreadyImplServicesCheck(post,apply,_delete,action,Dollarlocation,propertylist,servicesPeriodlist,type)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixSystemreadyImplServletSystemAliveServlet = function orgApacheFelixSystemreadyImplServletSystemAliveServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern = req.swagger.params['osgi.http.whiteboard.servlet.pattern'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect = req.swagger.params['osgi.http.whiteboard.context.select'].value;
  Configmgr.orgApacheFelixSystemreadyImplServletSystemAliveServlet(post,apply,_delete,action,Dollarlocation,propertylist,osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern,osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixSystemreadyImplServletSystemReadyServlet = function orgApacheFelixSystemreadyImplServletSystemReadyServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern = req.swagger.params['osgi.http.whiteboard.servlet.pattern'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect = req.swagger.params['osgi.http.whiteboard.context.select'].value;
  Configmgr.orgApacheFelixSystemreadyImplServletSystemReadyServlet(post,apply,_delete,action,Dollarlocation,propertylist,osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern,osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixSystemreadySystemReadyMonitor = function orgApacheFelixSystemreadySystemReadyMonitor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pollPeriodinterval = req.swagger.params['poll.interval'].value;
  Configmgr.orgApacheFelixSystemreadySystemReadyMonitor(post,apply,_delete,action,Dollarlocation,propertylist,pollPeriodinterval)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixWebconsoleInternalServletOsgiManager = function orgApacheFelixWebconsoleInternalServletOsgiManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var managerPeriodroot = req.swagger.params['manager.root'].value;
  var httpPeriodservicePeriodfilter = req.swagger.params['http.service.filter'].value;
  var defaultPeriodrender = req.swagger.params['default.render'].value;
  var realm = req.swagger.params['realm'].value;
  var username = req.swagger.params['username'].value;
  var password = req.swagger.params['password'].value;
  var category = req.swagger.params['category'].value;
  var locale = req.swagger.params['locale'].value;
  var loglevel = req.swagger.params['loglevel'].value;
  var plugins = req.swagger.params['plugins'].value;
  Configmgr.orgApacheFelixWebconsoleInternalServletOsgiManager(post,apply,_delete,action,Dollarlocation,propertylist,managerPeriodroot,httpPeriodservicePeriodfilter,defaultPeriodrender,realm,username,password,category,locale,loglevel,plugins)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixWebconsolePluginsEventInternalPluginServlet = function orgApacheFelixWebconsolePluginsEventInternalPluginServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxPeriodsize = req.swagger.params['max.size'].value;
  Configmgr.orgApacheFelixWebconsolePluginsEventInternalPluginServlet(post,apply,_delete,action,Dollarlocation,propertylist,maxPeriodsize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo = function orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var felixPeriodmemoryusagePerioddumpPeriodthreshold = req.swagger.params['felix.memoryusage.dump.threshold'].value;
  var felixPeriodmemoryusagePerioddumpPeriodinterval = req.swagger.params['felix.memoryusage.dump.interval'].value;
  var felixPeriodmemoryusagePerioddumpPeriodlocation = req.swagger.params['felix.memoryusage.dump.location'].value;
  Configmgr.orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo(post,apply,_delete,action,Dollarlocation,propertylist,felixPeriodmemoryusagePerioddumpPeriodthreshold,felixPeriodmemoryusagePerioddumpPeriodinterval,felixPeriodmemoryusagePerioddumpPeriodlocation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheHttpProxyconfigurator = function orgApacheHttpProxyconfigurator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var proxyPeriodenabled = req.swagger.params['proxy.enabled'].value;
  var proxyPeriodhost = req.swagger.params['proxy.host'].value;
  var proxyPeriodport = req.swagger.params['proxy.port'].value;
  var proxyPerioduser = req.swagger.params['proxy.user'].value;
  var proxyPeriodpassword = req.swagger.params['proxy.password'].value;
  var proxyPeriodexceptions = req.swagger.params['proxy.exceptions'].value;
  Configmgr.orgApacheHttpProxyconfigurator(post,apply,_delete,action,Dollarlocation,propertylist,proxyPeriodenabled,proxyPeriodhost,proxyPeriodport,proxyPerioduser,proxyPeriodpassword,proxyPeriodexceptions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider = function orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var dir = req.swagger.params['dir'].value;
  Configmgr.orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider(post,apply,_delete,action,Dollarlocation,propertylist,dir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore = function orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  Configmgr.orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore(post,apply,_delete,action,Dollarlocation,propertylist,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService = function orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mongouri = req.swagger.params['mongouri'].value;
  var db = req.swagger.params['db'].value;
  var socketKeepAlive = req.swagger.params['socketKeepAlive'].value;
  var cache = req.swagger.params['cache'].value;
  var nodeCachePercentage = req.swagger.params['nodeCachePercentage'].value;
  var prevDocCachePercentage = req.swagger.params['prevDocCachePercentage'].value;
  var childrenCachePercentage = req.swagger.params['childrenCachePercentage'].value;
  var diffCachePercentage = req.swagger.params['diffCachePercentage'].value;
  var cacheSegmentCount = req.swagger.params['cacheSegmentCount'].value;
  var cacheStackMoveDistance = req.swagger.params['cacheStackMoveDistance'].value;
  var blobCacheSize = req.swagger.params['blobCacheSize'].value;
  var persistentCache = req.swagger.params['persistentCache'].value;
  var journalCache = req.swagger.params['journalCache'].value;
  var customBlobStore = req.swagger.params['customBlobStore'].value;
  var journalGCInterval = req.swagger.params['journalGCInterval'].value;
  var journalGCMaxAge = req.swagger.params['journalGCMaxAge'].value;
  var prefetchExternalChanges = req.swagger.params['prefetchExternalChanges'].value;
  var role = req.swagger.params['role'].value;
  var versionGcMaxAgeInSecs = req.swagger.params['versionGcMaxAgeInSecs'].value;
  var versionGCExpression = req.swagger.params['versionGCExpression'].value;
  var versionGCTimeLimitInSecs = req.swagger.params['versionGCTimeLimitInSecs'].value;
  var blobGcMaxAgeInSecs = req.swagger.params['blobGcMaxAgeInSecs'].value;
  var blobTrackSnapshotIntervalInSecs = req.swagger.params['blobTrackSnapshotIntervalInSecs'].value;
  var repositoryPeriodhome = req.swagger.params['repository.home'].value;
  var maxReplicationLagInSecs = req.swagger.params['maxReplicationLagInSecs'].value;
  var documentStoreType = req.swagger.params['documentStoreType'].value;
  var bundlingDisabled = req.swagger.params['bundlingDisabled'].value;
  var updateLimit = req.swagger.params['updateLimit'].value;
  var persistentCacheIncludes = req.swagger.params['persistentCacheIncludes'].value;
  var leaseCheckMode = req.swagger.params['leaseCheckMode'].value;
  Configmgr.orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService(post,apply,_delete,action,Dollarlocation,propertylist,mongouri,db,socketKeepAlive,cache,nodeCachePercentage,prevDocCachePercentage,childrenCachePercentage,diffCachePercentage,cacheSegmentCount,cacheStackMoveDistance,blobCacheSize,persistentCache,journalCache,customBlobStore,journalGCInterval,journalGCMaxAge,prefetchExternalChanges,role,versionGcMaxAgeInSecs,versionGCExpression,versionGCTimeLimitInSecs,blobGcMaxAgeInSecs,blobTrackSnapshotIntervalInSecs,repositoryPeriodhome,maxReplicationLagInSecs,documentStoreType,bundlingDisabled,updateLimit,persistentCacheIncludes,leaseCheckMode)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre = function orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var persistentCacheIncludes = req.swagger.params['persistentCacheIncludes'].value;
  Configmgr.orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre(post,apply,_delete,action,Dollarlocation,propertylist,persistentCacheIncludes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac = function orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var includedPaths = req.swagger.params['includedPaths'].value;
  var enableAsyncObserver = req.swagger.params['enableAsyncObserver'].value;
  var observerQueueSize = req.swagger.params['observerQueueSize'].value;
  Configmgr.orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac(post,apply,_delete,action,Dollarlocation,propertylist,includedPaths,enableAsyncObserver,observerQueueSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexAsyncIndexerService = function orgApacheJackrabbitOakPluginsIndexAsyncIndexerService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var asyncConfigs = req.swagger.params['asyncConfigs'].value;
  var leaseTimeOutMinutes = req.swagger.params['leaseTimeOutMinutes'].value;
  var failingIndexTimeoutSeconds = req.swagger.params['failingIndexTimeoutSeconds'].value;
  var errorWarnIntervalSeconds = req.swagger.params['errorWarnIntervalSeconds'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexAsyncIndexerService(post,apply,_delete,action,Dollarlocation,propertylist,asyncConfigs,leaseTimeOutMinutes,failingIndexTimeoutSeconds,errorWarnIntervalSeconds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ = function orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var disabled = req.swagger.params['disabled'].value;
  var debug = req.swagger.params['debug'].value;
  var localIndexDir = req.swagger.params['localIndexDir'].value;
  var enableOpenIndexAsync = req.swagger.params['enableOpenIndexAsync'].value;
  var threadPoolSize = req.swagger.params['threadPoolSize'].value;
  var prefetchIndexFiles = req.swagger.params['prefetchIndexFiles'].value;
  var extractedTextCacheSizeInMB = req.swagger.params['extractedTextCacheSizeInMB'].value;
  var extractedTextCacheExpiryInSecs = req.swagger.params['extractedTextCacheExpiryInSecs'].value;
  var alwaysUsePreExtractedCache = req.swagger.params['alwaysUsePreExtractedCache'].value;
  var booleanClauseLimit = req.swagger.params['booleanClauseLimit'].value;
  var enableHybridIndexing = req.swagger.params['enableHybridIndexing'].value;
  var hybridQueueSize = req.swagger.params['hybridQueueSize'].value;
  var disableStoredIndexDefinition = req.swagger.params['disableStoredIndexDefinition'].value;
  var deletedBlobsCollectionEnabled = req.swagger.params['deletedBlobsCollectionEnabled'].value;
  var propIndexCleanerIntervalInSecs = req.swagger.params['propIndexCleanerIntervalInSecs'].value;
  var enableSingleBlobIndexFiles = req.swagger.params['enableSingleBlobIndexFiles'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ(post,apply,_delete,action,Dollarlocation,propertylist,disabled,debug,localIndexDir,enableOpenIndexAsync,threadPoolSize,prefetchIndexFiles,extractedTextCacheSizeInMB,extractedTextCacheExpiryInSecs,alwaysUsePreExtractedCache,booleanClauseLimit,enableHybridIndexing,hybridQueueSize,disableStoredIndexDefinition,deletedBlobsCollectionEnabled,propIndexCleanerIntervalInSecs,enableSingleBlobIndexFiles)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo = function orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var solrPeriodhomePeriodpath = req.swagger.params['solr.home.path'].value;
  var solrPeriodcorePeriodname = req.swagger.params['solr.core.name'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo(post,apply,_delete,action,Dollarlocation,propertylist,solrPeriodhomePeriodpath,solrPeriodcorePeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers = function orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration = function orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var pathPerioddescPeriodfield = req.swagger.params['path.desc.field'].value;
  var pathPeriodchildPeriodfield = req.swagger.params['path.child.field'].value;
  var pathPeriodparentPeriodfield = req.swagger.params['path.parent.field'].value;
  var pathPeriodexactPeriodfield = req.swagger.params['path.exact.field'].value;
  var catchPeriodallPeriodfield = req.swagger.params['catch.all.field'].value;
  var collapsedPeriodpathPeriodfield = req.swagger.params['collapsed.path.field'].value;
  var pathPerioddepthPeriodfield = req.swagger.params['path.depth.field'].value;
  var commitPeriodpolicy = req.swagger.params['commit.policy'].value;
  var rows = req.swagger.params['rows'].value;
  var pathPeriodrestrictions = req.swagger.params['path.restrictions'].value;
  var propertyPeriodrestrictions = req.swagger.params['property.restrictions'].value;
  var primarytypesPeriodrestrictions = req.swagger.params['primarytypes.restrictions'].value;
  var ignoredPeriodproperties = req.swagger.params['ignored.properties'].value;
  var usedPeriodproperties = req.swagger.params['used.properties'].value;
  var typePeriodmappings = req.swagger.params['type.mappings'].value;
  var propertyPeriodmappings = req.swagger.params['property.mappings'].value;
  var collapsePeriodjcrcontentPeriodnodes = req.swagger.params['collapse.jcrcontent.nodes'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,pathPerioddescPeriodfield,pathPeriodchildPeriodfield,pathPeriodparentPeriodfield,pathPeriodexactPeriodfield,catchPeriodallPeriodfield,collapsedPeriodpathPeriodfield,pathPerioddepthPeriodfield,commitPeriodpolicy,rows,pathPeriodrestrictions,propertyPeriodrestrictions,primarytypesPeriodrestrictions,ignoredPeriodproperties,usedPeriodproperties,typePeriodmappings,propertyPeriodmappings,collapsePeriodjcrcontentPeriodnodes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf = function orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var solrPeriodhttpPeriodurl = req.swagger.params['solr.http.url'].value;
  var solrPeriodzkPeriodhost = req.swagger.params['solr.zk.host'].value;
  var solrPeriodcollection = req.swagger.params['solr.collection'].value;
  var solrPeriodsocketPeriodtimeout = req.swagger.params['solr.socket.timeout'].value;
  var solrPeriodconnectionPeriodtimeout = req.swagger.params['solr.connection.timeout'].value;
  var solrPeriodshardsPeriodno = req.swagger.params['solr.shards.no'].value;
  var solrPeriodreplicationPeriodfactor = req.swagger.params['solr.replication.factor'].value;
  var solrPeriodconfPerioddir = req.swagger.params['solr.conf.dir'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf(post,apply,_delete,action,Dollarlocation,propertylist,solrPeriodhttpPeriodurl,solrPeriodzkPeriodhost,solrPeriodcollection,solrPeriodsocketPeriodtimeout,solrPeriodconnectionPeriodtimeout,solrPeriodshardsPeriodno,solrPeriodreplicationPeriodfactor,solrPeriodconfPerioddir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid = function orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var queryPeriodaggregation = req.swagger.params['query.aggregation'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid(post,apply,_delete,action,Dollarlocation,propertylist,queryPeriodaggregation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe = function orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var serverPeriodtype = req.swagger.params['server.type'].value;
  Configmgr.orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe(post,apply,_delete,action,Dollarlocation,propertylist,serverPeriodtype)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory = function orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerType = req.swagger.params['providerType'].value;
  Configmgr.orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory(post,apply,_delete,action,Dollarlocation,propertylist,providerType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider = function orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxItems = req.swagger.params['maxItems'].value;
  var maxPathDepth = req.swagger.params['maxPathDepth'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider(post,apply,_delete,action,Dollarlocation,propertylist,maxItems,maxPathDepth,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakQueryQueryEngineSettingsService = function orgApacheJackrabbitOakQueryQueryEngineSettingsService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var queryLimitInMemory = req.swagger.params['queryLimitInMemory'].value;
  var queryLimitReads = req.swagger.params['queryLimitReads'].value;
  var queryFailTraversal = req.swagger.params['queryFailTraversal'].value;
  var fastQuerySize = req.swagger.params['fastQuerySize'].value;
  Configmgr.orgApacheJackrabbitOakQueryQueryEngineSettingsService(post,apply,_delete,action,Dollarlocation,propertylist,queryLimitInMemory,queryLimitReads,queryFailTraversal,fastQuerySize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig = function orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName = req.swagger.params['org.apache.jackrabbit.oak.authentication.appName'].value;
  var orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName = req.swagger.params['org.apache.jackrabbit.oak.authentication.configSpiName'].value;
  Configmgr.orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName,orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti = function orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerPeriodname = req.swagger.params['provider.name'].value;
  var hostPeriodname = req.swagger.params['host.name'].value;
  var hostPeriodport = req.swagger.params['host.port'].value;
  var hostPeriodssl = req.swagger.params['host.ssl'].value;
  var hostPeriodtls = req.swagger.params['host.tls'].value;
  var hostPeriodnoCertCheck = req.swagger.params['host.noCertCheck'].value;
  var bindPerioddn = req.swagger.params['bind.dn'].value;
  var bindPeriodpassword = req.swagger.params['bind.password'].value;
  var searchTimeout = req.swagger.params['searchTimeout'].value;
  var adminPoolPeriodmaxActive = req.swagger.params['adminPool.maxActive'].value;
  var adminPoolPeriodlookupOnValidate = req.swagger.params['adminPool.lookupOnValidate'].value;
  var userPoolPeriodmaxActive = req.swagger.params['userPool.maxActive'].value;
  var userPoolPeriodlookupOnValidate = req.swagger.params['userPool.lookupOnValidate'].value;
  var userPeriodbaseDN = req.swagger.params['user.baseDN'].value;
  var userPeriodobjectclass = req.swagger.params['user.objectclass'].value;
  var userPeriodidAttribute = req.swagger.params['user.idAttribute'].value;
  var userPeriodextraFilter = req.swagger.params['user.extraFilter'].value;
  var userPeriodmakeDnPath = req.swagger.params['user.makeDnPath'].value;
  var groupPeriodbaseDN = req.swagger.params['group.baseDN'].value;
  var groupPeriodobjectclass = req.swagger.params['group.objectclass'].value;
  var groupPeriodnameAttribute = req.swagger.params['group.nameAttribute'].value;
  var groupPeriodextraFilter = req.swagger.params['group.extraFilter'].value;
  var groupPeriodmakeDnPath = req.swagger.params['group.makeDnPath'].value;
  var groupPeriodmemberAttribute = req.swagger.params['group.memberAttribute'].value;
  var useUidForExtId = req.swagger.params['useUidForExtId'].value;
  var customattributes = req.swagger.params['customattributes'].value;
  Configmgr.orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti(post,apply,_delete,action,Dollarlocation,propertylist,providerPeriodname,hostPeriodname,hostPeriodport,hostPeriodssl,hostPeriodtls,hostPeriodnoCertCheck,bindPerioddn,bindPeriodpassword,searchTimeout,adminPoolPeriodmaxActive,adminPoolPeriodlookupOnValidate,userPoolPeriodmaxActive,userPoolPeriodlookupOnValidate,userPeriodbaseDN,userPeriodobjectclass,userPeriodidAttribute,userPeriodextraFilter,userPeriodmakeDnPath,groupPeriodbaseDN,groupPeriodobjectclass,groupPeriodnameAttribute,groupPeriodextraFilter,groupPeriodmakeDnPath,groupPeriodmemberAttribute,useUidForExtId,customattributes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura = function orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var tokenExpiration = req.swagger.params['tokenExpiration'].value;
  var tokenLength = req.swagger.params['tokenLength'].value;
  var tokenRefresh = req.swagger.params['tokenRefresh'].value;
  var tokenCleanupThreshold = req.swagger.params['tokenCleanupThreshold'].value;
  var passwordHashAlgorithm = req.swagger.params['passwordHashAlgorithm'].value;
  var passwordHashIterations = req.swagger.params['passwordHashIterations'].value;
  var passwordSaltSize = req.swagger.params['passwordSaltSize'].value;
  Configmgr.orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura(post,apply,_delete,action,Dollarlocation,propertylist,tokenExpiration,tokenLength,tokenRefresh,tokenCleanupThreshold,passwordHashAlgorithm,passwordHashIterations,passwordSaltSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur = function orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var permissionsJr2 = req.swagger.params['permissionsJr2'].value;
  var importBehavior = req.swagger.params['importBehavior'].value;
  var readPaths = req.swagger.params['readPaths'].value;
  var administrativePrincipals = req.swagger.params['administrativePrincipals'].value;
  var configurationRanking = req.swagger.params['configurationRanking'].value;
  Configmgr.orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur(post,apply,_delete,action,Dollarlocation,propertylist,permissionsJr2,importBehavior,readPaths,administrativePrincipals,configurationRanking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati = function orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var requiredServicePids = req.swagger.params['requiredServicePids'].value;
  var authorizationCompositionType = req.swagger.params['authorizationCompositionType'].value;
  Configmgr.orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati(post,apply,_delete,action,Dollarlocation,propertylist,requiredServicePids,authorizationCompositionType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName = function orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var length = req.swagger.params['length'].value;
  Configmgr.orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName(post,apply,_delete,action,Dollarlocation,propertylist,length)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSecurityUserUserConfigurationImpl = function orgApacheJackrabbitOakSecurityUserUserConfigurationImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var usersPath = req.swagger.params['usersPath'].value;
  var groupsPath = req.swagger.params['groupsPath'].value;
  var systemRelativePath = req.swagger.params['systemRelativePath'].value;
  var defaultDepth = req.swagger.params['defaultDepth'].value;
  var importBehavior = req.swagger.params['importBehavior'].value;
  var passwordHashAlgorithm = req.swagger.params['passwordHashAlgorithm'].value;
  var passwordHashIterations = req.swagger.params['passwordHashIterations'].value;
  var passwordSaltSize = req.swagger.params['passwordSaltSize'].value;
  var omitAdminPw = req.swagger.params['omitAdminPw'].value;
  var supportAutoSave = req.swagger.params['supportAutoSave'].value;
  var passwordMaxAge = req.swagger.params['passwordMaxAge'].value;
  var initialPasswordChange = req.swagger.params['initialPasswordChange'].value;
  var passwordHistorySize = req.swagger.params['passwordHistorySize'].value;
  var passwordExpiryForAdmin = req.swagger.params['passwordExpiryForAdmin'].value;
  var cacheExpiration = req.swagger.params['cacheExpiration'].value;
  var enableRFC7613UsercaseMappedProfile = req.swagger.params['enableRFC7613UsercaseMappedProfile'].value;
  Configmgr.orgApacheJackrabbitOakSecurityUserUserConfigurationImpl(post,apply,_delete,action,Dollarlocation,propertylist,usersPath,groupsPath,systemRelativePath,defaultDepth,importBehavior,passwordHashAlgorithm,passwordHashIterations,passwordSaltSize,omitAdminPw,supportAutoSave,passwordMaxAge,initialPasswordChange,passwordHistorySize,passwordExpiryForAdmin,cacheExpiration,enableRFC7613UsercaseMappedProfile)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService = function orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var accountName = req.swagger.params['accountName'].value;
  var containerName = req.swagger.params['containerName'].value;
  var accessKey = req.swagger.params['accessKey'].value;
  var rootPath = req.swagger.params['rootPath'].value;
  var connectionURL = req.swagger.params['connectionURL'].value;
  Configmgr.orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService(post,apply,_delete,action,Dollarlocation,propertylist,accountName,containerName,accessKey,rootPath,connectionURL)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory = function orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var repositoryPeriodhome = req.swagger.params['repository.home'].value;
  var tarmkPeriodmode = req.swagger.params['tarmk.mode'].value;
  var tarmkPeriodsize = req.swagger.params['tarmk.size'].value;
  var segmentCachePeriodsize = req.swagger.params['segmentCache.size'].value;
  var stringCachePeriodsize = req.swagger.params['stringCache.size'].value;
  var templateCachePeriodsize = req.swagger.params['templateCache.size'].value;
  var stringDeduplicationCachePeriodsize = req.swagger.params['stringDeduplicationCache.size'].value;
  var templateDeduplicationCachePeriodsize = req.swagger.params['templateDeduplicationCache.size'].value;
  var nodeDeduplicationCachePeriodsize = req.swagger.params['nodeDeduplicationCache.size'].value;
  var pauseCompaction = req.swagger.params['pauseCompaction'].value;
  var compactionPeriodretryCount = req.swagger.params['compaction.retryCount'].value;
  var compactionPeriodforcePeriodtimeout = req.swagger.params['compaction.force.timeout'].value;
  var compactionPeriodsizeDeltaEstimation = req.swagger.params['compaction.sizeDeltaEstimation'].value;
  var compactionPerioddisableEstimation = req.swagger.params['compaction.disableEstimation'].value;
  var compactionPeriodretainedGenerations = req.swagger.params['compaction.retainedGenerations'].value;
  var compactionPeriodmemoryThreshold = req.swagger.params['compaction.memoryThreshold'].value;
  var compactionPeriodprogressLog = req.swagger.params['compaction.progressLog'].value;
  var standby = req.swagger.params['standby'].value;
  var customBlobStore = req.swagger.params['customBlobStore'].value;
  var customSegmentStore = req.swagger.params['customSegmentStore'].value;
  var splitPersistence = req.swagger.params['splitPersistence'].value;
  var repositoryPeriodbackupPerioddir = req.swagger.params['repository.backup.dir'].value;
  var blobGcMaxAgeInSecs = req.swagger.params['blobGcMaxAgeInSecs'].value;
  var blobTrackSnapshotIntervalInSecs = req.swagger.params['blobTrackSnapshotIntervalInSecs'].value;
  var role = req.swagger.params['role'].value;
  var registerDescriptors = req.swagger.params['registerDescriptors'].value;
  var dispatchChanges = req.swagger.params['dispatchChanges'].value;
  Configmgr.orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory(post,apply,_delete,action,Dollarlocation,propertylist,repositoryPeriodhome,tarmkPeriodmode,tarmkPeriodsize,segmentCachePeriodsize,stringCachePeriodsize,templateCachePeriodsize,stringDeduplicationCachePeriodsize,templateDeduplicationCachePeriodsize,nodeDeduplicationCachePeriodsize,pauseCompaction,compactionPeriodretryCount,compactionPeriodforcePeriodtimeout,compactionPeriodsizeDeltaEstimation,compactionPerioddisableEstimation,compactionPeriodretainedGenerations,compactionPeriodmemoryThreshold,compactionPeriodprogressLog,standby,customBlobStore,customSegmentStore,splitPersistence,repositoryPeriodbackupPerioddir,blobGcMaxAgeInSecs,blobTrackSnapshotIntervalInSecs,role,registerDescriptors,dispatchChanges)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService = function orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var commitsTrackerWriterGroups = req.swagger.params['commitsTrackerWriterGroups'].value;
  Configmgr.orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService(post,apply,_delete,action,Dollarlocation,propertylist,commitsTrackerWriterGroups)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSegmentSegmentNodeStoreService = function orgApacheJackrabbitOakSegmentSegmentNodeStoreService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var repositoryPeriodhome = req.swagger.params['repository.home'].value;
  var tarmkPeriodmode = req.swagger.params['tarmk.mode'].value;
  var tarmkPeriodsize = req.swagger.params['tarmk.size'].value;
  var segmentCachePeriodsize = req.swagger.params['segmentCache.size'].value;
  var stringCachePeriodsize = req.swagger.params['stringCache.size'].value;
  var templateCachePeriodsize = req.swagger.params['templateCache.size'].value;
  var stringDeduplicationCachePeriodsize = req.swagger.params['stringDeduplicationCache.size'].value;
  var templateDeduplicationCachePeriodsize = req.swagger.params['templateDeduplicationCache.size'].value;
  var nodeDeduplicationCachePeriodsize = req.swagger.params['nodeDeduplicationCache.size'].value;
  var pauseCompaction = req.swagger.params['pauseCompaction'].value;
  var compactionPeriodretryCount = req.swagger.params['compaction.retryCount'].value;
  var compactionPeriodforcePeriodtimeout = req.swagger.params['compaction.force.timeout'].value;
  var compactionPeriodsizeDeltaEstimation = req.swagger.params['compaction.sizeDeltaEstimation'].value;
  var compactionPerioddisableEstimation = req.swagger.params['compaction.disableEstimation'].value;
  var compactionPeriodretainedGenerations = req.swagger.params['compaction.retainedGenerations'].value;
  var compactionPeriodmemoryThreshold = req.swagger.params['compaction.memoryThreshold'].value;
  var compactionPeriodprogressLog = req.swagger.params['compaction.progressLog'].value;
  var standby = req.swagger.params['standby'].value;
  var customBlobStore = req.swagger.params['customBlobStore'].value;
  var customSegmentStore = req.swagger.params['customSegmentStore'].value;
  var splitPersistence = req.swagger.params['splitPersistence'].value;
  var repositoryPeriodbackupPerioddir = req.swagger.params['repository.backup.dir'].value;
  var blobGcMaxAgeInSecs = req.swagger.params['blobGcMaxAgeInSecs'].value;
  var blobTrackSnapshotIntervalInSecs = req.swagger.params['blobTrackSnapshotIntervalInSecs'].value;
  Configmgr.orgApacheJackrabbitOakSegmentSegmentNodeStoreService(post,apply,_delete,action,Dollarlocation,propertylist,repositoryPeriodhome,tarmkPeriodmode,tarmkPeriodsize,segmentCachePeriodsize,stringCachePeriodsize,templateCachePeriodsize,stringDeduplicationCachePeriodsize,templateDeduplicationCachePeriodsize,nodeDeduplicationCachePeriodsize,pauseCompaction,compactionPeriodretryCount,compactionPeriodforcePeriodtimeout,compactionPeriodsizeDeltaEstimation,compactionPerioddisableEstimation,compactionPeriodretainedGenerations,compactionPeriodmemoryThreshold,compactionPeriodprogressLog,standby,customBlobStore,customSegmentStore,splitPersistence,repositoryPeriodbackupPerioddir,blobGcMaxAgeInSecs,blobTrackSnapshotIntervalInSecs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService = function orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist = req.swagger.params['org.apache.sling.installer.configuration.persist'].value;
  var mode = req.swagger.params['mode'].value;
  var port = req.swagger.params['port'].value;
  var primaryPeriodhost = req.swagger.params['primary.host'].value;
  var interval = req.swagger.params['interval'].value;
  var primaryPeriodallowedClientIpRanges = req.swagger.params['primary.allowed-client-ip-ranges'].value;
  var secure = req.swagger.params['secure'].value;
  var standbyPeriodreadtimeout = req.swagger.params['standby.readtimeout'].value;
  var standbyPeriodautoclean = req.swagger.params['standby.autoclean'].value;
  Configmgr.orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist,mode,port,primaryPeriodhost,interval,primaryPeriodallowedClientIpRanges,secure,standbyPeriodreadtimeout,standbyPeriodautoclean)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe = function orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var handlerPeriodname = req.swagger.params['handler.name'].value;
  var userPeriodexpirationTime = req.swagger.params['user.expirationTime'].value;
  var userPeriodautoMembership = req.swagger.params['user.autoMembership'].value;
  var userPeriodpropertyMapping = req.swagger.params['user.propertyMapping'].value;
  var userPeriodpathPrefix = req.swagger.params['user.pathPrefix'].value;
  var userPeriodmembershipExpTime = req.swagger.params['user.membershipExpTime'].value;
  var userPeriodmembershipNestingDepth = req.swagger.params['user.membershipNestingDepth'].value;
  var userPerioddynamicMembership = req.swagger.params['user.dynamicMembership'].value;
  var userPerioddisableMissing = req.swagger.params['user.disableMissing'].value;
  var groupPeriodexpirationTime = req.swagger.params['group.expirationTime'].value;
  var groupPeriodautoMembership = req.swagger.params['group.autoMembership'].value;
  var groupPeriodpropertyMapping = req.swagger.params['group.propertyMapping'].value;
  var groupPeriodpathPrefix = req.swagger.params['group.pathPrefix'].value;
  var enableRFC7613UsercaseMappedProfile = req.swagger.params['enableRFC7613UsercaseMappedProfile'].value;
  Configmgr.orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe(post,apply,_delete,action,Dollarlocation,propertylist,handlerPeriodname,userPeriodexpirationTime,userPeriodautoMembership,userPeriodpropertyMapping,userPeriodpathPrefix,userPeriodmembershipExpTime,userPeriodmembershipNestingDepth,userPerioddynamicMembership,userPerioddisableMissing,groupPeriodexpirationTime,groupPeriodautoMembership,groupPeriodpropertyMapping,groupPeriodpathPrefix,enableRFC7613UsercaseMappedProfile)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx = function orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jaasPeriodranking = req.swagger.params['jaas.ranking'].value;
  var jaasPeriodcontrolFlag = req.swagger.params['jaas.controlFlag'].value;
  var jaasPeriodrealmName = req.swagger.params['jaas.realmName'].value;
  var idpPeriodname = req.swagger.params['idp.name'].value;
  var syncPeriodhandlerName = req.swagger.params['sync.handlerName'].value;
  Configmgr.orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx(post,apply,_delete,action,Dollarlocation,propertylist,jaasPeriodranking,jaasPeriodcontrolFlag,jaasPeriodrealmName,idpPeriodname,syncPeriodhandlerName)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr = function orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var protectExternalId = req.swagger.params['protectExternalId'].value;
  Configmgr.orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr(post,apply,_delete,action,Dollarlocation,propertylist,protectExternalId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi = function orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var cugSupportedPaths = req.swagger.params['cugSupportedPaths'].value;
  var cugEnabled = req.swagger.params['cugEnabled'].value;
  var configurationRanking = req.swagger.params['configurationRanking'].value;
  Configmgr.orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi(post,apply,_delete,action,Dollarlocation,propertylist,cugSupportedPaths,cugEnabled,configurationRanking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu = function orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var principalNames = req.swagger.params['principalNames'].value;
  Configmgr.orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu(post,apply,_delete,action,Dollarlocation,propertylist,principalNames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable = function orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabledActions = req.swagger.params['enabledActions'].value;
  var userPrivilegeNames = req.swagger.params['userPrivilegeNames'].value;
  var groupPrivilegeNames = req.swagger.params['groupPrivilegeNames'].value;
  var constraint = req.swagger.params['constraint'].value;
  Configmgr.orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable(post,apply,_delete,action,Dollarlocation,propertylist,enabledActions,userPrivilegeNames,groupPrivilegeNames,constraint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitVaultPackagingImplPackagingImpl = function orgApacheJackrabbitVaultPackagingImplPackagingImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var packageRoots = req.swagger.params['packageRoots'].value;
  Configmgr.orgApacheJackrabbitVaultPackagingImplPackagingImpl(post,apply,_delete,action,Dollarlocation,propertylist,packageRoots)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry = function orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var homePath = req.swagger.params['homePath'].value;
  Configmgr.orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry(post,apply,_delete,action,Dollarlocation,propertylist,homePath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingAuthCoreImplLogoutServlet = function orgApacheSlingAuthCoreImplLogoutServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodmethods = req.swagger.params['sling.servlet.methods'].value;
  var slingPeriodservletPeriodpaths = req.swagger.params['sling.servlet.paths'].value;
  Configmgr.orgApacheSlingAuthCoreImplLogoutServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodmethods,slingPeriodservletPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigImplConfigurationBindingsValueProvider = function orgApacheSlingCaconfigImplConfigurationBindingsValueProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.orgApacheSlingCaconfigImplConfigurationBindingsValueProvider(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigImplConfigurationResolverImpl = function orgApacheSlingCaconfigImplConfigurationResolverImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var configBucketNames = req.swagger.params['configBucketNames'].value;
  Configmgr.orgApacheSlingCaconfigImplConfigurationResolverImpl(post,apply,_delete,action,Dollarlocation,propertylist,configBucketNames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra = function orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var configPropertyInheritancePropertyNames = req.swagger.params['configPropertyInheritancePropertyNames'].value;
  Configmgr.orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra(post,apply,_delete,action,Dollarlocation,propertylist,enabled,configPropertyInheritancePropertyNames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra = function orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra(post,apply,_delete,action,Dollarlocation,propertylist,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi = function orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var description = req.swagger.params['description'].value;
  var overrides = req.swagger.params['overrides'].value;
  var enabled = req.swagger.params['enabled'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi(post,apply,_delete,action,Dollarlocation,propertylist,description,overrides,enabled,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve = function orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve(post,apply,_delete,action,Dollarlocation,propertylist,enabled,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigManagementImplConfigurationManagementSetti = function orgApacheSlingCaconfigManagementImplConfigurationManagementSetti (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var ignorePropertyNameRegex = req.swagger.params['ignorePropertyNameRegex'].value;
  var configCollectionPropertiesResourceNames = req.swagger.params['configCollectionPropertiesResourceNames'].value;
  Configmgr.orgApacheSlingCaconfigManagementImplConfigurationManagementSetti(post,apply,_delete,action,Dollarlocation,propertylist,ignorePropertyNameRegex,configCollectionPropertiesResourceNames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour = function orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var configPath = req.swagger.params['configPath'].value;
  var fallbackPaths = req.swagger.params['fallbackPaths'].value;
  var configCollectionInheritancePropertyNames = req.swagger.params['configCollectionInheritancePropertyNames'].value;
  Configmgr.orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour(post,apply,_delete,action,Dollarlocation,propertylist,enabled,configPath,fallbackPaths,configCollectionInheritancePropertyNames)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy = function orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var enabled = req.swagger.params['enabled'].value;
  var configRefResourceNames = req.swagger.params['configRefResourceNames'].value;
  var configRefPropertyNames = req.swagger.params['configRefPropertyNames'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy(post,apply,_delete,action,Dollarlocation,propertylist,enabled,configRefResourceNames,configRefPropertyNames,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser = function orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var parserPeriodfeatures = req.swagger.params['parser.features'].value;
  Configmgr.orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser(post,apply,_delete,action,Dollarlocation,propertylist,parserPeriodfeatures)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsLogLogManager = function orgApacheSlingCommonsLogLogManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel = req.swagger.params['org.apache.sling.commons.log.level'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile = req.swagger.params['org.apache.sling.commons.log.file'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber = req.swagger.params['org.apache.sling.commons.log.file.number'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize = req.swagger.params['org.apache.sling.commons.log.file.size'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern = req.swagger.params['org.apache.sling.commons.log.pattern'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile = req.swagger.params['org.apache.sling.commons.log.configurationFile'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled = req.swagger.params['org.apache.sling.commons.log.packagingDataEnabled'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth = req.swagger.params['org.apache.sling.commons.log.maxCallerDataDepth'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump = req.swagger.params['org.apache.sling.commons.log.maxOldFileCountInDump'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines = req.swagger.params['org.apache.sling.commons.log.numOfLines'].value;
  Configmgr.orgApacheSlingCommonsLogLogManager(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsLogLogManagerFactoryConfig = function orgApacheSlingCommonsLogLogManagerFactoryConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel = req.swagger.params['org.apache.sling.commons.log.level'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile = req.swagger.params['org.apache.sling.commons.log.file'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern = req.swagger.params['org.apache.sling.commons.log.pattern'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames = req.swagger.params['org.apache.sling.commons.log.names'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv = req.swagger.params['org.apache.sling.commons.log.additiv'].value;
  Configmgr.orgApacheSlingCommonsLogLogManagerFactoryConfig(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsLogLogManagerFactoryWriter = function orgApacheSlingCommonsLogLogManagerFactoryWriter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile = req.swagger.params['org.apache.sling.commons.log.file'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber = req.swagger.params['org.apache.sling.commons.log.file.number'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize = req.swagger.params['org.apache.sling.commons.log.file.size'].value;
  var orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered = req.swagger.params['org.apache.sling.commons.log.file.buffered'].value;
  Configmgr.orgApacheSlingCommonsLogLogManagerFactoryWriter(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize,orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsMetricsInternalLogReporter = function orgApacheSlingCommonsMetricsInternalLogReporter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var period = req.swagger.params['period'].value;
  var timeUnit = req.swagger.params['timeUnit'].value;
  var level = req.swagger.params['level'].value;
  var loggerName = req.swagger.params['loggerName'].value;
  var prefix = req.swagger.params['prefix'].value;
  var pattern = req.swagger.params['pattern'].value;
  var registryName = req.swagger.params['registryName'].value;
  Configmgr.orgApacheSlingCommonsMetricsInternalLogReporter(post,apply,_delete,action,Dollarlocation,propertylist,period,timeUnit,level,loggerName,prefix,pattern,registryName)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter = function orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var datasources = req.swagger.params['datasources'].value;
  var step = req.swagger.params['step'].value;
  var archives = req.swagger.params['archives'].value;
  var path = req.swagger.params['path'].value;
  Configmgr.orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter(post,apply,_delete,action,Dollarlocation,propertylist,datasources,step,archives,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl = function orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mimePeriodtypes = req.swagger.params['mime.types'].value;
  Configmgr.orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,mimePeriodtypes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsSchedulerImplQuartzScheduler = function orgApacheSlingCommonsSchedulerImplQuartzScheduler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var poolName = req.swagger.params['poolName'].value;
  var allowedPoolNames = req.swagger.params['allowedPoolNames'].value;
  var schedulerPerioduseleaderforsingle = req.swagger.params['scheduler.useleaderforsingle'].value;
  var metricsPeriodfilters = req.swagger.params['metrics.filters'].value;
  var slowThresholdMillis = req.swagger.params['slowThresholdMillis'].value;
  Configmgr.orgApacheSlingCommonsSchedulerImplQuartzScheduler(post,apply,_delete,action,Dollarlocation,propertylist,poolName,allowedPoolNames,schedulerPerioduseleaderforsingle,metricsPeriodfilters,slowThresholdMillis)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck = function orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxPeriodquartzJobPerioddurationPeriodacceptable = req.swagger.params['max.quartzJob.duration.acceptable'].value;
  Configmgr.orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,maxPeriodquartzJobPerioddurationPeriodacceptable)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory = function orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var minPoolSize = req.swagger.params['minPoolSize'].value;
  var maxPoolSize = req.swagger.params['maxPoolSize'].value;
  var queueSize = req.swagger.params['queueSize'].value;
  var maxThreadAge = req.swagger.params['maxThreadAge'].value;
  var keepAliveTime = req.swagger.params['keepAliveTime'].value;
  var blockPolicy = req.swagger.params['blockPolicy'].value;
  var shutdownGraceful = req.swagger.params['shutdownGraceful'].value;
  var daemon = req.swagger.params['daemon'].value;
  var shutdownWaitTime = req.swagger.params['shutdownWaitTime'].value;
  var priority = req.swagger.params['priority'].value;
  Configmgr.orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory(post,apply,_delete,action,Dollarlocation,propertylist,name,minPoolSize,maxPoolSize,queueSize,maxThreadAge,keepAliveTime,blockPolicy,shutdownGraceful,daemon,shutdownWaitTime,priority)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDatasourceDataSourceFactory = function orgApacheSlingDatasourceDataSourceFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var datasourcePeriodname = req.swagger.params['datasource.name'].value;
  var datasourcePeriodsvcPeriodpropPeriodname = req.swagger.params['datasource.svc.prop.name'].value;
  var driverClassName = req.swagger.params['driverClassName'].value;
  var url = req.swagger.params['url'].value;
  var username = req.swagger.params['username'].value;
  var password = req.swagger.params['password'].value;
  var defaultAutoCommit = req.swagger.params['defaultAutoCommit'].value;
  var defaultReadOnly = req.swagger.params['defaultReadOnly'].value;
  var defaultTransactionIsolation = req.swagger.params['defaultTransactionIsolation'].value;
  var defaultCatalog = req.swagger.params['defaultCatalog'].value;
  var maxActive = req.swagger.params['maxActive'].value;
  var maxIdle = req.swagger.params['maxIdle'].value;
  var minIdle = req.swagger.params['minIdle'].value;
  var initialSize = req.swagger.params['initialSize'].value;
  var maxWait = req.swagger.params['maxWait'].value;
  var maxAge = req.swagger.params['maxAge'].value;
  var testOnBorrow = req.swagger.params['testOnBorrow'].value;
  var testOnReturn = req.swagger.params['testOnReturn'].value;
  var testWhileIdle = req.swagger.params['testWhileIdle'].value;
  var validationQuery = req.swagger.params['validationQuery'].value;
  var validationQueryTimeout = req.swagger.params['validationQueryTimeout'].value;
  var timeBetweenEvictionRunsMillis = req.swagger.params['timeBetweenEvictionRunsMillis'].value;
  var minEvictableIdleTimeMillis = req.swagger.params['minEvictableIdleTimeMillis'].value;
  var connectionProperties = req.swagger.params['connectionProperties'].value;
  var initSQL = req.swagger.params['initSQL'].value;
  var jdbcInterceptors = req.swagger.params['jdbcInterceptors'].value;
  var validationInterval = req.swagger.params['validationInterval'].value;
  var logValidationErrors = req.swagger.params['logValidationErrors'].value;
  var datasourcePeriodsvcPeriodproperties = req.swagger.params['datasource.svc.properties'].value;
  Configmgr.orgApacheSlingDatasourceDataSourceFactory(post,apply,_delete,action,Dollarlocation,propertylist,datasourcePeriodname,datasourcePeriodsvcPeriodpropPeriodname,driverClassName,url,username,password,defaultAutoCommit,defaultReadOnly,defaultTransactionIsolation,defaultCatalog,maxActive,maxIdle,minIdle,initialSize,maxWait,maxAge,testOnBorrow,testOnReturn,testWhileIdle,validationQuery,validationQueryTimeout,timeBetweenEvictionRunsMillis,minEvictableIdleTimeMillis,connectionProperties,initSQL,jdbcInterceptors,validationInterval,logValidationErrors,datasourcePeriodsvcPeriodproperties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDatasourceJNDIDataSourceFactory = function orgApacheSlingDatasourceJNDIDataSourceFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var datasourcePeriodname = req.swagger.params['datasource.name'].value;
  var datasourcePeriodsvcPeriodpropPeriodname = req.swagger.params['datasource.svc.prop.name'].value;
  var datasourcePeriodjndiPeriodname = req.swagger.params['datasource.jndi.name'].value;
  var jndiPeriodproperties = req.swagger.params['jndi.properties'].value;
  Configmgr.orgApacheSlingDatasourceJNDIDataSourceFactory(post,apply,_delete,action,Dollarlocation,propertylist,datasourcePeriodname,datasourcePeriodsvcPeriodpropPeriodname,datasourcePeriodjndiPeriodname,jndiPeriodproperties)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDiscoveryOakConfig = function orgApacheSlingDiscoveryOakConfig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var connectorPingTimeout = req.swagger.params['connectorPingTimeout'].value;
  var connectorPingInterval = req.swagger.params['connectorPingInterval'].value;
  var discoveryLiteCheckInterval = req.swagger.params['discoveryLiteCheckInterval'].value;
  var clusterSyncServiceTimeout = req.swagger.params['clusterSyncServiceTimeout'].value;
  var clusterSyncServiceInterval = req.swagger.params['clusterSyncServiceInterval'].value;
  var enableSyncToken = req.swagger.params['enableSyncToken'].value;
  var minEventDelay = req.swagger.params['minEventDelay'].value;
  var socketConnectTimeout = req.swagger.params['socketConnectTimeout'].value;
  var soTimeout = req.swagger.params['soTimeout'].value;
  var topologyConnectorUrls = req.swagger.params['topologyConnectorUrls'].value;
  var topologyConnectorWhitelist = req.swagger.params['topologyConnectorWhitelist'].value;
  var autoStopLocalLoopEnabled = req.swagger.params['autoStopLocalLoopEnabled'].value;
  var gzipConnectorRequestsEnabled = req.swagger.params['gzipConnectorRequestsEnabled'].value;
  var hmacEnabled = req.swagger.params['hmacEnabled'].value;
  var enableEncryption = req.swagger.params['enableEncryption'].value;
  var sharedKey = req.swagger.params['sharedKey'].value;
  var hmacSharedKeyTTL = req.swagger.params['hmacSharedKeyTTL'].value;
  var backoffStandbyFactor = req.swagger.params['backoffStandbyFactor'].value;
  var backoffStableFactor = req.swagger.params['backoffStableFactor'].value;
  Configmgr.orgApacheSlingDiscoveryOakConfig(post,apply,_delete,action,Dollarlocation,propertylist,connectorPingTimeout,connectorPingInterval,discoveryLiteCheckInterval,clusterSyncServiceTimeout,clusterSyncServiceInterval,enableSyncToken,minEventDelay,socketConnectTimeout,soTimeout,topologyConnectorUrls,topologyConnectorWhitelist,autoStopLocalLoopEnabled,gzipConnectorRequestsEnabled,hmacEnabled,enableEncryption,sharedKey,hmacSharedKeyTTL,backoffStandbyFactor,backoffStableFactor)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck = function orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  Configmgr.orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto = function orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var title = req.swagger.params['title'].value;
  var details = req.swagger.params['details'].value;
  var enabled = req.swagger.params['enabled'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var logPeriodlevel = req.swagger.params['log.level'].value;
  var allowedPeriodroots = req.swagger.params['allowed.roots'].value;
  var queuePeriodprocessingPeriodenabled = req.swagger.params['queue.processing.enabled'].value;
  var packageImporterPeriodendpoints = req.swagger.params['packageImporter.endpoints'].value;
  var passiveQueues = req.swagger.params['passiveQueues'].value;
  var priorityQueues = req.swagger.params['priorityQueues'].value;
  var retryPeriodstrategy = req.swagger.params['retry.strategy'].value;
  var retryPeriodattempts = req.swagger.params['retry.attempts'].value;
  var requestAuthorizationStrategyPeriodtarget = req.swagger.params['requestAuthorizationStrategy.target'].value;
  var transportSecretProviderPeriodtarget = req.swagger.params['transportSecretProvider.target'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  var triggersPeriodtarget = req.swagger.params['triggers.target'].value;
  var queuePeriodprovider = req.swagger.params['queue.provider'].value;
  var asyncPerioddelivery = req.swagger.params['async.delivery'].value;
  var httpPeriodconnPeriodtimeout = req.swagger.params['http.conn.timeout'].value;
  Configmgr.orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto(post,apply,_delete,action,Dollarlocation,propertylist,name,title,details,enabled,serviceName,logPeriodlevel,allowedPeriodroots,queuePeriodprocessingPeriodenabled,packageImporterPeriodendpoints,passiveQueues,priorityQueues,retryPeriodstrategy,retryPeriodattempts,requestAuthorizationStrategyPeriodtarget,transportSecretProviderPeriodtarget,packageBuilderPeriodtarget,triggersPeriodtarget,queuePeriodprovider,asyncPerioddelivery,httpPeriodconnPeriodtimeout)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA = function orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var jcrPrivilege = req.swagger.params['jcrPrivilege'].value;
  Configmgr.orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA(post,apply,_delete,action,Dollarlocation,propertylist,name,jcrPrivilege)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory = function orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var title = req.swagger.params['title'].value;
  var details = req.swagger.params['details'].value;
  var enabled = req.swagger.params['enabled'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var logPeriodlevel = req.swagger.params['log.level'].value;
  var allowedPeriodroots = req.swagger.params['allowed.roots'].value;
  var requestAuthorizationStrategyPeriodtarget = req.swagger.params['requestAuthorizationStrategy.target'].value;
  var queueProviderFactoryPeriodtarget = req.swagger.params['queueProviderFactory.target'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  var triggersPeriodtarget = req.swagger.params['triggers.target'].value;
  var priorityQueues = req.swagger.params['priorityQueues'].value;
  Configmgr.orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory(post,apply,_delete,action,Dollarlocation,propertylist,name,title,details,enabled,serviceName,logPeriodlevel,allowedPeriodroots,requestAuthorizationStrategyPeriodtarget,queueProviderFactoryPeriodtarget,packageBuilderPeriodtarget,triggersPeriodtarget,priorityQueues)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto = function orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var title = req.swagger.params['title'].value;
  var details = req.swagger.params['details'].value;
  var enabled = req.swagger.params['enabled'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var logPeriodlevel = req.swagger.params['log.level'].value;
  var queuePeriodprocessingPeriodenabled = req.swagger.params['queue.processing.enabled'].value;
  var packageExporterPeriodendpoints = req.swagger.params['packageExporter.endpoints'].value;
  var pullPerioditems = req.swagger.params['pull.items'].value;
  var httpPeriodconnPeriodtimeout = req.swagger.params['http.conn.timeout'].value;
  var requestAuthorizationStrategyPeriodtarget = req.swagger.params['requestAuthorizationStrategy.target'].value;
  var transportSecretProviderPeriodtarget = req.swagger.params['transportSecretProvider.target'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  var triggersPeriodtarget = req.swagger.params['triggers.target'].value;
  Configmgr.orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto(post,apply,_delete,action,Dollarlocation,propertylist,name,title,details,enabled,serviceName,logPeriodlevel,queuePeriodprocessingPeriodenabled,packageExporterPeriodendpoints,pullPerioditems,httpPeriodconnPeriodtimeout,requestAuthorizationStrategyPeriodtarget,transportSecretProviderPeriodtarget,packageBuilderPeriodtarget,triggersPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor = function orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var title = req.swagger.params['title'].value;
  var details = req.swagger.params['details'].value;
  var enabled = req.swagger.params['enabled'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var logPeriodlevel = req.swagger.params['log.level'].value;
  var queuePeriodprocessingPeriodenabled = req.swagger.params['queue.processing.enabled'].value;
  var packageExporterPeriodtarget = req.swagger.params['packageExporter.target'].value;
  var packageImporterPeriodtarget = req.swagger.params['packageImporter.target'].value;
  var requestAuthorizationStrategyPeriodtarget = req.swagger.params['requestAuthorizationStrategy.target'].value;
  var triggersPeriodtarget = req.swagger.params['triggers.target'].value;
  Configmgr.orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor(post,apply,_delete,action,Dollarlocation,propertylist,name,title,details,enabled,serviceName,logPeriodlevel,queuePeriodprocessingPeriodenabled,packageExporterPeriodtarget,packageImporterPeriodtarget,requestAuthorizationStrategyPeriodtarget,triggersPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory = function orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var title = req.swagger.params['title'].value;
  var details = req.swagger.params['details'].value;
  var enabled = req.swagger.params['enabled'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var logPeriodlevel = req.swagger.params['log.level'].value;
  var queuePeriodprocessingPeriodenabled = req.swagger.params['queue.processing.enabled'].value;
  var passiveQueues = req.swagger.params['passiveQueues'].value;
  var packageExporterPeriodendpoints = req.swagger.params['packageExporter.endpoints'].value;
  var packageImporterPeriodendpoints = req.swagger.params['packageImporter.endpoints'].value;
  var retryPeriodstrategy = req.swagger.params['retry.strategy'].value;
  var retryPeriodattempts = req.swagger.params['retry.attempts'].value;
  var pullPerioditems = req.swagger.params['pull.items'].value;
  var httpPeriodconnPeriodtimeout = req.swagger.params['http.conn.timeout'].value;
  var requestAuthorizationStrategyPeriodtarget = req.swagger.params['requestAuthorizationStrategy.target'].value;
  var transportSecretProviderPeriodtarget = req.swagger.params['transportSecretProvider.target'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  var triggersPeriodtarget = req.swagger.params['triggers.target'].value;
  Configmgr.orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory(post,apply,_delete,action,Dollarlocation,propertylist,name,title,details,enabled,serviceName,logPeriodlevel,queuePeriodprocessingPeriodenabled,passiveQueues,packageExporterPeriodendpoints,packageImporterPeriodendpoints,retryPeriodstrategy,retryPeriodattempts,pullPerioditems,httpPeriodconnPeriodtimeout,requestAuthorizationStrategyPeriodtarget,transportSecretProviderPeriodtarget,packageBuilderPeriodtarget,triggersPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionMonitorDistributionQueueHealthCheck = function orgApacheSlingDistributionMonitorDistributionQueueHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  var numberOfRetriesAllowed = req.swagger.params['numberOfRetriesAllowed'].value;
  Configmgr.orgApacheSlingDistributionMonitorDistributionQueueHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname,numberOfRetriesAllowed)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionPackagingImplExporterAgentDistributio = function orgApacheSlingDistributionPackagingImplExporterAgentDistributio (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var queue = req.swagger.params['queue'].value;
  var dropPeriodinvalidPerioditems = req.swagger.params['drop.invalid.items'].value;
  var agentPeriodtarget = req.swagger.params['agent.target'].value;
  Configmgr.orgApacheSlingDistributionPackagingImplExporterAgentDistributio(post,apply,_delete,action,Dollarlocation,propertylist,name,queue,dropPeriodinvalidPerioditems,agentPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionPackagingImplExporterLocalDistributio = function orgApacheSlingDistributionPackagingImplExporterLocalDistributio (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  Configmgr.orgApacheSlingDistributionPackagingImplExporterLocalDistributio(post,apply,_delete,action,Dollarlocation,propertylist,name,packageBuilderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionPackagingImplExporterRemoteDistributi = function orgApacheSlingDistributionPackagingImplExporterRemoteDistributi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var endpoints = req.swagger.params['endpoints'].value;
  var pullPerioditems = req.swagger.params['pull.items'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  var transportSecretProviderPeriodtarget = req.swagger.params['transportSecretProvider.target'].value;
  Configmgr.orgApacheSlingDistributionPackagingImplExporterRemoteDistributi(post,apply,_delete,action,Dollarlocation,propertylist,name,endpoints,pullPerioditems,packageBuilderPeriodtarget,transportSecretProviderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionPackagingImplImporterLocalDistributio = function orgApacheSlingDistributionPackagingImplImporterLocalDistributio (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var packageBuilderPeriodtarget = req.swagger.params['packageBuilder.target'].value;
  Configmgr.orgApacheSlingDistributionPackagingImplImporterLocalDistributio(post,apply,_delete,action,Dollarlocation,propertylist,name,packageBuilderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionPackagingImplImporterRemoteDistributi = function orgApacheSlingDistributionPackagingImplImporterRemoteDistributi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var endpoints = req.swagger.params['endpoints'].value;
  var transportSecretProviderPeriodtarget = req.swagger.params['transportSecretProvider.target'].value;
  Configmgr.orgApacheSlingDistributionPackagingImplImporterRemoteDistributi(post,apply,_delete,action,Dollarlocation,propertylist,name,endpoints,transportSecretProviderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionPackagingImplImporterRepositoryDistri = function orgApacheSlingDistributionPackagingImplImporterRepositoryDistri (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var servicePeriodname = req.swagger.params['service.name'].value;
  var path = req.swagger.params['path'].value;
  var privilegePeriodname = req.swagger.params['privilege.name'].value;
  Configmgr.orgApacheSlingDistributionPackagingImplImporterRepositoryDistri(post,apply,_delete,action,Dollarlocation,propertylist,name,servicePeriodname,path,privilegePeriodname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionResourcesImplDistributionConfiguration = function orgApacheSlingDistributionResourcesImplDistributionConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerPeriodroots = req.swagger.params['provider.roots'].value;
  var kind = req.swagger.params['kind'].value;
  Configmgr.orgApacheSlingDistributionResourcesImplDistributionConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,providerPeriodroots,kind)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionResourcesImplDistributionServiceResour = function orgApacheSlingDistributionResourcesImplDistributionServiceResour (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerPeriodroots = req.swagger.params['provider.roots'].value;
  var kind = req.swagger.params['kind'].value;
  Configmgr.orgApacheSlingDistributionResourcesImplDistributionServiceResour(post,apply,_delete,action,Dollarlocation,propertylist,providerPeriodroots,kind)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionSerializationImplDistributionPackageBu = function orgApacheSlingDistributionSerializationImplDistributionPackageBu (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var type = req.swagger.params['type'].value;
  var formatPeriodtarget = req.swagger.params['format.target'].value;
  var tempFsFolder = req.swagger.params['tempFsFolder'].value;
  var fileThreshold = req.swagger.params['fileThreshold'].value;
  var memoryUnit = req.swagger.params['memoryUnit'].value;
  var useOffHeapMemory = req.swagger.params['useOffHeapMemory'].value;
  var digestAlgorithm = req.swagger.params['digestAlgorithm'].value;
  var monitoringQueueSize = req.swagger.params['monitoringQueueSize'].value;
  var cleanupDelay = req.swagger.params['cleanupDelay'].value;
  var packagePeriodfilters = req.swagger.params['package.filters'].value;
  var propertyPeriodfilters = req.swagger.params['property.filters'].value;
  Configmgr.orgApacheSlingDistributionSerializationImplDistributionPackageBu(post,apply,_delete,action,Dollarlocation,propertylist,name,type,formatPeriodtarget,tempFsFolder,fileThreshold,memoryUnit,useOffHeapMemory,digestAlgorithm,monitoringQueueSize,cleanupDelay,packagePeriodfilters,propertyPeriodfilters)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionSerializationImplVltVaultDistribution = function orgApacheSlingDistributionSerializationImplVltVaultDistribution (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var type = req.swagger.params['type'].value;
  var importMode = req.swagger.params['importMode'].value;
  var aclHandling = req.swagger.params['aclHandling'].value;
  var packagePeriodroots = req.swagger.params['package.roots'].value;
  var packagePeriodfilters = req.swagger.params['package.filters'].value;
  var propertyPeriodfilters = req.swagger.params['property.filters'].value;
  var tempFsFolder = req.swagger.params['tempFsFolder'].value;
  var useBinaryReferences = req.swagger.params['useBinaryReferences'].value;
  var autoSaveThreshold = req.swagger.params['autoSaveThreshold'].value;
  var cleanupDelay = req.swagger.params['cleanupDelay'].value;
  var fileThreshold = req.swagger.params['fileThreshold'].value;
  var mEGAUnderscoreBYTES = req.swagger.params['MEGA_BYTES'].value;
  var useOffHeapMemory = req.swagger.params['useOffHeapMemory'].value;
  var digestAlgorithm = req.swagger.params['digestAlgorithm'].value;
  var monitoringQueueSize = req.swagger.params['monitoringQueueSize'].value;
  var pathsMapping = req.swagger.params['pathsMapping'].value;
  var strictImport = req.swagger.params['strictImport'].value;
  Configmgr.orgApacheSlingDistributionSerializationImplVltVaultDistribution(post,apply,_delete,action,Dollarlocation,propertylist,name,type,importMode,aclHandling,packagePeriodroots,packagePeriodfilters,propertyPeriodfilters,tempFsFolder,useBinaryReferences,autoSaveThreshold,cleanupDelay,fileThreshold,mEGAUnderscoreBYTES,useOffHeapMemory,digestAlgorithm,monitoringQueueSize,pathsMapping,strictImport)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTransportImplUserCredentialsDistributi = function orgApacheSlingDistributionTransportImplUserCredentialsDistributi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var username = req.swagger.params['username'].value;
  var password = req.swagger.params['password'].value;
  Configmgr.orgApacheSlingDistributionTransportImplUserCredentialsDistributi(post,apply,_delete,action,Dollarlocation,propertylist,name,username,password)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTriggerImplDistributionEventDistribute = function orgApacheSlingDistributionTriggerImplDistributionEventDistribute (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var path = req.swagger.params['path'].value;
  Configmgr.orgApacheSlingDistributionTriggerImplDistributionEventDistribute(post,apply,_delete,action,Dollarlocation,propertylist,name,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger = function orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var path = req.swagger.params['path'].value;
  var ignoredPathsPatterns = req.swagger.params['ignoredPathsPatterns'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var deep = req.swagger.params['deep'].value;
  Configmgr.orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger(post,apply,_delete,action,Dollarlocation,propertylist,name,path,ignoredPathsPatterns,serviceName,deep)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi = function orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var path = req.swagger.params['path'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  var nuggetsPath = req.swagger.params['nuggetsPath'].value;
  Configmgr.orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi(post,apply,_delete,action,Dollarlocation,propertylist,name,path,serviceName,nuggetsPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig = function orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var endpoint = req.swagger.params['endpoint'].value;
  var transportSecretProviderPeriodtarget = req.swagger.params['transportSecretProvider.target'].value;
  Configmgr.orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig(post,apply,_delete,action,Dollarlocation,propertylist,name,endpoint,transportSecretProviderPeriodtarget)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTriggerImplResourceEventDistributionTr = function orgApacheSlingDistributionTriggerImplResourceEventDistributionTr (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var path = req.swagger.params['path'].value;
  Configmgr.orgApacheSlingDistributionTriggerImplResourceEventDistributionTr(post,apply,_delete,action,Dollarlocation,propertylist,name,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge = function orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var path = req.swagger.params['path'].value;
  var seconds = req.swagger.params['seconds'].value;
  var serviceName = req.swagger.params['serviceName'].value;
  Configmgr.orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge(post,apply,_delete,action,Dollarlocation,propertylist,name,path,seconds,serviceName)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEngineImplAuthSlingAuthenticator = function orgApacheSlingEngineImplAuthSlingAuthenticator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect = req.swagger.params['osgi.http.whiteboard.context.select'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodlistener = req.swagger.params['osgi.http.whiteboard.listener'].value;
  var authPeriodsudoPeriodcookie = req.swagger.params['auth.sudo.cookie'].value;
  var authPeriodsudoPeriodparameter = req.swagger.params['auth.sudo.parameter'].value;
  var authPeriodannonymous = req.swagger.params['auth.annonymous'].value;
  var slingPeriodauthPeriodrequirements = req.swagger.params['sling.auth.requirements'].value;
  var slingPeriodauthPeriodanonymousPerioduser = req.swagger.params['sling.auth.anonymous.user'].value;
  var slingPeriodauthPeriodanonymousPeriodpassword = req.swagger.params['sling.auth.anonymous.password'].value;
  var authPeriodhttp = req.swagger.params['auth.http'].value;
  var authPeriodhttpPeriodrealm = req.swagger.params['auth.http.realm'].value;
  var authPerioduriPeriodsuffix = req.swagger.params['auth.uri.suffix'].value;
  Configmgr.orgApacheSlingEngineImplAuthSlingAuthenticator(post,apply,_delete,action,Dollarlocation,propertylist,osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect,osgiPeriodhttpPeriodwhiteboardPeriodlistener,authPeriodsudoPeriodcookie,authPeriodsudoPeriodparameter,authPeriodannonymous,slingPeriodauthPeriodrequirements,slingPeriodauthPeriodanonymousPerioduser,slingPeriodauthPeriodanonymousPeriodpassword,authPeriodhttp,authPeriodhttpPeriodrealm,authPerioduriPeriodsuffix)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter = function orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var extensions = req.swagger.params['extensions'].value;
  var minDurationMs = req.swagger.params['minDurationMs'].value;
  var maxDurationMs = req.swagger.params['maxDurationMs'].value;
  var compactLogFormat = req.swagger.params['compactLogFormat'].value;
  Configmgr.orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter(post,apply,_delete,action,Dollarlocation,propertylist,extensions,minDurationMs,maxDurationMs,compactLogFormat)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEngineImplLogRequestLogger = function orgApacheSlingEngineImplLogRequestLogger (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var requestPeriodlogPeriodoutput = req.swagger.params['request.log.output'].value;
  var requestPeriodlogPeriodoutputtype = req.swagger.params['request.log.outputtype'].value;
  var requestPeriodlogPeriodenabled = req.swagger.params['request.log.enabled'].value;
  var accessPeriodlogPeriodoutput = req.swagger.params['access.log.output'].value;
  var accessPeriodlogPeriodoutputtype = req.swagger.params['access.log.outputtype'].value;
  var accessPeriodlogPeriodenabled = req.swagger.params['access.log.enabled'].value;
  Configmgr.orgApacheSlingEngineImplLogRequestLogger(post,apply,_delete,action,Dollarlocation,propertylist,requestPeriodlogPeriodoutput,requestPeriodlogPeriodoutputtype,requestPeriodlogPeriodenabled,accessPeriodlogPeriodoutput,accessPeriodlogPeriodoutputtype,accessPeriodlogPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEngineImplLogRequestLoggerService = function orgApacheSlingEngineImplLogRequestLoggerService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var requestPeriodlogPeriodservicePeriodformat = req.swagger.params['request.log.service.format'].value;
  var requestPeriodlogPeriodservicePeriodoutput = req.swagger.params['request.log.service.output'].value;
  var requestPeriodlogPeriodservicePeriodoutputtype = req.swagger.params['request.log.service.outputtype'].value;
  var requestPeriodlogPeriodservicePeriodonentry = req.swagger.params['request.log.service.onentry'].value;
  Configmgr.orgApacheSlingEngineImplLogRequestLoggerService(post,apply,_delete,action,Dollarlocation,propertylist,requestPeriodlogPeriodservicePeriodformat,requestPeriodlogPeriodservicePeriodoutput,requestPeriodlogPeriodservicePeriodoutputtype,requestPeriodlogPeriodservicePeriodonentry)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEngineImplSlingMainServlet = function orgApacheSlingEngineImplSlingMainServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodmaxPeriodcalls = req.swagger.params['sling.max.calls'].value;
  var slingPeriodmaxPeriodinclusions = req.swagger.params['sling.max.inclusions'].value;
  var slingPeriodtracePeriodallow = req.swagger.params['sling.trace.allow'].value;
  var slingPeriodmaxPeriodrecordPeriodrequests = req.swagger.params['sling.max.record.requests'].value;
  var slingPeriodstorePeriodpatternPeriodrequests = req.swagger.params['sling.store.pattern.requests'].value;
  var slingPeriodserverinfo = req.swagger.params['sling.serverinfo'].value;
  var slingPeriodadditionalPeriodresponsePeriodheaders = req.swagger.params['sling.additional.response.headers'].value;
  Configmgr.orgApacheSlingEngineImplSlingMainServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodmaxPeriodcalls,slingPeriodmaxPeriodinclusions,slingPeriodtracePeriodallow,slingPeriodmaxPeriodrecordPeriodrequests,slingPeriodstorePeriodpatternPeriodrequests,slingPeriodserverinfo,slingPeriodadditionalPeriodresponsePeriodheaders)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEngineParameters = function orgApacheSlingEngineParameters (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPerioddefaultPeriodparameterPeriodencoding = req.swagger.params['sling.default.parameter.encoding'].value;
  var slingPerioddefaultPeriodmaxPeriodparameters = req.swagger.params['sling.default.max.parameters'].value;
  var filePeriodlocation = req.swagger.params['file.location'].value;
  var filePeriodthreshold = req.swagger.params['file.threshold'].value;
  var filePeriodmax = req.swagger.params['file.max'].value;
  var requestPeriodmax = req.swagger.params['request.max'].value;
  var slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters = req.swagger.params['sling.default.parameter.checkForAdditionalContainerParameters'].value;
  Configmgr.orgApacheSlingEngineParameters(post,apply,_delete,action,Dollarlocation,propertylist,slingPerioddefaultPeriodparameterPeriodencoding,slingPerioddefaultPeriodmaxPeriodparameters,filePeriodlocation,filePeriodthreshold,filePeriodmax,requestPeriodmax,slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEventImplEventingThreadPool = function orgApacheSlingEventImplEventingThreadPool (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var minPoolSize = req.swagger.params['minPoolSize'].value;
  Configmgr.orgApacheSlingEventImplEventingThreadPool(post,apply,_delete,action,Dollarlocation,propertylist,minPoolSize)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEventImplJobsDefaultJobManager = function orgApacheSlingEventImplJobsDefaultJobManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var queuePeriodpriority = req.swagger.params['queue.priority'].value;
  var queuePeriodretries = req.swagger.params['queue.retries'].value;
  var queuePeriodretrydelay = req.swagger.params['queue.retrydelay'].value;
  var queuePeriodmaxparallel = req.swagger.params['queue.maxparallel'].value;
  Configmgr.orgApacheSlingEventImplJobsDefaultJobManager(post,apply,_delete,action,Dollarlocation,propertylist,queuePeriodpriority,queuePeriodretries,queuePeriodretrydelay,queuePeriodmaxparallel)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEventImplJobsJcrPersistenceHandler = function orgApacheSlingEventImplJobsJcrPersistenceHandler (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jobPeriodconsumermanagerPerioddisableDistribution = req.swagger.params['job.consumermanager.disableDistribution'].value;
  var startupPerioddelay = req.swagger.params['startup.delay'].value;
  var cleanupPeriodperiod = req.swagger.params['cleanup.period'].value;
  Configmgr.orgApacheSlingEventImplJobsJcrPersistenceHandler(post,apply,_delete,action,Dollarlocation,propertylist,jobPeriodconsumermanagerPerioddisableDistribution,startupPerioddelay,cleanupPeriodperiod)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEventImplJobsJobConsumerManager = function orgApacheSlingEventImplJobsJobConsumerManager (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist = req.swagger.params['org.apache.sling.installer.configuration.persist'].value;
  var jobPeriodconsumermanagerPeriodwhitelist = req.swagger.params['job.consumermanager.whitelist'].value;
  var jobPeriodconsumermanagerPeriodblacklist = req.swagger.params['job.consumermanager.blacklist'].value;
  Configmgr.orgApacheSlingEventImplJobsJobConsumerManager(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist,jobPeriodconsumermanagerPeriodwhitelist,jobPeriodconsumermanagerPeriodblacklist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingEventJobsQueueConfiguration = function orgApacheSlingEventJobsQueueConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var queuePeriodname = req.swagger.params['queue.name'].value;
  var queuePeriodtopics = req.swagger.params['queue.topics'].value;
  var queuePeriodtype = req.swagger.params['queue.type'].value;
  var queuePeriodpriority = req.swagger.params['queue.priority'].value;
  var queuePeriodretries = req.swagger.params['queue.retries'].value;
  var queuePeriodretrydelay = req.swagger.params['queue.retrydelay'].value;
  var queuePeriodmaxparallel = req.swagger.params['queue.maxparallel'].value;
  var queuePeriodkeepJobs = req.swagger.params['queue.keepJobs'].value;
  var queuePeriodpreferRunOnCreationInstance = req.swagger.params['queue.preferRunOnCreationInstance'].value;
  var queuePeriodthreadPoolSize = req.swagger.params['queue.threadPoolSize'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.orgApacheSlingEventJobsQueueConfiguration(post,apply,_delete,action,Dollarlocation,propertylist,queuePeriodname,queuePeriodtopics,queuePeriodtype,queuePeriodpriority,queuePeriodretries,queuePeriodretrydelay,queuePeriodmaxparallel,queuePeriodkeepJobs,queuePeriodpreferRunOnCreationInstance,queuePeriodthreadPoolSize,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW = function orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var users = req.swagger.params['users'].value;
  var groups = req.swagger.params['groups'].value;
  Configmgr.orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW(post,apply,_delete,action,Dollarlocation,propertylist,users,groups)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingFeatureflagsFeature = function orgApacheSlingFeatureflagsFeature (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var description = req.swagger.params['description'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.orgApacheSlingFeatureflagsFeature(post,apply,_delete,action,Dollarlocation,propertylist,name,description,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingFeatureflagsImplConfiguredFeature = function orgApacheSlingFeatureflagsImplConfiguredFeature (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var name = req.swagger.params['name'].value;
  var description = req.swagger.params['description'].value;
  var enabled = req.swagger.params['enabled'].value;
  Configmgr.orgApacheSlingFeatureflagsImplConfiguredFeature(post,apply,_delete,action,Dollarlocation,propertylist,name,description,enabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHapiImplHApiUtilImpl = function orgApacheSlingHapiImplHApiUtilImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype = req.swagger.params['org.apache.sling.hapi.tools.resourcetype'].value;
  var orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype = req.swagger.params['org.apache.sling.hapi.tools.collectionresourcetype'].value;
  var orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths = req.swagger.params['org.apache.sling.hapi.tools.searchpaths'].value;
  var orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl = req.swagger.params['org.apache.sling.hapi.tools.externalurl'].value;
  var orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled = req.swagger.params['org.apache.sling.hapi.tools.enabled'].value;
  Configmgr.orgApacheSlingHapiImplHApiUtilImpl(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype,orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype,orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths,orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl,orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHcCoreImplCompositeHealthCheck = function orgApacheSlingHcCoreImplCompositeHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  var filterPeriodtags = req.swagger.params['filter.tags'].value;
  var filterPeriodcombineTagsWithOr = req.swagger.params['filter.combineTagsWithOr'].value;
  Configmgr.orgApacheSlingHcCoreImplCompositeHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname,filterPeriodtags,filterPeriodcombineTagsWithOr)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl = function orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var timeoutInMs = req.swagger.params['timeoutInMs'].value;
  var longRunningFutureThresholdForCriticalMs = req.swagger.params['longRunningFutureThresholdForCriticalMs'].value;
  var resultCacheTtlInMs = req.swagger.params['resultCacheTtlInMs'].value;
  Configmgr.orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl(post,apply,_delete,action,Dollarlocation,propertylist,timeoutInMs,longRunningFutureThresholdForCriticalMs,resultCacheTtlInMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHcCoreImplJmxAttributeHealthCheck = function orgApacheSlingHcCoreImplJmxAttributeHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  var mbeanPeriodname = req.swagger.params['mbean.name'].value;
  var attributePeriodname = req.swagger.params['attribute.name'].value;
  var attributePeriodvaluePeriodconstraint = req.swagger.params['attribute.value.constraint'].value;
  Configmgr.orgApacheSlingHcCoreImplJmxAttributeHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname,mbeanPeriodname,attributePeriodname,attributePeriodvaluePeriodconstraint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHcCoreImplScriptableHealthCheck = function orgApacheSlingHcCoreImplScriptableHealthCheck (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var hcPeriodname = req.swagger.params['hc.name'].value;
  var hcPeriodtags = req.swagger.params['hc.tags'].value;
  var hcPeriodmbeanPeriodname = req.swagger.params['hc.mbean.name'].value;
  var expression = req.swagger.params['expression'].value;
  var languagePeriodextension = req.swagger.params['language.extension'].value;
  Configmgr.orgApacheSlingHcCoreImplScriptableHealthCheck(post,apply,_delete,action,Dollarlocation,propertylist,hcPeriodname,hcPeriodtags,hcPeriodmbeanPeriodname,expression,languagePeriodextension)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet = function orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servletPath = req.swagger.params['servletPath'].value;
  var disabled = req.swagger.params['disabled'].value;
  var corsPeriodaccessControlAllowOrigin = req.swagger.params['cors.accessControlAllowOrigin'].value;
  Configmgr.orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet(post,apply,_delete,action,Dollarlocation,propertylist,servletPath,disabled,corsPeriodaccessControlAllowOrigin)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer = function orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var totalWidth = req.swagger.params['totalWidth'].value;
  var colWidthName = req.swagger.params['colWidthName'].value;
  var colWidthResult = req.swagger.params['colWidthResult'].value;
  var colWidthTiming = req.swagger.params['colWidthTiming'].value;
  Configmgr.orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer(post,apply,_delete,action,Dollarlocation,propertylist,totalWidth,colWidthName,colWidthResult,colWidthTiming)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingI18nImplI18NFilter = function orgApacheSlingI18nImplI18NFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var slingPeriodfilterPeriodscope = req.swagger.params['sling.filter.scope'].value;
  Configmgr.orgApacheSlingI18nImplI18NFilter(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,slingPeriodfilterPeriodscope)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingI18nImplJcrResourceBundleProvider = function orgApacheSlingI18nImplJcrResourceBundleProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var localePerioddefault = req.swagger.params['locale.default'].value;
  var preloadPeriodbundles = req.swagger.params['preload.bundles'].value;
  var invalidationPerioddelay = req.swagger.params['invalidation.delay'].value;
  Configmgr.orgApacheSlingI18nImplJcrResourceBundleProvider(post,apply,_delete,action,Dollarlocation,propertylist,localePerioddefault,preloadPeriodbundles,invalidationPerioddelay)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingInstallerProviderJcrImplJcrInstaller = function orgApacheSlingInstallerProviderJcrImplJcrInstaller (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var handlerPeriodschemes = req.swagger.params['handler.schemes'].value;
  var slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp = req.swagger.params['sling.jcrinstall.folder.name.regexp'].value;
  var slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth = req.swagger.params['sling.jcrinstall.folder.max.depth'].value;
  var slingPeriodjcrinstallPeriodsearchPeriodpath = req.swagger.params['sling.jcrinstall.search.path'].value;
  var slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath = req.swagger.params['sling.jcrinstall.new.config.path'].value;
  var slingPeriodjcrinstallPeriodsignalPeriodpath = req.swagger.params['sling.jcrinstall.signal.path'].value;
  var slingPeriodjcrinstallPeriodenablePeriodwriteback = req.swagger.params['sling.jcrinstall.enable.writeback'].value;
  Configmgr.orgApacheSlingInstallerProviderJcrImplJcrInstaller(post,apply,_delete,action,Dollarlocation,propertylist,handlerPeriodschemes,slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp,slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth,slingPeriodjcrinstallPeriodsearchPeriodpath,slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath,slingPeriodjcrinstallPeriodsignalPeriodpath,slingPeriodjcrinstallPeriodenablePeriodwriteback)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrBaseInternalLoginAdminWhitelist = function orgApacheSlingJcrBaseInternalLoginAdminWhitelist (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var whitelistPeriodbypass = req.swagger.params['whitelist.bypass'].value;
  var whitelistPeriodbundlesPeriodregexp = req.swagger.params['whitelist.bundles.regexp'].value;
  Configmgr.orgApacheSlingJcrBaseInternalLoginAdminWhitelist(post,apply,_delete,action,Dollarlocation,propertylist,whitelistPeriodbypass,whitelistPeriodbundlesPeriodregexp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment = function orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var whitelistPeriodname = req.swagger.params['whitelist.name'].value;
  var whitelistPeriodbundles = req.swagger.params['whitelist.bundles'].value;
  Configmgr.orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment(post,apply,_delete,action,Dollarlocation,propertylist,whitelistPeriodname,whitelistPeriodbundles)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrDavexImplServletsSlingDavExServlet = function orgApacheSlingJcrDavexImplServletsSlingDavExServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var alias = req.swagger.params['alias'].value;
  var davPeriodcreateAbsoluteUri = req.swagger.params['dav.create-absolute-uri'].value;
  var davPeriodprotectedhandlers = req.swagger.params['dav.protectedhandlers'].value;
  Configmgr.orgApacheSlingJcrDavexImplServletsSlingDavExServlet(post,apply,_delete,action,Dollarlocation,propertylist,alias,davPeriodcreateAbsoluteUri,davPeriodprotectedhandlers)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport = function orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var javaPeriodnamingPeriodfactoryPeriodinitial = req.swagger.params['java.naming.factory.initial'].value;
  var javaPeriodnamingPeriodproviderPeriodurl = req.swagger.params['java.naming.provider.url'].value;
  Configmgr.orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport(post,apply,_delete,action,Dollarlocation,propertylist,javaPeriodnamingPeriodfactoryPeriodinitial,javaPeriodnamingPeriodproviderPeriodurl)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport = function orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var port = req.swagger.params['port'].value;
  Configmgr.orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport(post,apply,_delete,action,Dollarlocation,propertylist,port)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrRepoinitImplRepositoryInitializer = function orgApacheSlingJcrRepoinitImplRepositoryInitializer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var references = req.swagger.params['references'].value;
  Configmgr.orgApacheSlingJcrRepoinitImplRepositoryInitializer(post,apply,_delete,action,Dollarlocation,propertylist,references)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrRepoinitRepositoryInitializer = function orgApacheSlingJcrRepoinitRepositoryInitializer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var references = req.swagger.params['references'].value;
  var scripts = req.swagger.params['scripts'].value;
  Configmgr.orgApacheSlingJcrRepoinitRepositoryInitializer(post,apply,_delete,action,Dollarlocation,propertylist,references,scripts)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl = function orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var resourcePeriodresolverPeriodsearchpath = req.swagger.params['resource.resolver.searchpath'].value;
  var resourcePeriodresolverPeriodmanglenamespaces = req.swagger.params['resource.resolver.manglenamespaces'].value;
  var resourcePeriodresolverPeriodallowDirect = req.swagger.params['resource.resolver.allowDirect'].value;
  var resourcePeriodresolverPeriodrequiredPeriodproviders = req.swagger.params['resource.resolver.required.providers'].value;
  var resourcePeriodresolverPeriodrequiredPeriodprovidernames = req.swagger.params['resource.resolver.required.providernames'].value;
  var resourcePeriodresolverPeriodvirtual = req.swagger.params['resource.resolver.virtual'].value;
  var resourcePeriodresolverPeriodmapping = req.swagger.params['resource.resolver.mapping'].value;
  var resourcePeriodresolverPeriodmapPeriodlocation = req.swagger.params['resource.resolver.map.location'].value;
  var resourcePeriodresolverPeriodmapPeriodobservation = req.swagger.params['resource.resolver.map.observation'].value;
  var resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus = req.swagger.params['resource.resolver.default.vanity.redirect.status'].value;
  var resourcePeriodresolverPeriodenablePeriodvanitypath = req.swagger.params['resource.resolver.enable.vanitypath'].value;
  var resourcePeriodresolverPeriodvanitypathPeriodmaxEntries = req.swagger.params['resource.resolver.vanitypath.maxEntries'].value;
  var resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup = req.swagger.params['resource.resolver.vanitypath.maxEntries.startup'].value;
  var resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes = req.swagger.params['resource.resolver.vanitypath.bloomfilter.maxBytes'].value;
  var resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution = req.swagger.params['resource.resolver.optimize.alias.resolution'].value;
  var resourcePeriodresolverPeriodvanitypathPeriodwhitelist = req.swagger.params['resource.resolver.vanitypath.whitelist'].value;
  var resourcePeriodresolverPeriodvanitypathPeriodblacklist = req.swagger.params['resource.resolver.vanitypath.blacklist'].value;
  var resourcePeriodresolverPeriodvanityPeriodprecedence = req.swagger.params['resource.resolver.vanity.precedence'].value;
  var resourcePeriodresolverPeriodproviderhandlingPeriodparanoid = req.swagger.params['resource.resolver.providerhandling.paranoid'].value;
  var resourcePeriodresolverPeriodlogPeriodclosing = req.swagger.params['resource.resolver.log.closing'].value;
  var resourcePeriodresolverPeriodlogPeriodunclosed = req.swagger.params['resource.resolver.log.unclosed'].value;
  Configmgr.orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl(post,apply,_delete,action,Dollarlocation,propertylist,resourcePeriodresolverPeriodsearchpath,resourcePeriodresolverPeriodmanglenamespaces,resourcePeriodresolverPeriodallowDirect,resourcePeriodresolverPeriodrequiredPeriodproviders,resourcePeriodresolverPeriodrequiredPeriodprovidernames,resourcePeriodresolverPeriodvirtual,resourcePeriodresolverPeriodmapping,resourcePeriodresolverPeriodmapPeriodlocation,resourcePeriodresolverPeriodmapPeriodobservation,resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus,resourcePeriodresolverPeriodenablePeriodvanitypath,resourcePeriodresolverPeriodvanitypathPeriodmaxEntries,resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup,resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes,resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution,resourcePeriodresolverPeriodvanitypathPeriodwhitelist,resourcePeriodresolverPeriodvanitypathPeriodblacklist,resourcePeriodresolverPeriodvanityPeriodprecedence,resourcePeriodresolverPeriodproviderhandlingPeriodparanoid,resourcePeriodresolverPeriodlogPeriodclosing,resourcePeriodresolverPeriodlogPeriodunclosed)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrResourceInternalJcrSystemUserValidator = function orgApacheSlingJcrResourceInternalJcrSystemUserValidator (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var allowPeriodonlyPeriodsystemPerioduser = req.swagger.params['allow.only.system.user'].value;
  Configmgr.orgApacheSlingJcrResourceInternalJcrSystemUserValidator(post,apply,_delete,action,Dollarlocation,propertylist,allowPeriodonlyPeriodsystemPerioduser)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory = function orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var path = req.swagger.params['path'].value;
  var checkpathPeriodprefix = req.swagger.params['checkpath.prefix'].value;
  var jcrPath = req.swagger.params['jcrPath'].value;
  Configmgr.orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory(post,apply,_delete,action,Dollarlocation,propertylist,path,checkpathPeriodprefix,jcrPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService = function orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var typePeriodcollections = req.swagger.params['type.collections'].value;
  var typePeriodnoncollections = req.swagger.params['type.noncollections'].value;
  var typePeriodcontent = req.swagger.params['type.content'].value;
  Configmgr.orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,typePeriodcollections,typePeriodnoncollections,typePeriodcontent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic = function orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  Configmgr.orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet = function orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var davPeriodroot = req.swagger.params['dav.root'].value;
  var davPeriodcreateAbsoluteUri = req.swagger.params['dav.create-absolute-uri'].value;
  var davPeriodrealm = req.swagger.params['dav.realm'].value;
  var collectionPeriodtypes = req.swagger.params['collection.types'].value;
  var filterPeriodprefixes = req.swagger.params['filter.prefixes'].value;
  var filterPeriodtypes = req.swagger.params['filter.types'].value;
  var filterPerioduris = req.swagger.params['filter.uris'].value;
  var typePeriodcollections = req.swagger.params['type.collections'].value;
  var typePeriodnoncollections = req.swagger.params['type.noncollections'].value;
  var typePeriodcontent = req.swagger.params['type.content'].value;
  Configmgr.orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet(post,apply,_delete,action,Dollarlocation,propertylist,davPeriodroot,davPeriodcreateAbsoluteUri,davPeriodrealm,collectionPeriodtypes,filterPeriodprefixes,filterPeriodtypes,filterPerioduris,typePeriodcollections,typePeriodnoncollections,typePeriodcontent)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingJmxProviderImplJMXResourceProvider = function orgApacheSlingJmxProviderImplJMXResourceProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var providerPeriodroots = req.swagger.params['provider.roots'].value;
  Configmgr.orgApacheSlingJmxProviderImplJMXResourceProvider(post,apply,_delete,action,Dollarlocation,propertylist,providerPeriodroots)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingModelsImplModelAdapterFactory = function orgApacheSlingModelsImplModelAdapterFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodlistener = req.swagger.params['osgi.http.whiteboard.listener'].value;
  var osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect = req.swagger.params['osgi.http.whiteboard.context.select'].value;
  var maxPeriodrecursionPerioddepth = req.swagger.params['max.recursion.depth'].value;
  var cleanupPeriodjobPeriodperiod = req.swagger.params['cleanup.job.period'].value;
  Configmgr.orgApacheSlingModelsImplModelAdapterFactory(post,apply,_delete,action,Dollarlocation,propertylist,osgiPeriodhttpPeriodwhiteboardPeriodlistener,osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect,maxPeriodrecursionPerioddepth,cleanupPeriodjobPeriodperiod)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingModelsJacksonexporterImplResourceModuleProvider = function orgApacheSlingModelsJacksonexporterImplResourceModuleProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var maxPeriodrecursionPeriodlevels = req.swagger.params['max.recursion.levels'].value;
  Configmgr.orgApacheSlingModelsJacksonexporterImplResourceModuleProvider(post,apply,_delete,action,Dollarlocation,propertylist,maxPeriodrecursionPeriodlevels)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto = function orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var felixPeriodinventoryPeriodprinterPeriodname = req.swagger.params['felix.inventory.printer.name'].value;
  var felixPeriodinventoryPeriodprinterPeriodtitle = req.swagger.params['felix.inventory.printer.title'].value;
  var path = req.swagger.params['path'].value;
  Configmgr.orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto(post,apply,_delete,action,Dollarlocation,propertylist,felixPeriodinventoryPeriodprinterPeriodname,felixPeriodinventoryPeriodprinterPeriodtitle,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingResourcemergerImplMergedResourceProviderFactory = function orgApacheSlingResourcemergerImplMergedResourceProviderFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mergePeriodroot = req.swagger.params['merge.root'].value;
  var mergePeriodreadOnly = req.swagger.params['merge.readOnly'].value;
  Configmgr.orgApacheSlingResourcemergerImplMergedResourceProviderFactory(post,apply,_delete,action,Dollarlocation,propertylist,mergePeriodroot,mergePeriodreadOnly)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingResourcemergerPickerOverriding = function orgApacheSlingResourcemergerPickerOverriding (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var mergePeriodroot = req.swagger.params['merge.root'].value;
  var mergePeriodreadOnly = req.swagger.params['merge.readOnly'].value;
  Configmgr.orgApacheSlingResourcemergerPickerOverriding(post,apply,_delete,action,Dollarlocation,propertylist,mergePeriodroot,mergePeriodreadOnly)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingScriptingCoreImplScriptCacheImpl = function orgApacheSlingScriptingCoreImplScriptCacheImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize = req.swagger.params['org.apache.sling.scripting.cache.size'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalUnderscoreextensions = req.swagger.params['org.apache.sling.scripting.cache.additional_extensions'].value;
  Configmgr.orgApacheSlingScriptingCoreImplScriptCacheImpl(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize,orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalUnderscoreextensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider = function orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var logPeriodstacktracePeriodonclose = req.swagger.params['log.stacktrace.onclose'].value;
  Configmgr.orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider(post,apply,_delete,action,Dollarlocation,propertylist,logPeriodstacktracePeriodonclose)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingScriptingJavaImplJavaScriptEngineFactory = function orgApacheSlingScriptingJavaImplJavaScriptEngineFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var javaPeriodclassdebuginfo = req.swagger.params['java.classdebuginfo'].value;
  var javaPeriodjavaEncoding = req.swagger.params['java.javaEncoding'].value;
  var javaPeriodcompilerSourceVM = req.swagger.params['java.compilerSourceVM'].value;
  var javaPeriodcompilerTargetVM = req.swagger.params['java.compilerTargetVM'].value;
  Configmgr.orgApacheSlingScriptingJavaImplJavaScriptEngineFactory(post,apply,_delete,action,Dollarlocation,propertylist,javaPeriodclassdebuginfo,javaPeriodjavaEncoding,javaPeriodcompilerSourceVM,javaPeriodcompilerTargetVM)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa = function orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel = req.swagger.params['org.apache.sling.scripting.javascript.rhino.optLevel'].value;
  Configmgr.orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingScriptingJspJspScriptEngineFactory = function orgApacheSlingScriptingJspJspScriptEngineFactory (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var jasperPeriodcompilerTargetVM = req.swagger.params['jasper.compilerTargetVM'].value;
  var jasperPeriodcompilerSourceVM = req.swagger.params['jasper.compilerSourceVM'].value;
  var jasperPeriodclassdebuginfo = req.swagger.params['jasper.classdebuginfo'].value;
  var jasperPeriodenablePooling = req.swagger.params['jasper.enablePooling'].value;
  var jasperPeriodieClassId = req.swagger.params['jasper.ieClassId'].value;
  var jasperPeriodgenStringAsCharArray = req.swagger.params['jasper.genStringAsCharArray'].value;
  var jasperPeriodkeepgenerated = req.swagger.params['jasper.keepgenerated'].value;
  var jasperPeriodmappedfile = req.swagger.params['jasper.mappedfile'].value;
  var jasperPeriodtrimSpaces = req.swagger.params['jasper.trimSpaces'].value;
  var jasperPerioddisplaySourceFragments = req.swagger.params['jasper.displaySourceFragments'].value;
  var defaultPeriodisPeriodsession = req.swagger.params['default.is.session'].value;
  Configmgr.orgApacheSlingScriptingJspJspScriptEngineFactory(post,apply,_delete,action,Dollarlocation,propertylist,jasperPeriodcompilerTargetVM,jasperPeriodcompilerSourceVM,jasperPeriodclassdebuginfo,jasperPeriodenablePooling,jasperPeriodieClassId,jasperPeriodgenStringAsCharArray,jasperPeriodkeepgenerated,jasperPeriodmappedfile,jasperPeriodtrimSpaces,jasperPerioddisplaySourceFragments,defaultPeriodisPeriodsession)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv = function orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings = req.swagger.params['org.apache.sling.scripting.sightly.js.bindings'].value;
  Configmgr.orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv(post,apply,_delete,action,Dollarlocation,propertylist,orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingSecurityImplContentDispositionFilter = function orgApacheSlingSecurityImplContentDispositionFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodcontentPerioddispositionPeriodpaths = req.swagger.params['sling.content.disposition.paths'].value;
  var slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths = req.swagger.params['sling.content.disposition.excluded.paths'].value;
  var slingPeriodcontentPerioddispositionPeriodallPeriodpaths = req.swagger.params['sling.content.disposition.all.paths'].value;
  Configmgr.orgApacheSlingSecurityImplContentDispositionFilter(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodcontentPerioddispositionPeriodpaths,slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths,slingPeriodcontentPerioddispositionPeriodallPeriodpaths)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingSecurityImplReferrerFilter = function orgApacheSlingSecurityImplReferrerFilter (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var allowPeriodempty = req.swagger.params['allow.empty'].value;
  var allowPeriodhosts = req.swagger.params['allow.hosts'].value;
  var allowPeriodhostsPeriodregexp = req.swagger.params['allow.hosts.regexp'].value;
  var filterPeriodmethods = req.swagger.params['filter.methods'].value;
  var excludePeriodagentsPeriodregexp = req.swagger.params['exclude.agents.regexp'].value;
  Configmgr.orgApacheSlingSecurityImplReferrerFilter(post,apply,_delete,action,Dollarlocation,propertylist,allowPeriodempty,allowPeriodhosts,allowPeriodhostsPeriodregexp,filterPeriodmethods,excludePeriodagentsPeriodregexp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServiceusermappingImplServiceUserMapperImpl = function orgApacheSlingServiceusermappingImplServiceUserMapperImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var userPeriodmapping = req.swagger.params['user.mapping'].value;
  var userPerioddefault = req.swagger.params['user.default'].value;
  var userPeriodenablePerioddefaultPeriodmapping = req.swagger.params['user.enable.default.mapping'].value;
  var requirePeriodvalidation = req.swagger.params['require.validation'].value;
  Configmgr.orgApacheSlingServiceusermappingImplServiceUserMapperImpl(post,apply,_delete,action,Dollarlocation,propertylist,userPeriodmapping,userPerioddefault,userPeriodenablePerioddefaultPeriodmapping,requirePeriodvalidation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended = function orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var userPeriodmapping = req.swagger.params['user.mapping'].value;
  Configmgr.orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended(post,apply,_delete,action,Dollarlocation,propertylist,servicePeriodranking,userPeriodmapping)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServletsGetDefaultGetServlet = function orgApacheSlingServletsGetDefaultGetServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var aliases = req.swagger.params['aliases'].value;
  var index = req.swagger.params['index'].value;
  var indexPeriodfiles = req.swagger.params['index.files'].value;
  var enablePeriodhtml = req.swagger.params['enable.html'].value;
  var enablePeriodjson = req.swagger.params['enable.json'].value;
  var enablePeriodtxt = req.swagger.params['enable.txt'].value;
  var enablePeriodxml = req.swagger.params['enable.xml'].value;
  var jsonPeriodmaximumresults = req.swagger.params['json.maximumresults'].value;
  var ecmaSuport = req.swagger.params['ecmaSuport'].value;
  Configmgr.orgApacheSlingServletsGetDefaultGetServlet(post,apply,_delete,action,Dollarlocation,propertylist,aliases,index,indexPeriodfiles,enablePeriodhtml,enablePeriodjson,enablePeriodtxt,enablePeriodxml,jsonPeriodmaximumresults,ecmaSuport)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServletsGetImplVersionVersionInfoServlet = function orgApacheSlingServletsGetImplVersionVersionInfoServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodservletPeriodselectors = req.swagger.params['sling.servlet.selectors'].value;
  var ecmaSuport = req.swagger.params['ecmaSuport'].value;
  Configmgr.orgApacheSlingServletsGetImplVersionVersionInfoServlet(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodservletPeriodselectors,ecmaSuport)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServletsPostImplHelperChunkCleanUpTask = function orgApacheSlingServletsPostImplHelperChunkCleanUpTask (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var schedulerPeriodexpression = req.swagger.params['scheduler.expression'].value;
  var schedulerPeriodconcurrent = req.swagger.params['scheduler.concurrent'].value;
  var chunkPeriodcleanupPeriodage = req.swagger.params['chunk.cleanup.age'].value;
  Configmgr.orgApacheSlingServletsPostImplHelperChunkCleanUpTask(post,apply,_delete,action,Dollarlocation,propertylist,schedulerPeriodexpression,schedulerPeriodconcurrent,chunkPeriodcleanupPeriodage)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServletsPostImplSlingPostServlet = function orgApacheSlingServletsPostImplSlingPostServlet (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servletPeriodpostPerioddateFormats = req.swagger.params['servlet.post.dateFormats'].value;
  var servletPeriodpostPeriodnodeNameHints = req.swagger.params['servlet.post.nodeNameHints'].value;
  var servletPeriodpostPeriodnodeNameMaxLength = req.swagger.params['servlet.post.nodeNameMaxLength'].value;
  var servletPeriodpostPeriodcheckinNewVersionableNodes = req.swagger.params['servlet.post.checkinNewVersionableNodes'].value;
  var servletPeriodpostPeriodautoCheckout = req.swagger.params['servlet.post.autoCheckout'].value;
  var servletPeriodpostPeriodautoCheckin = req.swagger.params['servlet.post.autoCheckin'].value;
  var servletPeriodpostPeriodignorePattern = req.swagger.params['servlet.post.ignorePattern'].value;
  Configmgr.orgApacheSlingServletsPostImplSlingPostServlet(post,apply,_delete,action,Dollarlocation,propertylist,servletPeriodpostPerioddateFormats,servletPeriodpostPeriodnodeNameHints,servletPeriodpostPeriodnodeNameMaxLength,servletPeriodpostPeriodcheckinNewVersionableNodes,servletPeriodpostPeriodautoCheckout,servletPeriodpostPeriodautoCheckin,servletPeriodpostPeriodignorePattern)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingServletsResolverSlingServletResolver = function orgApacheSlingServletsResolverSlingServletResolver (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var servletresolverPeriodservletRoot = req.swagger.params['servletresolver.servletRoot'].value;
  var servletresolverPeriodcacheSize = req.swagger.params['servletresolver.cacheSize'].value;
  var servletresolverPeriodpaths = req.swagger.params['servletresolver.paths'].value;
  var servletresolverPerioddefaultExtensions = req.swagger.params['servletresolver.defaultExtensions'].value;
  Configmgr.orgApacheSlingServletsResolverSlingServletResolver(post,apply,_delete,action,Dollarlocation,propertylist,servletresolverPeriodservletRoot,servletresolverPeriodcacheSize,servletresolverPeriodpaths,servletresolverPerioddefaultExtensions)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingSettingsImplSlingSettingsServiceImpl = function orgApacheSlingSettingsImplSlingSettingsServiceImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var slingPeriodname = req.swagger.params['sling.name'].value;
  var slingPerioddescription = req.swagger.params['sling.description'].value;
  Configmgr.orgApacheSlingSettingsImplSlingSettingsServiceImpl(post,apply,_delete,action,Dollarlocation,propertylist,slingPeriodname,slingPerioddescription)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingStartupfilterImplStartupFilterImpl = function orgApacheSlingStartupfilterImplStartupFilterImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var activePeriodbyPerioddefault = req.swagger.params['active.by.default'].value;
  var defaultPeriodmessage = req.swagger.params['default.message'].value;
  Configmgr.orgApacheSlingStartupfilterImplStartupFilterImpl(post,apply,_delete,action,Dollarlocation,propertylist,activePeriodbyPerioddefault,defaultPeriodmessage)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingTenantInternalTenantProviderImpl = function orgApacheSlingTenantInternalTenantProviderImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var tenantPeriodroot = req.swagger.params['tenant.root'].value;
  var tenantPeriodpathPeriodmatcher = req.swagger.params['tenant.path.matcher'].value;
  Configmgr.orgApacheSlingTenantInternalTenantProviderImpl(post,apply,_delete,action,Dollarlocation,propertylist,tenantPeriodroot,tenantPeriodpathPeriodmatcher)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingTracerInternalLogTracer = function orgApacheSlingTracerInternalLogTracer (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var tracerSets = req.swagger.params['tracerSets'].value;
  var enabled = req.swagger.params['enabled'].value;
  var servletEnabled = req.swagger.params['servletEnabled'].value;
  var recordingCacheSizeInMB = req.swagger.params['recordingCacheSizeInMB'].value;
  var recordingCacheDurationInSecs = req.swagger.params['recordingCacheDurationInSecs'].value;
  var recordingCompressionEnabled = req.swagger.params['recordingCompressionEnabled'].value;
  var gzipResponse = req.swagger.params['gzipResponse'].value;
  Configmgr.orgApacheSlingTracerInternalLogTracer(post,apply,_delete,action,Dollarlocation,propertylist,tracerSets,enabled,servletEnabled,recordingCacheSizeInMB,recordingCacheDurationInSecs,recordingCompressionEnabled,gzipResponse)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.orgApacheSlingXssImplXSSFilterImpl = function orgApacheSlingXssImplXSSFilterImpl (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  var policyPath = req.swagger.params['policyPath'].value;
  Configmgr.orgApacheSlingXssImplXSSFilterImpl(post,apply,_delete,action,Dollarlocation,propertylist,policyPath)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
