const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.scene7.uploadservice.activejobtimeout.label`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.scene7.uploadservice.connectionmaxperroute.label`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.scene7.uploadservice.activejobtimeout.label': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.scene7.uploadservice.activejobtimeout.label`)),
            'cq.dam.scene7.uploadservice.connectionmaxperroute.label': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.scene7.uploadservice.connectionmaxperroute.label`)),
        }
    },
}
