/*
 * OrgApacheFelixSystemreadyImplComponentsCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixSystemreadyImplComponentsCheckProperties_H_
#define _OrgApacheFelixSystemreadyImplComponentsCheckProperties_H_


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

class OrgApacheFelixSystemreadyImplComponentsCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixSystemreadyImplComponentsCheckProperties();
	OrgApacheFelixSystemreadyImplComponentsCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixSystemreadyImplComponentsCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComponentslist();

	/*! \brief Set 
	 */
	void setComponentslist(ConfigNodePropertyArray  componentslist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown  type);

private:
	ConfigNodePropertyArray componentslist;
	ConfigNodePropertyDropDown type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixSystemreadyImplComponentsCheckProperties_H_ */
