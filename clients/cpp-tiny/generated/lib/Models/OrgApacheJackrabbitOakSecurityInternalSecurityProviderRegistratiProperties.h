
/*
 * OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties();
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRequiredServicePids();

	/*! \brief Set 
	 */
	void setRequiredServicePids(ConfigNodePropertyArray requiredServicePids);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAuthorizationCompositionType();

	/*! \brief Set 
	 */
	void setAuthorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType);


    private:
    ConfigNodePropertyArray requiredServicePids;
    ConfigNodePropertyDropDown authorizationCompositionType;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties_H_ */
