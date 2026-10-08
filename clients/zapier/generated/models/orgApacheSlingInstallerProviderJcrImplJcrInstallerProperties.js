const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}handler.schemes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.jcrinstall.folder.name.regexp`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}sling.jcrinstall.folder.max.depth`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.jcrinstall.search.path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.jcrinstall.new.config.path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.jcrinstall.signal.path`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}sling.jcrinstall.enable.writeback`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'handler.schemes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}handler.schemes`)),
            'sling.jcrinstall.folder.name.regexp': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.jcrinstall.folder.name.regexp`)),
            'sling.jcrinstall.folder.max.depth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}sling.jcrinstall.folder.max.depth`)),
            'sling.jcrinstall.search.path': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.jcrinstall.search.path`)),
            'sling.jcrinstall.new.config.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.jcrinstall.new.config.path`)),
            'sling.jcrinstall.signal.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.jcrinstall.signal.path`)),
            'sling.jcrinstall.enable.writeback': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}sling.jcrinstall.enable.writeback`)),
        }
    },
}
