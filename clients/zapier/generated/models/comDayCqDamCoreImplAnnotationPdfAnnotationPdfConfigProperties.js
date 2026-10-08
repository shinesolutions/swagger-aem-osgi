const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.document.width`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.document.height`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.document.padding.horizontal`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.document.padding.vertical`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.font.size`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.config.annotation.pdf.font.color`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.config.annotation.pdf.font.family`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.config.annotation.pdf.font.light`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.marginTextImage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.minImageHeight`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.width`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.color.approved`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.color.rejected`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.annotationMarker.width`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.config.annotation.pdf.asset.minheight`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.config.annotation.pdf.document.width': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.document.width`)),
            'cq.dam.config.annotation.pdf.document.height': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.document.height`)),
            'cq.dam.config.annotation.pdf.document.padding.horizontal': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.document.padding.horizontal`)),
            'cq.dam.config.annotation.pdf.document.padding.vertical': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.document.padding.vertical`)),
            'cq.dam.config.annotation.pdf.font.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.font.size`)),
            'cq.dam.config.annotation.pdf.font.color': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.font.color`)),
            'cq.dam.config.annotation.pdf.font.family': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.font.family`)),
            'cq.dam.config.annotation.pdf.font.light': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.font.light`)),
            'cq.dam.config.annotation.pdf.marginTextImage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.marginTextImage`)),
            'cq.dam.config.annotation.pdf.minImageHeight': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.minImageHeight`)),
            'cq.dam.config.annotation.pdf.reviewStatus.width': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.width`)),
            'cq.dam.config.annotation.pdf.reviewStatus.color.approved': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.color.approved`)),
            'cq.dam.config.annotation.pdf.reviewStatus.color.rejected': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.color.rejected`)),
            'cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested`)),
            'cq.dam.config.annotation.pdf.annotationMarker.width': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.annotationMarker.width`)),
            'cq.dam.config.annotation.pdf.asset.minheight': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.config.annotation.pdf.asset.minheight`)),
        }
    },
}
