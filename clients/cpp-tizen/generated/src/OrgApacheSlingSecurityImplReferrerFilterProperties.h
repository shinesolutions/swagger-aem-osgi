/*
 * OrgApacheSlingSecurityImplReferrerFilterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingSecurityImplReferrerFilterProperties_H_
#define _OrgApacheSlingSecurityImplReferrerFilterProperties_H_


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

class OrgApacheSlingSecurityImplReferrerFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingSecurityImplReferrerFilterProperties();
	OrgApacheSlingSecurityImplReferrerFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingSecurityImplReferrerFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowempty();

	/*! \brief Set 
	 */
	void setAllowempty(ConfigNodePropertyBoolean  allowempty);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowhosts();

	/*! \brief Set 
	 */
	void setAllowhosts(ConfigNodePropertyArray  allowhosts);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowhostsregexp();

	/*! \brief Set 
	 */
	void setAllowhostsregexp(ConfigNodePropertyArray  allowhostsregexp);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltermethods();

	/*! \brief Set 
	 */
	void setFiltermethods(ConfigNodePropertyArray  filtermethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludeagentsregexp();

	/*! \brief Set 
	 */
	void setExcludeagentsregexp(ConfigNodePropertyArray  excludeagentsregexp);

private:
	ConfigNodePropertyBoolean allowempty;
	ConfigNodePropertyArray allowhosts;
	ConfigNodePropertyArray allowhostsregexp;
	ConfigNodePropertyArray filtermethods;
	ConfigNodePropertyArray excludeagentsregexp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingSecurityImplReferrerFilterProperties_H_ */
