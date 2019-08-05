using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletAssetDownloadServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletAssetDownloadServletProperties:  IEquatable<ComDayCqDamCoreImplServletAssetDownloadServletProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletAssetDownloadServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletAssetDownloadServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletAssetDownloadServletProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletAssetDownloadServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletAssetDownloadServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletAssetDownloadServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetDownloadServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetDownloadServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletAssetDownloadServletProperties left, ComDayCqDamCoreImplServletAssetDownloadServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletAssetDownloadServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetDownloadServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetDownloadServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletAssetDownloadServletProperties left, ComDayCqDamCoreImplServletAssetDownloadServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletAssetDownloadServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletAssetDownloadServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletAssetDownloadServletProperties</returns>
            public ComDayCqDamCoreImplServletAssetDownloadServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletAssetDownloadServletProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}