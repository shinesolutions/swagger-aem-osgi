
/*
 * OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties();
    OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackageRoots();

	/*! \brief Set 
	 */
	void setPackageRoots(ConfigNodePropertyArray packageRoots);


    private:
    ConfigNodePropertyArray packageRoots;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties_H_ */
