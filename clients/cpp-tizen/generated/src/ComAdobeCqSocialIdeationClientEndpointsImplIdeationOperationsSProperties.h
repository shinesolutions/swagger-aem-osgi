/*
 * ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties_H_
#define _ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties();
	ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAttachmentTypeBlacklist();

	/*! \brief Set 
	 */
	void setAttachmentTypeBlacklist(ConfigNodePropertyArray  attachmentTypeBlacklist);

private:
	ConfigNodePropertyArray fieldWhitelist;
	ConfigNodePropertyArray attachmentTypeBlacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties_H_ */