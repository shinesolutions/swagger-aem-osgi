
/*
 * OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties_H_


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

class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties();
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties();


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


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString path;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties_H_ */
