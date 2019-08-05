using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCreateAssetServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCreateAssetServletProperties:  IEquatable<ComDayCqDamCoreImplServletCreateAssetServletProperties>
    { 
        /// <summary>
        /// DetectDuplicate
        /// </summary>
        public ConfigNodePropertyBoolean DetectDuplicate { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCreateAssetServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCreateAssetServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletCreateAssetServletProperties(ConfigNodePropertyBoolean DetectDuplicate)
        {
            
            this.DetectDuplicate = DetectDuplicate;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCreateAssetServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder With()
        {
            return Builder()
                .DetectDuplicate(DetectDuplicate);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletCreateAssetServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCreateAssetServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCreateAssetServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCreateAssetServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCreateAssetServletProperties left, ComDayCqDamCoreImplServletCreateAssetServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCreateAssetServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCreateAssetServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCreateAssetServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCreateAssetServletProperties left, ComDayCqDamCoreImplServletCreateAssetServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCreateAssetServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DetectDuplicate;

            internal ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCreateAssetServletProperties.DetectDuplicate property.
            /// </summary>
            /// <param name="value">DetectDuplicate</param>
            public ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder DetectDuplicate(ConfigNodePropertyBoolean value)
            {
                _DetectDuplicate = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCreateAssetServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCreateAssetServletProperties</returns>
            public ComDayCqDamCoreImplServletCreateAssetServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCreateAssetServletProperties(
                    DetectDuplicate: _DetectDuplicate
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}