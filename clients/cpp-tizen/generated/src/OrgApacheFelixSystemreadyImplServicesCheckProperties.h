/*
 * OrgApacheFelixSystemreadyImplServicesCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixSystemreadyImplServicesCheckProperties_H_
#define _OrgApacheFelixSystemreadyImplServicesCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheFelixSystemreadyImplServicesCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixSystemreadyImplServicesCheckProperties();
	OrgApacheFelixSystemreadyImplServicesCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixSystemreadyImplServicesCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServiceslist();

	/*! \brief Set 
	 */
	void setServiceslist(ConfigNodePropertyArray  serviceslist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown  type);

private:
	ConfigNodePropertyArray serviceslist;
	ConfigNodePropertyDropDown type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixSystemreadyImplServicesCheckProperties_H_ */
