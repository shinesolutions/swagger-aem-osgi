const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}translate.language`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}translate.display`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}translate.attribution`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}translate.caching`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}translate.smart.rendering`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}translate.caching.duration`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}translate.session.save.interval`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}translate.session.save.batchLimit`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'translate.language': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}translate.language`)),
            'translate.display': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}translate.display`)),
            'translate.attribution': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}translate.attribution`)),
            'translate.caching': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}translate.caching`)),
            'translate.smart.rendering': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}translate.smart.rendering`)),
            'translate.caching.duration': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}translate.caching.duration`)),
            'translate.session.save.interval': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}translate.session.save.interval`)),
            'translate.session.save.batchLimit': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}translate.session.save.batchLimit`)),
        }
    },
}
