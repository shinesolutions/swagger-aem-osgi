using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties:  IEquatable<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties>
    { 
        /// <summary>
        /// CqDamAllowAllMime
        /// </summary>
        public ConfigNodePropertyBoolean CqDamAllowAllMime { get; private set; }

        /// <summary>
        /// CqDamAllowedAssetMimes
        /// </summary>
        public ConfigNodePropertyArray CqDamAllowedAssetMimes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties()
        {
        }

        private ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(ConfigNodePropertyBoolean CqDamAllowAllMime, ConfigNodePropertyArray CqDamAllowedAssetMimes)
        {
            
            this.CqDamAllowAllMime = CqDamAllowAllMime;
            
            this.CqDamAllowedAssetMimes = CqDamAllowedAssetMimes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder</returns>
        public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder With()
        {
            return Builder()
                .CqDamAllowAllMime(CqDamAllowAllMime)
                .CqDamAllowedAssetMimes(CqDamAllowedAssetMimes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties left, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties left, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamAllowAllMime;
            private ConfigNodePropertyArray _CqDamAllowedAssetMimes;

            internal ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.CqDamAllowAllMime property.
            /// </summary>
            /// <param name="value">CqDamAllowAllMime</param>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder CqDamAllowAllMime(ConfigNodePropertyBoolean value)
            {
                _CqDamAllowAllMime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.CqDamAllowedAssetMimes property.
            /// </summary>
            /// <param name="value">CqDamAllowedAssetMimes</param>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder CqDamAllowedAssetMimes(ConfigNodePropertyArray value)
            {
                _CqDamAllowedAssetMimes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties</returns>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(
                    CqDamAllowAllMime: _CqDamAllowAllMime,
                    CqDamAllowedAssetMimes: _CqDamAllowedAssetMimes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}