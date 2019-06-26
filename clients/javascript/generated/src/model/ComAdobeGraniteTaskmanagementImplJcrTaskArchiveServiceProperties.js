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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties model module.
 * @module model/ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
 * @version 1.0.0
 */
class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</code>.
     * @alias module:model/ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
     */
    constructor() { 
        
        ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties} The populated <code>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties();

            if (data.hasOwnProperty('archiving.enabled')) {
                obj['archiving.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['archiving.enabled']);
            }
            if (data.hasOwnProperty('scheduler.expression')) {
                obj['scheduler.expression'] = ConfigNodePropertyString.constructFromObject(data['scheduler.expression']);
            }
            if (data.hasOwnProperty('archive.since.days.completed')) {
                obj['archive.since.days.completed'] = ConfigNodePropertyInteger.constructFromObject(data['archive.since.days.completed']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} archiving.enabled
 */
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.prototype['archiving.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} scheduler.expression
 */
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.prototype['scheduler.expression'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} archive.since.days.completed
 */
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.prototype['archive.since.days.completed'] = undefined;






export default ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties;

