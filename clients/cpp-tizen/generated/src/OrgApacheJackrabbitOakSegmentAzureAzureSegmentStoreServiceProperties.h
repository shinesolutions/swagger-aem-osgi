/*
 * OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties_H_
#define _OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
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

class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties();
	OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccountName();

	/*! \brief Set 
	 */
	void setAccountName(ConfigNodePropertyString  accountName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getContainerName();

	/*! \brief Set 
	 */
	void setContainerName(ConfigNodePropertyString  containerName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccessKey();

	/*! \brief Set 
	 */
	void setAccessKey(ConfigNodePropertyString  accessKey);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRootPath();

	/*! \brief Set 
	 */
	void setRootPath(ConfigNodePropertyString  rootPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConnectionURL();

	/*! \brief Set 
	 */
	void setConnectionURL(ConfigNodePropertyString  connectionURL);

private:
	ConfigNodePropertyString accountName;
	ConfigNodePropertyString containerName;
	ConfigNodePropertyString accessKey;
	ConfigNodePropertyString rootPath;
	ConfigNodePropertyString connectionURL;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties_H_ */
