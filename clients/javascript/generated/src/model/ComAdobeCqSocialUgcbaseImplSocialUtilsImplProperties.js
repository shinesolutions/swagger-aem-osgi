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
 * The ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties model module.
 * @module model/ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties} The populated <code>ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties();

            if (data.hasOwnProperty('legacyCloudUGCPathMapping')) {
                obj['legacyCloudUGCPathMapping'] = ConfigNodePropertyBoolean.constructFromObject(data['legacyCloudUGCPathMapping']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} legacyCloudUGCPathMapping
 */
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.prototype['legacyCloudUGCPathMapping'] = undefined;






export default ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties;

