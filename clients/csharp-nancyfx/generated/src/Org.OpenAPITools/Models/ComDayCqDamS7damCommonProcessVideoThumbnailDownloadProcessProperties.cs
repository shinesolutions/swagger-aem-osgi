using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties:  IEquatable<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties>
    { 
        /// <summary>
        /// ProcessLabel
        /// </summary>
        public ConfigNodePropertyString ProcessLabel { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties()
        {
        }

        private ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(ConfigNodePropertyString ProcessLabel)
        {
            
            this.ProcessLabel = ProcessLabel;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder With()
        {
            return Builder()
                .ProcessLabel(ProcessLabel);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties left, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties left, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;

            internal ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</returns>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(
                    ProcessLabel: _ProcessLabel
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}