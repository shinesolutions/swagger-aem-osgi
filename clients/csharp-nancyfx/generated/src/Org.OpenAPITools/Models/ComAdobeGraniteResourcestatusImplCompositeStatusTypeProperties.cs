using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
    /// </summary>
    public sealed class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties:  IEquatable<ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Types
        /// </summary>
        public ConfigNodePropertyArray Types { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties()
        {
        }

        private ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(ConfigNodePropertyString Name, ConfigNodePropertyArray Types)
        {
            
            this.Name = Name;
            
            this.Types = Types;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder</returns>
        public static ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder</returns>
        public ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Types(Types);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties left, ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties left, ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
        /// </summary>
        public sealed class ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyArray _Types;

            internal ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.Types property.
            /// </summary>
            /// <param name="value">Types</param>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder Types(ConfigNodePropertyArray value)
            {
                _Types = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties</returns>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties Build()
            {
                Validate();
                return new ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(
                    Name: _Name,
                    Types: _Types
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}