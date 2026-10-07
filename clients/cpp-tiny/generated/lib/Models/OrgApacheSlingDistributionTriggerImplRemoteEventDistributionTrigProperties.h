
/*
 * OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties_H_


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

class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties();
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties();


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
	ConfigNodePropertyString getEndpoint();

	/*! \brief Set 
	 */
	void setEndpoint(ConfigNodePropertyString endpoint);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString endpoint;
    ConfigNodePropertyString transportSecretProvidertarget;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties_H_ */
