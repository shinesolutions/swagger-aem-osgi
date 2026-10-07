const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.context.select`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.listener`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.sudo.cookie`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.sudo.parameter`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auth.annonymous`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.auth.requirements`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.auth.anonymous.user`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.auth.anonymous.password`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}auth.http`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.http.realm`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.uri.suffix`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'osgi.http.whiteboard.context.select': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.context.select`)),
            'osgi.http.whiteboard.listener': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.listener`)),
            'auth.sudo.cookie': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.sudo.cookie`)),
            'auth.sudo.parameter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.sudo.parameter`)),
            'auth.annonymous': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auth.annonymous`)),
            'sling.auth.requirements': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.auth.requirements`)),
            'sling.auth.anonymous.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.auth.anonymous.user`)),
            'sling.auth.anonymous.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.auth.anonymous.password`)),
            'auth.http': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}auth.http`)),
            'auth.http.realm': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.http.realm`)),
            'auth.uri.suffix': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.uri.suffix`)),
        }
    },
}
