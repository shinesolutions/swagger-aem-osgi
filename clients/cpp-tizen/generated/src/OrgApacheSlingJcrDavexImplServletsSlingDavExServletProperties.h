/*
 * OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties_H_
#define _OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties_H_


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

class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties();
	OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAlias();

	/*! \brief Set 
	 */
	void setAlias(ConfigNodePropertyString  alias);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDavcreateabsoluteuri();

	/*! \brief Set 
	 */
	void setDavcreateabsoluteuri(ConfigNodePropertyBoolean  davcreateabsoluteuri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDavprotectedhandlers();

	/*! \brief Set 
	 */
	void setDavprotectedhandlers(ConfigNodePropertyString  davprotectedhandlers);

private:
	ConfigNodePropertyString alias;
	ConfigNodePropertyBoolean davcreateabsoluteuri;
	ConfigNodePropertyString davprotectedhandlers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties_H_ */
