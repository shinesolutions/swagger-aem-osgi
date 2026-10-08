const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}repconf.timezone`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}repconf.locale`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}repconf.snapshots`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}repconf.repdir`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}repconf.hourofday`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}repconf.minofhour`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}repconf.maxrows`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}repconf.fakedata`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}repconf.snapshotuser`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}repconf.enforcesnapshotuser`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'repconf.timezone': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repconf.timezone`)),
            'repconf.locale': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repconf.locale`)),
            'repconf.snapshots': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repconf.snapshots`)),
            'repconf.repdir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repconf.repdir`)),
            'repconf.hourofday': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}repconf.hourofday`)),
            'repconf.minofhour': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}repconf.minofhour`)),
            'repconf.maxrows': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}repconf.maxrows`)),
            'repconf.fakedata': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}repconf.fakedata`)),
            'repconf.snapshotuser': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repconf.snapshotuser`)),
            'repconf.enforcesnapshotuser': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}repconf.enforcesnapshotuser`)),
        }
    },
}
