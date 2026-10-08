
/*
 * ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties();
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties();


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
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTranslatelistenertype();

	/*! \brief Set 
	 */
	void setTranslatelistenertype(ConfigNodePropertyArray translatelistenertype);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTranslatepropertylist();

	/*! \brief Set 
	 */
	void setTranslatepropertylist(ConfigNodePropertyArray translatepropertylist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolSize();

	/*! \brief Set 
	 */
	void setPoolSize(ConfigNodePropertyInteger poolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPoolSize();

	/*! \brief Set 
	 */
	void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getKeepAliveTime();

	/*! \brief Set 
	 */
	void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime);


    private:
    ConfigNodePropertyString eventtopics;
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyArray translatelistenertype;
    ConfigNodePropertyArray translatepropertylist;
    ConfigNodePropertyInteger poolSize;
    ConfigNodePropertyInteger maxPoolSize;
    ConfigNodePropertyInteger queueSize;
    ConfigNodePropertyInteger keepAliveTime;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties_H_ */
