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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties model module.
 * @module model/ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
 * @version 1.0.0
 */
class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</code>.
     * @alias module:model/ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
     */
    constructor() { 
        
        ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties} The populated <code>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();

            if (data.hasOwnProperty('com.adobe.cq.screens.analytics.impl.url')) {
                obj['com.adobe.cq.screens.analytics.impl.url'] = ConfigNodePropertyString.constructFromObject(data['com.adobe.cq.screens.analytics.impl.url']);
            }
            if (data.hasOwnProperty('com.adobe.cq.screens.analytics.impl.apikey')) {
                obj['com.adobe.cq.screens.analytics.impl.apikey'] = ConfigNodePropertyString.constructFromObject(data['com.adobe.cq.screens.analytics.impl.apikey']);
            }
            if (data.hasOwnProperty('com.adobe.cq.screens.analytics.impl.project')) {
                obj['com.adobe.cq.screens.analytics.impl.project'] = ConfigNodePropertyString.constructFromObject(data['com.adobe.cq.screens.analytics.impl.project']);
            }
            if (data.hasOwnProperty('com.adobe.cq.screens.analytics.impl.environment')) {
                obj['com.adobe.cq.screens.analytics.impl.environment'] = ConfigNodePropertyDropDown.constructFromObject(data['com.adobe.cq.screens.analytics.impl.environment']);
            }
            if (data.hasOwnProperty('com.adobe.cq.screens.analytics.impl.sendFrequency')) {
                obj['com.adobe.cq.screens.analytics.impl.sendFrequency'] = ConfigNodePropertyInteger.constructFromObject(data['com.adobe.cq.screens.analytics.impl.sendFrequency']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} com.adobe.cq.screens.analytics.impl.url
 */
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.prototype['com.adobe.cq.screens.analytics.impl.url'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} com.adobe.cq.screens.analytics.impl.apikey
 */
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.prototype['com.adobe.cq.screens.analytics.impl.apikey'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} com.adobe.cq.screens.analytics.impl.project
 */
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.prototype['com.adobe.cq.screens.analytics.impl.project'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} com.adobe.cq.screens.analytics.impl.environment
 */
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.prototype['com.adobe.cq.screens.analytics.impl.environment'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} com.adobe.cq.screens.analytics.impl.sendFrequency
 */
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.prototype['com.adobe.cq.screens.analytics.impl.sendFrequency'] = undefined;






export default ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties;

