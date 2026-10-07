/*
 * OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_
#define _OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();
	OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJcrPrivilege();

	/*! \brief Set 
	 */
	void setJcrPrivilege(ConfigNodePropertyString  jcrPrivilege);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString jcrPrivilege;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_ */
