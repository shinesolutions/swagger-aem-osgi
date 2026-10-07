
/*
 * OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties_H_


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

class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties();
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString password);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString username;
    ConfigNodePropertyString password;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties_H_ */
