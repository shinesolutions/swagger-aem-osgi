/*
 * OrgApacheFelixJaasConfigurationFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixJaasConfigurationFactoryProperties_H_
#define _OrgApacheFelixJaasConfigurationFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheFelixJaasConfigurationFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixJaasConfigurationFactoryProperties();
	OrgApacheFelixJaasConfigurationFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixJaasConfigurationFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyDropDown  jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger  jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString  jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasclassname();

	/*! \brief Set 
	 */
	void setJaasclassname(ConfigNodePropertyString  jaasclassname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJaasoptions();

	/*! \brief Set 
	 */
	void setJaasoptions(ConfigNodePropertyArray  jaasoptions);

private:
	ConfigNodePropertyDropDown jaascontrolFlag;
	ConfigNodePropertyInteger jaasranking;
	ConfigNodePropertyString jaasrealmName;
	ConfigNodePropertyString jaasclassname;
	ConfigNodePropertyArray jaasoptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixJaasConfigurationFactoryProperties_H_ */
