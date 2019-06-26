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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties model module.
 * @module model/ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
 * @version 1.0.0
 */
class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</code>.
     * @alias module:model/ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
     */
    constructor() { 
        
        ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties} The populated <code>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties();

            if (data.hasOwnProperty('syncTranslationState.schedulingFormat')) {
                obj['syncTranslationState.schedulingFormat'] = ConfigNodePropertyString.constructFromObject(data['syncTranslationState.schedulingFormat']);
            }
            if (data.hasOwnProperty('schedulingRepeatTranslation.schedulingFormat')) {
                obj['schedulingRepeatTranslation.schedulingFormat'] = ConfigNodePropertyString.constructFromObject(data['schedulingRepeatTranslation.schedulingFormat']);
            }
            if (data.hasOwnProperty('syncTranslationState.lockTimeoutInMinutes')) {
                obj['syncTranslationState.lockTimeoutInMinutes'] = ConfigNodePropertyString.constructFromObject(data['syncTranslationState.lockTimeoutInMinutes']);
            }
            if (data.hasOwnProperty('export.format')) {
                obj['export.format'] = ConfigNodePropertyDropDown.constructFromObject(data['export.format']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} syncTranslationState.schedulingFormat
 */
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.prototype['syncTranslationState.schedulingFormat'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} schedulingRepeatTranslation.schedulingFormat
 */
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.prototype['schedulingRepeatTranslation.schedulingFormat'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} syncTranslationState.lockTimeoutInMinutes
 */
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.prototype['syncTranslationState.lockTimeoutInMinutes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} export.format
 */
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.prototype['export.format'] = undefined;






export default ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties;
