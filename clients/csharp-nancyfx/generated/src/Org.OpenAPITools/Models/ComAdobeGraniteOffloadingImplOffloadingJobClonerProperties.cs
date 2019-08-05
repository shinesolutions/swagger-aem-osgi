using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties:  IEquatable<ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties>
    { 
        /// <summary>
        /// OffloadingJobclonerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean OffloadingJobclonerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties()
        {
        }

        private ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(ConfigNodePropertyBoolean OffloadingJobclonerEnabled)
        {
            
            this.OffloadingJobclonerEnabled = OffloadingJobclonerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder</returns>
        public static ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder</returns>
        public ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder With()
        {
            return Builder()
                .OffloadingJobclonerEnabled(OffloadingJobclonerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties left, ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties left, ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OffloadingJobclonerEnabled;

            internal ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.OffloadingJobclonerEnabled property.
            /// </summary>
            /// <param name="value">OffloadingJobclonerEnabled</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder OffloadingJobclonerEnabled(ConfigNodePropertyBoolean value)
            {
                _OffloadingJobclonerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</returns>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(
                    OffloadingJobclonerEnabled: _OffloadingJobclonerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}