using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo:  IEquatable<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo()
        {
        }

        private ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder</returns>
        public static ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder</returns>
        public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo left, ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo left, ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder Properties(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo</returns>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}