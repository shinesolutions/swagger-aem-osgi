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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties model module.
 * @module model/ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
 * @version 1.0.0
 */
class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</code>.
     * @alias module:model/ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
     */
    constructor() { 
        
        ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties} The populated <code>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();

            if (data.hasOwnProperty('cq.commerce.asset.handler.fallback')) {
                obj['cq.commerce.asset.handler.fallback'] = ConfigNodePropertyString.constructFromObject(data['cq.commerce.asset.handler.fallback']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} cq.commerce.asset.handler.fallback
 */
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.prototype['cq.commerce.asset.handler.fallback'] = undefined;






export default ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties;

