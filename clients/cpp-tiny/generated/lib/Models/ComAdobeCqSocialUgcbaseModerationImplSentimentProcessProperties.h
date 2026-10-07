
/*
 * ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties();
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWatchwordspositive();

	/*! \brief Set 
	 */
	void setWatchwordspositive(ConfigNodePropertyArray watchwordspositive);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWatchwordsnegative();

	/*! \brief Set 
	 */
	void setWatchwordsnegative(ConfigNodePropertyArray watchwordsnegative);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWatchwordspath();

	/*! \brief Set 
	 */
	void setWatchwordspath(ConfigNodePropertyString watchwordspath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSentimentpath();

	/*! \brief Set 
	 */
	void setSentimentpath(ConfigNodePropertyString sentimentpath);


    private:
    ConfigNodePropertyArray watchwordspositive;
    ConfigNodePropertyArray watchwordsnegative;
    ConfigNodePropertyString watchwordspath;
    ConfigNodePropertyString sentimentpath;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties_H_ */
