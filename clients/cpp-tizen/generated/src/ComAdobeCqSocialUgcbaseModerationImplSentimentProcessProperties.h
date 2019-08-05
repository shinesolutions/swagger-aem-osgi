/*
 * ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties_H_
#define _ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties();
	ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWatchwordspositive();

	/*! \brief Set 
	 */
	void setWatchwordspositive(ConfigNodePropertyArray  watchwordspositive);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWatchwordsnegative();

	/*! \brief Set 
	 */
	void setWatchwordsnegative(ConfigNodePropertyArray  watchwordsnegative);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWatchwordspath();

	/*! \brief Set 
	 */
	void setWatchwordspath(ConfigNodePropertyString  watchwordspath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSentimentpath();

	/*! \brief Set 
	 */
	void setSentimentpath(ConfigNodePropertyString  sentimentpath);

private:
	ConfigNodePropertyArray watchwordspositive;
	ConfigNodePropertyArray watchwordsnegative;
	ConfigNodePropertyString watchwordspath;
	ConfigNodePropertyString sentimentpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties_H_ */
