const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.scene7.apiclient.recordsperpage.nofilter.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.scene7.apiclient.recordsperpage.withfilter.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.scene7.apiclient.recordsperpage.nofilter.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.scene7.apiclient.recordsperpage.nofilter.name`)),
            'cq.dam.scene7.apiclient.recordsperpage.withfilter.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.scene7.apiclient.recordsperpage.withfilter.name`)),
        }
    },
}
