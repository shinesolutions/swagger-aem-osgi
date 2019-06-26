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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties model module.
 * @module model/ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties} The populated <code>ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();

            if (data.hasOwnProperty('max.unread.notification.count')) {
                obj['max.unread.notification.count'] = ConfigNodePropertyInteger.constructFromObject(data['max.unread.notification.count']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} max.unread.notification.count
 */
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.prototype['max.unread.notification.count'] = undefined;






export default ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties;
