/*
 * OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties_H_
#define _OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties();
	OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyArray  slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEcmaSuport();

	/*! \brief Set 
	 */
	void setEcmaSuport(ConfigNodePropertyBoolean  ecmaSuport);

private:
	ConfigNodePropertyArray slingservletselectors;
	ConfigNodePropertyBoolean ecmaSuport;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties_H_ */
