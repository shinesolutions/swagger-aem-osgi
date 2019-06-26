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
 * The GuideLocalizationServiceProperties model module.
 * @module model/GuideLocalizationServiceProperties
 * @version 1.0.0
 */
class GuideLocalizationServiceProperties {
    /**
     * Constructs a new <code>GuideLocalizationServiceProperties</code>.
     * @alias module:model/GuideLocalizationServiceProperties
     */
    constructor() { 
        
        GuideLocalizationServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GuideLocalizationServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GuideLocalizationServiceProperties} obj Optional instance to populate.
     * @return {module:model/GuideLocalizationServiceProperties} The populated <code>GuideLocalizationServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GuideLocalizationServiceProperties();

            if (data.hasOwnProperty('supportedLocales')) {
                obj['supportedLocales'] = ConfigNodePropertyArray.constructFromObject(data['supportedLocales']);
            }
            if (data.hasOwnProperty('Localizable Properties')) {
                obj['Localizable Properties'] = ConfigNodePropertyArray.constructFromObject(data['Localizable Properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} supportedLocales
 */
GuideLocalizationServiceProperties.prototype['supportedLocales'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} Localizable Properties
 */
GuideLocalizationServiceProperties.prototype['Localizable Properties'] = undefined;






export default GuideLocalizationServiceProperties;
