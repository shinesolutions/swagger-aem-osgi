const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyFloat = require('../models/configNodePropertyFloat');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}global.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}max.disk.usage`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}persistence.enabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}thread.pool.max.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduled.thread.pool.max.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}graceful.shutdown.timeout`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}queues`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}topics`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}addresses.max.delivery.attempts`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}addresses.expiry.delay`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}addresses.address.full.message.policy`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}addresses.max.size.bytes`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}addresses.page.size.bytes`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}addresses.page.cache.max.size`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cluster.user`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cluster.password`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.call.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.call.failover.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.client.failure.check.period`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.notification.attempts`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.notification.interval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}id.cache.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.confirmation.window.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.connection.ttl`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cluster.duplicate.detection`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.initial.connect.attempts`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.max.retry.interval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.min.large.message.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.producer.window.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.reconnect.attempts`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cluster.retry.interval`, isInput),
            ...configNodePropertyFloat.fields(`${keyPrefix}cluster.retry.interval.multiplier`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'global.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}global.size`)),
            'max.disk.usage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}max.disk.usage`)),
            'persistence.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}persistence.enabled`)),
            'thread.pool.max.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}thread.pool.max.size`)),
            'scheduled.thread.pool.max.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduled.thread.pool.max.size`)),
            'graceful.shutdown.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}graceful.shutdown.timeout`)),
            'queues': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}queues`)),
            'topics': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}topics`)),
            'addresses.max.delivery.attempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}addresses.max.delivery.attempts`)),
            'addresses.expiry.delay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}addresses.expiry.delay`)),
            'addresses.address.full.message.policy': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}addresses.address.full.message.policy`)),
            'addresses.max.size.bytes': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}addresses.max.size.bytes`)),
            'addresses.page.size.bytes': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}addresses.page.size.bytes`)),
            'addresses.page.cache.max.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}addresses.page.cache.max.size`)),
            'cluster.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cluster.user`)),
            'cluster.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cluster.password`)),
            'cluster.call.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.call.timeout`)),
            'cluster.call.failover.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.call.failover.timeout`)),
            'cluster.client.failure.check.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.client.failure.check.period`)),
            'cluster.notification.attempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.notification.attempts`)),
            'cluster.notification.interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.notification.interval`)),
            'id.cache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}id.cache.size`)),
            'cluster.confirmation.window.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.confirmation.window.size`)),
            'cluster.connection.ttl': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.connection.ttl`)),
            'cluster.duplicate.detection': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cluster.duplicate.detection`)),
            'cluster.initial.connect.attempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.initial.connect.attempts`)),
            'cluster.max.retry.interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.max.retry.interval`)),
            'cluster.min.large.message.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.min.large.message.size`)),
            'cluster.producer.window.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.producer.window.size`)),
            'cluster.reconnect.attempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.reconnect.attempts`)),
            'cluster.retry.interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cluster.retry.interval`)),
            'cluster.retry.interval.multiplier': utils.removeIfEmpty(configNodePropertyFloat.mapping(bundle, `${keyPrefix}cluster.retry.interval.multiplier`)),
        }
    },
}
