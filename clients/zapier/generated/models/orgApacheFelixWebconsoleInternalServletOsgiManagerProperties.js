const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}manager.root`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}http.service.filter`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}default.render`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}realm`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}username`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}password`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}category`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}locale`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}loglevel`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}plugins`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'manager.root': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}manager.root`)),
            'http.service.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}http.service.filter`)),
            'default.render': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}default.render`)),
            'realm': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}realm`)),
            'username': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}username`)),
            'password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}password`)),
            'category': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}category`)),
            'locale': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}locale`)),
            'loglevel': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}loglevel`)),
            'plugins': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}plugins`)),
        }
    },
}
