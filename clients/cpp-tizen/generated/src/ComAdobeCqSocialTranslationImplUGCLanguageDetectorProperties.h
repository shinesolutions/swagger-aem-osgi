/*
 * ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties_H_
#define _ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties();
	ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyString  eventtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTranslatelistenertype();

	/*! \brief Set 
	 */
	void setTranslatelistenertype(ConfigNodePropertyArray  translatelistenertype);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTranslatepropertylist();

	/*! \brief Set 
	 */
	void setTranslatepropertylist(ConfigNodePropertyArray  translatepropertylist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolSize();

	/*! \brief Set 
	 */
	void setPoolSize(ConfigNodePropertyInteger  poolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPoolSize();

	/*! \brief Set 
	 */
	void setMaxPoolSize(ConfigNodePropertyInteger  maxPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger  queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getKeepAliveTime();

	/*! \brief Set 
	 */
	void setKeepAliveTime(ConfigNodePropertyInteger  keepAliveTime);

private:
	ConfigNodePropertyString eventtopics;
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyArray translatelistenertype;
	ConfigNodePropertyArray translatepropertylist;
	ConfigNodePropertyInteger poolSize;
	ConfigNodePropertyInteger maxPoolSize;
	ConfigNodePropertyInteger queueSize;
	ConfigNodePropertyInteger keepAliveTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties_H_ */
