using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplUnzipUnzipConfigProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplUnzipUnzipConfigProperties:  IEquatable<ComDayCqDamCoreImplUnzipUnzipConfigProperties>
    { 
        /// <summary>
        /// CqDamConfigUnzipMaxuncompressedsize
        /// </summary>
        public ConfigNodePropertyInteger CqDamConfigUnzipMaxuncompressedsize { get; private set; }

        /// <summary>
        /// CqDamConfigUnzipEncoding
        /// </summary>
        public ConfigNodePropertyString CqDamConfigUnzipEncoding { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplUnzipUnzipConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplUnzipUnzipConfigProperties()
        {
        }

        private ComDayCqDamCoreImplUnzipUnzipConfigProperties(ConfigNodePropertyInteger CqDamConfigUnzipMaxuncompressedsize, ConfigNodePropertyString CqDamConfigUnzipEncoding)
        {
            
            this.CqDamConfigUnzipMaxuncompressedsize = CqDamConfigUnzipMaxuncompressedsize;
            
            this.CqDamConfigUnzipEncoding = CqDamConfigUnzipEncoding;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplUnzipUnzipConfigProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder</returns>
        public ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder With()
        {
            return Builder()
                .CqDamConfigUnzipMaxuncompressedsize(CqDamConfigUnzipMaxuncompressedsize)
                .CqDamConfigUnzipEncoding(CqDamConfigUnzipEncoding);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplUnzipUnzipConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplUnzipUnzipConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUnzipUnzipConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUnzipUnzipConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplUnzipUnzipConfigProperties left, ComDayCqDamCoreImplUnzipUnzipConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplUnzipUnzipConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUnzipUnzipConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUnzipUnzipConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplUnzipUnzipConfigProperties left, ComDayCqDamCoreImplUnzipUnzipConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplUnzipUnzipConfigProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamConfigUnzipMaxuncompressedsize;
            private ConfigNodePropertyString _CqDamConfigUnzipEncoding;

            internal ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUnzipUnzipConfigProperties.CqDamConfigUnzipMaxuncompressedsize property.
            /// </summary>
            /// <param name="value">CqDamConfigUnzipMaxuncompressedsize</param>
            public ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder CqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger value)
            {
                _CqDamConfigUnzipMaxuncompressedsize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUnzipUnzipConfigProperties.CqDamConfigUnzipEncoding property.
            /// </summary>
            /// <param name="value">CqDamConfigUnzipEncoding</param>
            public ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder CqDamConfigUnzipEncoding(ConfigNodePropertyString value)
            {
                _CqDamConfigUnzipEncoding = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplUnzipUnzipConfigProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplUnzipUnzipConfigProperties</returns>
            public ComDayCqDamCoreImplUnzipUnzipConfigProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplUnzipUnzipConfigProperties(
                    CqDamConfigUnzipMaxuncompressedsize: _CqDamConfigUnzipMaxuncompressedsize,
                    CqDamConfigUnzipEncoding: _CqDamConfigUnzipEncoding
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}