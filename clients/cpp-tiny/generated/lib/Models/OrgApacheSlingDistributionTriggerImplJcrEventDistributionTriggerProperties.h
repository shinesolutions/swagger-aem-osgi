
/*
 * OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties();
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties();


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
	ConfigNodePropertyArray getIgnoredPathsPatterns();

	/*! \brief Set 
	 */
	void setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeep();

	/*! \brief Set 
	 */
	void setDeep(ConfigNodePropertyBoolean deep);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString path;
    ConfigNodePropertyArray ignoredPathsPatterns;
    ConfigNodePropertyString serviceName;
    ConfigNodePropertyBoolean deep;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties_H_ */
