/*
 * ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties_H_
#define _ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties_H_


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

class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties();
	ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties();

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
	ConfigNodePropertyBoolean getCqwcmmsmimplactionreferencesupdatepropUpdateNested();

	/*! \brief Set 
	 */
	void setCqwcmmsmimplactionreferencesupdatepropUpdateNested(ConfigNodePropertyBoolean  cqwcmmsmimplactionreferencesupdateprop_updateNested);

private:
	ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes;
	ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems;
	ConfigNodePropertyArray cqwcmmsmactionexcludedprops;
	ConfigNodePropertyBoolean cqwcmmsmimplactionreferencesupdateprop_updateNested;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties_H_ */
