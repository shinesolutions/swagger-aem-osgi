
/*
 * ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties();
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmmsmactionexcludednodetypes();

	/*! \brief Set 
	 */
	void setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmmsmactionexcludedparagraphitems();

	/*! \brief Set 
	 */
	void setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmmsmactionexcludedprops();

	/*! \brief Set 
	 */
	void setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getContentcopyactionorderstyle();

	/*! \brief Set 
	 */
	void setContentcopyactionorderstyle(ConfigNodePropertyDropDown contentcopyactionorderstyle);


    private:
    ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes;
    ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems;
    ConfigNodePropertyArray cqwcmmsmactionexcludedprops;
    ConfigNodePropertyDropDown contentcopyactionorderstyle;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties_H_ */
