
/*
 * ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties();
    ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties();


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


    private:
    ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes;
    ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems;
    ConfigNodePropertyArray cqwcmmsmactionexcludedprops;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties_H_ */
