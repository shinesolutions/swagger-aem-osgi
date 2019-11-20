/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.h
 *
 * 
 */

#ifndef ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_
#define ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
    : public ModelBase
{
public:
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties();
    virtual ~ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getReplicationContentUseFileStorage() const;
    void setReplicationContentUseFileStorage(ConfigNodePropertyBoolean const& value);
    bool replicationContentUseFileStorageIsSet() const;
    void unsetReplication_content_useFileStorage();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getReplicationContentMaxCommitAttempts() const;
    void setReplicationContentMaxCommitAttempts(ConfigNodePropertyInteger const& value);
    bool replicationContentMaxCommitAttemptsIsSet() const;
    void unsetReplication_content_maxCommitAttempts();

protected:
    ConfigNodePropertyBoolean m_Replication_content_useFileStorage;
    bool m_Replication_content_useFileStorageIsSet;
    ConfigNodePropertyInteger m_Replication_content_maxCommitAttempts;
    bool m_Replication_content_maxCommitAttemptsIsSet;
};

}
}
}
}

#endif /* ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_ */