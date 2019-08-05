using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties:  IEquatable<ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties>
    { 
        /// <summary>
        /// ProcessLabel
        /// </summary>
        public ConfigNodePropertyString ProcessLabel { get; private set; }

        /// <summary>
        /// ExtractPages
        /// </summary>
        public ConfigNodePropertyBoolean ExtractPages { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties()
        {
        }

        private ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(ConfigNodePropertyString ProcessLabel, ConfigNodePropertyBoolean ExtractPages)
        {
            
            this.ProcessLabel = ProcessLabel;
            
            this.ExtractPages = ExtractPages;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder</returns>
        public static ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder</returns>
        public ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder With()
        {
            return Builder()
                .ProcessLabel(ProcessLabel)
                .ExtractPages(ExtractPages);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties left, ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties left, ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyBoolean _ExtractPages;

            internal ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.ExtractPages property.
            /// </summary>
            /// <param name="value">ExtractPages</param>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder ExtractPages(ConfigNodePropertyBoolean value)
            {
                _ExtractPages = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties</returns>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(
                    ProcessLabel: _ProcessLabel,
                    ExtractPages: _ExtractPages
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}