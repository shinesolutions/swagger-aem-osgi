
/*
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties_H_


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

class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties();
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPrincipalNames();

	/*! \brief Set 
	 */
	void setPrincipalNames(ConfigNodePropertyArray principalNames);


    private:
    ConfigNodePropertyArray principalNames;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties_H_ */
