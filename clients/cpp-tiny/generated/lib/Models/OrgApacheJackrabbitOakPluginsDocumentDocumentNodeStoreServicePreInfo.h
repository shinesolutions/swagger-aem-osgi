
/*
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo();
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties properties);
	/*! \brief Get 
	 */
	std::string getBundleLocation();

	/*! \brief Set 
	 */
	void setBundleLocation(std::string bundle_location);
	/*! \brief Get 
	 */
	std::string getServiceLocation();

	/*! \brief Set 
	 */
	void setServiceLocation(std::string service_location);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties properties;
    std::string bundle_location{};
    std::string service_location{};
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo_H_ */
