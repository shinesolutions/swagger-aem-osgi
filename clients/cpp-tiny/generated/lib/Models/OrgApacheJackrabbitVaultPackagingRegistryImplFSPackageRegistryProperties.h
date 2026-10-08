
/*
 * OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties_H_


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

class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties();
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHomePath();

	/*! \brief Set 
	 */
	void setHomePath(ConfigNodePropertyString homePath);


    private:
    ConfigNodePropertyString homePath;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties_H_ */
