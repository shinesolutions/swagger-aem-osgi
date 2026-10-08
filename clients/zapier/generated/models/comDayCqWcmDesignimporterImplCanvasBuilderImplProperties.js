const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}filepattern`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}build.page.nodes`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}build.client.libs`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}build.canvas.component`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'filepattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}filepattern`)),
            'build.page.nodes': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}build.page.nodes`)),
            'build.client.libs': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}build.client.libs`)),
            'build.canvas.component': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}build.canvas.component`)),
        }
    },
}
