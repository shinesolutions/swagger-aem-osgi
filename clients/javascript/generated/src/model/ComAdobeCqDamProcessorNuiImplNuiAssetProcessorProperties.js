/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties model module.
 * @module model/ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
 * @version 1.0.0
 */
class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {
    /**
     * Constructs a new <code>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</code>.
     * @alias module:model/ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
     */
    constructor() { 
        
        ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties} The populated <code>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();

            if (data.hasOwnProperty('nuiEnabled')) {
                obj['nuiEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['nuiEnabled']);
            }
            if (data.hasOwnProperty('nuiServiceUrl')) {
                obj['nuiServiceUrl'] = ConfigNodePropertyString.constructFromObject(data['nuiServiceUrl']);
            }
            if (data.hasOwnProperty('nuiApiKey')) {
                obj['nuiApiKey'] = ConfigNodePropertyString.constructFromObject(data['nuiApiKey']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} nuiEnabled
 */
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.prototype['nuiEnabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} nuiServiceUrl
 */
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.prototype['nuiServiceUrl'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} nuiApiKey
 */
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.prototype['nuiApiKey'] = undefined;






export default ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties;

