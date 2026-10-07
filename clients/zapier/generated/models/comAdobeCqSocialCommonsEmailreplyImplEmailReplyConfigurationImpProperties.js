const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}email.name`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}email.createPostFromReply`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}email.addCommentIdTo`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}email.subjectMaximumLength`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}email.replyToAddress`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}email.replyToDelimiter`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}email.trackerIdPrefixInSubject`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}email.trackerIdPrefixInBody`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}email.asHTML`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}email.defaultUserName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}email.templates.rootPath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'email.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.name`)),
            'email.createPostFromReply': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}email.createPostFromReply`)),
            'email.addCommentIdTo': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}email.addCommentIdTo`)),
            'email.subjectMaximumLength': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}email.subjectMaximumLength`)),
            'email.replyToAddress': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.replyToAddress`)),
            'email.replyToDelimiter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.replyToDelimiter`)),
            'email.trackerIdPrefixInSubject': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.trackerIdPrefixInSubject`)),
            'email.trackerIdPrefixInBody': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.trackerIdPrefixInBody`)),
            'email.asHTML': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}email.asHTML`)),
            'email.defaultUserName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.defaultUserName`)),
            'email.templates.rootPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}email.templates.rootPath`)),
        }
    },
}
