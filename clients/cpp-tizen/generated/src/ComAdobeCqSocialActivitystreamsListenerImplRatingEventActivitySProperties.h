/*
 * ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties_H_
#define _ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties();
	ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRanking();

	/*! \brief Set 
	 */
	void setRanking(ConfigNodePropertyInteger  ranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean  enable);

private:
	ConfigNodePropertyInteger ranking;
	ConfigNodePropertyBoolean enable;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties_H_ */
