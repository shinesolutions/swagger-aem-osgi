
/*
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties();
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProtectExternalId();

	/*! \brief Set 
	 */
	void setProtectExternalId(ConfigNodePropertyBoolean protectExternalId);


    private:
    ConfigNodePropertyBoolean protectExternalId;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties_H_ */
