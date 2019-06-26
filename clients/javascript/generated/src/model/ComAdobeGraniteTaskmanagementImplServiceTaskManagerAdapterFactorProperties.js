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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties model module.
 * @module model/ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
 * @version 1.0.0
 */
class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</code>.
     * @alias module:model/ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
     */
    constructor() { 
        
        ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties} The populated <code>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties();

            if (data.hasOwnProperty('adapter.condition')) {
                obj['adapter.condition'] = ConfigNodePropertyString.constructFromObject(data['adapter.condition']);
            }
            if (data.hasOwnProperty('taskmanager.admingroups')) {
                obj['taskmanager.admingroups'] = ConfigNodePropertyArray.constructFromObject(data['taskmanager.admingroups']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} adapter.condition
 */
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.prototype['adapter.condition'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} taskmanager.admingroups
 */
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.prototype['taskmanager.admingroups'] = undefined;






export default ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties;

