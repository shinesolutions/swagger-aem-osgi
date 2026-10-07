/*
 * ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H_
#define _ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
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

class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();
	ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPipelinetype();

	/*! \brief Set 
	 */
	void setPipelinetype(ConfigNodePropertyString  pipelinetype);

private:
	ConfigNodePropertyString pipelinetype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H_ */
