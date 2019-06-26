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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties model module.
 * @module model/ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties</code>.
     * @alias module:model/ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties
     */
    constructor() { 
        
        ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties} The populated <code>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties();

            if (data.hasOwnProperty('group.listing.pagination.enable')) {
                obj['group.listing.pagination.enable'] = ConfigNodePropertyBoolean.constructFromObject(data['group.listing.pagination.enable']);
            }
            if (data.hasOwnProperty('group.listing.lazyloading.enable')) {
                obj['group.listing.lazyloading.enable'] = ConfigNodePropertyBoolean.constructFromObject(data['group.listing.lazyloading.enable']);
            }
            if (data.hasOwnProperty('page.size')) {
                obj['page.size'] = ConfigNodePropertyInteger.constructFromObject(data['page.size']);
            }
            if (data.hasOwnProperty('priority')) {
                obj['priority'] = ConfigNodePropertyInteger.constructFromObject(data['priority']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} group.listing.pagination.enable
 */
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties.prototype['group.listing.pagination.enable'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} group.listing.lazyloading.enable
 */
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties.prototype['group.listing.lazyloading.enable'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} page.size
 */
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties.prototype['page.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} priority
 */
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties.prototype['priority'] = undefined;






export default ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactoryProperties;
