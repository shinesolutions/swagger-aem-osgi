/*
 * OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties_H_
#define _OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties();
	OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowonlysystemuser();

	/*! \brief Set 
	 */
	void setAllowonlysystemuser(ConfigNodePropertyBoolean  allowonlysystemuser);

private:
	ConfigNodePropertyBoolean allowonlysystemuser;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties_H_ */
