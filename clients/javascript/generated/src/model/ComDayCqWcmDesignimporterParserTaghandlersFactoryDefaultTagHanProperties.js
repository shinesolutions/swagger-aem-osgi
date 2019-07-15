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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties model module.
 * @module model/ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
 * @version 1.0.0
 */
class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties {
    /**
     * Constructs a new <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties</code>.
     * @alias module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
     */
    constructor() { 
        
        ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties} The populated <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties();

            if (data.hasOwnProperty('service.ranking')) {
                obj['service.ranking'] = ConfigNodePropertyInteger.constructFromObject(data['service.ranking']);
            }
            if (data.hasOwnProperty('tagpattern')) {
                obj['tagpattern'] = ConfigNodePropertyString.constructFromObject(data['tagpattern']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} service.ranking
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties.prototype['service.ranking'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} tagpattern
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties.prototype['tagpattern'] = undefined;






export default ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties;

