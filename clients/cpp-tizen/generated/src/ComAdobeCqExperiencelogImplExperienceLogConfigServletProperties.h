/*
 * ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties_H_
#define _ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties();
	ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDisabledForGroups();

	/*! \brief Set 
	 */
	void setDisabledForGroups(ConfigNodePropertyArray  disabledForGroups);

private:
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyArray disabledForGroups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties_H_ */
