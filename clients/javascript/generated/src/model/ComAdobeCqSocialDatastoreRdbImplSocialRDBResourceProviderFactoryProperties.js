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
 * The ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties model module.
 * @module model/ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties</code>.
     * @alias module:model/ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties
     */
    constructor() { 
        
        ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties} The populated <code>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties();

            if (data.hasOwnProperty('solr.zk.timeout')) {
                obj['solr.zk.timeout'] = ConfigNodePropertyString.constructFromObject(data['solr.zk.timeout']);
            }
            if (data.hasOwnProperty('solr.commit')) {
                obj['solr.commit'] = ConfigNodePropertyString.constructFromObject(data['solr.commit']);
            }
            if (data.hasOwnProperty('cache.on')) {
                obj['cache.on'] = ConfigNodePropertyBoolean.constructFromObject(data['cache.on']);
            }
            if (data.hasOwnProperty('concurrency.level')) {
                obj['concurrency.level'] = ConfigNodePropertyInteger.constructFromObject(data['concurrency.level']);
            }
            if (data.hasOwnProperty('cache.start.size')) {
                obj['cache.start.size'] = ConfigNodePropertyInteger.constructFromObject(data['cache.start.size']);
            }
            if (data.hasOwnProperty('cache.ttl')) {
                obj['cache.ttl'] = ConfigNodePropertyInteger.constructFromObject(data['cache.ttl']);
            }
            if (data.hasOwnProperty('cache.size')) {
                obj['cache.size'] = ConfigNodePropertyInteger.constructFromObject(data['cache.size']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} solr.zk.timeout
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['solr.zk.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} solr.commit
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['solr.commit'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} cache.on
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['cache.on'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} concurrency.level
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['concurrency.level'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cache.start.size
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['cache.start.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cache.ttl
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['cache.ttl'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cache.size
 */
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties.prototype['cache.size'] = undefined;






export default ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactoryProperties;
