/*
 * OrgApacheSlingSecurityImplContentDispositionFilterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingSecurityImplContentDispositionFilterProperties_H_
#define _OrgApacheSlingSecurityImplContentDispositionFilterProperties_H_


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

class OrgApacheSlingSecurityImplContentDispositionFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingSecurityImplContentDispositionFilterProperties();
	OrgApacheSlingSecurityImplContentDispositionFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingSecurityImplContentDispositionFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingcontentdispositionpaths();

	/*! \brief Set 
	 */
	void setSlingcontentdispositionpaths(ConfigNodePropertyArray  slingcontentdispositionpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingcontentdispositionexcludedpaths();

	/*! \brief Set 
	 */
	void setSlingcontentdispositionexcludedpaths(ConfigNodePropertyArray  slingcontentdispositionexcludedpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingcontentdispositionallpaths();

	/*! \brief Set 
	 */
	void setSlingcontentdispositionallpaths(ConfigNodePropertyBoolean  slingcontentdispositionallpaths);

private:
	ConfigNodePropertyArray slingcontentdispositionpaths;
	ConfigNodePropertyArray slingcontentdispositionexcludedpaths;
	ConfigNodePropertyBoolean slingcontentdispositionallpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingSecurityImplContentDispositionFilterProperties_H_ */
