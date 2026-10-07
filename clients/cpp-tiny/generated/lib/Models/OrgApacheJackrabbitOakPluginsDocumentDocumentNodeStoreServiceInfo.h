
/*
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo();
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo();


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
	OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo_H_ */
