
/*
 * OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo();
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo();


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
	OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo_H_ */
