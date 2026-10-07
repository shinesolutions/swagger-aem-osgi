const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name`)),
            'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name`)),
            'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name`)),
            'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name`)),
            'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name`)),
            'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name`)),
            'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name`)),
        }
    },
}
