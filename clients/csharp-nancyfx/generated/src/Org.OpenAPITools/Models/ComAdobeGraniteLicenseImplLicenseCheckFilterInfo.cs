using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteLicenseImplLicenseCheckFilterInfo
    /// </summary>
    public sealed class ComAdobeGraniteLicenseImplLicenseCheckFilterInfo:  IEquatable<ComAdobeGraniteLicenseImplLicenseCheckFilterInfo>
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
        public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteLicenseImplLicenseCheckFilterInfo()
        {
        }

        private ComAdobeGraniteLicenseImplLicenseCheckFilterInfo(string Pid, string Title, string Description, ComAdobeGraniteLicenseImplLicenseCheckFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder</returns>
        public static ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder Builder()
        {
            return new ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder</returns>
        public ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteLicenseImplLicenseCheckFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo left, ComAdobeGraniteLicenseImplLicenseCheckFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteLicenseImplLicenseCheckFilterInfo left, ComAdobeGraniteLicenseImplLicenseCheckFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.
        /// </summary>
        public sealed class ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteLicenseImplLicenseCheckFilterProperties _Properties;

            internal ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterInfoBuilder Properties(ComAdobeGraniteLicenseImplLicenseCheckFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteLicenseImplLicenseCheckFilterInfo</returns>
            public ComAdobeGraniteLicenseImplLicenseCheckFilterInfo Build()
            {
                Validate();
                return new ComAdobeGraniteLicenseImplLicenseCheckFilterInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}