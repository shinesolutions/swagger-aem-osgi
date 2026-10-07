const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.player.pingfrequency`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.aem.screens.device.pasword.specialchars`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.device.pasword.minlowercasechars`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.device.pasword.minuppercasechars`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.device.pasword.minnumberchars`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.device.pasword.minspecialchars`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.device.pasword.minlength`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.aem.screens.player.pingfrequency': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.player.pingfrequency`)),
            'com.adobe.aem.screens.device.pasword.specialchars': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.device.pasword.specialchars`)),
            'com.adobe.aem.screens.device.pasword.minlowercasechars': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.device.pasword.minlowercasechars`)),
            'com.adobe.aem.screens.device.pasword.minuppercasechars': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.device.pasword.minuppercasechars`)),
            'com.adobe.aem.screens.device.pasword.minnumberchars': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.device.pasword.minnumberchars`)),
            'com.adobe.aem.screens.device.pasword.minspecialchars': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.device.pasword.minspecialchars`)),
            'com.adobe.aem.screens.device.pasword.minlength': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.device.pasword.minlength`)),
        }
    },
}
