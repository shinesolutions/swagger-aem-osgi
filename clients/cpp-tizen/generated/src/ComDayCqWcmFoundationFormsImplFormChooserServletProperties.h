/*
 * ComDayCqWcmFoundationFormsImplFormChooserServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationFormsImplFormChooserServletProperties_H_
#define _ComDayCqWcmFoundationFormsImplFormChooserServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmFoundationFormsImplFormChooserServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationFormsImplFormChooserServletProperties();
	ComDayCqWcmFoundationFormsImplFormChooserServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationFormsImplFormChooserServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getServicename();

	/*! \brief Set 
	 */
	void setServicename(ConfigNodePropertyString  servicename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyString  slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString  slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsformchooserservletadvansesearchrequire();

	/*! \brief Set 
	 */
	void setFormsformchooserservletadvansesearchrequire(ConfigNodePropertyBoolean  formsformchooserservletadvansesearchrequire);

private:
	ConfigNodePropertyString servicename;
	ConfigNodePropertyString slingservletresourceTypes;
	ConfigNodePropertyString slingservletselectors;
	ConfigNodePropertyArray slingservletmethods;
	ConfigNodePropertyBoolean formsformchooserservletadvansesearchrequire;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationFormsImplFormChooserServletProperties_H_ */
