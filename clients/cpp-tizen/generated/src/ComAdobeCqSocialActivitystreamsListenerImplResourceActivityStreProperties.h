/*
 * ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties_H_
#define _ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties_H_


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

class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties();
	ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getStreamPath();

	/*! \brief Set 
	 */
	void setStreamPath(ConfigNodePropertyString  streamPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getStreamName();

	/*! \brief Set 
	 */
	void setStreamName(ConfigNodePropertyString  streamName);

private:
	ConfigNodePropertyString streamPath;
	ConfigNodePropertyString streamName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties_H_ */
