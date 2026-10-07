/*
 * ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties_H_
#define _ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties_H_


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

class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties();
	ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties();

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

#endif /* _ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties_H_ */
