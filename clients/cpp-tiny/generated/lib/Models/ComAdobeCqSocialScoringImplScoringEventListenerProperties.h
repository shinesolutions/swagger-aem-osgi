
/*
 * ComAdobeCqSocialScoringImplScoringEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialScoringImplScoringEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialScoringImplScoringEventListenerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialScoringImplScoringEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialScoringImplScoringEventListenerProperties();
    ComAdobeCqSocialScoringImplScoringEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialScoringImplScoringEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyString eventtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);


    private:
    ConfigNodePropertyString eventtopics;
    ConfigNodePropertyString eventfilter;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialScoringImplScoringEventListenerProperties_H_ */
