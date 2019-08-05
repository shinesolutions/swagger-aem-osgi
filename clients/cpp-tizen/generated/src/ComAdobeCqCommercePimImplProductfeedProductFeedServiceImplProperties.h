/*
 * ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_
#define _ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_


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

class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();
	ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getFeedgeneratoralgorithm();

	/*! \brief Set 
	 */
	void setFeedgeneratoralgorithm(ConfigNodePropertyDropDown  feedgeneratoralgorithm);

private:
	ConfigNodePropertyDropDown feedgeneratoralgorithm;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_ */
