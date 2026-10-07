const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.expiry.notification.scheduler.istimebased`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.expiry.notification.scheduler.timebased.rule`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.expiry.notification.scheduler.period.rule`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}send_email`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}asset_expired_limit`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}prior_notification_seconds`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.expiry.notification.url.protocol`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.expiry.notification.scheduler.istimebased': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.expiry.notification.scheduler.istimebased`)),
            'cq.dam.expiry.notification.scheduler.timebased.rule': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.expiry.notification.scheduler.timebased.rule`)),
            'cq.dam.expiry.notification.scheduler.period.rule': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.expiry.notification.scheduler.period.rule`)),
            'send_email': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}send_email`)),
            'asset_expired_limit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}asset_expired_limit`)),
            'prior_notification_seconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}prior_notification_seconds`)),
            'cq.dam.expiry.notification.url.protocol': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.expiry.notification.url.protocol`)),
        }
    },
}
