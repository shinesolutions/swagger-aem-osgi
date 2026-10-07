/*
 * OrgApacheSlingAuthCoreImplLogoutServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingAuthCoreImplLogoutServletProperties_H_
#define _OrgApacheSlingAuthCoreImplLogoutServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingAuthCoreImplLogoutServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingAuthCoreImplLogoutServletProperties();
	OrgApacheSlingAuthCoreImplLogoutServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingAuthCoreImplLogoutServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString  slingservletpaths);

private:
	ConfigNodePropertyArray slingservletmethods;
	ConfigNodePropertyString slingservletpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingAuthCoreImplLogoutServletProperties_H_ */
