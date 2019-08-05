using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties:  IEquatable<ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties>
    { 
        /// <summary>
        /// CqDamConfigAnnotationPdfDocumentWidth
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentWidth { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfDocumentHeight
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentHeight { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfDocumentPaddingHorizontal
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentPaddingHorizontal { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfDocumentPaddingVertical
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentPaddingVertical { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfFontSize
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfFontSize { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfFontColor
        /// </summary>
        public ConfigNodePropertyString CqDamConfigAnnotationPdfFontColor { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfFontFamily
        /// </summary>
        public ConfigNodePropertyString CqDamConfigAnnotationPdfFontFamily { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfFontLight
        /// </summary>
        public ConfigNodePropertyString CqDamConfigAnnotationPdfFontLight { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfMarginTextImage
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfMarginTextImage { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfMinImageHeight
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfMinImageHeight { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfReviewStatusWidth
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfReviewStatusWidth { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfReviewStatusColorApproved
        /// </summary>
        public ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorApproved { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfReviewStatusColorRejected
        /// </summary>
        public ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorRejected { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfReviewStatusColorChangesRequested
        /// </summary>
        public ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorChangesRequested { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfAnnotationMarkerWidth
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfAnnotationMarkerWidth { get; private set; }

        /// <summary>
        /// CqDamConfigAnnotationPdfAssetMinheight
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigAnnotationPdfAssetMinheight { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties()
        {
        }

        private ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentWidth, ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentHeight, ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentPaddingHorizontal, ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentPaddingVertical, ConfigNodePropertyInteger CqDamConfigAnnotationPdfFontSize, ConfigNodePropertyString CqDamConfigAnnotationPdfFontColor, ConfigNodePropertyString CqDamConfigAnnotationPdfFontFamily, ConfigNodePropertyString CqDamConfigAnnotationPdfFontLight, ConfigNodePropertyInteger CqDamConfigAnnotationPdfMarginTextImage, ConfigNodePropertyInteger CqDamConfigAnnotationPdfMinImageHeight, ConfigNodePropertyInteger CqDamConfigAnnotationPdfReviewStatusWidth, ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorApproved, ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorRejected, ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorChangesRequested, ConfigNodePropertyInteger CqDamConfigAnnotationPdfAnnotationMarkerWidth, ConfigNodePropertyInteger CqDamConfigAnnotationPdfAssetMinheight)
        {
            
            this.CqDamConfigAnnotationPdfDocumentWidth = CqDamConfigAnnotationPdfDocumentWidth;
            
            this.CqDamConfigAnnotationPdfDocumentHeight = CqDamConfigAnnotationPdfDocumentHeight;
            
            this.CqDamConfigAnnotationPdfDocumentPaddingHorizontal = CqDamConfigAnnotationPdfDocumentPaddingHorizontal;
            
            this.CqDamConfigAnnotationPdfDocumentPaddingVertical = CqDamConfigAnnotationPdfDocumentPaddingVertical;
            
            this.CqDamConfigAnnotationPdfFontSize = CqDamConfigAnnotationPdfFontSize;
            
            this.CqDamConfigAnnotationPdfFontColor = CqDamConfigAnnotationPdfFontColor;
            
            this.CqDamConfigAnnotationPdfFontFamily = CqDamConfigAnnotationPdfFontFamily;
            
            this.CqDamConfigAnnotationPdfFontLight = CqDamConfigAnnotationPdfFontLight;
            
            this.CqDamConfigAnnotationPdfMarginTextImage = CqDamConfigAnnotationPdfMarginTextImage;
            
            this.CqDamConfigAnnotationPdfMinImageHeight = CqDamConfigAnnotationPdfMinImageHeight;
            
            this.CqDamConfigAnnotationPdfReviewStatusWidth = CqDamConfigAnnotationPdfReviewStatusWidth;
            
            this.CqDamConfigAnnotationPdfReviewStatusColorApproved = CqDamConfigAnnotationPdfReviewStatusColorApproved;
            
            this.CqDamConfigAnnotationPdfReviewStatusColorRejected = CqDamConfigAnnotationPdfReviewStatusColorRejected;
            
            this.CqDamConfigAnnotationPdfReviewStatusColorChangesRequested = CqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
            
            this.CqDamConfigAnnotationPdfAnnotationMarkerWidth = CqDamConfigAnnotationPdfAnnotationMarkerWidth;
            
            this.CqDamConfigAnnotationPdfAssetMinheight = CqDamConfigAnnotationPdfAssetMinheight;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder</returns>
        public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder With()
        {
            return Builder()
                .CqDamConfigAnnotationPdfDocumentWidth(CqDamConfigAnnotationPdfDocumentWidth)
                .CqDamConfigAnnotationPdfDocumentHeight(CqDamConfigAnnotationPdfDocumentHeight)
                .CqDamConfigAnnotationPdfDocumentPaddingHorizontal(CqDamConfigAnnotationPdfDocumentPaddingHorizontal)
                .CqDamConfigAnnotationPdfDocumentPaddingVertical(CqDamConfigAnnotationPdfDocumentPaddingVertical)
                .CqDamConfigAnnotationPdfFontSize(CqDamConfigAnnotationPdfFontSize)
                .CqDamConfigAnnotationPdfFontColor(CqDamConfigAnnotationPdfFontColor)
                .CqDamConfigAnnotationPdfFontFamily(CqDamConfigAnnotationPdfFontFamily)
                .CqDamConfigAnnotationPdfFontLight(CqDamConfigAnnotationPdfFontLight)
                .CqDamConfigAnnotationPdfMarginTextImage(CqDamConfigAnnotationPdfMarginTextImage)
                .CqDamConfigAnnotationPdfMinImageHeight(CqDamConfigAnnotationPdfMinImageHeight)
                .CqDamConfigAnnotationPdfReviewStatusWidth(CqDamConfigAnnotationPdfReviewStatusWidth)
                .CqDamConfigAnnotationPdfReviewStatusColorApproved(CqDamConfigAnnotationPdfReviewStatusColorApproved)
                .CqDamConfigAnnotationPdfReviewStatusColorRejected(CqDamConfigAnnotationPdfReviewStatusColorRejected)
                .CqDamConfigAnnotationPdfReviewStatusColorChangesRequested(CqDamConfigAnnotationPdfReviewStatusColorChangesRequested)
                .CqDamConfigAnnotationPdfAnnotationMarkerWidth(CqDamConfigAnnotationPdfAnnotationMarkerWidth)
                .CqDamConfigAnnotationPdfAssetMinheight(CqDamConfigAnnotationPdfAssetMinheight);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties left, ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties left, ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfDocumentWidth;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfDocumentHeight;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfDocumentPaddingHorizontal;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfDocumentPaddingVertical;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfFontSize;
            private ConfigNodePropertyString _CqDamConfigAnnotationPdfFontColor;
            private ConfigNodePropertyString _CqDamConfigAnnotationPdfFontFamily;
            private ConfigNodePropertyString _CqDamConfigAnnotationPdfFontLight;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfMarginTextImage;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfMinImageHeight;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfReviewStatusWidth;
            private ConfigNodePropertyString _CqDamConfigAnnotationPdfReviewStatusColorApproved;
            private ConfigNodePropertyString _CqDamConfigAnnotationPdfReviewStatusColorRejected;
            private ConfigNodePropertyString _CqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfAnnotationMarkerWidth;
            private ConfigNodePropertyInteger _CqDamConfigAnnotationPdfAssetMinheight;

            internal ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfDocumentWidth property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfDocumentWidth</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfDocumentWidth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfDocumentHeight property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfDocumentHeight</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfDocumentHeight = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfDocumentPaddingHorizontal property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfDocumentPaddingHorizontal</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfDocumentPaddingHorizontal = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfDocumentPaddingVertical property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfDocumentPaddingVertical</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfDocumentPaddingVertical = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfFontSize property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfFontSize</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfFontSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfFontColor property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfFontColor</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString value)
            {
                _CqDamConfigAnnotationPdfFontColor = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfFontFamily property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfFontFamily</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString value)
            {
                _CqDamConfigAnnotationPdfFontFamily = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfFontLight property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfFontLight</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString value)
            {
                _CqDamConfigAnnotationPdfFontLight = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfMarginTextImage property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfMarginTextImage</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfMarginTextImage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfMinImageHeight property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfMinImageHeight</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfMinImageHeight = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfReviewStatusWidth property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfReviewStatusWidth</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfReviewStatusWidth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfReviewStatusColorApproved property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfReviewStatusColorApproved</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString value)
            {
                _CqDamConfigAnnotationPdfReviewStatusColorApproved = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfReviewStatusColorRejected property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfReviewStatusColorRejected</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString value)
            {
                _CqDamConfigAnnotationPdfReviewStatusColorRejected = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfReviewStatusColorChangesRequested property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfReviewStatusColorChangesRequested</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString value)
            {
                _CqDamConfigAnnotationPdfReviewStatusColorChangesRequested = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfAnnotationMarkerWidth property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfAnnotationMarkerWidth</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfAnnotationMarkerWidth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.CqDamConfigAnnotationPdfAssetMinheight property.
            /// </summary>
            /// <param name="value">CqDamConfigAnnotationPdfAssetMinheight</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesBuilder CqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger value)
            {
                _CqDamConfigAnnotationPdfAssetMinheight = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</returns>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(
                    CqDamConfigAnnotationPdfDocumentWidth: _CqDamConfigAnnotationPdfDocumentWidth,
                    CqDamConfigAnnotationPdfDocumentHeight: _CqDamConfigAnnotationPdfDocumentHeight,
                    CqDamConfigAnnotationPdfDocumentPaddingHorizontal: _CqDamConfigAnnotationPdfDocumentPaddingHorizontal,
                    CqDamConfigAnnotationPdfDocumentPaddingVertical: _CqDamConfigAnnotationPdfDocumentPaddingVertical,
                    CqDamConfigAnnotationPdfFontSize: _CqDamConfigAnnotationPdfFontSize,
                    CqDamConfigAnnotationPdfFontColor: _CqDamConfigAnnotationPdfFontColor,
                    CqDamConfigAnnotationPdfFontFamily: _CqDamConfigAnnotationPdfFontFamily,
                    CqDamConfigAnnotationPdfFontLight: _CqDamConfigAnnotationPdfFontLight,
                    CqDamConfigAnnotationPdfMarginTextImage: _CqDamConfigAnnotationPdfMarginTextImage,
                    CqDamConfigAnnotationPdfMinImageHeight: _CqDamConfigAnnotationPdfMinImageHeight,
                    CqDamConfigAnnotationPdfReviewStatusWidth: _CqDamConfigAnnotationPdfReviewStatusWidth,
                    CqDamConfigAnnotationPdfReviewStatusColorApproved: _CqDamConfigAnnotationPdfReviewStatusColorApproved,
                    CqDamConfigAnnotationPdfReviewStatusColorRejected: _CqDamConfigAnnotationPdfReviewStatusColorRejected,
                    CqDamConfigAnnotationPdfReviewStatusColorChangesRequested: _CqDamConfigAnnotationPdfReviewStatusColorChangesRequested,
                    CqDamConfigAnnotationPdfAnnotationMarkerWidth: _CqDamConfigAnnotationPdfAnnotationMarkerWidth,
                    CqDamConfigAnnotationPdfAssetMinheight: _CqDamConfigAnnotationPdfAssetMinheight
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}