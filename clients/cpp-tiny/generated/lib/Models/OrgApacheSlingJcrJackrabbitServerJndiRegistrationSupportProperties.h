
/*
 * OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties_H_


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

class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties();
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavanamingfactoryinitial();

	/*! \brief Set 
	 */
	void setJavanamingfactoryinitial(ConfigNodePropertyString javanamingfactoryinitial);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavanamingproviderurl();

	/*! \brief Set 
	 */
	void setJavanamingproviderurl(ConfigNodePropertyString javanamingproviderurl);


    private:
    ConfigNodePropertyString javanamingfactoryinitial;
    ConfigNodePropertyString javanamingproviderurl;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties_H_ */
