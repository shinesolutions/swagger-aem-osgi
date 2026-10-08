const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}jasper.compilerTargetVM`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jasper.compilerSourceVM`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.classdebuginfo`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.enablePooling`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jasper.ieClassId`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.genStringAsCharArray`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.keepgenerated`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.mappedfile`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.trimSpaces`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}jasper.displaySourceFragments`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}default.is.session`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jasper.compilerTargetVM': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jasper.compilerTargetVM`)),
            'jasper.compilerSourceVM': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jasper.compilerSourceVM`)),
            'jasper.classdebuginfo': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.classdebuginfo`)),
            'jasper.enablePooling': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.enablePooling`)),
            'jasper.ieClassId': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jasper.ieClassId`)),
            'jasper.genStringAsCharArray': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.genStringAsCharArray`)),
            'jasper.keepgenerated': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.keepgenerated`)),
            'jasper.mappedfile': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.mappedfile`)),
            'jasper.trimSpaces': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.trimSpaces`)),
            'jasper.displaySourceFragments': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}jasper.displaySourceFragments`)),
            'default.is.session': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}default.is.session`)),
        }
    },
}
