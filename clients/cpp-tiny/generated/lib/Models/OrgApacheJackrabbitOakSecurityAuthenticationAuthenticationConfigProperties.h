
/*
 * OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties_H_


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

class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties();
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachejackrabbitoakauthenticationappName();

	/*! \brief Set 
	 */
	void setOrgapachejackrabbitoakauthenticationappName(ConfigNodePropertyString orgapachejackrabbitoakauthenticationappName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachejackrabbitoakauthenticationconfigSpiName();

	/*! \brief Set 
	 */
	void setOrgapachejackrabbitoakauthenticationconfigSpiName(ConfigNodePropertyString orgapachejackrabbitoakauthenticationconfigSpiName);


    private:
    ConfigNodePropertyString orgapachejackrabbitoakauthenticationappName;
    ConfigNodePropertyString orgapachejackrabbitoakauthenticationconfigSpiName;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties_H_ */
