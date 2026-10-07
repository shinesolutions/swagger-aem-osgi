
/*
 * OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties();
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccountName();

	/*! \brief Set 
	 */
	void setAccountName(ConfigNodePropertyString accountName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getContainerName();

	/*! \brief Set 
	 */
	void setContainerName(ConfigNodePropertyString containerName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccessKey();

	/*! \brief Set 
	 */
	void setAccessKey(ConfigNodePropertyString accessKey);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRootPath();

	/*! \brief Set 
	 */
	void setRootPath(ConfigNodePropertyString rootPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConnectionURL();

	/*! \brief Set 
	 */
	void setConnectionURL(ConfigNodePropertyString connectionURL);


    private:
    ConfigNodePropertyString accountName;
    ConfigNodePropertyString containerName;
    ConfigNodePropertyString accessKey;
    ConfigNodePropertyString rootPath;
    ConfigNodePropertyString connectionURL;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties_H_ */
