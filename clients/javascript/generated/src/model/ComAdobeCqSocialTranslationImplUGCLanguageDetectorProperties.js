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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties model module.
 * @module model/ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</code>.
     * @alias module:model/ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
     */
    constructor() { 
        
        ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties} The populated <code>ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties();

            if (data.hasOwnProperty('event.topics')) {
                obj['event.topics'] = ConfigNodePropertyString.constructFromObject(data['event.topics']);
            }
            if (data.hasOwnProperty('event.filter')) {
                obj['event.filter'] = ConfigNodePropertyString.constructFromObject(data['event.filter']);
            }
            if (data.hasOwnProperty('translate.listener.type')) {
                obj['translate.listener.type'] = ConfigNodePropertyArray.constructFromObject(data['translate.listener.type']);
            }
            if (data.hasOwnProperty('translate.property.list')) {
                obj['translate.property.list'] = ConfigNodePropertyArray.constructFromObject(data['translate.property.list']);
            }
            if (data.hasOwnProperty('poolSize')) {
                obj['poolSize'] = ConfigNodePropertyInteger.constructFromObject(data['poolSize']);
            }
            if (data.hasOwnProperty('maxPoolSize')) {
                obj['maxPoolSize'] = ConfigNodePropertyInteger.constructFromObject(data['maxPoolSize']);
            }
            if (data.hasOwnProperty('queueSize')) {
                obj['queueSize'] = ConfigNodePropertyInteger.constructFromObject(data['queueSize']);
            }
            if (data.hasOwnProperty('keepAliveTime')) {
                obj['keepAliveTime'] = ConfigNodePropertyInteger.constructFromObject(data['keepAliveTime']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} event.topics
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['event.topics'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} event.filter
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['event.filter'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} translate.listener.type
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['translate.listener.type'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} translate.property.list
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['translate.property.list'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} poolSize
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['poolSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxPoolSize
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['maxPoolSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} queueSize
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['queueSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} keepAliveTime
 */
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.prototype['keepAliveTime'] = undefined;






export default ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties;
