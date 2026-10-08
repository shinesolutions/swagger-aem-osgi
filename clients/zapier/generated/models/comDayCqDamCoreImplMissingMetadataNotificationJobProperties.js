const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.missingmetadata.notification.scheduler.istimebased`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.missingmetadata.notification.scheduler.timebased.rule`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.missingmetadata.notification.scheduler.period.rule`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.missingmetadata.notification.recipient`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.missingmetadata.notification.scheduler.istimebased': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.missingmetadata.notification.scheduler.istimebased`)),
            'cq.dam.missingmetadata.notification.scheduler.timebased.rule': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.missingmetadata.notification.scheduler.timebased.rule`)),
            'cq.dam.missingmetadata.notification.scheduler.period.rule': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.missingmetadata.notification.scheduler.period.rule`)),
            'cq.dam.missingmetadata.notification.recipient': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.missingmetadata.notification.recipient`)),
        }
    },
}
