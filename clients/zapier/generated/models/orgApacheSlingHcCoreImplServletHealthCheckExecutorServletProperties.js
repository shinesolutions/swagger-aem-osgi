const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}servletPath`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}disabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cors.accessControlAllowOrigin`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'servletPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}servletPath`)),
            'disabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}disabled`)),
            'cors.accessControlAllowOrigin': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cors.accessControlAllowOrigin`)),
        }
    },
}
