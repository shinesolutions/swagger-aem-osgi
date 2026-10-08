
/*
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWhitelistbypass();

	/*! \brief Set 
	 */
	void setWhitelistbypass(ConfigNodePropertyBoolean whitelistbypass);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWhitelistbundlesregexp();

	/*! \brief Set 
	 */
	void setWhitelistbundlesregexp(ConfigNodePropertyString whitelistbundlesregexp);


    private:
    ConfigNodePropertyBoolean whitelistbypass;
    ConfigNodePropertyString whitelistbundlesregexp;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_ */
