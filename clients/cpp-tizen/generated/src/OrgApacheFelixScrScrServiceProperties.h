/*
 * OrgApacheFelixScrScrServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixScrScrServiceProperties_H_
#define _OrgApacheFelixScrScrServiceProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheFelixScrScrServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixScrScrServiceProperties();
	OrgApacheFelixScrScrServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixScrScrServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDsloglevel();

	/*! \brief Set 
	 */
	void setDsloglevel(ConfigNodePropertyDropDown  dsloglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDsfactoryenabled();

	/*! \brief Set 
	 */
	void setDsfactoryenabled(ConfigNodePropertyBoolean  dsfactoryenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDsdelayedkeepInstances();

	/*! \brief Set 
	 */
	void setDsdelayedkeepInstances(ConfigNodePropertyBoolean  dsdelayedkeepInstances);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDslocktimeoutmilliseconds();

	/*! \brief Set 
	 */
	void setDslocktimeoutmilliseconds(ConfigNodePropertyInteger  dslocktimeoutmilliseconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDsstoptimeoutmilliseconds();

	/*! \brief Set 
	 */
	void setDsstoptimeoutmilliseconds(ConfigNodePropertyInteger  dsstoptimeoutmilliseconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDsglobalextender();

	/*! \brief Set 
	 */
	void setDsglobalextender(ConfigNodePropertyBoolean  dsglobalextender);

private:
	ConfigNodePropertyDropDown dsloglevel;
	ConfigNodePropertyBoolean dsfactoryenabled;
	ConfigNodePropertyBoolean dsdelayedkeepInstances;
	ConfigNodePropertyInteger dslocktimeoutmilliseconds;
	ConfigNodePropertyInteger dsstoptimeoutmilliseconds;
	ConfigNodePropertyBoolean dsglobalextender;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixScrScrServiceProperties_H_ */
