/*
 * ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_
#define _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_


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

class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();
	ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAutomoderationsequence();

	/*! \brief Set 
	 */
	void setAutomoderationsequence(ConfigNodePropertyArray  automoderationsequence);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAutomoderationonfailurestop();

	/*! \brief Set 
	 */
	void setAutomoderationonfailurestop(ConfigNodePropertyBoolean  automoderationonfailurestop);

private:
	ConfigNodePropertyArray automoderationsequence;
	ConfigNodePropertyBoolean automoderationonfailurestop;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_ */
