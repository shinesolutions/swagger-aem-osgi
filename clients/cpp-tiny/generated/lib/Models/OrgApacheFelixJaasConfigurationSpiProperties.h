
/*
 * OrgApacheFelixJaasConfigurationSpiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixJaasConfigurationSpiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixJaasConfigurationSpiProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixJaasConfigurationSpiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixJaasConfigurationSpiProperties();
    OrgApacheFelixJaasConfigurationSpiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixJaasConfigurationSpiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasdefaultRealmName();

	/*! \brief Set 
	 */
	void setJaasdefaultRealmName(ConfigNodePropertyString jaasdefaultRealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasconfigProviderName();

	/*! \brief Set 
	 */
	void setJaasconfigProviderName(ConfigNodePropertyString jaasconfigProviderName);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getJaasglobalConfigPolicy();

	/*! \brief Set 
	 */
	void setJaasglobalConfigPolicy(ConfigNodePropertyDropDown jaasglobalConfigPolicy);


    private:
    ConfigNodePropertyString jaasdefaultRealmName;
    ConfigNodePropertyString jaasconfigProviderName;
    ConfigNodePropertyDropDown jaasglobalConfigPolicy;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixJaasConfigurationSpiProperties_H_ */
