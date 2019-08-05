/*
 * ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties_H_
#define _ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties_H_


#include <string>
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

class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties();
	ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfdocumentwidth();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfdocumentwidth(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentwidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfdocumentheight();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfdocumentheight(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentheight);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfdocumentpaddinghorizontal();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfdocumentpaddinghorizontal(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentpaddinghorizontal);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfdocumentpaddingvertical();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfdocumentpaddingvertical(ConfigNodePropertyInteger  cqdamconfigannotationpdfdocumentpaddingvertical);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdffontsize();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdffontsize(ConfigNodePropertyInteger  cqdamconfigannotationpdffontsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigannotationpdffontcolor();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdffontcolor(ConfigNodePropertyString  cqdamconfigannotationpdffontcolor);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigannotationpdffontfamily();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdffontfamily(ConfigNodePropertyString  cqdamconfigannotationpdffontfamily);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigannotationpdffontlight();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdffontlight(ConfigNodePropertyString  cqdamconfigannotationpdffontlight);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfmarginTextImage();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfmarginTextImage(ConfigNodePropertyInteger  cqdamconfigannotationpdfmarginTextImage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfminImageHeight();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfminImageHeight(ConfigNodePropertyInteger  cqdamconfigannotationpdfminImageHeight);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfreviewStatuswidth();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfreviewStatuswidth(ConfigNodePropertyInteger  cqdamconfigannotationpdfreviewStatuswidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigannotationpdfreviewStatuscolorapproved();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfreviewStatuscolorapproved(ConfigNodePropertyString  cqdamconfigannotationpdfreviewStatuscolorapproved);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigannotationpdfreviewStatuscolorrejected();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfreviewStatuscolorrejected(ConfigNodePropertyString  cqdamconfigannotationpdfreviewStatuscolorrejected);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigannotationpdfreviewStatuscolorchangesRequested();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfreviewStatuscolorchangesRequested(ConfigNodePropertyString  cqdamconfigannotationpdfreviewStatuscolorchangesRequested);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfannotationMarkerwidth();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfannotationMarkerwidth(ConfigNodePropertyInteger  cqdamconfigannotationpdfannotationMarkerwidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigannotationpdfassetminheight();

	/*! \brief Set 
	 */
	void setCqdamconfigannotationpdfassetminheight(ConfigNodePropertyInteger  cqdamconfigannotationpdfassetminheight);

private:
	ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentwidth;
	ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentheight;
	ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentpaddinghorizontal;
	ConfigNodePropertyInteger cqdamconfigannotationpdfdocumentpaddingvertical;
	ConfigNodePropertyInteger cqdamconfigannotationpdffontsize;
	ConfigNodePropertyString cqdamconfigannotationpdffontcolor;
	ConfigNodePropertyString cqdamconfigannotationpdffontfamily;
	ConfigNodePropertyString cqdamconfigannotationpdffontlight;
	ConfigNodePropertyInteger cqdamconfigannotationpdfmarginTextImage;
	ConfigNodePropertyInteger cqdamconfigannotationpdfminImageHeight;
	ConfigNodePropertyInteger cqdamconfigannotationpdfreviewStatuswidth;
	ConfigNodePropertyString cqdamconfigannotationpdfreviewStatuscolorapproved;
	ConfigNodePropertyString cqdamconfigannotationpdfreviewStatuscolorrejected;
	ConfigNodePropertyString cqdamconfigannotationpdfreviewStatuscolorchangesRequested;
	ConfigNodePropertyInteger cqdamconfigannotationpdfannotationMarkerwidth;
	ConfigNodePropertyInteger cqdamconfigannotationpdfassetminheight;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties_H_ */
