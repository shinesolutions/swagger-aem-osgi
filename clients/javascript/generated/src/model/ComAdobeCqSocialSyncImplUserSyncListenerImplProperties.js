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

/**
 * The ComAdobeCqSocialSyncImplUserSyncListenerImplProperties model module.
 * @module model/ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialSyncImplUserSyncListenerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialSyncImplUserSyncListenerImplProperties} The populated <code>ComAdobeCqSocialSyncImplUserSyncListenerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialSyncImplUserSyncListenerImplProperties();

            if (data.hasOwnProperty('nodetypes')) {
                obj['nodetypes'] = ConfigNodePropertyArray.constructFromObject(data['nodetypes']);
            }
            if (data.hasOwnProperty('ignorableprops')) {
                obj['ignorableprops'] = ConfigNodePropertyArray.constructFromObject(data['ignorableprops']);
            }
            if (data.hasOwnProperty('ignorablenodes')) {
                obj['ignorablenodes'] = ConfigNodePropertyArray.constructFromObject(data['ignorablenodes']);
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
            if (data.hasOwnProperty('distfolders')) {
                obj['distfolders'] = ConfigNodePropertyArray.constructFromObject(data['distfolders']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} nodetypes
 */
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.prototype['nodetypes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} ignorableprops
 */
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.prototype['ignorableprops'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} ignorablenodes
 */
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.prototype['ignorablenodes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} distfolders
 */
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.prototype['distfolders'] = undefined;






export default ComAdobeCqSocialSyncImplUserSyncListenerImplProperties;

