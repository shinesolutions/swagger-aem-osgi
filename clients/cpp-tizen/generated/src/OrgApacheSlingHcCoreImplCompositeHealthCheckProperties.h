/*
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHcCoreImplCompositeHealthCheckProperties_H_
#define _OrgApacheSlingHcCoreImplCompositeHealthCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHcCoreImplCompositeHealthCheckProperties();
	OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHcCoreImplCompositeHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString  hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString  hcmbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltertags();

	/*! \brief Set 
	 */
	void setFiltertags(ConfigNodePropertyArray  filtertags);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFiltercombineTagsWithOr();

	/*! \brief Set 
	 */
	void setFiltercombineTagsWithOr(ConfigNodePropertyBoolean  filtercombineTagsWithOr);

private:
	ConfigNodePropertyString hcname;
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyString hcmbeanname;
	ConfigNodePropertyArray filtertags;
	ConfigNodePropertyBoolean filtercombineTagsWithOr;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHcCoreImplCompositeHealthCheckProperties_H_ */
