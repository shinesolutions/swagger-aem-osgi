using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
    /// </summary>
    public sealed class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties:  IEquatable<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties>
    { 
        /// <summary>
        /// CheckInternval
        /// </summary>
        public ConfigNodePropertyInteger CheckInternval { get; private set; }

        /// <summary>
        /// ExcludeIds
        /// </summary>
        public ConfigNodePropertyArray ExcludeIds { get; private set; }

        /// <summary>
        /// EncryptPing
        /// </summary>
        public ConfigNodePropertyBoolean EncryptPing { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties()
        {
        }

        private ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(ConfigNodePropertyInteger CheckInternval, ConfigNodePropertyArray ExcludeIds, ConfigNodePropertyBoolean EncryptPing)
        {
            
            this.CheckInternval = CheckInternval;
            
            this.ExcludeIds = ExcludeIds;
            
            this.EncryptPing = EncryptPing;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder</returns>
        public static ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder</returns>
        public ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder With()
        {
            return Builder()
                .CheckInternval(CheckInternval)
                .ExcludeIds(ExcludeIds)
                .EncryptPing(EncryptPing);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteLicenseImplLicenseCheckFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties left, ComAdobeGraniteLicenseImplLicenseCheckFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties left, ComAdobeGraniteLicenseImplLicenseCheckFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.
        /// </summary>
        public sealed class ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CheckInternval;
            private ConfigNodePropertyArray _ExcludeIds;
            private ConfigNodePropertyBoolean _EncryptPing;

            internal ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.CheckInternval property.
            /// </summary>
            /// <param name="value">CheckInternval</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder CheckInternval(ConfigNodePropertyInteger value)
            {
                _CheckInternval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.ExcludeIds property.
            /// </summary>
            /// <param name="value">ExcludeIds</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder ExcludeIds(ConfigNodePropertyArray value)
            {
                _ExcludeIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.EncryptPing property.
            /// </summary>
            /// <param name="value">EncryptPing</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder EncryptPing(ConfigNodePropertyBoolean value)
            {
                _EncryptPing = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteLicenseImplLicenseCheckFilterProperties</returns>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties Build()
            {
                Validate();
                return new ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(
                    CheckInternval: _CheckInternval,
                    ExcludeIds: _ExcludeIds,
                    EncryptPing: _EncryptPing
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}