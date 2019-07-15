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
 * The OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties model module.
 * @module model/OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
 * @version 1.0.0
 */
class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {
    /**
     * Constructs a new <code>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</code>.
     * @alias module:model/OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
     */
    constructor() { 
        
        OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties} The populated <code>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties();

            if (data.hasOwnProperty('service.ranking')) {
                obj['service.ranking'] = ConfigNodePropertyInteger.constructFromObject(data['service.ranking']);
            }
            if (data.hasOwnProperty('type.collections')) {
                obj['type.collections'] = ConfigNodePropertyString.constructFromObject(data['type.collections']);
            }
            if (data.hasOwnProperty('type.noncollections')) {
                obj['type.noncollections'] = ConfigNodePropertyString.constructFromObject(data['type.noncollections']);
            }
            if (data.hasOwnProperty('type.content')) {
                obj['type.content'] = ConfigNodePropertyString.constructFromObject(data['type.content']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} service.ranking
 */
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.prototype['service.ranking'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} type.collections
 */
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.prototype['type.collections'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} type.noncollections
 */
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.prototype['type.noncollections'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} type.content
 */
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.prototype['type.content'] = undefined;






export default OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties;

