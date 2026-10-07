const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.sling.installer.configuration.persist`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}mode`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}port`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}primary.host`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}interval`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}primary.allowed-client-ip-ranges`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}secure`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}standby.readtimeout`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}standby.autoclean`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.installer.configuration.persist': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.sling.installer.configuration.persist`)),
            'mode': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}mode`)),
            'port': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}port`)),
            'primary.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}primary.host`)),
            'interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}interval`)),
            'primary.allowed-client-ip-ranges': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}primary.allowed-client-ip-ranges`)),
            'secure': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}secure`)),
            'standby.readtimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}standby.readtimeout`)),
            'standby.autoclean': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}standby.autoclean`)),
        }
    },
}
