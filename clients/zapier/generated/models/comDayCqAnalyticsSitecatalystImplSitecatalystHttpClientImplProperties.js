const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.analytics.sitecatalyst.service.datacenter.url`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}devhostnamepatterns`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connection.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}socket.timeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.analytics.sitecatalyst.service.datacenter.url': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.analytics.sitecatalyst.service.datacenter.url`)),
            'devhostnamepatterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}devhostnamepatterns`)),
            'connection.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connection.timeout`)),
            'socket.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}socket.timeout`)),
        }
    },
}
