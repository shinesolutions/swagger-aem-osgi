const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}default.transport.agent-to-worker.prefix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}default.transport.agent-to-master.prefix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}default.transport.input.package`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}default.transport.output.package`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}default.transport.replication.synchronous`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}default.transport.contentpackage`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}offloading.transporter.default.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'default.transport.agent-to-worker.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}default.transport.agent-to-worker.prefix`)),
            'default.transport.agent-to-master.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}default.transport.agent-to-master.prefix`)),
            'default.transport.input.package': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}default.transport.input.package`)),
            'default.transport.output.package': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}default.transport.output.package`)),
            'default.transport.replication.synchronous': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}default.transport.replication.synchronous`)),
            'default.transport.contentpackage': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}default.transport.contentpackage`)),
            'offloading.transporter.default.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}offloading.transporter.default.enabled`)),
        }
    },
}
