/*
 * ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties_H_
#define _ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties();
	ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrzktimeout();

	/*! \brief Set 
	 */
	void setSolrzktimeout(ConfigNodePropertyString  solrzktimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrcommit();

	/*! \brief Set 
	 */
	void setSolrcommit(ConfigNodePropertyString  solrcommit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheon();

	/*! \brief Set 
	 */
	void setCacheon(ConfigNodePropertyBoolean  cacheon);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConcurrencylevel();

	/*! \brief Set 
	 */
	void setConcurrencylevel(ConfigNodePropertyInteger  concurrencylevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachestartsize();

	/*! \brief Set 
	 */
	void setCachestartsize(ConfigNodePropertyInteger  cachestartsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachettl();

	/*! \brief Set 
	 */
	void setCachettl(ConfigNodePropertyInteger  cachettl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachesize();

	/*! \brief Set 
	 */
	void setCachesize(ConfigNodePropertyInteger  cachesize);

private:
	ConfigNodePropertyString solrzktimeout;
	ConfigNodePropertyString solrcommit;
	ConfigNodePropertyBoolean cacheon;
	ConfigNodePropertyInteger concurrencylevel;
	ConfigNodePropertyInteger cachestartsize;
	ConfigNodePropertyInteger cachettl;
	ConfigNodePropertyInteger cachesize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties_H_ */
