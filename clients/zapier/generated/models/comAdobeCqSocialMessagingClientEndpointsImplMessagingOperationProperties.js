const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}message.properties`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}messageBoxSizeLimit`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}messageCountLimit`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}notifyFailure`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}failureMessageFrom`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}failureTemplatePath`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxRetries`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minWaitBetweenRetries`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}countUpdatePoolSize`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}inbox.path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sentitems.path`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}supportAttachments`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}supportGroupMessaging`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxTotalRecipients`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}batchSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxTotalAttachmentSize`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}attachmentTypeBlacklist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}allowedAttachmentTypes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceSelector`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}fieldWhitelist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'message.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}message.properties`)),
            'messageBoxSizeLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}messageBoxSizeLimit`)),
            'messageCountLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}messageCountLimit`)),
            'notifyFailure': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notifyFailure`)),
            'failureMessageFrom': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}failureMessageFrom`)),
            'failureTemplatePath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}failureTemplatePath`)),
            'maxRetries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxRetries`)),
            'minWaitBetweenRetries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minWaitBetweenRetries`)),
            'countUpdatePoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}countUpdatePoolSize`)),
            'inbox.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}inbox.path`)),
            'sentitems.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sentitems.path`)),
            'supportAttachments': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}supportAttachments`)),
            'supportGroupMessaging': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}supportGroupMessaging`)),
            'maxTotalRecipients': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxTotalRecipients`)),
            'batchSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}batchSize`)),
            'maxTotalAttachmentSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxTotalAttachmentSize`)),
            'attachmentTypeBlacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}attachmentTypeBlacklist`)),
            'allowedAttachmentTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allowedAttachmentTypes`)),
            'serviceSelector': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceSelector`)),
            'fieldWhitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}fieldWhitelist`)),
        }
    },
}
