using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemTransactionCoreImplTransactionRecorderProperties
    /// </summary>
    public sealed class ComAdobeAemTransactionCoreImplTransactionRecorderProperties:  IEquatable<ComAdobeAemTransactionCoreImplTransactionRecorderProperties>
    { 
        /// <summary>
        /// IsTransactionRecordingEnabled
        /// </summary>
        public ConfigNodePropertyBoolean IsTransactionRecordingEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemTransactionCoreImplTransactionRecorderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemTransactionCoreImplTransactionRecorderProperties()
        {
        }

        private ComAdobeAemTransactionCoreImplTransactionRecorderProperties(ConfigNodePropertyBoolean IsTransactionRecordingEnabled)
        {
            
            this.IsTransactionRecordingEnabled = IsTransactionRecordingEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemTransactionCoreImplTransactionRecorderProperties.
        /// </summary>
        /// <returns>ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder</returns>
        public static ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder Builder()
        {
            return new ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder</returns>
        public ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder With()
        {
            return Builder()
                .IsTransactionRecordingEnabled(IsTransactionRecordingEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeAemTransactionCoreImplTransactionRecorderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemTransactionCoreImplTransactionRecorderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderProperties</param>
        /// <param name="right">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemTransactionCoreImplTransactionRecorderProperties left, ComAdobeAemTransactionCoreImplTransactionRecorderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemTransactionCoreImplTransactionRecorderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderProperties</param>
        /// <param name="right">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemTransactionCoreImplTransactionRecorderProperties left, ComAdobeAemTransactionCoreImplTransactionRecorderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemTransactionCoreImplTransactionRecorderProperties.
        /// </summary>
        public sealed class ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IsTransactionRecordingEnabled;

            internal ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemTransactionCoreImplTransactionRecorderProperties.IsTransactionRecordingEnabled property.
            /// </summary>
            /// <param name="value">IsTransactionRecordingEnabled</param>
            public ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder IsTransactionRecordingEnabled(ConfigNodePropertyBoolean value)
            {
                _IsTransactionRecordingEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemTransactionCoreImplTransactionRecorderProperties.
            /// </summary>
            /// <returns>ComAdobeAemTransactionCoreImplTransactionRecorderProperties</returns>
            public ComAdobeAemTransactionCoreImplTransactionRecorderProperties Build()
            {
                Validate();
                return new ComAdobeAemTransactionCoreImplTransactionRecorderProperties(
                    IsTransactionRecordingEnabled: _IsTransactionRecordingEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}