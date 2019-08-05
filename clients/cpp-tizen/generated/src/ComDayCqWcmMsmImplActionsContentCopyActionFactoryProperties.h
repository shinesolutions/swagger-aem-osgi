/*
 * ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties_H_
#define _ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties();
	ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmmsmactionexcludednodetypes();

	/*! \brief Set 
	 */
	void setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray  cqwcmmsmactionexcludednodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmmsmactionexcludedparagraphitems();

	/*! \brief Set 
	 */
	void setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray  cqwcmmsmactionexcludedparagraphitems);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmmsmactionexcludedprops();

	/*! \brief Set 
	 */
	void setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray  cqwcmmsmactionexcludedprops);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getContentcopyactionorderstyle();

	/*! \brief Set 
	 */
	void setContentcopyactionorderstyle(ConfigNodePropertyDropDown  contentcopyactionorderstyle);

private:
	ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes;
	ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems;
	ConfigNodePropertyArray cqwcmmsmactionexcludedprops;
	ConfigNodePropertyDropDown contentcopyactionorderstyle;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties_H_ */
