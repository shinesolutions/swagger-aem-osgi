/*
 * OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties_H_
#define _OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties_H_


#include <string>
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

class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties();
	OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingname();

	/*! \brief Set 
	 */
	void setSlingname(ConfigNodePropertyString  slingname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingdescription();

	/*! \brief Set 
	 */
	void setSlingdescription(ConfigNodePropertyString  slingdescription);

private:
	ConfigNodePropertyString slingname;
	ConfigNodePropertyString slingdescription;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties_H_ */
