
/*
 * OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_


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

class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();


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
	ConfigNodePropertyString getJcrPrivilege();

	/*! \brief Set 
	 */
	void setJcrPrivilege(ConfigNodePropertyString jcrPrivilege);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString jcrPrivilege;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_ */
