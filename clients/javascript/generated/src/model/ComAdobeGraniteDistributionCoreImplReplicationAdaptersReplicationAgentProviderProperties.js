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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties model module.
 * @module model/ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties
 * @version 1.0.0
 */
class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties</code>.
     * @alias module:model/ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties
     */
    constructor() { 
        
        ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties} The populated <code>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties();

            if (data.hasOwnProperty('providerName')) {
                obj['providerName'] = ConfigNodePropertyString.constructFromObject(data['providerName']);
            }
            if (data.hasOwnProperty('forward.requests')) {
                obj['forward.requests'] = ConfigNodePropertyBoolean.constructFromObject(data['forward.requests']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} providerName
 */
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties.prototype['providerName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} forward.requests
 */
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties.prototype['forward.requests'] = undefined;






export default ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProviderProperties;
