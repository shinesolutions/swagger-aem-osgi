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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties model module.
 * @module model/ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</code>.
     * @alias module:model/ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
     */
    constructor() { 
        
        ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties} The populated <code>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties();

            if (data.hasOwnProperty('offloading.agentmanager.enabled')) {
                obj['offloading.agentmanager.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['offloading.agentmanager.enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} offloading.agentmanager.enabled
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.prototype['offloading.agentmanager.enabled'] = undefined;






export default ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties;

