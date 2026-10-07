const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cluster.level.enable`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.master.level`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.slave.level`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cluster.level.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cluster.level.enable`)),
            'cluster.master.level': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.master.level`)),
            'cluster.slave.level': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.slave.level`)),
        }
    },
}
