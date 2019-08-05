/*
 * OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties_H_
#define _OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties();
	OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeout();

	/*! \brief Set 
	 */
	void setTimeout(ConfigNodePropertyInteger  timeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTargetstartlevel();

	/*! \brief Set 
	 */
	void setTargetstartlevel(ConfigNodePropertyInteger  targetstartlevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTargetstartlevelpropname();

	/*! \brief Set 
	 */
	void setTargetstartlevelpropname(ConfigNodePropertyString  targetstartlevelpropname);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown  type);

private:
	ConfigNodePropertyInteger timeout;
	ConfigNodePropertyInteger targetstartlevel;
	ConfigNodePropertyString targetstartlevelpropname;
	ConfigNodePropertyDropDown type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties_H_ */
