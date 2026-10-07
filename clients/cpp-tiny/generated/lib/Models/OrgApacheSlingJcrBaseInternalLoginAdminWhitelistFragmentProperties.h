
/*
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties();
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getWhitelistname();

	/*! \brief Set 
	 */
	void setWhitelistname(ConfigNodePropertyString whitelistname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWhitelistbundles();

	/*! \brief Set 
	 */
	void setWhitelistbundles(ConfigNodePropertyArray whitelistbundles);


    private:
    ConfigNodePropertyString whitelistname;
    ConfigNodePropertyArray whitelistbundles;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties_H_ */
