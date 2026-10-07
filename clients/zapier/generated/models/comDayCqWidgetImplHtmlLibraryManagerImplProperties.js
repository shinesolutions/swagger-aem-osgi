const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.clientmanager`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.debug`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.debug.console`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.debug.init.js`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.defaultthemename`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.defaultuserthemename`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.firebuglite.path`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.forceCQUrlInfo`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.gzip`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}htmllibmanager.maxage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}htmllibmanager.maxDataUriSize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.minify`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.path.list`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.timing`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'htmllibmanager.clientmanager': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.clientmanager`)),
            'htmllibmanager.debug': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.debug`)),
            'htmllibmanager.debug.console': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.debug.console`)),
            'htmllibmanager.debug.init.js': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.debug.init.js`)),
            'htmllibmanager.defaultthemename': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.defaultthemename`)),
            'htmllibmanager.defaultuserthemename': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.defaultuserthemename`)),
            'htmllibmanager.firebuglite.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.firebuglite.path`)),
            'htmllibmanager.forceCQUrlInfo': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.forceCQUrlInfo`)),
            'htmllibmanager.gzip': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.gzip`)),
            'htmllibmanager.maxage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}htmllibmanager.maxage`)),
            'htmllibmanager.maxDataUriSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}htmllibmanager.maxDataUriSize`)),
            'htmllibmanager.minify': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.minify`)),
            'htmllibmanager.path.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.path.list`)),
            'htmllibmanager.timing': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.timing`)),
        }
    },
}
