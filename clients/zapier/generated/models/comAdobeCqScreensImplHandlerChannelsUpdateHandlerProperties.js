const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.pagesupdatehandler.imageresourcetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.pagesupdatehandler.productresourcetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.pagesupdatehandler.videoresourcetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.pagesupdatehandler.dynamicsequenceresourcetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.pagesupdatehandler.previewmodepaths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.pagesupdatehandler.imageresourcetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.pagesupdatehandler.imageresourcetypes`)),
            'cq.pagesupdatehandler.productresourcetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.pagesupdatehandler.productresourcetypes`)),
            'cq.pagesupdatehandler.videoresourcetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.pagesupdatehandler.videoresourcetypes`)),
            'cq.pagesupdatehandler.dynamicsequenceresourcetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.pagesupdatehandler.dynamicsequenceresourcetypes`)),
            'cq.pagesupdatehandler.previewmodepaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.pagesupdatehandler.previewmodepaths`)),
        }
    },
}
