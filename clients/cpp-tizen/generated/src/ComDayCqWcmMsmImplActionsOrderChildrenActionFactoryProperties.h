/*
 * ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties_H_
#define _ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties_H_


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

class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties();
	ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties();

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

private:
	ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes;
	ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems;
	ConfigNodePropertyArray cqwcmmsmactionexcludedprops;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties_H_ */
