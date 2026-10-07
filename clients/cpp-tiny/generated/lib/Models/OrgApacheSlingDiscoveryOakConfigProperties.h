
/*
 * OrgApacheSlingDiscoveryOakConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDiscoveryOakConfigProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDiscoveryOakConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDiscoveryOakConfigProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDiscoveryOakConfigProperties();
    OrgApacheSlingDiscoveryOakConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDiscoveryOakConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectorPingTimeout();

	/*! \brief Set 
	 */
	void setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectorPingInterval();

	/*! \brief Set 
	 */
	void setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDiscoveryLiteCheckInterval();

	/*! \brief Set 
	 */
	void setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterSyncServiceTimeout();

	/*! \brief Set 
	 */
	void setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterSyncServiceInterval();

	/*! \brief Set 
	 */
	void setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableSyncToken();

	/*! \brief Set 
	 */
	void setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinEventDelay();

	/*! \brief Set 
	 */
	void setMinEventDelay(ConfigNodePropertyInteger minEventDelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSocketConnectTimeout();

	/*! \brief Set 
	 */
	void setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSoTimeout();

	/*! \brief Set 
	 */
	void setSoTimeout(ConfigNodePropertyInteger soTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTopologyConnectorUrls();

	/*! \brief Set 
	 */
	void setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTopologyConnectorWhitelist();

	/*! \brief Set 
	 */
	void setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled();

	/*! \brief Set 
	 */
	void setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled();

	/*! \brief Set 
	 */
	void setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHmacEnabled();

	/*! \brief Set 
	 */
	void setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableEncryption();

	/*! \brief Set 
	 */
	void setEnableEncryption(ConfigNodePropertyBoolean enableEncryption);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSharedKey();

	/*! \brief Set 
	 */
	void setSharedKey(ConfigNodePropertyString sharedKey);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHmacSharedKeyTTL();

	/*! \brief Set 
	 */
	void setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getBackoffStandbyFactor();

	/*! \brief Set 
	 */
	void setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getBackoffStableFactor();

	/*! \brief Set 
	 */
	void setBackoffStableFactor(ConfigNodePropertyString backoffStableFactor);


    private:
    ConfigNodePropertyInteger connectorPingTimeout;
    ConfigNodePropertyInteger connectorPingInterval;
    ConfigNodePropertyInteger discoveryLiteCheckInterval;
    ConfigNodePropertyInteger clusterSyncServiceTimeout;
    ConfigNodePropertyInteger clusterSyncServiceInterval;
    ConfigNodePropertyBoolean enableSyncToken;
    ConfigNodePropertyInteger minEventDelay;
    ConfigNodePropertyInteger socketConnectTimeout;
    ConfigNodePropertyInteger soTimeout;
    ConfigNodePropertyArray topologyConnectorUrls;
    ConfigNodePropertyArray topologyConnectorWhitelist;
    ConfigNodePropertyBoolean autoStopLocalLoopEnabled;
    ConfigNodePropertyBoolean gzipConnectorRequestsEnabled;
    ConfigNodePropertyBoolean hmacEnabled;
    ConfigNodePropertyBoolean enableEncryption;
    ConfigNodePropertyString sharedKey;
    ConfigNodePropertyInteger hmacSharedKeyTTL;
    ConfigNodePropertyString backoffStandbyFactor;
    ConfigNodePropertyString backoffStableFactor;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDiscoveryOakConfigProperties_H_ */
