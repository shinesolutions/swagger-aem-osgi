using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties:  IEquatable<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties>
    { 
        /// <summary>
        /// OffloadingOffloaderEnabled
        /// </summary>
        public ConfigNodePropertyBoolean OffloadingOffloaderEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties()
        {
        }

        private ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(ConfigNodePropertyBoolean OffloadingOffloaderEnabled)
        {
            
            this.OffloadingOffloaderEnabled = OffloadingOffloaderEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder</returns>
        public static ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder</returns>
        public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder With()
        {
            return Builder()
                .OffloadingOffloaderEnabled(OffloadingOffloaderEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties left, ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties left, ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OffloadingOffloaderEnabled;

            internal ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.OffloadingOffloaderEnabled property.
            /// </summary>
            /// <param name="value">OffloadingOffloaderEnabled</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder OffloadingOffloaderEnabled(ConfigNodePropertyBoolean value)
            {
                _OffloadingOffloaderEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties</returns>
            public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(
                    OffloadingOffloaderEnabled: _OffloadingOffloaderEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}