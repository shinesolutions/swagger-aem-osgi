/*
 * ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties_H_


#include <string>
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

class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties();
	ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getConnectProtocol();

	/*! \brief Set 
	 */
	void setConnectProtocol(ConfigNodePropertyDropDown  connectProtocol);

private:
	ConfigNodePropertyDropDown connectProtocol;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties_H_ */
