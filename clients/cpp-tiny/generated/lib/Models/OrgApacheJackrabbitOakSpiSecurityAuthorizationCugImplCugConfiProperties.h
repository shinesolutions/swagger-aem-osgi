
/*
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties();
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCugSupportedPaths();

	/*! \brief Set 
	 */
	void setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCugEnabled();

	/*! \brief Set 
	 */
	void setCugEnabled(ConfigNodePropertyBoolean cugEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConfigurationRanking();

	/*! \brief Set 
	 */
	void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking);


    private:
    ConfigNodePropertyArray cugSupportedPaths;
    ConfigNodePropertyBoolean cugEnabled;
    ConfigNodePropertyInteger configurationRanking;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties_H_ */
