
/*
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties();
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAsyncConfigs();

	/*! \brief Set 
	 */
	void setAsyncConfigs(ConfigNodePropertyArray asyncConfigs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLeaseTimeOutMinutes();

	/*! \brief Set 
	 */
	void setLeaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFailingIndexTimeoutSeconds();

	/*! \brief Set 
	 */
	void setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getErrorWarnIntervalSeconds();

	/*! \brief Set 
	 */
	void setErrorWarnIntervalSeconds(ConfigNodePropertyInteger errorWarnIntervalSeconds);


    private:
    ConfigNodePropertyArray asyncConfigs;
    ConfigNodePropertyInteger leaseTimeOutMinutes;
    ConfigNodePropertyInteger failingIndexTimeoutSeconds;
    ConfigNodePropertyInteger errorWarnIntervalSeconds;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties_H_ */
