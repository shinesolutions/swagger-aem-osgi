/*
 * OrgApacheSlingServletsGetDefaultGetServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServletsGetDefaultGetServletProperties_H_
#define _OrgApacheSlingServletsGetDefaultGetServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingServletsGetDefaultGetServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServletsGetDefaultGetServletProperties();
	OrgApacheSlingServletsGetDefaultGetServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServletsGetDefaultGetServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAliases();

	/*! \brief Set 
	 */
	void setAliases(ConfigNodePropertyArray  aliases);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIndex();

	/*! \brief Set 
	 */
	void setIndex(ConfigNodePropertyBoolean  index);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIndexfiles();

	/*! \brief Set 
	 */
	void setIndexfiles(ConfigNodePropertyArray  indexfiles);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablehtml();

	/*! \brief Set 
	 */
	void setEnablehtml(ConfigNodePropertyBoolean  enablehtml);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablejson();

	/*! \brief Set 
	 */
	void setEnablejson(ConfigNodePropertyBoolean  enablejson);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabletxt();

	/*! \brief Set 
	 */
	void setEnabletxt(ConfigNodePropertyBoolean  enabletxt);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablexml();

	/*! \brief Set 
	 */
	void setEnablexml(ConfigNodePropertyBoolean  enablexml);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJsonmaximumresults();

	/*! \brief Set 
	 */
	void setJsonmaximumresults(ConfigNodePropertyInteger  jsonmaximumresults);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEcmaSuport();

	/*! \brief Set 
	 */
	void setEcmaSuport(ConfigNodePropertyBoolean  ecmaSuport);

private:
	ConfigNodePropertyArray aliases;
	ConfigNodePropertyBoolean index;
	ConfigNodePropertyArray indexfiles;
	ConfigNodePropertyBoolean enablehtml;
	ConfigNodePropertyBoolean enablejson;
	ConfigNodePropertyBoolean enabletxt;
	ConfigNodePropertyBoolean enablexml;
	ConfigNodePropertyInteger jsonmaximumresults;
	ConfigNodePropertyBoolean ecmaSuport;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServletsGetDefaultGetServletProperties_H_ */
