const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}granite.workflowinbox.sort.propertyName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}granite.workflowinbox.sort.order`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.workflow.job.retry`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.workflow.superuser`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}granite.workflow.inboxQuerySize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.workflow.adminUserGroupFilter`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.workflow.enforceWorkitemAssigneePermissions`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.workflow.enforceWorkflowInitiatorPermissions`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.workflow.injectTenantIdInJobTopics`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}granite.workflow.maxPurgeSaveThreshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}granite.workflow.maxPurgeQueryCount`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'granite.workflowinbox.sort.propertyName': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}granite.workflowinbox.sort.propertyName`)),
            'granite.workflowinbox.sort.order': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}granite.workflowinbox.sort.order`)),
            'cq.workflow.job.retry': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.workflow.job.retry`)),
            'cq.workflow.superuser': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.workflow.superuser`)),
            'granite.workflow.inboxQuerySize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}granite.workflow.inboxQuerySize`)),
            'granite.workflow.adminUserGroupFilter': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.workflow.adminUserGroupFilter`)),
            'granite.workflow.enforceWorkitemAssigneePermissions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.workflow.enforceWorkitemAssigneePermissions`)),
            'granite.workflow.enforceWorkflowInitiatorPermissions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.workflow.enforceWorkflowInitiatorPermissions`)),
            'granite.workflow.injectTenantIdInJobTopics': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.workflow.injectTenantIdInJobTopics`)),
            'granite.workflow.maxPurgeSaveThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}granite.workflow.maxPurgeSaveThreshold`)),
            'granite.workflow.maxPurgeQueryCount': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}granite.workflow.maxPurgeQueryCount`)),
        }
    },
}
