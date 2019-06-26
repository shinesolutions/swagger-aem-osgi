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
 * The ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties model module.
 * @module model/ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</code>.
     * @alias module:model/ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
     */
    constructor() { 
        
        ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties} The populated <code>ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();

            if (data.hasOwnProperty('extension.order')) {
                obj['extension.order'] = ConfigNodePropertyInteger.constructFromObject(data['extension.order']);
            }
            if (data.hasOwnProperty('flush.forumontopic')) {
                obj['flush.forumontopic'] = ConfigNodePropertyBoolean.constructFromObject(data['flush.forumontopic']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} extension.order
 */
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.prototype['extension.order'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} flush.forumontopic
 */
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.prototype['flush.forumontopic'] = undefined;






export default ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties;
