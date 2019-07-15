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

/**
 * The ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties model module.
 * @module model/ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties} The populated <code>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties();

            if (data.hasOwnProperty('enableFallback')) {
                obj['enableFallback'] = ConfigNodePropertyBoolean.constructFromObject(data['enableFallback']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enableFallback
 */
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.prototype['enableFallback'] = undefined;






export default ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties;

