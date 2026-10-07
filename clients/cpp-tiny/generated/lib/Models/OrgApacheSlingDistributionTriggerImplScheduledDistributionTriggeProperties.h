
/*
 * OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties_H_


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

class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties();
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties();


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
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSeconds();

	/*! \brief Set 
	 */
	void setSeconds(ConfigNodePropertyString seconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString path;
    ConfigNodePropertyString seconds;
    ConfigNodePropertyString serviceName;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties_H_ */
