/*
 * OrgApacheSlingXssImplXSSFilterImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingXssImplXSSFilterImplProperties_H_
#define _OrgApacheSlingXssImplXSSFilterImplProperties_H_


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

class OrgApacheSlingXssImplXSSFilterImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingXssImplXSSFilterImplProperties();
	OrgApacheSlingXssImplXSSFilterImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingXssImplXSSFilterImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPolicyPath();

	/*! \brief Set 
	 */
	void setPolicyPath(ConfigNodePropertyString  policyPath);

private:
	ConfigNodePropertyString policyPath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingXssImplXSSFilterImplProperties_H_ */
