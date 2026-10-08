const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.adhoc.asset.share.prezip.maxcontentsize`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.adhoc.asset.share.prezip.maxcontentsize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.adhoc.asset.share.prezip.maxcontentsize`)),
        }
    },
}
