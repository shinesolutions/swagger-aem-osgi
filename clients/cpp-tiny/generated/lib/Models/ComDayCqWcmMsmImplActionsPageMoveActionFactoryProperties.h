
/*
 * ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties();
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties();


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
	ConfigNodePropertyBoolean getCqwcmmsmimplactionspagemovepropReferenceUpdate();

	/*! \brief Set 
	 */
	void setCqwcmmsmimplactionspagemovepropReferenceUpdate(ConfigNodePropertyBoolean cqwcmmsmimplactionspagemoveprop_referenceUpdate);


    private:
    ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes;
    ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems;
    ConfigNodePropertyArray cqwcmmsmactionexcludedprops;
    ConfigNodePropertyBoolean cqwcmmsmimplactionspagemoveprop_referenceUpdate;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties_H_ */
