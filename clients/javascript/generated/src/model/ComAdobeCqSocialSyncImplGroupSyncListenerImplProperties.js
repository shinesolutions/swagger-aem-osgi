/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties model module.
 * @module model/ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties} The populated <code>ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties();

            if (data.hasOwnProperty('nodetypes')) {
                obj['nodetypes'] = ConfigNodePropertyArray.constructFromObject(data['nodetypes']);
            }
            if (data.hasOwnProperty('ignorableprops')) {
                obj['ignorableprops'] = ConfigNodePropertyArray.constructFromObject(data['ignorableprops']);
            }
            if (data.hasOwnProperty('ignorablenodes')) {
                obj['ignorablenodes'] = ConfigNodePropertyString.constructFromObject(data['ignorablenodes']);
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
            if (data.hasOwnProperty('distfolders')) {
                obj['distfolders'] = ConfigNodePropertyString.constructFromObject(data['distfolders']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} nodetypes
 */
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.prototype['nodetypes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} ignorableprops
 */
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.prototype['ignorableprops'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} ignorablenodes
 */
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.prototype['ignorablenodes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} distfolders
 */
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.prototype['distfolders'] = undefined;






export default ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties;
