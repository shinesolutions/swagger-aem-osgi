const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');
const configNodePropertyDropDown_type = require('../models/configNodePropertyDropDown_type');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `property name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}optional`,
                label: `True if optional - [${labelPrefix}optional]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_set`,
                label: `True if property is set - [${labelPrefix}is_set]`,
                type: 'boolean',
            },
            ...configNodePropertyDropDown_type.fields(`${keyPrefix}type`, isInput),
            ....fields(`${keyPrefix}value`, isInput),
            {
                key: `${keyPrefix}description`,
                label: `Property description - [${labelPrefix}description]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'optional': bundle.inputData?.[`${keyPrefix}optional`],
            'is_set': bundle.inputData?.[`${keyPrefix}is_set`],
            'type': utils.removeIfEmpty(configNodePropertyDropDown_type.mapping(bundle, `${keyPrefix}type`)),
            'value': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}value`)),
            'description': bundle.inputData?.[`${keyPrefix}description`],
        }
    },
}
