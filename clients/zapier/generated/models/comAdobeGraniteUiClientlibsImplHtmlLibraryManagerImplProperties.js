const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.timing`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.debug.init.js`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.minify`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.debug`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.gzip`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}htmllibmanager.maxDataUriSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}htmllibmanager.maxage`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.forceCQUrlInfo`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.defaultthemename`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.defaultuserthemename`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.clientmanager`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.path.list`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.excluded.path.list`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.processor.js`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.processor.css`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.longcache.patterns`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.longcache.format`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmllibmanager.useFileSystemOutputCache`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}htmllibmanager.fileSystemOutputCacheLocation`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}htmllibmanager.disable.replacement`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'htmllibmanager.timing': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.timing`)),
            'htmllibmanager.debug.init.js': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.debug.init.js`)),
            'htmllibmanager.minify': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.minify`)),
            'htmllibmanager.debug': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.debug`)),
            'htmllibmanager.gzip': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.gzip`)),
            'htmllibmanager.maxDataUriSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}htmllibmanager.maxDataUriSize`)),
            'htmllibmanager.maxage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}htmllibmanager.maxage`)),
            'htmllibmanager.forceCQUrlInfo': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.forceCQUrlInfo`)),
            'htmllibmanager.defaultthemename': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.defaultthemename`)),
            'htmllibmanager.defaultuserthemename': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.defaultuserthemename`)),
            'htmllibmanager.clientmanager': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.clientmanager`)),
            'htmllibmanager.path.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.path.list`)),
            'htmllibmanager.excluded.path.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.excluded.path.list`)),
            'htmllibmanager.processor.js': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.processor.js`)),
            'htmllibmanager.processor.css': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.processor.css`)),
            'htmllibmanager.longcache.patterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.longcache.patterns`)),
            'htmllibmanager.longcache.format': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.longcache.format`)),
            'htmllibmanager.useFileSystemOutputCache': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmllibmanager.useFileSystemOutputCache`)),
            'htmllibmanager.fileSystemOutputCacheLocation': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}htmllibmanager.fileSystemOutputCacheLocation`)),
            'htmllibmanager.disable.replacement': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmllibmanager.disable.replacement`)),
        }
    },
}
