const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}solr.http.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}solr.zk.host`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}solr.collection`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}solr.socket.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}solr.connection.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}solr.shards.no`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}solr.replication.factor`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}solr.conf.dir`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'solr.http.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.http.url`)),
            'solr.zk.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.zk.host`)),
            'solr.collection': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.collection`)),
            'solr.socket.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}solr.socket.timeout`)),
            'solr.connection.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}solr.connection.timeout`)),
            'solr.shards.no': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}solr.shards.no`)),
            'solr.replication.factor': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}solr.replication.factor`)),
            'solr.conf.dir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.conf.dir`)),
        }
    },
}
