
/*
 * OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPort();

	/*! \brief Set 
	 */
	void setPort(ConfigNodePropertyInteger port);


    private:
    ConfigNodePropertyInteger port;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_ */
