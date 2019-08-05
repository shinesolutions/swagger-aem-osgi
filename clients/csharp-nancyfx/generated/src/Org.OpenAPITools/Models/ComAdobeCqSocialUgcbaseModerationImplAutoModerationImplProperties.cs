using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties:  IEquatable<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties>
    { 
        /// <summary>
        /// AutomoderationSequence
        /// </summary>
        public ConfigNodePropertyArray AutomoderationSequence { get; private set; }

        /// <summary>
        /// AutomoderationOnfailurestop
        /// </summary>
        public ConfigNodePropertyBoolean AutomoderationOnfailurestop { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(ConfigNodePropertyArray AutomoderationSequence, ConfigNodePropertyBoolean AutomoderationOnfailurestop)
        {
            
            this.AutomoderationSequence = AutomoderationSequence;
            
            this.AutomoderationOnfailurestop = AutomoderationOnfailurestop;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder With()
        {
            return Builder()
                .AutomoderationSequence(AutomoderationSequence)
                .AutomoderationOnfailurestop(AutomoderationOnfailurestop);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties left, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties left, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _AutomoderationSequence;
            private ConfigNodePropertyBoolean _AutomoderationOnfailurestop;

            internal ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.AutomoderationSequence property.
            /// </summary>
            /// <param name="value">AutomoderationSequence</param>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder AutomoderationSequence(ConfigNodePropertyArray value)
            {
                _AutomoderationSequence = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.AutomoderationOnfailurestop property.
            /// </summary>
            /// <param name="value">AutomoderationOnfailurestop</param>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder AutomoderationOnfailurestop(ConfigNodePropertyBoolean value)
            {
                _AutomoderationOnfailurestop = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties</returns>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(
                    AutomoderationSequence: _AutomoderationSequence,
                    AutomoderationOnfailurestop: _AutomoderationOnfailurestop
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}