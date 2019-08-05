/*
 * OrgApacheSlingResourcemergerPickerOverridingProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingResourcemergerPickerOverridingProperties_H_
#define _OrgApacheSlingResourcemergerPickerOverridingProperties_H_


#include <string>
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

class OrgApacheSlingResourcemergerPickerOverridingProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingResourcemergerPickerOverridingProperties();
	OrgApacheSlingResourcemergerPickerOverridingProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingResourcemergerPickerOverridingProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMergeroot();

	/*! \brief Set 
	 */
	void setMergeroot(ConfigNodePropertyString  mergeroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMergereadOnly();

	/*! \brief Set 
	 */
	void setMergereadOnly(ConfigNodePropertyBoolean  mergereadOnly);

private:
	ConfigNodePropertyString mergeroot;
	ConfigNodePropertyBoolean mergereadOnly;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingResourcemergerPickerOverridingProperties_H_ */
