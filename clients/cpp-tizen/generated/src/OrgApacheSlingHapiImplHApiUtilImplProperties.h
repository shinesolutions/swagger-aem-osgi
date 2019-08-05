/*
 * OrgApacheSlingHapiImplHApiUtilImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHapiImplHApiUtilImplProperties_H_
#define _OrgApacheSlingHapiImplHApiUtilImplProperties_H_


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

class OrgApacheSlingHapiImplHApiUtilImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHapiImplHApiUtilImplProperties();
	OrgApacheSlingHapiImplHApiUtilImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHapiImplHApiUtilImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslinghapitoolsresourcetype();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolsresourcetype(ConfigNodePropertyString  orgapacheslinghapitoolsresourcetype);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslinghapitoolscollectionresourcetype();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolscollectionresourcetype(ConfigNodePropertyString  orgapacheslinghapitoolscollectionresourcetype);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslinghapitoolssearchpaths();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolssearchpaths(ConfigNodePropertyArray  orgapacheslinghapitoolssearchpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslinghapitoolsexternalurl();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolsexternalurl(ConfigNodePropertyString  orgapacheslinghapitoolsexternalurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslinghapitoolsenabled();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolsenabled(ConfigNodePropertyBoolean  orgapacheslinghapitoolsenabled);

private:
	ConfigNodePropertyString orgapacheslinghapitoolsresourcetype;
	ConfigNodePropertyString orgapacheslinghapitoolscollectionresourcetype;
	ConfigNodePropertyArray orgapacheslinghapitoolssearchpaths;
	ConfigNodePropertyString orgapacheslinghapitoolsexternalurl;
	ConfigNodePropertyBoolean orgapacheslinghapitoolsenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHapiImplHApiUtilImplProperties_H_ */
