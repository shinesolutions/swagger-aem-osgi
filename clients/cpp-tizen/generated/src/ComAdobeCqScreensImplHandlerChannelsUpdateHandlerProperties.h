/*
 * ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_
#define _ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_


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

class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();
	ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerimageresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerimageresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerproductresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerproductresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerproductresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlervideoresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlervideoresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlervideoresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerdynamicsequenceresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerdynamicsequenceresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerdynamicsequenceresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerpreviewmodepaths();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerpreviewmodepaths(ConfigNodePropertyArray  cqpagesupdatehandlerpreviewmodepaths);

private:
	ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes;
	ConfigNodePropertyArray cqpagesupdatehandlerproductresourcetypes;
	ConfigNodePropertyArray cqpagesupdatehandlervideoresourcetypes;
	ConfigNodePropertyArray cqpagesupdatehandlerdynamicsequenceresourcetypes;
	ConfigNodePropertyArray cqpagesupdatehandlerpreviewmodepaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_ */
