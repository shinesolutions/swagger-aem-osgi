
/*
 * ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties_H_


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

class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties();
    ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties();


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

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties_H_ */
