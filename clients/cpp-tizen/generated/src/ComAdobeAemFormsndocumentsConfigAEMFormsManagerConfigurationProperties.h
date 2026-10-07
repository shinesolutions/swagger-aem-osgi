/*
 * ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.h
 *
 * 
 */

#ifndef _ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties_H_
#define _ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties_H_


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

class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties();
	ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsManagerConfigincludeOOTBTemplates();

	/*! \brief Set 
	 */
	void setFormsManagerConfigincludeOOTBTemplates(ConfigNodePropertyBoolean  formsManagerConfigincludeOOTBTemplates);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsManagerConfigincludeDeprecatedTemplates();

	/*! \brief Set 
	 */
	void setFormsManagerConfigincludeDeprecatedTemplates(ConfigNodePropertyBoolean  formsManagerConfigincludeDeprecatedTemplates);

private:
	ConfigNodePropertyBoolean formsManagerConfigincludeOOTBTemplates;
	ConfigNodePropertyBoolean formsManagerConfigincludeDeprecatedTemplates;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties_H_ */
