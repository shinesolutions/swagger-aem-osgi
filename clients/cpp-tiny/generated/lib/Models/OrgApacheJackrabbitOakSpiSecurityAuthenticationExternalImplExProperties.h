
/*
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties();
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyString jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpname();

	/*! \brief Set 
	 */
	void setIdpname(ConfigNodePropertyString idpname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSynchandlerName();

	/*! \brief Set 
	 */
	void setSynchandlerName(ConfigNodePropertyString synchandlerName);


    private:
    ConfigNodePropertyInteger jaasranking;
    ConfigNodePropertyString jaascontrolFlag;
    ConfigNodePropertyString jaasrealmName;
    ConfigNodePropertyString idpname;
    ConfigNodePropertyString synchandlerName;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties_H_ */
