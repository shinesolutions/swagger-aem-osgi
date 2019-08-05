/*
 * OrgApacheAriesJmxFrameworkStateConfigProperties.h
 *
 * 
 */

#ifndef _OrgApacheAriesJmxFrameworkStateConfigProperties_H_
#define _OrgApacheAriesJmxFrameworkStateConfigProperties_H_


#include <string>
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

class OrgApacheAriesJmxFrameworkStateConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheAriesJmxFrameworkStateConfigProperties();
	OrgApacheAriesJmxFrameworkStateConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheAriesJmxFrameworkStateConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAttributeChangeNotificationEnabled();

	/*! \brief Set 
	 */
	void setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean  attributeChangeNotificationEnabled);

private:
	ConfigNodePropertyBoolean attributeChangeNotificationEnabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheAriesJmxFrameworkStateConfigProperties_H_ */
