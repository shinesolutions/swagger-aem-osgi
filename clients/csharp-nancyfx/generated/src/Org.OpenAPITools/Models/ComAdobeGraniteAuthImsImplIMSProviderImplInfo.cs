using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplIMSProviderImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplIMSProviderImplInfo:  IEquatable<ComAdobeGraniteAuthImsImplIMSProviderImplInfo>
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
        public ComAdobeGraniteAuthImsImplIMSProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplIMSProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplIMSProviderImplInfo()
        {
        }

        private ComAdobeGraniteAuthImsImplIMSProviderImplInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthImsImplIMSProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplIMSProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder</returns>
        public static ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder</returns>
        public ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthImsImplIMSProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplIMSProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplIMSProviderImplInfo left, ComAdobeGraniteAuthImsImplIMSProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplIMSProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplIMSProviderImplInfo left, ComAdobeGraniteAuthImsImplIMSProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplIMSProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthImsImplIMSProviderImplProperties _Properties;

            internal ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplInfoBuilder Properties(ComAdobeGraniteAuthImsImplIMSProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplIMSProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplIMSProviderImplInfo</returns>
            public ComAdobeGraniteAuthImsImplIMSProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplIMSProviderImplInfo(
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