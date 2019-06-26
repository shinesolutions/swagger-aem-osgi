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

/**
 * The ComDayCqWcmFoundationImplPageRedirectServletProperties model module.
 * @module model/ComDayCqWcmFoundationImplPageRedirectServletProperties
 * @version 1.0.0
 */
class ComDayCqWcmFoundationImplPageRedirectServletProperties {
    /**
     * Constructs a new <code>ComDayCqWcmFoundationImplPageRedirectServletProperties</code>.
     * @alias module:model/ComDayCqWcmFoundationImplPageRedirectServletProperties
     */
    constructor() { 
        
        ComDayCqWcmFoundationImplPageRedirectServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmFoundationImplPageRedirectServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmFoundationImplPageRedirectServletProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmFoundationImplPageRedirectServletProperties} The populated <code>ComDayCqWcmFoundationImplPageRedirectServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmFoundationImplPageRedirectServletProperties();

            if (data.hasOwnProperty('excluded.resource.types')) {
                obj['excluded.resource.types'] = ConfigNodePropertyArray.constructFromObject(data['excluded.resource.types']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} excluded.resource.types
 */
ComDayCqWcmFoundationImplPageRedirectServletProperties.prototype['excluded.resource.types'] = undefined;






export default ComDayCqWcmFoundationImplPageRedirectServletProperties;
