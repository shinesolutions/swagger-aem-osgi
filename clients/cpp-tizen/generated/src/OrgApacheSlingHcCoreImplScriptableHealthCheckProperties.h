/*
 * OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHcCoreImplScriptableHealthCheckProperties_H_
#define _OrgApacheSlingHcCoreImplScriptableHealthCheckProperties_H_


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

class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHcCoreImplScriptableHealthCheckProperties();
	OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHcCoreImplScriptableHealthCheckProperties();

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
	ConfigNodePropertyString getExpression();

	/*! \brief Set 
	 */
	void setExpression(ConfigNodePropertyString  expression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLanguageextension();

	/*! \brief Set 
	 */
	void setLanguageextension(ConfigNodePropertyString  languageextension);

private:
	ConfigNodePropertyString hcname;
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyString hcmbeanname;
	ConfigNodePropertyString expression;
	ConfigNodePropertyString languageextension;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHcCoreImplScriptableHealthCheckProperties_H_ */
