/*
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties_H_
#define _OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties();
	OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAsyncConfigs();

	/*! \brief Set 
	 */
	void setAsyncConfigs(ConfigNodePropertyArray  asyncConfigs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLeaseTimeOutMinutes();

	/*! \brief Set 
	 */
	void setLeaseTimeOutMinutes(ConfigNodePropertyInteger  leaseTimeOutMinutes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFailingIndexTimeoutSeconds();

	/*! \brief Set 
	 */
	void setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger  failingIndexTimeoutSeconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getErrorWarnIntervalSeconds();

	/*! \brief Set 
	 */
	void setErrorWarnIntervalSeconds(ConfigNodePropertyInteger  errorWarnIntervalSeconds);

private:
	ConfigNodePropertyArray asyncConfigs;
	ConfigNodePropertyInteger leaseTimeOutMinutes;
	ConfigNodePropertyInteger failingIndexTimeoutSeconds;
	ConfigNodePropertyInteger errorWarnIntervalSeconds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties_H_ */
